package array;

public class Candle {

    static int birthdayCakeCanes(int[] ar) {
        int maxCandleHeight = Integer.MIN_VALUE;
        int maxCadleFreqCount = 0;

        //ar = 4
        //maxCandleHeight = 3
        //maxCadleFreqCount = 1

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == maxCandleHeight) {
                maxCadleFreqCount++;
            }
            if (ar[i] > maxCandleHeight) {
                maxCandleHeight = ar[i];
                maxCadleFreqCount = 1;
            }
        }
        System.out.println(maxCadleFreqCount);
        return maxCadleFreqCount;
    }
    public static void main(String[] args) {
        int[] ar = {3, 2, 1, 3};
        birthdayCakeCanes(ar);
        System.out.println(ar);
    }
}



