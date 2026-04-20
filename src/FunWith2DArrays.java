public class FunWith2DArrays {
    public static int totalElements(int[][] arr1) {
        return (arr1.length * arr1[0].length);
    }

    public static void fourCorners(String[][] arr1) {
        System.out.println(arr1[0][0] + "\n" + arr1[0][arr1[0].length - 1] + "\n" + arr1[arr1.length - 1][0]
                + "\n" + arr1[arr1.length - 1][arr1[0].length - 1]);
    }

    public static void swapFrontAndBackRows(String[][] arr1) {
        String[] temp = arr1[0];
        arr1[0] = arr1[arr1.length - 1];
        arr1[arr1.length - 1] = temp;
    }

    public static double average(int[][] arr1) {
        int average = 0;
        int count = 0;
        for (int[] r : arr1) {
            for (int c : r) {
                average += c;
                count++;
            }
        }
        return ((double) average / count);
    }

    public static int edgeSum(int[][] arr1) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (i == 0 || i == arr1.length - 1) {
                for (int c = 0; c < arr1[i].length; c++) {
                    sum += c;
                }
            }
            else{
                sum += arr1[i][0];
                sum += arr1[i][arr1.length-1];
            }

        }
        return sum;
    }
}
