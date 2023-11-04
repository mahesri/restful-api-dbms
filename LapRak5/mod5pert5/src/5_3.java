//Fungsi Insertion

public static void mengurutkanDataInsertion(formatBiodata biodataMahasiswa[]){

	formatBiodata biodataSementara = formatBiodata();
	//untuk menentukan awal dari data sisi kanan (sisi yang masih berantakan)
	int awal;
	//untuk mencari posisi yg tepat pada sisi kiri (sisi yang sudah terurutkan )
	int cari;
	awal = 1;
	while (awal <= N-1){

		biodataSementara = biodataMahasiswa[awal];
		cari = awal - 1;

		//cari akan bergerak dari kanan (awal-1) ke kiri
		while(cari >= 0){

			if(biodataMahasiswa[cari].nama.compareTo(biodataSementara.nama) > 0)
			{

				biodataMahasiswa[cari]
				}
			}

		}


	}