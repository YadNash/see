import java.util.*;

class ArrayOperation {
    void seperateEvenOdd(int[] arr) {
        int evencount = 0;
        int oddcount = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                evencount++;
            else
                oddcount++;
        }

        int[] evenArray = new int[evencount];
        int[] oddArray = new int[oddcount];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                evenArray[evenIndex++] = num;
            else
                oddArray[oddIndex++] = num;
        }
        System.out.println("Even:" + Arrays.toString(evenArray));
        System.out.println("Odd:" + Arrays.toString(oddArray));

    }
}

class MatrixOperation extends ArrayOperation{
    void seperateEvenOdd(int[][] matrix){
        int rows = matrix.length;
        int col = matrix[0].length;

        int[][] transpose = new int[col][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose.length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}

    class Trans {
        public static void main(String[] args) {
            ArrayOperation obj1 = new ArrayOperation();
            int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            obj1.seperateEvenOdd(arr);

            MatrixOperation obj2 = new MatrixOperation();
            int[][] mat = {
                    { 1, 2, 3 },
                    { 4, 5, 6 },
                    { 7, 8, 9 }
            };
            obj2.seperateEvenOdd(mat);
        }
    
}
