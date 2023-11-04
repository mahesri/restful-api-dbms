public static void mengurutkanDataSelection(formatBiodata biodataMahasiswa[]){

	formatBiodata biodataSementara = new formatBiodata();
	String teksTerkecil = "";
	int lokasi = 0;

	//bagian mengurutkkan dengan teknik selection

	for(int i = 0 ; i <= N-2; i++){

	//data pertama yang dibaca dianggap data terkecil

	teksTerkecil = "zzzzzzz";

	//menentukan bilangan terkecil mulai larik ke i+1 sampai N-1

for (int S = i+1; S<=N-1; S++)
{
	if(biodataMahasiswa[S].nama.compareTo(teksTerkecil) < 0){
		//jika data[S] adalah bilangan terkecil simpan diteks terkecil

		teksterkecil = biodataMahasiswa[S].nama;
		lokasi = S;

		}}
//membandingkan data[lokasi] yang adalah data terkecil,
//versus data[i] yang adalah 'diagonal ke 1'
if(biodataMahasiswa[i].nama.compareTo(biodataMahasiswa[lokasi].nama)>0){
	//tukar posisi

biodataMahasiswa = biodataMahasiswa[i];
biodataMahasiswa[i] = biodataMahasiswa[lokasi];
biodataMahasiswa[lokasi] = biodataSementara;

	}

}