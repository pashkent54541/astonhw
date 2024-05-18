import java.util.Arrays;

public class Lecture2 {
    public static void main(String[] args) {
        //1
        pintThreeWords();
        //2
        checkSumSign();
        //3
        printColor();
        //4
        compareNumbers();
        //5
        System.out.println(from10to20(randomInRange(0, 10), randomInRange(0, 10)));
        //6
        numberSign(randomInRange(-100, 100));
        //7
        System.out.println(isNegativeNumber(randomInRange(-100, 100)));
        //8
        printString("Aston", randomInRange(0, 4));
        //9
        System.out.println(isLeapYear(randomInRange(0, 2024)));
        //10
        inverseArr();
        //11
        fillArr();
        //12
        task12();
        //13
        fillTwoDimensionalArr();
        //14
        fillArr2(randomInRange(0,10), randomInRange(0,15));


    }

    // 1
    static void pintThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    // 2
    static void checkSumSign() {
        int a = randomInRange(-100, 100);
        int b = randomInRange(-100, 100);
        if (a + b > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    // 3
    static void printColor() {
        int value = randomInRange(-50, 150);
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    // 4
    static void compareNumbers() {
        int a = randomInRange(-100, 100);
        int b = randomInRange(-100, 100);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5
    static boolean from10to20(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    // 6
    static void numberSign(int a) {
        boolean isPositive = a >= 0;
        if (isPositive) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    // 7
    static boolean isNegativeNumber(int a) {
        return a < 0;
    }

    // 8
    static void printString(String string, int a) {
        for (int i = 0; i < a; i++) {
            System.out.print(string + " ");
        }
    }

    //9
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 || year % 400 == 0) && year % 100 != 0;
    }

    //10
    static void inverseArr() {
        int[] arr = {0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] ^ 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //11
    static void fillArr() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //12
    static void task12() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr2 = new int[9];
        int pointer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
                arr2[pointer] = arr[i];
                pointer++;
            }

        }
        System.out.println(Arrays.toString(arr2));
    }

    //13
    static void fillTwoDimensionalArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i + j == 20 - 1) {
                    arr[i][j] = 1;
                }

            }
        }
        printTwoDimensionalArr(arr);
    }

    //14
    static void fillArr2(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }


    static int randomInRange(int min, int max) {
        int rangeCoefficient = max - min + 1; // это коэффициент, который устанавливает диапазон рандомных числел
        int lowBorder = min; // это нижняя граница
        int result = (int) (Math.random() * rangeCoefficient + lowBorder);
        return result;
    }

    static void printTwoDimensionalArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}



