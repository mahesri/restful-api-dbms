import java.util.*;

public class Pemanasan {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean sikon = false;

		do {
			System.out.print("Masukan bilangan : ");
			int bil = in.nextInt();

			if (bil % 2 == 0) {

				System.out.println("Bilangan Genap!");

			} else {

				System.out.println("Bilangan Ganjil!");

			}

			System.out.println("Ingin melakukan pengecekan lagi? (Y/N) :");
			String jawaban = in.next();

			if (jawaban.equalsIgnoreCase("Y")) {

				sikon = true;
			} else {
				sikon = false;
			}

		} while (sikon);

	}

}