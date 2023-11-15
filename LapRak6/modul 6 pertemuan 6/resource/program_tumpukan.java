public class program_tumpukan {
	public static int N = 5;
	public static int atas = -1;
public static void PUSH (String tumpukan[], String data){

	if(atas == N-1) //Kondisi Jika Tumpukan Penuh
	{
		System.out.println("Tumpukan penuh, PUSH " + data +" tidak dapat dilakukan");

			}else{ //Kondisi jika tumpukan/stack tidak penuh

			atas = atas + 1;
			tumpukan[atas] = data;
			System.out.println("PUSH "+data+" berhasil!");
				}
}

public static String POP (String tumpukan[])
{
	String hasil;
	if(atas < 0){ //kondisi apabila tumpukan/stack kosong

		hasil = "TUMPUKAN KOSONG, POP GAGAL DILAKUKAN";

		}else{ //kondisi jika tumpukan/stack tidak kosong
				hasil = tumpukan[atas];
				atas = atas - 1;
			}
			return(hasil);
}

public static void lihatTumpukan(String tumpukan[]){

	System.out.print(" ");
	System.out.print("--TUMPUKAN--");

	for(int i = atas; i>=0;i--){
		System.out.println(tumpukan[i]);
	}
System.out.println("--AKHIR TUMPUKAN--");
System.out.println(" ");
	}

public static void main(String[]args){

	String tumpukan[] = new String[10];
	PUSH (tumpukan, "Buku A");
	PUSH (tumpukan, "Buku B");
	PUSH (tumpukan, "Buku C");
	PUSH (tumpukan, "Buku D");
	PUSH (tumpukan, "Buku E");
	PUSH (tumpukan, "Buku F");
	PUSH (tumpukan, "Buku G");
	System.out.println("POP: " + POP(tumpukan));
	System.out.println("POP: " + POP(tumpukan));
	System.out.println("POP: " + POP(tumpukan));
	System.out.println("POP: " + POP(tumpukan));
	lihatTumpukan(tumpukan);
	}}