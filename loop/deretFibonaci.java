import java.util.Scanner;

public class deretFibonaci {

    public static void main (String[]args) {
    
    Scanner in = new Scanner(System.in);

    int fN, fN_1, fN_2, N;
    
    System.out.print("Masukan deret fibonaci ke - : ");
    N = in.nextInt();

        fN_2 = 0;
        fN_1 = 1;
        fN = 1;
        
    for(int i = 0; i <= N;i++){

        System.out.println("perulangan ke - "+i+" menjadi " +fN);
        fN = fN_1 + fN_2;
        fN_2 = fN_1;
        fN_1 = fN;
        


    }



    }
}
