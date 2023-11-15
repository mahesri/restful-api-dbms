public class program_antrian {

private static int N = 5 ;
private static int belakang = -1;

public static void ENQUEUE (String antrian[], String data){

if(belakang == N - 1) {//kondisi jika antrian / array penuh

	System.out.println("Antrian penuh! ENQUEUE "+ data + " tidak dapat dilakukan");

	}else{ //kondisi jika antrian/array bisa diisi
		belakang = belakang + 1;
		antrian[belakang] = data;
		System.out.println("ENQUEUE " +data+ " berhasil..");
		}
	}

public static void DEQUEUE (String antiran[]){

String hasil;
if(belakang < 0){//kondisi jika antrian kosong

hasil = "ANTRIAN KOSONG, DEQUEUE GAGAL DILAKUKAN";
}else{ //kondisi jika antrian tidak kosong
hasil = antrian[0];

//--Perulangan untuk menggeser data kedua sampai data ke-N habis tergeser kedepan
for(int i = 0; i <= belakang-1 ; i++){
	antrian[i] = antrian[i+1];
	}
belakang = belakang - 1;
	}
return(hasil);
}

public static void lihatAntrian(String antrian[]){

System.out.println("------------------------------------------");
System.out.print("ISI ANTRIAN : (depan)");
for (int i=0; i<=belakang; i++){
	System.out.print(" " + antrian[i]);
}
System.out.println(" (belakang)");
System.out.println("------------------------------------------");
	}
public static void main (String[] args){
	String antrian[] = new String[5];
	ENQUEUE (antrian, "Mobil A");
	ENQUEUE (antrian, "Mobil B");
	ENQUEUE (antrian, "Mobil C");
	lihatAntrian(antrian);
}}
