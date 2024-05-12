public class Leftrighttriangle {
    public static void main(String[] args)
    {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Right Triangle:");
        //  print the right triangle of a matrix

        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //  print the left triangle of a matrix
        System.out.println("\nLeft Triangle:");

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
