import java.util.*;

class formatBiodata {
	String nama;
	String alamat;
	int umur;
	char jekel;
	String hobi[] = new String[3];
	float ipk;
}

public class tugas {

	private static int N = 0;
	private static int jmlTerisi = 0;

	private static Scanner in = new Scanner(System.in);

	public static void inputData(formatBiodata biodataMahasiswa[]) {

		int bacaTombol = 0;
		String jawaban;
		boolean approve = false;

		do {

			System.out.print("Masukan jumlah mahasiswa (Maks 10) : ");
			N = in.nextInt();

			if (jmlTerisi + N > 10) {

				System.out.println("Anda sudah melebihi batas");
				break;
			}

			for (int i = jmlTerisi; i < jmlTerisi + N; i++) {
				System.out.print("Silahkan masukan nama Anda : ");
				biodataMahasiswa[i] = new formatBiodata();
				biodataMahasiswa[i].nama = in.next();
				System.out.print("Silahkan masukan alamat Anda : ");
				biodataMahasiswa[i].alamat = in.next();
				System.out.print("Silahkan masukan umur Anda : ");
				biodataMahasiswa[i].umur = in.nextInt();
				System.out.print("Silahkan masukan jenis kelamin Anda : ");
				try {
					bacaTombol = System.in.read();
				} catch (java.io.IOException e) {
				}
				biodataMahasiswa[i].jekel = (char) bacaTombol;
				System.out.println("Silahkan masukan hobi Anda (Maks 3)");
				for (int j = 0; j < 3; j++) {
					System.out.print("Masukan hobi- " + (j) + " : ");
					biodataMahasiswa[i].hobi[j] = in.next();
				}
				System.out.print("Silahkan Masukan IPK Anda : ");
				biodataMahasiswa[i].ipk = in.nextFloat();
				System.out.println(" ");
			}

			jmlTerisi += N;

			System.out.print("Apakah Anda ingin menambahkan data? (Y/N) : ");
			jawaban = in.next();

		} while (jawaban.equalsIgnoreCase("Y") && jmlTerisi < 10);

		System.out.println(" ");

	}

	public static void tampilData(formatBiodata biodataMahasiswa[]) {

		System.out.println("--------------------------------------------------");
		System.out.println("NAMA ALAMAT UMUR JEKEL HOBI[0] HOBI[1] HOBI[2] IPK");
		System.out.println("--------------------------------------------------");

		for (int i = 0; i <= N - 1; i++) {

			System.out.print(biodataMahasiswa[i].nama + "\t");
			System.out.print(biodataMahasiswa[i].alamat + "\t");
			System.out.print(biodataMahasiswa[i].umur + "\t");
			System.out.print(biodataMahasiswa[i].jekel + "\t");

			for (int j = 0; j < 3; j++) {
				System.out.print(biodataMahasiswa[i].hobi[j] + "\t");
			}
			System.out.println(biodataMahasiswa[i].ipk + "\t");
		}

		System.out.println("--------------------------------------------------");
	}

	public static void mengurutkanDataInsertion(formatBiodata biodataMahasiswa[]) {

		formatBiodata biodataSementara = new formatBiodata();

		int awal;
		int cari;
		awal = 1;

		while (awal <= N - 1) {

			biodataSementara = biodataMahasiswa[awal];
			cari = awal - 1;

			while (cari >= 0) {

				if (biodataMahasiswa[cari].nama.compareTo(biodataSementara.nama) > 0) {

					biodataMahasiswa[cari + 1] = biodataMahasiswa[cari];
					biodataMahasiswa[cari] = biodataSementara;
					cari--;

				} else {
					biodataMahasiswa[cari + 1] = biodataSementara;
					cari = -1;
				}}
			awal++;
		}

		System.out.println("Data sudah diurutkan silahkan pili (3 VIEW)");

	}

	public static void main(String[] args) {

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

		while (true) {

			System.out.println("\nMenu:");
			System.out.println("1. Insert");
			System.out.println("2. View");
			System.out.println("3. Sort");
			System.out.println("4. Exit");
			System.out.print("Pilih menu (1/2/3/4): ");

			int pil = in.nextInt();

			switch (pil) {

				case 1:
					inputData(biodataMahasiswa);
					break;
				case 2:
					tampilData(biodataMahasiswa);
					break;
				case 3:
					mengurutkanDataInsertion(biodataMahasiswa);
					break;
				case 4:
					System.out.println("Terima kasih!");
					return;
				default:
					System.out.println("Anda Memasukan pilihan yang salah!");

			}}}}