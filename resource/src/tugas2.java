import java.util.Scanner;
class formatBiodata {
    String nama;
    int noMhs;
    float nilaiUts;
    float nilaiUas;
}

public class tugas2 {

    
    private static int jmlMhs = 0;

    public static void inputData(formatBiodata biodataMahasiswa[]){

        Scanner in = new Scanner(System.in);

        System.out.println("Masukan jumlah mahasiswa : ");
        jmlMhs = in.nextInt();
        for(int i = 0; i < jmlMhs;i++ ){
            System.out.print("Silahkan masukan nama Mahasiswa : ");
            biodataMahasiswa[i].nama = in.next();
            System.out.print("Silahkan masukan nomor mahasiswa : ");

        }
    }

public static void main(String[]args){
    int pilihan = 1;


    do {
        System.out.println("|--------------MENU---------------|");
        System.out.println("| PILIH |1 INPUT| |2 VIEW| |3 EXIT|");
        System.out.println("|---------------------------------|");
        System.out.print("Silahkan masukan pilihan Anda : ");
        pilihan = in.nextInt();

        switch(pilihan){
            case 1 :

        }
        
    }while(pilihan< 3);

}

}