import java.util.Scanner;

public class doWhile {
    
    public static void main (String[]args){

        Scanner in = new Scanner(System.in);

        System.out.println("Masukan nilai awal :");
        int nilaiAwal = in.nextInt();

        
        System.out.println("Masukan nilai akhir :");
        int nilaiAkhir = in.nextInt();

        int total = 0;

        do{
            total = total + nilaiAwal;
            System.out.println("ditambah "+nilaiAwal+ " Menjadi "+total);
            nilaiAwal++;
            
        }while(nilaiAwal <= nilaiAkhir);

    }

}
