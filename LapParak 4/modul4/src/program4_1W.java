public static void cariDataLinear(formatBiodata biodataMahasiswa[]){

String kataKunci;
int lokasi = -1;
boolean dataKetemu = false;

System.out.print("Silakan masukkan kataKunci data yang anda cari :");
kataKunci = in.next();


int i = 0;

while ((i <=N-1) && (dataKetemu == false)){

	if(kataKunci.equals(biodataMahasiswa[i].nama)){
		dataKetemu = true;
		lokasi = i;
		}
	i++;
	}
	System.out.println("Setatus ketemu : "+dataKetemu+" diposisi ke-"+lokasi);
	}
