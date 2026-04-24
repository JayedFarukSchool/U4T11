import java.util.HashSet;

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

    public static int[] indexFound(String[][] arr1, String word) {
        int row = -1;
        int col = -1;
        boolean found = false;
        for (int c = 0; c < arr1[0].length; c++) {
            for (int r = 0; r < arr1.length; r++) {
                if (arr1[r][c].equals(word)) {
                    row = r;
                    col = c;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        return new int[]{row, col};
    }

    public static int[][] split(int[][] arr, int row, int col) {
        if (row >= arr.length || col >= arr[0].length) {
            return new int[0][0];
        }
        int[][] broken = new int[row + 1][col + 1];
        for (int r = 0; r <= row; r++) {
            for (int c = 0; c <= col; c++) {
                broken[r][c] = arr[r][c];
                System.out.println(broken[r][c]);
            }
        }
        return broken;
    }

    public static int[][] invert(int[][] arr) {
        int[][] inverted = new int[arr[0].length][arr.length];
        for (int c = 0; c < arr[0].length; c++) {
            for (int r = 0; r < arr.length; r++) {
                inverted[c][r] = arr[r][c];
            }
        }
        return inverted;
    }

    public static int sumForRow(int[][] arr, int row) {
        int sum = 0;
        for (int num : arr[row]) {
            sum += num;
        }
        return sum;
    }

    public static int sumForColumn(int[][] arr, int col) {
        int sum = 0;
        for (int r = 0; r < arr.length; r++) {
            sum += arr[r][col];
        }
        return sum;
    }

    public static boolean magicSquare(int[][] arr) {
        if (arr.length == 1 && arr[0].length == 1) return true;
        HashSet<Integer> seen = new HashSet<>();
        for (int[] row : arr) {
            for (int num : row) {
                if (!seen.add(num)) return false;
            }
        }
        int target = 0;
        for (int num : arr[0]) target += num;
        for (int i = 0; i < arr.length; i++) {
            int row = 0;
            int col = 0;
            for (int j = 0; j < arr.length; j++) {
                row += arr[i][j];
                col += arr[j][i];
            }
            if (target != row || target != col) return false;
        }
        for (int i = 0; i < arr.length; i++) {
            int diagonal1 = 0;
            int diagonal2 = 0;
            diagonal1 += arr[i][i];
            diagonal2 += arr[i][(arr.length-1)-i];
            if (target != diagonal1 || target!= diagonal2) return false;
        }
        return true;
    }

}

