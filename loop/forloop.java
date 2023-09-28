import java.util.Scanner;

public class forloop {

    public static void main (String[]args){

        Scanner in = new Scanner(System.in);

        System.out.println("Masukan nilai awal : ");
        int nilaiAwal = in.nextInt();

        System.out.println("Masukan nilai awal : ");
        int nilaiAkhir = in.nextInt();

        System.out.println("Karena total sudah di declare dengan nilainya yaitu 0 maka ");
        for(int total = 0;nilaiAwal<= nilaiAkhir;nilaiAwal++){

            total = nilaiAwal + total;
            System.out.println("Ditambah "+nilaiAwal+" menjadi " +total);
            

        }


    }
    
}
