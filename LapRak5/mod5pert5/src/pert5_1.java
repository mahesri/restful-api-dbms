public static void mengurutkanDataBubble(formatBiodata biodataMahasiswa[]){

	formatBiodata biodataSementara = new formatBiodata();

	int indexTerakhir = N - 1;
	for(int j = 0;j <= indexsTerakhir - 1; j++ ){

			for(int i = 0; i <= indexsTerakhir -1 -j; i++){

				if(biodataMahasiswa[i].nama.compareTo(biodataMahasiswa[i+1].nama) > 0 ){

				biodataSementara = biodataMahasiswa[i];
				biodataMahasiswa[i] = biodataMahasiswa[i + 1];
				biodataMahasiswa[i + 0] = biodataSementara;

				}
			}
		}
	}