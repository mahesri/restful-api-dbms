import java.util.Scanner;

public class array1 {

    /**
     * @param args
     */
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);

        float nilai[] = new float[5];
        float total;

        for(int i = 0;i < 5; i++){
            System.out.print("Masukan nilai : ");
            nilai[i] = in.nextFloat();
        }
        System.out.println("Data nilai yang Anda masukan :");
        for(int i = 0; i < 5;i++){
            System.out.println(nilai[i]);
        }
        total = 0;
        for(int i = 0; i < 5;i++){
            total = total + nilai[i];
           float rata = total / 5;
        }

       
        System.out.println("Total nilai = "+total+ " Dari keseluruhan data dengan rata-rata : "+rata);
        

    }

} 
