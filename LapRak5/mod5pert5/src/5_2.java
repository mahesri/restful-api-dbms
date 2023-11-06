public static void mengurutkanDataSelection(formatBiodata biodataMahasiswa[]){
	
	formatBiodata biodataSementara = new formatBiodata();

	String teksTerkecil = "";
	int lokasi = 0;

	for (int i = 0 ; i <= N - 2;i++){

		teksTerkecil = "zzzzzzz";

		for (int S = i + 1; S <= N-1;S++) {

			if(biodataMahasiswa[S].nama.compareTo(teksTerkecil)>0){
				teksTerkecil = biodataMahasiswa[S].nama;
				lokasi = S;
			}
		}
		if(biodataMahasiswa[i].nama.compareTo(biodataMahasiswa[lokasi].nama) < 0){ {

			biodataSementara = biodataMahasiswa[i];
			biodataMahasiswa[i] = biodataMahasiswa[i + 1];
			biodataMahasiswa[i+1] = biodataSementara;
		}

		}

	}

}