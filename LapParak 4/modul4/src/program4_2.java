public static void mencariDataBiner(formatBiodata biodataMahasiswa[]){
	String kataKunci;
	int lokasiData = -1;
	boolean setatusKetemu;

	System.out.print("Masukan kata kunci Anda : ");
	kataKunci = in.next();

	int atas, bawah, tengah;
	atas = 0;
	bawah = N -1;
	tengah = (atas + bawah) / 2;

	while((setatusKetemu == false) && (bawah - atas != 1)) {
		System.out.println(biodataMahasiswa[tengah].nama+" <----> "+kataKunci);

	if(kataKunci.compareTo(biodataMahasiswa[tengah].nama)< 0){

		bawah = tengah;
		tengah = (atas + bawah) /2;

		}else if(kataKunci.compareTo(biodataMahasiswa[tengah].nama)>0){

		atas = tengah;
		tengah = (atas + bawah) / 2;

			}else{

			setatusKetemu = true;
			lokasi = tengah;
				}

			}

			if(setatusKetemu == true){
			System.out.println("Data yang Anda cari KETEMU di lakrik ke-"+ lokasi);
					}else{
			System.out.println("Maap. Nama yang Anda cari tidak ditemukan");
						}
	}