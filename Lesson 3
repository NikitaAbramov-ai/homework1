class Lesson 3 {
public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

public static void checkSumSign() {
    int a = 4;
    int b = 6;
    int c = a + b;
    if (c >= 0) {
        System.out.println("sum is positive");
    } else {
        System.out.println("sum is negative");
    }
}

public static void printCol() {
    int value = 101;
    if (value <=0) {
        System.out.println("red");
    } if (value>0 && value<100) {
        System.out.println("yellow");
    } if (value>100) {
        System.out.println("green");
    }
}

public static void compareNumbers() {
    int a = 40;
    int b = 40;
    if  (a>=b) {
        System.out.println("a>=b");
    } if (a<b) {
        System.out.println("a<b");
    }
}

public static boolean expressionCheck(int a, int b) {
    return a >= 10 && b <= 20;
}

public static void checkPositiveNegative (int a) {

    System.out.println(a >= 0 ? "Positive/n" : "Negative/n");
}

public static boolean checkNegative(int a){

    return a < 0;
}

public static void printWordNTimes(String str, int n){
    for (int i = 1; i <= n; i++){
        System.out.println("[" + i + "]" + str);
    }
}

public static boolean checkLeapYear (int year){
    if (year % 400 == 0){
        return true;
    } else if (year % 100 == 0) {
        return false;
    } else {
        return year % 4 == 0;
    }
}

ublic static void task1(int[] replaceValues) {
    for (int i = 0; i < replaceValues.length; i++) {
        replaceValues[i] = (replaceValues[i] > 0)? 0 : 1;
        System.out.print(replaceValues[i] + " ");
    }
}

public static void task2(int size) {
    int[] fillArr = new int[size];
    for (int i = 0; i < fillArr.length; i++) {
        fillArr[i] = i + 1;
        System.out.print(fillArr[i] + " ");
    }
}

public static void task3(int[] multiplyOn2) {
    for (int i = 0; i < multiplyOn2.length; i++) {
        if (multiplyOn2[i] < 6) {
            multiplyOn2[i] = multiplyOn2[i] * 2;
        }
        System.out.print(multiplyOn2[i] + " ");
    }
}

public static void task4() {
    int[][] arr = new int[3][3];
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
            if (i == j || i == x) arr[i][j] = 1;
            else arr[i][j] = 0;
            System.out.print(arr[i][j] + " ");
        }
        System.out.print("\n");
    }
}

public static void task5(int len, int initialValue){
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
        arr[i] = initialValue;
        System.out.print("[" + i + "]" + arr[i] + " ");
    }
}

}