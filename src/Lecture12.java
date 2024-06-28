import java.util.Arrays;
import java.util.Scanner;

public class Lecture12 {
    public static void main(String[] args) throws MyArraySizeException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = in.nextInt();
        System.out.println("Enter number of columns");
        int columns = in.nextInt();

        String[][] myArr = new String[rows][columns];

        System.out.println("Fill the array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArr[i][j] = in.next();
            }
        }
        convertAndSumMyArray(myArr);
    }


    public static void convertAndSumMyArray(String[][] myArr) throws MyArraySizeException {
        if (myArr.length != 4 || myArr[0].length != 4)
            throw new MyArraySizeException();
        int currentSum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    currentSum += Integer.parseInt(myArr[i][j]);
                } catch (NumberFormatException e) {
                    printMyArray(myArr);
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        printMyArray(myArr);
        System.out.println("Sum of elements of the array:" + currentSum);
    }

    public static void printMyArray(String[][] myArr) {
        for (String[] rows : myArr) {
            System.out.println(Arrays.toString(rows));
        }
    }
}
