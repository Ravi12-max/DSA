class Main {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    Node head;
    Node tail;
    int size;
    void addAtTail(int val){
    
        if(tail==null) {
            addAtHead(val);
            return;
        }
             Node temp=new Node(val);
        tail.next=temp;
        tail=temp;
        size++;
        
    }
    void addAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(head==null) return;
        head=head.next;
        size--;
    }
    int search(int key){
        if(head==null) return -1;
        Node temp=head;
        int idx=0;
        while(temp!=null){
            if(temp.val==key) return idx;
            temp=temp.next;
            idx++;
        }
        return -1;
    }
    void display(){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void insert(int val,int idx){
        if(idx<0 || idx>size) return;
        else if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            Node t = new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;
        }
    }
    int get(int idx){
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    void delete(int idx){
        if(idx<0 idx>=size) return;
        if(idx==0){
            deleteAtHead();
            return;
        }
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(idx==size-1) tail=temp;
        size--;
    }
    public static void main(String[] args) {
       Main ll=new Main();
       ll.addAtTail(10);ll.display();
       ll.addAtTail(20);ll.display();
       ll.addAtTail(30);ll.display();
       ll.addAtTail(40);ll.display();
       
       ll.addAtHead(50); ll.display();
       ll.addAtHead(60); ll.display();
       ll.deleteAtHead();ll.display();
       System.out.println(ll.size);
      ll.insert(90,2);ll.display();
      System.out.println(ll.get(0));
      ll.delete(3); ll.display();
    }
}
