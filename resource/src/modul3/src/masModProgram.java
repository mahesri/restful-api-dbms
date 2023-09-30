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