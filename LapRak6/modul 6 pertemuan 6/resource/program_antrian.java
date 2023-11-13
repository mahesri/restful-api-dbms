public class program_antrian {

private static int N = 5 ;
private static int belakang = -1;

public static void ENQUEUE (String antrian[], String data){

if(belakang == N - 1) {//kondisi jika antrian / array penuh

	System.out.println("Antrian penuh! ENQUEUE "+ data + " tidak dapat dilakukan");

	}else{//kondisi jika antrian/array bisa diisi
		belakang + belakang + 1;
		antrian[belakang] = data;
		}
	}
	}