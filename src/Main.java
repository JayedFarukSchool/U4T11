import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // TEST CODE FOR indexFound
        System.out.println("----TEST 1-----");
        String[][] letters = {{"a", "b", "c"}, {"c", "d", "e"}};
        boolean test1 = true;
        int[] idx = FunWith2DArrays.indexFound(letters, "c");
        if (!(idx.length == 2 && idx[0] == 1 && idx[1] == 0)) {
            test1 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(letters, "a");
        if (!(idx.length == 2 && idx[0] == 0 && idx[1] == 0)) {
            test1 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(letters, "e");
        if (!(idx.length == 2 && idx[0] == 1 && idx[1] == 2)) {
            test1 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(letters, "g");
        if (!(idx.length == 2 && idx[0] == -1 && idx[1] == -1)) {
            test1 = false;
        }
        System.out.println(Arrays.toString(idx));
        if (test1) {
            System.out.println("TEST 1 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 1 FAILS !!!!!!!");
        }
        System.out.println("\n----TEST 2-----");
        String[][] words = {{"hi", "time", "stuff", "hi"}, {"bye", "hi", "time", "up"}, {"time", "low", "time", "hi"}};
        boolean test2 = true;
        idx = FunWith2DArrays.indexFound(words, "time");
        if (!(idx.length == 2 && idx[0] == 2 && idx[1] == 0)) {
            test2 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(words, "hi");
        if (!(idx.length == 2 && idx[0] == 0 && idx[1] == 0)) {
            test2 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(words, "up");
        if (!(idx.length == 2 && idx[0] == 1 && idx[1] == 3)) {
            test2 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(words, "cat");
        if (!(idx.length == 2 && idx[0] == -1 && idx[1] == -1)) {
            test2 = false;
        }
        System.out.println(Arrays.toString(idx));
        if (test2) {
            System.out.println("TEST 2 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 2 FAILS !!!!!!!");
        }
        System.out.println("\n----TEST 3-----");
        String[][] words2 = {{"time", "up", "bye"}};
        boolean test3 = true;
        idx = FunWith2DArrays.indexFound(words2, "time");
        if (!(idx.length == 2 && idx[0] == 0 && idx[1] == 0)) {
            test3 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(words2, "up");
        if (!(idx.length == 2 && idx[0] == 0 && idx[1] == 1)) {
            test3 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(words2, "bye");
        if (!(idx.length == 2 && idx[0] == 0 && idx[1] == 2)) {
            test3 = false;
        }
        System.out.println(Arrays.toString(idx));
        idx = FunWith2DArrays.indexFound(words2, "cat");
        if (!(idx.length == 2 && idx[0] == -1 && idx[1] == -1)) {
            test3 = false;
        }
        System.out.println(Arrays.toString(idx));
        if (test3) {
            System.out.println("TEST 3 PASSES");
        } else {
            System.out.println("!!!!!!! TEST 3 FAILS !!!!!!!");
        }

    }
}