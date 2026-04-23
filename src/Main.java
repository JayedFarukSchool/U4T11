import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] testArr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
        int t1 = FunWith2DArrays.sumForColumn(testArr, 0);
        System.out.println(t1);
        int t2 = FunWith2DArrays.sumForColumn(testArr, 1);
        System.out.println(t2);
        int t3 = FunWith2DArrays.sumForColumn(testArr, 2);
        System.out.println(t3);
        int t4 = FunWith2DArrays.sumForColumn(testArr, 3);
        System.out.println(t4);
        int t5 = FunWith2DArrays.sumForColumn(testArr, 4);
        System.out.println(t5);
        int[][] testArr2 = {{3, 4, 5}, {8, 9, 10}, {8, 3, 5}, {1, 2, 3}};
        int t6 = FunWith2DArrays.sumForColumn(testArr2, 0);
        System.out.println(t6);
        int t7 = FunWith2DArrays.sumForColumn(testArr2, 1);
        System.out.println(t7);
        int t8 = FunWith2DArrays.sumForColumn(testArr2, 2);
        System.out.println(t8);
        if (t1 == 11 && t2 == 15 && t3 == 19 && t4 == 16 &&
                t5 == 20 && t6 == 20 && t7 == 18 && t8 == 23) {
            System.out.println("TEST PASSES");
        } else {
            System.out.println("!!!!!!! TEST FAILS !!!!!!!");
        }

    }
}