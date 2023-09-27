import java.util.Scanner;
class formatBiodata {
    String nama;
    int noMhs;
    float nilaiUts;
    float nilaiUas;
}

public class tugas2 {

    
    private static  Scanner in = new Scanner(System.in);;
    private static int jmlMhs = 0;

    public static void inputData(formatBiodata biodataMahasiswa[]){

        System.out.print("Masukan jumlah mahasiswa (Maks 10) : ");
        jmlMhs = in.nextInt();

        for(int i = 0; i < jmlMhs;i++ ){
            System.out.print("Silahkan masukan nama Mahasiswa : ");
            biodataMahasiswa[i].nama = in.next();
            System.out.print("Silahkan masukan nomor mahasiswa : ");
            biodataMahasiswa[i].noMhs = in.nextInt();
            System.out.print("Masukan nilai UTS :");
            biodataMahasiswa[i].nilaiUts = in.nextFloat();
            System.out.print("Masukan nilai UAS : ");
            biodataMahasiswa[i].nilaiUas = in.nextFloat();
            System.out.println(" ");

        }
    }

    public static void tampilkanData(formatBiodata biodataMahasiswa[]){

        System.out.println("-------------------------------------");
        System.out.println("Nama No Mahasiswa Nilia UTS Nilai UAS");
        System.out.println("-------------------------------------");
        
        for(int i = 0; i < jmlMhs; i++){
            System.out.print(biodataMahasiswa[i].nama+ " " );
            System.out.print(biodataMahasiswa[i].noMhs+ " " );
            System.out.print(biodataMahasiswa[i].nilaiUts+ " " );
            System.out.println(biodataMahasiswa[i].nilaiUas+ " " );
            System.out.println(" ");
            
        }
        System.out.println("-------------------------------------");
    }

public static void main(String[]args){
    int pilihan = 1;
    formatBiodata biodataMahasiswa[] = new formatBiodata[10];
    biodataMahasiswa[0] = new formatBiodata();
    biodataMahasiswa[1] = new formatBiodata();
    biodataMahasiswa[2] = new formatBiodata();
    biodataMahasiswa[3] = new formatBiodata();
    biodataMahasiswa[4] = new formatBiodata();
    biodataMahasiswa[5] = new formatBiodata();
    biodataMahasiswa[6] = new formatBiodata();
    biodataMahasiswa[7] = new formatBiodata();
    biodataMahasiswa[8] = new formatBiodata();
    biodataMahasiswa[9] = new formatBiodata();

    do {
        System.out.println("|--------------MENU---------------|");
        System.out.println("| PILIH |1 INPUT| |2 VIEW| |3 EXIT|");
        System.out.println("|---------------------------------|");
        System.out.print("Silahkan masukan pilihan Anda : ");
        pilihan = in.nextInt();

        switch(pilihan){
            case 1 :
            inputData(biodataMahasiswa);
            break;
            case 2 :
            tampilkanData(biodataMahasiswa);
            break;
            case 3 :
            System.out.println("Terimakasih sudah menggunakan layanan kami!");
            return;
            default :
            System.out.println("Anda memasukan pilihan yang salah!");
        }
        
    }while(pilihan != 3);

}

}