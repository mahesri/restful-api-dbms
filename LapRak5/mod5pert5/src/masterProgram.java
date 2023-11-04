import java.util.*;

class formatBiodata {

	String nama;
	String alamat;
	int umur;
	char jekel;
	String[] hobi = new String[3];
	float ipk;

	}

	public class masterProgram {

	private static int N = 5;
	private static Scanner in = new Scanner(System.in);

public static void tambahData(formatBiodata biodataMahasiswa[]){

	int bacaTombol = 0;

	for(int i = 0; i<= N-1;i++){
		System.out.print("Masukan nama Anda : ");
		biodataMahasiswa[i].nama = in.next();
		System.out.print("Masukan alamat Anda : ");
		biodataMahasiswa[i].alamat = in.next();
		System.out.print("Masukan umur Anda : ");
		biodataMahasiswa[i].umur = in.nextInt();
		System.out.print("Masukan jenis kelamin Anda : ");
		try{
			bacaTombol = System.in.read();
		}catch(java.io.IOException e){}
		biodataMahasiswa[i].jekel = (char)bacaTombol;
		System.out.println("Silahkan masukan hobi Anda (maks 3)");
		for(int j = 0;j < 3; j++){
			System.out.print("Masukan hobi-"+j+" : ");
			biodataMahasiswa[i].hobi[j] = in.next();
		}
		System.out.print("Silahkan masukan IPK Anda : ");
		biodataMahasiswa[i].ipk = in.nextFloat();
		System.out.println("");

	}

	}

public static void tampilData(formatBiodata biodataMahasiswa[]){

	System.out.println("--------------------------------------------------");
	System.out.println("NAMA ALAMAT UMUR JEKEL HOBI[0] HOBI[1] HOBI[2] IPK");
	System.out.println("--------------------------------------------------");

	for(int i = 0; i <= N - 1; i++){

		System.out.print(biodataMahasiswa[i].nama+"\t");
		System.out.print(biodataMahasiswa[i].alamat+"\t");
		System.out.print(biodataMahasiswa[i].umur+"\t");
		System.out.print(biodataMahasiswa[i].jekel+"\t");

		for(int j = 0; j < 3;j++){
			System.out.print(biodataMahasiswa[i].hobi[j]+"\t");
		}
		System.out.println(biodataMahasiswa[i].ipk+"\t");
	}

	System.out.println("--------------------------------------------------");
}


public static void mengurutkanDataBubble(formatBiodata biodataMahasiswa[]){

	formatBiodata biodataSementara = new formatBiodata();

	int indexTerakhir = N - 1;
	for(int j = 0;j <= indexTerakhir - 1; j++ ){

			for(int i = 0; i <= indexTerakhir -1 -j; i++){

				if(biodataMahasiswa[i].nama.compareTo(biodataMahasiswa[i+1].nama) > 0 ){

				biodataSementara = biodataMahasiswa[i];
				biodataMahasiswa[i] = biodataMahasiswa[i + 1];
				biodataMahasiswa[i + 0] = biodataSementara;

				}
			}
		}
	}

	public static void tampilData2(formatBiodata biodataMahasiswa[]){

		System.out.println("                DATA SETELAH DIURUTKAN            ");
		System.out.println("--------------------------------------------------");
		System.out.println("NAMA ALAMAT UMUR JEKEL HOBI[0] HOBI[1] HOBI[2] IPK");
		System.out.println("--------------------------------------------------");

	for(int i = 0; i <= N - 1; i++){

		System.out.print(biodataMahasiswa[i].nama+"\t");
		System.out.print(biodataMahasiswa[i].alamat+"\t");
		System.out.print(biodataMahasiswa[i].umur+"\t");
		System.out.print(biodataMahasiswa[i].jekel+"\t");

		for(int j = 0; j < 3;j++){
			System.out.print(biodataMahasiswa[i].hobi[j]+"\t");
		}
		System.out.println(biodataMahasiswa[i].ipk+"\t");
	}

	System.out.println("--------------------------------------------------");
}

public static void main(String[]args){

	formatBiodata biodataMahasiswa[] = new formatBiodata[N];
	biodataMahasiswa[0] = new formatBiodata();
	biodataMahasiswa[1] = new formatBiodata();
	biodataMahasiswa[2] = new formatBiodata();
	biodataMahasiswa[3] = new formatBiodata();
	biodataMahasiswa[4] = new formatBiodata();

	tambahData(biodataMahasiswa);
	tampilData(biodataMahasiswa);
	mengurutkanDataBubble(biodataMahasiswa);
	tampilData2(biodataMahasiswa);


}

}


