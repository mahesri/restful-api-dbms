public static void hapusDataDiDepan(formatBiodata biodataMahasiswa[]){

    for(int i = 0; i <= N-2;i++){
       biodataMahasiswa[i] = biodataMahasiswa[i+1]; 
    }
    System.out.println("Penghapusan data ke-0 sudah selesai");
    N--;
}