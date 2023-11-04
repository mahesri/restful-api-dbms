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

	private static int N = 10;
	private static Scanner in = new Scanner(System.in);

public static void inisialisasiData(formatBiodata biodataMahasiswa[]){

		biodataMahasiswa[0] = new formatBiodata();
		biodataMahasiswa[0].nama = "Mahesri";
		biodataMahasiswa[0].alamat = "Boyolali";
		biodataMahasiswa[0].umur = 24;
		biodataMahasiswa[0].jekel = 'L';
		biodataMahasiswa[0].hobi[0] = "Belajar";
		biodataMahasiswa[0].hobi[1] = "Problem-Solving";
		biodataMahasiswa[0].hobi[2] = "Koding";
		biodataMahasiswa[0].ipk = (float)3.41;

		biodataMahasiswa[1] = new formatBiodata();
		biodataMahasiswa[1].nama = "Indah";
		biodataMahasiswa[1].alamat = "Pamekasan";
		biodataMahasiswa[1].umur = 25;
		biodataMahasiswa[1].jekel = 'P';
		biodataMahasiswa[1].hobi[0] = "Musik";
		biodataMahasiswa[1].hobi[1] = "Nyanyi";
		biodataMahasiswa[1].hobi[2] = " Traveling";
		biodataMahasiswa[1].ipk = (float)4.1;

		biodataMahasiswa[2] = new formatBiodata();
		biodataMahasiswa[2].nama = "Ahmad";
		biodataMahasiswa[2].alamat = "Madura";
		biodataMahasiswa[2].umur = 27;
		biodataMahasiswa[2].jekel = 'L';
		biodataMahasiswa[2].hobi[0] = "StanUp-Komedi";
		biodataMahasiswa[2].hobi[1] = "Bisnis";
		biodataMahasiswa[2].hobi[2] = "Fisika";
		biodataMahasiswa[2].ipk = (float)4.1;

		biodataMahasiswa[3] = new formatBiodata();
		biodataMahasiswa[3].nama = "Andri";
		biodataMahasiswa[3].alamat = "Sedayu";
		biodataMahasiswa[3].umur = 22;
		biodataMahasiswa[3].jekel = 'L';
		biodataMahasiswa[3].hobi[0] = "Belajar";
		biodataMahasiswa[3].hobi[1] = "Problem-Solving";
		biodataMahasiswa[3].hobi[2] = "Koding";
		biodataMahasiswa[3].ipk = (float)3.41;


		biodataMahasiswa[4] = new formatBiodata();
		biodataMahasiswa[4].nama = "Wulan";
		biodataMahasiswa[4].alamat = "Jombang";
		biodataMahasiswa[4].umur = 21;
		biodataMahasiswa[4].jekel = 'P';
		biodataMahasiswa[4].hobi[0] = "Nyanyi";
		biodataMahasiswa[4].hobi[1] = "Nulis";
		biodataMahasiswa[4].hobi[2] = "masak";
		biodataMahasiswa[4].ipk = (float) 3.84;

		biodataMahasiswa[5] = new formatBiodata();
		biodataMahasiswa[5].nama = "Wulan";
		biodataMahasiswa[5].alamat = "Jombang";
		biodataMahasiswa[5].umur = 21;
		biodataMahasiswa[5].jekel = 'P';
		biodataMahasiswa[5].hobi[0] = "Nyanyi";
		biodataMahasiswa[5].hobi[1] = "Nulis";
		biodataMahasiswa[5].hobi[2] = "masak";
		biodataMahasiswa[5].ipk = (float) 3.84;

		biodataMahasiswa[5] = new formatBiodata();
		biodataMahasiswa[5].nama = "Intan";
		biodataMahasiswa[5].alamat = "Wonogiri";
		biodataMahasiswa[5].umur = 26;
		biodataMahasiswa[5].jekel = 'P';
		biodataMahasiswa[5].hobi[0] = "Tanaman";
		biodataMahasiswa[5].hobi[1] = "Travel";
		biodataMahasiswa[5].hobi[2] = "Buku";
		biodataMahasiswa[5].ipk = (float)4.1;

		biodataMahasiswa[6] = new formatBiodata();
		biodataMahasiswa[6].nama = "Livia";
		biodataMahasiswa[6].alamat = "Godean";
		biodataMahasiswa[6].umur = 24;
		biodataMahasiswa[6].jekel = 'P';
		biodataMahasiswa[6].hobi[0] = "Nyanyi";
		biodataMahasiswa[6].hobi[1] = "Musik";
		biodataMahasiswa[6].hobi[2] = "masak";
		biodataMahasiswa[6].ipk = (float)4.1;

		biodataMahasiswa[7] = new formatBiodata();
		biodataMahasiswa[7].nama = "Niken";
		biodataMahasiswa[7].alamat = "Kediri";
		biodataMahasiswa[7].umur = 27;
		biodataMahasiswa[7].jekel = 'P';
		biodataMahasiswa[7].hobi[0] = "Makan";
		biodataMahasiswa[7].hobi[1] = "Nongkrong";
		biodataMahasiswa[7].hobi[2] = "Jalan-jalan";
		biodataMahasiswa[7].ipk = (float)4.4;

		biodataMahasiswa[8] = new formatBiodata();
		biodataMahasiswa[8].nama = "Dwi";
		biodataMahasiswa[8].alamat = "Klaten";
		biodataMahasiswa[8].umur = 27;
		biodataMahasiswa[8].jekel = 'P';
		biodataMahasiswa[8].hobi[0] = "Makan";
		biodataMahasiswa[8].hobi[1] = "Rebahan";
		biodataMahasiswa[8].hobi[2] = "Julid";
		biodataMahasiswa[8].ipk = (float)4.2;

		biodataMahasiswa[9] = new formatBiodata();
		biodataMahasiswa[9].nama = "Novita";
		biodataMahasiswa[9].alamat = "Sleman";
		biodataMahasiswa[9].umur = 25;
		biodataMahasiswa[9].jekel = 'P';
		biodataMahasiswa[9].hobi[0] = "Makan-Gamau-Gemuk";
		biodataMahasiswa[9].hobi[1] = "Rebahan";
		biodataMahasiswa[9].hobi[2] = "masak-kalau-mood";
		biodataMahasiswa[9].ipk = (float)3.6;

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


public static void mengurutkanDataSelection(formatBiodata biodataMahasiswa[]) {

formatBiodata biodataSementara = new formatBiodata();

String teksTerkecil = "";
int lokasi=0;

//bagian mengurutkan dengan teknik selection
for (int i=0; i<=N-2; i++) {
//data pertama yang dibaca dianggap data terkecil
teksTerkecil = "zzzzzzz";
//menentukan bilangan terkecil mulai larik ke i+1 sampai N-1
for (int S=i+1; S<=N-1; S++){

if (biodataMahasiswa[S].nama.compareTo(teksTerkecil)<0) { //jika data[S] adlh bilangan terkecil, simpan di teksTerkecil
teksTerkecil = biodataMahasiswa[S].nama;
//mencatat posisi dimana data terkecil ada
lokasi = S;
}
}
//membandingkan data[lokasi] yang adalah data terkecil,
// versus data[i] yang adalah ‘diagonal ke-i'
if (biodataMahasiswa[i].nama.compareTo
(biodataMahasiswa[lokasi].nama)>0)
{
//tukar posisi
{ biodataSementara = biodataMahasiswa[i];
biodataMahasiswa[i] = biodataMahasiswa[lokasi];
biodataMahasiswa[lokasi] = biodataSementara;
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

	inisialisasiData(biodataMahasiswa);
	tampilData(biodataMahasiswa);
	mengurutkanDataSelection(biodataMahasiswa);
	tampilData2(biodataMahasiswa);


}

}


