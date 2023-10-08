public static void mencariDataLinear(formatBiodata biodataMahasiswa[]){

	String kataKunci;
	int lokasi = -1;
	boolean statusKetemu = false;

	Scanner in = new Scanner(System.in);

	System.out.print("Masukan kata kunci : ");
	kataKunci = in.next();

	for(int i = 0; i <= N-1; i++){

	if(biodataMahasiswa[i].nama.equals(katakunci)){

		statusKetemu = true;
		lokasi = i;
		break;
		}
		}
		if(statusKetemu == true){
		System.out.println("Data ditemukan! "+lokasi);
			}else{
				System.out.println("Maap ganteng. Data tidak ditemukan");
			}

	}