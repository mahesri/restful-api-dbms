import java.util.*;
class formatBiodata {

	String nama;
	String alamat;
	int umur;
	char jekel;
	String hobi[] new String[3];
	float ipk;
}

public class masModProgram{

private static int N = 10;
private static Scanner in = new Scanner(System.in);

public static void inisialisasidata(formatBiodata biodataMahasiswa[]){

	formatBiodata biodataMahasiswa[] = new formatBiodata();

	biodataMahasiswa[0] = new formatBiodata();
	biodataMahasiswa[0].nama = "Mahesri";
	biodataMahasiswa[0].alamat = "Boyolali";
	biodataMahasiswa[0].umur = 24;
	biodataMahasiswa[0].jekel = "L";
	biodataMahasiswa[0].hobi[0] = "Belajar";
	biodataMahasiswa[0].hobi[1] = "Problem-Solving";
	biodataMahasiswa[0].hobi[2] = "Koding";
	biodataMahasiswa[0].ipk = 3.41;

	biodataMahasiswa[1] = new formatBiodata();
	biodataMahasiswa[1].nama = "Indah";
	biodataMahasiswa[1].alamat = "Pamekasan";
	biodataMahasiswa[1].umur = 25;
	biodataMahasiswa[1].jekel = "P";
	biodataMahasiswa[1].hobi[0] = "Musik";
	biodataMahasiswa[1].hobi[1] = "Nyanyi";
	biodataMahasiswa[1].hobi[2] = "Traveling";
	biodataMahasiswa[1].ipk = 4.1;

	biodataMahasiswa[2] = new formatBiodata();
	biodataMahasiswa[2].nama = "Ahmad";
	biodataMahasiswa[2].alamat = "Madura";
	biodataMahasiswa[2].umur = 27;
	biodataMahasiswa[2].jekel = "L";
	biodataMahasiswa[2].hobi[0] = "StanUp-Komedi";
	biodataMahasiswa[2].hobi[1] = "Bisnis";
	biodataMahasiswa[2].hobi[2] = "Fisika";
	biodataMahasiswa[2].ipk = 4.1;

	biodataMahasiswa[3] = new formatBiodata();
	biodataMahasiswa[3].nama = "Andri";
	biodataMahasiswa[3].alamat = "Sedayu";
	biodataMahasiswa[3].umur = 22;
	biodataMahasiswa[3].jekel = "L";
	biodataMahasiswa[3].hobi[0] = "Belajar";
	biodataMahasiswa[3].hobi[1] = "Problem-Solving";
	biodataMahasiswa[3].hobi[2] = "Koding";
	biodataMahasiswa[3].ipk = 3.41;


	biodataMahasiswa[4] = new formatBiodata();
	biodataMahasiswa[4].nama = "Wulan";
	biodataMahasiswa[4].alamat = "Jombang";
	biodataMahasiswa[4].umur = 21;
	biodataMahasiswa[4].jekel = "P";
	biodataMahasiswa[4].hobi[0] = "Nyanyi";
	biodataMahasiswa[4].hobi[1] = "Nulis";
	biodataMahasiswa[4].hobi[2] = "masak";
	biodataMahasiswa[4].ipk = 3.84;

	biodataMahasiswa[5] = new formatBiodata();
	biodataMahasiswa[5].nama = "Wulan";
	biodataMahasiswa[5].alamat = "Jombang";
	biodataMahasiswa[5].umur = 21;
	biodataMahasiswa[5].jekel = "P";
	biodataMahasiswa[5].hobi[0] = "Nyanyi";
	biodataMahasiswa[5].hobi[1] = "Nulis";
	biodataMahasiswa[5].hobi[2] = "masak";
	biodataMahasiswa[5].ipk = 3.84;
	}

public static void tampilkanData(formatBiodata biodataMahasiswa[]) {

        System.out.println("--------------------------------------------");
        System.out.println("NAMA ALAMAT UMUR JEKEL HOBI[1] HOBI[2] HOBI[3] IPK");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < N; i++) {
            System.out.print(biodataMahasiswa[i].nama + "\t");
            System.out.print(biodataMahasiswa[i].alamat + "\t");
            System.out.print(biodataMahasiswa[i].umur + "\t");
            System.out.print(biodataMahasiswa[i].jekel + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(biodataMahasiswa[i].hobi[j] + "\t");
            }
            System.out.println(biodataMahasiswa[i].ipk + "\t");
        }
        System.out.println("--------------------------------------------");
    }

public static void main(String[]args){


	}

	}