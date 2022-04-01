import java.util.ArrayList;

public class Matrix {

    public static int sumOfEvenNumbers(int[][] matrix) {
        int db = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] % 2 == 0){
                    db += matrix[i][j];
                }
            }
        }
        return  db;
    }

    public static ArrayList<Integer> rowsWithZero(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    rows.add(i);
                }
            }
        }
        return rows;
    }
}
