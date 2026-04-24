import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] testArr1 = {{7, 2, 3}, {0, 4, 8}, {5, 6, 1}};
        boolean test1 = FunWith2DArrays.magicSquare(testArr1);
        System.out.println(test1 + " --> 1. magic square!");
        int[][] testArr2 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        boolean test2 = FunWith2DArrays.magicSquare(testArr2);
        System.out.println(test2 + " --> 2. magic square!");
        int[][] testArr3 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 6}, {14, 4, 1, 15}};
        boolean test3 = FunWith2DArrays.magicSquare(testArr3);
        System.out.println(test3 + " --> 3. magic square!");
        int[][] testArr4 = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 17, 13, 9, 2}, {20, 8, 19, 12, 6}, {5, 3, 10, 22, 25}};
        boolean test4 = FunWith2DArrays.magicSquare(testArr4);
        System.out.println(test4 + " --> 3. magic square!");
        System.out.println("-------");
        int[][] testArr8 = {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}};
        boolean test8 = FunWith2DArrays.magicSquare(testArr8);
        System.out.println(test8 + " --> 4. duplicate values");
        int[][] testArr9 = {{1, 3, 2}, {3, 2, 1}, {2, 1, 3}};
        boolean test9 = FunWith2DArrays.magicSquare(testArr9);
        System.out.println(test9 + " --> 5. duplicate values");
        int[][] testArr14 = {{2, 8, 5}, {8, 5, 2}, {5, 2, 8}};
        boolean test14 = FunWith2DArrays.magicSquare(testArr14);
        System.out.println(test14 + " --> 6. duplicate values");
        int[][] testArr15 = {{4, 5, 6}, {7, 5, 3}, {4, 5, 6}};
        boolean test15 = FunWith2DArrays.magicSquare(testArr15);
        System.out.println(test15 + " --> 7. duplicate values");
        int[][] testArr6 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 6}, {14, 4, 1, 8}};
        boolean test6 = FunWith2DArrays.magicSquare(testArr6);
        System.out.println(test6 + " --> 8. duplicate value");
        int[][] testArr5 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 15}, {14, 4, 1, 6}};
        boolean test5 = FunWith2DArrays.magicSquare(testArr5);
        System.out.println(test5 + " --> 9. row/col/diag sums not equal");
        int[][] testArr7 = {{7, 3, 2}, {0, 4, 8}, {5, 6, 1}};
        boolean test7 = FunWith2DArrays.magicSquare(testArr7);
        System.out.println(test7 + " --> 10. row/col/diag sums not equal");
        int[][] testArr10 = {{0, 4, 8}, {7, 2, 3}, {5, 6, 1}};
        boolean test10 = FunWith2DArrays.magicSquare(testArr10);
        System.out.println(test10 + " --> 11. row/col/diag sums not equal");
        int[][] testArr11 = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 26, 13, 9, 2}, {20, 8, 19, 12, 6}, {5, -6, 10, 22, 25}};
        boolean test11 = FunWith2DArrays.magicSquare(testArr11);
        System.out.println(test11 + " --> 12. row/col/diag sums not equal");
        int[][] testArr12 = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 27, 13, -1, 2}, {20, 8, 19, 12, 6}, {5, 3, 10, 22, 25}};;
        boolean test12 = FunWith2DArrays.magicSquare(testArr12);
        System.out.println(test12 + " --> 13. row/col/diag sums not equal");
        int[][] testArr13 = {{1, 2, 9}, {4, 15, -7}, {7, -5, 10}};
        boolean test13 = FunWith2DArrays.magicSquare(testArr13);
        System.out.println(test13 + " --> 14. row/col/diag sums not equal");
        System.out.println("-------");
        if (test1 && test2 && test3 && test4 && !test5 && !test6 && !test7 && !test8 && !test9 && !test10 && !test11 && !test12 && !test13) {
            System.out.println("ALL TESTS PASS!");
        } else {
            System.out.println("!!!!!!!! TEST FAILS !!!!!!!!!");
        }

    }
}