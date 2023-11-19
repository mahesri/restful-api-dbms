public class program_antrian {

    private static int N = 5;
    private static int belakang = -1;

    public static void ENQUEUE(String antrian[], String data) {
        if (belakang == N - 1) {
            System.out.println("Antrian penuh! ENQUEUE " + data + " tidak dapat dilakukan");
        } else {
            belakang = belakang + 1;
            antrian[belakang] = data;
            System.out.println("ENQUEUE " + data + " berhasil..");
        }
    }

    public static String DEQUEUE(String antrian[]) {
        String hasil;
        if (belakang < 0) {
            hasil = "ANTRIAN KOSONG, DEQUEUE GAGAL DILAKUKAN";
        } else {
            hasil = antrian[0];

            // Perulangan untuk menggeser data kedua sampai data ke-N habis tergeser kedepan
            for (int i = 0; i < belakang; i++) {
                antrian[i] = antrian[i + 1];
            }
            belakang = belakang - 1;
        }
        return hasil;
    }

    public static void lihatAntrian(String antrian[]) {
        System.out.println("------------------------------------------");
        System.out.print("ISI ANTRIAN : (depan)");

        for (int i = 0; i <= belakang; i++) {
            System.out.print(" " + antrian[i]);
        }

        System.out.println(" (belakang)");
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
		String antrian[] = new String[5];
		ENQUEUE(antrian, "Mobil A");
        ENQUEUE(antrian, "Mobil B");
        ENQUEUE(antrian, "Mobil C");
        ENQUEUE(antrian, "Mobil D");
		ENQUEUE(antrian, "Mobil E");
        ENQUEUE(antrian, "Mobil F");
        System.out.println("deQueue: " + DEQUEUE(antrian));
        System.out.println("deQueue: " + DEQUEUE(antrian));
        System.out.println("deQueue: " + DEQUEUE(antrian));
        System.out.println("deQueue: " + DEQUEUE(antrian));
        System.out.println("deQueue: " + DEQUEUE(antrian));
		lihatAntrian(antrian);

        // Perbaikan: Menggunakan nilai yang dikembalikan dari DEQUEUE dan mencetaknya
        String hasilDequeue = DEQUEUE(antrian);
        System.out.println("DEQUEUE: " + hasilDequeue);

        // Menampilkan antrian setelah DEQUEUE
        lihatAntrian(antrian);
    }}
