package Day_five_task;

public class productmatrix {
    public static void main(String[] args) {
        int[][] arr1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] arr2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        int rows = arr1.length;
        int cols = arr2[0].length;
        int[][] product = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                product[i][j] = 0;
                for (int k = 0; k < arr1[0].length; k++) {
                    product[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        System.out.println("Product of the two matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
