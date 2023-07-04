import java.util.*;

public class ai {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Masukan bilangan : ");
        int bil = in.nextInt();

        if (bil % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("bilangan ganjil");
        }

    }
}
