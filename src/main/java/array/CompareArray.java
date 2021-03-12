package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CompareArray {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(17, 28, 30);
        List<Integer> b = Arrays.asList(99, 16, 8);
//        compareArray(a, b);
        compareTriples(a, b);
    }

    static List<Integer> compareTriples(List<Integer> aList, List<Integer> bList) {
        int alicePoints = 0;
        int bobPoints = 0;
        List<Integer> result = new ArrayList<>();

        alicePoints = ((aList.get(0) > bList.get(0) ? 1 : 0) +
                   (aList.get(1) > bList.get(1) ? 1 : 0) +
                   (aList.get(2) > bList.get(2) ? 1 : 0));

        bobPoints = ((aList.get(0) < bList.get(0) ? 1 : 0) +
                (aList.get(1) < bList.get(1) ? 1 : 0) +
                (aList.get(2) < bList.get(2) ? 1 : 0));

        System.out.println(alicePoints + " " + bobPoints);
        result.add(0, alicePoints);
        result.add(1,bobPoints);
        return result;

    }

    static List<Integer> compareArray(List<Integer> aList, List<Integer> bList) {
        int pontosA = 0;
        int pontosB = 0;

        List<Integer> result = new ArrayList<>();

        for (int i=0; i < aList.size(); i++) {
            for (int j=0; i < bList.size(); i++) {
                if (aList.get(0) > bList.get(0)) {
                    pontosA += 1;
                } else if (aList.get(0) < bList.get(0)) {
                    pontosB += 1;
                }
            }
        }
        result.add(0, pontosA);
        result.add(1, pontosB);
        System.out.println(result.get(0) + " " +  result.get(1));
        return result;
    }
}
