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
        for (int num : arr1[0]) {
            sum += num;
        }
        for (int num : arr1[arr1.length - 1]) {
            sum += num;
        }
        for (int i = 1; i < arr1.length - 1; i++) {
            sum += arr1[i][0];
            sum += arr1[i][arr1[i].length - 1];
        }
        return sum;
    }

    public static int[] indexFound(String[][] arr1, String word){
        int row = -1;
        int col = -1;
        for (int r = 0; r<arr1.length; r++){
            for (int c = 0; c<arr1[r].length; c++){
                if (arr1[r][c].contains(word)) row = r; col = r;
            }
        }
        int[] match = new int[2];
        match[0] = row;
        match[1] = col;

        return match;
    }
}
