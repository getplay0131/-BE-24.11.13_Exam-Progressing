package Pack_241104_Exam_And_progress;

public class ArrayDi3 {
    public static void main(String[] args) {
    int [][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}