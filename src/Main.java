import java.util.Arrays;

public class Main {
    public static void solution(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.arraycopy(array, i, array, i + 1, array.length - i - 1);
                i = i + 2;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(array));
        solution(array);
        System.out.println(Arrays.toString(array));
    }
}