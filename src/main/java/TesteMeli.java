import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TesteMeli {

    public static void fizzBuzz(int n) {
        for (int i=0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static List<Integer> maxDig(Integer max) {
        List<Integer> numsList = new ArrayList<>();
        for (int i = 1000; i <= 9999; i++) {
            String[] nums = String.valueOf(i).split("");
            if (!Stream.of(nums).allMatch(n -> Integer.valueOf(n) <= max)
                    || Stream.of(nums).mapToInt(Integer::valueOf).sum() != 21)
                continue;
            numsList.add(Integer.valueOf(Stream.of(nums).collect(Collectors.joining())));
        }
        return numsList;
    }

    private static List<Integer> teste(Integer max) {
        List<Integer> numsList = new ArrayList<>();
        IntStream.range(1000, 9999).parallel()
                .forEach(n -> {
                    String[] nums = String.valueOf(n).split("");
                    if (!Stream.of(nums).allMatch(nu -> Integer.valueOf(nu) <= max) || Stream.of(nums).mapToInt(Integer::valueOf).sum() != 21)
                        return;
                    numsList.add(Integer.valueOf(Stream.of(nums).collect(Collectors.joining())));
                });
        return numsList;
    }

    public static void main(String[] args) {
        fizzBuzz(15);
        System.out.println(maxDig(6));
        System.out.println(teste(6));
    }
}
