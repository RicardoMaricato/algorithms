import java.util.stream.IntStream;

public class StringTest {

    public static void main(String[] args) {
        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Aula de Java".split(" "));
        System.out.println("Aula".concat("Java"));
        System.out.println("1234 asda qw".replaceAll("[0-9]", "#"));

        IntStream.of(1,2,3,4,5).forEach(n -> {
            System.out.println(n);
        });

        IntStream.range(0,3).forEach(n -> {
            System.out.println("Número = " + n);
        });

        int status = 2;
        int id = 0;
        int caixa = 0;

        System.out.println(String.valueOf(status == 2 && id == 0 && caixa == 1));

    }
}
