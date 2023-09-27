public static void tambahDataDiTengah(formatBiodata bidataMahasiswa[]){

    formatBiodata biodataMahasiswaBaru = formatBiodata();
    Scanner in = new Scanner(System.in);

    System.out.print("Silahkan masukan nama Anda : ");
	biodataMahasiswaBaru.nama = in.next();
	System.out.print("Silahkan masukan alamat Anda : ");
	biodataMahasiswaBaru.alamat = in.next();
	System.ou.print("Silahkan masukan jenis kelamin Anda : ");
	try{
	bacaTombol = System.in.read();
		}catch(java.io.IOException e){}
		biodataMahasiswaBaru.jekel = (char)bacaTombol;
	System.out.println("Silahkan masukan Hobi Anda (Maks 3)");
	System.out.print("Masukan hobi-0 : ");
	biodataMahasiswaBaru.hobi[0] = in.next();
	System.out.print("Masukan hobi-1 : ");
	biodataMahasiswaBaru.hobi[1] = in.next();
	System.out.print("Masukan hobi-2 : ")
	biodataMahasiswaBaru.hobi[2] = in.next();
	System.out.print("Silahkan masukan IPK Anda : ");
	biodataMahasiswaBaru.ipk = in.nextFloat();

    int T;
    System.out.print("Pada posisi berapa data dimasukan : ");
    T in.nextInt();

    for(int i = N - 1; i >=T; i-- ){
        biodataMahasiswa[i + 1] = biodataMahasiswaBaru[i];
    }

    biodataMahasiswa[T] = biodataMahasiswa;
    N++;
}