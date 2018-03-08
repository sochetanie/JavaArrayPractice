public class Array121 {

    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1, 2, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 2, 2, 1, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 2, 1, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(is121Array(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(is121Array(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1}));
        System.out.println(is121Array(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 2, 2}));
        System.out.println(is121Array(new int[]{2, 2, 2}));
    }

    static int is121Array(int[] a) {
        if (a.length <= 3 || a[0] != 1 || a[a.length - 1] != 1)
            return 0;

        int i, j;
        boolean flag = false;
        for (i = 0, j = a.length - 1; i < a.length && j >= 0 && i <= j; i++, j--) {
            if (a[i] != 1 || a[j] != 1) {
                if (a[i] != 2 || a[j] != 2)
                    return 0;
                else {
                    flag = true;
                    break;
                }
            }
        }

        for (int index = i; index <= j; index++) {
            if (a[index] != 2) return 0;
        }

        if (flag) return 1; return 0;
    }
}




public class ArrayNums {

    public static void main(String[] args) {
        System.out.println(isNumsArray(new int[]{2, 3, 5, 7, 11}));
        System.out.println(isNumsArray(new int[]{2, 3, 6, 7, 11}));
        System.out.println(isNumsArray(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(isNumsArray(new int[]{2, 4, 8, 16, 32}));
        System.out.println(isNumsArray(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1}));
        System.out.println(isNumsArray(new int[]{7, 11, 77, 49}));
        System.out.println(isNumsArray(new int[]{2}));
        System.out.println(isNumsArray(new int[]{}));
        System.out.println(isNumsArray(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));
    }

    static int isNumsArray(int[] a) {
        int divisibleBy2 = 0, divisibleBy3 = 0, divisibleBy5 = 0, notDivisible = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 || a[i] % 3 == 0 || a[i] % 5 == 0) {
                if (a[i] % 2 == 0) divisibleBy2++;
                if (a[i] % 3 == 0) divisibleBy3++;
                if (a[i] % 5 == 0) divisibleBy5++;
            } else { notDivisible++; }
        }

        if (divisibleBy2 + divisibleBy3 + divisibleBy5 + notDivisible == a.length)
            return 1;
        return 0;
    }
}