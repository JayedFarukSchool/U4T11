import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // TEST CODE for edgeSum
        int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int s1 = FunWith2DArrays.edgeSum(numbers);
        System.out.println(s1);
        int[][] numbers2 = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}, {13, 14, 15}, {18, 19, 20}};
        int s2 = FunWith2DArrays.edgeSum(numbers2);
        System.out.println(s2);
        int[][] numbers3 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int s3 = FunWith2DArrays.edgeSum(numbers3);
        System.out.println(s3);
        int[][] numbers4 = {{1, 2}, {5, 6}};
        int s4 = FunWith2DArrays.edgeSum(numbers4);
        System.out.println(s4);
        if (s1 == 102 && s2 == 123 && s3 == 36 && s4 == 14) {
            System.out.println("TEST PASSES");
        } else {
            System.out.println("!!!!!!! TEST FAILS !!!!!!!");
        }

    }
}