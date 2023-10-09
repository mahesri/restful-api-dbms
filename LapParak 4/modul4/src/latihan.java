import java.util.*;
public class latihan {

    private static int N = 10;
    
    public static void inisialisasiData(formatBiodata biodataMahasiswa[]){

        biodataMahasiswa[0] = new formatBiodata();
        biodataMahasiswa[0].nama = "Ahmad";
        biodataMahasiswa[0].alamat = "Madura";
        biodataMahasiswa[0].umur = 27;
        biodataMahasiswa[0].jekel = 'L';
        biodataMahasiswa[0].hobi[0] = "StanUp-Komedi";
        biodataMahasiswa[0].hobi[1] = "Bisnis";
        biodataMahasiswa[0].hobi[2] = "Fisika";
        biodataMahasiswa[0].ipk = (float)4.1;

        biodataMahasiswa[1] = new formatBiodata();
		biodataMahasiswa[1].nama = "Andri";
		biodataMahasiswa[1].alamat = "Sedayu";
		biodataMahasiswa[1].umur = 22;
		biodataMahasiswa[1].jekel = 'L';
		biodataMahasiswa[1].hobi[0] = "Belajar";
		biodataMahasiswa[1].hobi[1] = "Problem-Solving";
		biodataMahasiswa[1].hobi[2] = "Koding";
		biodataMahasiswa[1].ipk = (float)3.41;

        biodataMahasiswa[2] = new formatBiodata();
		biodataMahasiswa[2].nama = "Dwi";
		biodataMahasiswa[2].alamat = "Klaten";
		biodataMahasiswa[2].umur = 27;
		biodataMahasiswa[2].jekel = 'P';
		biodataMahasiswa[2].hobi[0] = "Makan";
		biodataMahasiswa[2].hobi[1] = "Rebahan";
		biodataMahasiswa[2].hobi[2] = "Julid";
		biodataMahasiswa[2].ipk = (float)4.2;

        biodataMahasiswa[3] = new formatBiodata();
		biodataMahasiswa[3].nama = "Indah";
		biodataMahasiswa[3].alamat = "Pamekasan";
		biodataMahasiswa[3].umur = 25;
		biodataMahasiswa[3].jekel = 'P';
		biodataMahasiswa[3].hobi[0] = "Musik";
		biodataMahasiswa[3].hobi[1] = "Nyanyi";
		biodataMahasiswa[3].hobi[2] = " Traveling";
		biodataMahasiswa[3].ipk = (float)4.1;

        biodataMahasiswa[4] = new formatBiodata();
		biodataMahasiswa[4].nama = "Intan";
		biodataMahasiswa[4].alamat = "Wonogiri";
		biodataMahasiswa[4].umur = 26;
		biodataMahasiswa[4].jekel = 'P';
		biodataMahasiswa[4].hobi[0] = "Tanaman";
		biodataMahasiswa[4].hobi[1] = "Travel";
		biodataMahasiswa[4].hobi[2] = "Buku";
		biodataMahasiswa[4].ipk = (float)4.1;

        biodataMahasiswa[5] = new formatBiodata();
		biodataMahasiswa[5].nama = "Livia";
		biodataMahasiswa[5].alamat = "Godean";
		biodataMahasiswa[5].umur = 24;
		biodataMahasiswa[5].jekel = 'P';
		biodataMahasiswa[5].hobi[0] = "Nyanyi";
		biodataMahasiswa[5].hobi[1] = "Musik";
		biodataMahasiswa[5].hobi[2] = "masak";
		biodataMahasiswa[5].ipk = (float)4.1;

        biodataMahasiswa[6] = new formatBiodata();
		biodataMahasiswa[6].nama = "Niken";
		biodataMahasiswa[6].alamat = "Kediri";
		biodataMahasiswa[6].umur = 27;
		biodataMahasiswa[6].jekel = 'P';
		biodataMahasiswa[6].hobi[0] = "Makan";
		biodataMahasiswa[6].hobi[1] = "Nongkrong";
		biodataMahasiswa[6].hobi[2] = "Jalan-jalan";
		biodataMahasiswa[6].ipk = (float)4.4;



        biodataMahasiswa[7] = new formatBiodata();
		biodataMahasiswa[7].nama = "Novita";
		biodataMahasiswa[7].alamat = "Sleman";
		biodataMahasiswa[7].umur = 25;
		biodataMahasiswa[7].jekel = 'P';
		biodataMahasiswa[7].hobi[0] = "Makan-Gamau-Gemuk";
		biodataMahasiswa[7].hobi[1] = "Rebahan";
		biodataMahasiswa[7].hobi[2] = "masak-kalau-mood";
		biodataMahasiswa[7].ipk = (float)3.6;

        biodataMahasiswa[8] = new formatBiodata();
		biodataMahasiswa[8].nama = "Mahesri";
		biodataMahasiswa[8].alamat = "Boyolali";
		biodataMahasiswa[8].umur = 24;
		biodataMahasiswa[8].jekel = 'L';
		biodataMahasiswa[8].hobi[0] = "Belajar";
		biodataMahasiswa[8].hobi[1] = "Problem-Solving";
		biodataMahasiswa[8].hobi[2] = "Koding";
		biodataMahasiswa[8].ipk = (float)3.41;


		biodataMahasiswa[9] = new formatBiodata();
		biodataMahasiswa[9].nama = "Wulan";
		biodataMahasiswa[9].alamat = "Jombang";
		biodataMahasiswa[9].umur = 21;
		biodataMahasiswa[9].jekel = 'P';
		biodataMahasiswa[9].hobi[0] = "Nyanyi";
		biodataMahasiswa[9].hobi[1] = "Nulis";
		biodataMahasiswa[9].hobi[2] = "masak";
		biodataMahasiswa[9].ipk = (float) 3.84;

}

ublic static void tampilkanDataBerdasarkanJenisKelamin(formatBiodata biodataMahasiswa[], char jenisKelamin) {
    System.out.println("--------------------------------------------------");
    System.out.println("NAMA ALAMAT UMUR JEKEL HOBI[0] HOBI[1] HOBI[2] IPK");
    System.out.println("--------------------------------------------------");

    for (int i = 0; i < biodataMahasiswa.length; i++) {
        if (biodataMahasiswa[i].jekel == jenisKelamin) {
            System.out.print(biodataMahasiswa[i].nama + "\t");
            System.out.print(biodataMahasiswa[i].alamat + "\t");
            System.out.print(biodataMahasiswa[i].umur + "\t");
            System.out.print(biodataMahasiswa[i].jekel + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(biodataMahasiswa[i].hobi[j] + "\t");
            }
            System.out.println(biodataMahasiswa[i].ipk + "\t");
        }
    }
    System.out.println("--------------------------------------------------");
}

public static void main(String[] args) {
    formatBiodata biodataMahasiswa[] = new formatBiodata[N];
    inisialisasiData(biodataMahasiswa);
    tampilkanDataBerdasarkanJenisKelamin(biodataMahasiswa, 'L');
}


}
