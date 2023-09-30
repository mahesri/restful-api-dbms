public static void hapusDataDiTengah(formatBiodata biodataMahasiswa[]){
   Scanner in = new Scanner(System.in);
   System.out.print("Tulislah posisi data yang akan dihapus: ");
   int T = in.nextInt();

   
   for( int i = T; i <= N-2;){
    biodataMahasiswa[i] = biodataMahasiswa[i+1];
   }
   System.out.println("Proses menghapus data dari ke-"+T+" Telah selesai ");
   N--;
}