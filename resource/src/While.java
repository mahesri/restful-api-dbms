import java.util.Scanner;

public class While {
    public static void main(String[] args) throws Exception {
       
       Scanner in = new Scanner(System.in);
        
       System.out.println("Masukan nilai awal : ");
       int nilaiAwal = in.nextInt();

        System.out.println("Masukan nilai akhir : ");
        int nilaiAkhir = in.nextInt();

        int total = 0;
        System.out.println("Karena nilai total sebelumnya adalah : "+total);    
        while(nilaiAwal <= nilaiAkhir){

                    
            total = nilaiAwal + total;

            
            System.out.println("Ditambah " +nilaiAwal+ " Menjadi "+total);
            nilaiAwal++;
        } 
        
    }
}
