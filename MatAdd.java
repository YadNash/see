class MatAdd{
    public static void main(String[] args) {
        int [][] m1 = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                       };
          int [][] m2 = {
                        {9,8,7},
                        {6,5,4},
                        {3,2,1}
                       };
        addMatrix( m1, m2);
       
                    
    }
    public static void addMatrix(int[][] m1, int[][] m2){
        int[][] ans = new int[m1.length][m2[0].length]; 

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                ans[i][j] = m1[i][j]+m2[i][j];
            }
        }
        for (int[] is : ans) {
            for (int i : is) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}