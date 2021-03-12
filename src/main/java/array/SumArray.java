package array;

public class SumArray {
    public static void main(String[] args) {
        int soma = 0;
        int[] array = {1, 2, 3, 4, 10, 11};
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        long[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        aVeryBigSum(ar);
    }

    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for (int i=0; i < ar.length; i++) {
            sum += ar[i];
        }
        System.out.println(sum);
        return sum;
    }

}
