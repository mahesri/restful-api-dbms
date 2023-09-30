import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class masterProgram {

    public static int N = 10;
    public static Scanner in = new Scanner(System.in);

    public static void ngentriData(formatBiodata biodataMahasiswa[]) {
        int bacaTombol = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Silahkan masukan nama Anda : ");
            biodataMahasiswa[i].nama = in.next();
            System.out.print("Silahkan masukan alamat Anda : ");
            biodataMahasiswa[i].alamat = in.next();
            System.out.print("Silahkan masukan umur Anda : ");
            biodataMahasiswa[i].umur = in.nextInt();
            System.out.print("Silahkan masukan jenis Kelamin Anda : ");
            try {
                bacaTombol = System.in.read();
            } catch (java.io.IOException e) {
            }
            biodataMahasiswa[i].jekel = (char) bacaTombol;
            System.out.println("Silahkan masukan hobi (Maks 3)");
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukan hobi ke-" + (j) + " : ");
                biodataMahasiswa[i].hobi[j] = in.next();
            }
            System.out.print("Silahkan masukan IPK Anda : ");
            biodataMahasiswa[i].ipk = in.nextFloat();
            System.out.println(" ");
        }
    }

    public static void tambahDataDiTengah(formatBiodata biodataMahasiswa[]) {

        formatBiodata biodataMahasiswaBaru = new formatBiodata();
        int bacaTombol = 0;
        int T;
        System.out.print("Silahkan masukan nama Anda : ");
        biodataMahasiswaBaru.nama = in.next();
        System.out.print("Silahkan Masukan alamat Anda : ");
        biodataMahasiswaBaru.alamat = in.next();
        System.out.print("Silahkan masukan umur Anda : ");
        biodataMahasiswaBaru.umur = in.nextInt();
        System.out.print("Silahkan masukan jenis kelamin Anda : ");
        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        biodataMahasiswaBaru.jekel = (char) bacaTombol;
        System.out.println("Silahkan masukan hobi Anda (Maks 3)");
        for (int i = 0; i < 3; i++) {

            System.out.print("Masukan hobi ke-" + (i) + " : ");
            biodataMahasiswaBaru.hobi[i] = in.next();
        }
        System.out.print("Silahkan masukan IPK Anda : ");
        biodataMahasiswaBaru.ipk = in.nextFloat();

        System.out.println("Pada data keberapa Anda ingin menambahkan Nilai : ");
        T = in.nextInt();

        for (int i = N - 1; i >=T; i--) {

            biodataMahasiswa[i + 1] = biodataMahasiswa[i];
        }
        biodataMahasiswa[T] = biodataMahasiswaBaru;
        N++;

    }

    public static void tampilkanData(formatBiodata biodataMahasiswa[]) {

        System.out.println("--------------------------------------------");
        System.out.println("NAMA ALAMAT UMUR JEKEL HOBI[1] HOBI[2] HOBI[3] IPK");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < N; i++) {
            System.out.print(biodataMahasiswa[i].nama + "\t");
            System.out.print(biodataMahasiswa[i].alamat + "\t");
            System.out.print(biodataMahasiswa[i].umur + "\t");
            System.out.print(biodataMahasiswa[i].jekel + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(biodataMahasiswa[i].hobi[j] + "\t");
            }
            System.out.println(biodataMahasiswa[i].ipk + "\t");
        }
        System.out.println("--------------------------------------------");
    }

    public static void main(String[] args) {
        formatBiodata biodataMahasiswa[] = new formatBiodata[N + 1];
        biodataMahasiswa[0] = new formatBiodata();
        biodataMahasiswa[1] = new formatBiodata();
        biodataMahasiswa[2] = new formatBiodata();
        biodataMahasiswa[3] = new formatBiodata();
        biodataMahasiswa[4] = new formatBiodata();
        biodataMahasiswa[5] = new formatBiodata();
        biodataMahasiswa[6] = new formatBiodata();
        biodataMahasiswa[7] = new formatBiodata();
        biodataMahasiswa[8] = new formatBiodata();
        biodataMahasiswa[9] = new formatBiodata();

        ngentriData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);
        tambahDataDiTengah(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);
    }
}
