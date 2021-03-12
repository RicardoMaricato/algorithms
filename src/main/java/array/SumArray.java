package array;

public class SumArray {
    public static void main(String[] args) {
        int soma = 0;
        int[] array = {1, 2, 3, 4, 10, 11};
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
    }

}
