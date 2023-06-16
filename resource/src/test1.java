import java.util.*;

public class test1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Masukan nilai awal : ");
        int nilaiAwal = in.nextInt();

        System.out.println("Masukan nilai akhir : ");
        int nilaiAkhir = in.nextInt();

        for (int total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++) {

            total = nilaiAwal + total;
            System.out.println("ditambah " + nilaiAwal + " Menjadi " + total);

        }
    }

}
