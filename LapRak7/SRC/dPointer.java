class tipePointer {

String nama;
int Angka;

/*

 * CATATAN : 
 * Heap dalam dunia pemograman secara umum merujuk pada alokasi
 * memori dari variable yang kita deklarasikan didalam script kita.
 * 
 * Dalam kasus ini komponen penting yang harus dipahami diantaranya :
 * 1. Heap/Objek dapat berarti sama, heap bisa berarti sebagaimana yang sudah disampaikan diatas,
 *    sementara objek adalah buah dari "class tipePointer" yang sebelumnya kita deklarasikan
 *    diatas
 * 
 * 2. Dalam konteks lain Heap juga dapat berarti sebuah alokasi memori yang ada didalam JVM untuk menyimpan
 * 	  Objek yang kita buat.
 * 
 * 3. "P = new tipePointer();" yang kita deklarasikan dibawah adalah "P" secara umum disimpan didalam stack
 * 	  selama proses eksekusi program berlangsung lantaran "P" merupakan variable yang secara teknis
 * 	  variable yang memiliki peran tidak banyak selayaknya objek 
*/  

//secara umum deklarasi pointer adalah penunjuk untuk menyimpan variable heap/objek/

}

public class dPointer {

tipePointer P; //P adalah refrensi objek dari class tipePointer

public dPointer(){ //dPointer disini adalah metode konstruktor

P = new tipePointer(); //tipePointer adalah sebuah objek dan "P" adalah refrensi untuk 
					   //mengakses apa saja yang ada didalam objek tersebut, seperti attribute
					   //nama & angka yang sebelumnya sudah dideklarasikan
P.nama = "Asep";
P.Angka = 73;

}

public static void main(String[]args){

	tipePointer P = new tipePointer();	
	
	P.nama = "Livia";
	P.Angka = 23;

	System.out.println(P.nama+" ");
	System.out.println(P.Angka+" ");

	}
}