class Palindromeattern {
    public static void main(String[] args) {
        String s="MADAM";
        int n=s.length();
        char[][] arr = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) arr[i][j]=s.charAt(j);
            }
        }
        for(int i=0;i<n;i++){
            char temp=arr[i][i];
            arr[i][i]=arr[i][n-i-1];
            arr[i][n-i-1]=temp;
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) arr[i][j]=s.charAt(j);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
       
    }
}
