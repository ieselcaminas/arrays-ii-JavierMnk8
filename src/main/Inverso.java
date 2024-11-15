import java.util.Arrays;

public class Inverso {
    public static void main(String[] args) {
        int[] num = {6, 3, 7, 23};
        int[] inverso = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            inverso[num.length - 1 - i] = num[i];
        }
        System.out.println(Arrays.toString(inverso));
    }
}