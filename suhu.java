package suhu;

import java.util.Scanner;

public class suhua {

    public static void main(String[] args) {
        double C;
        double R;
        double F;
        double K;
        int pilihan = 0;
        System.out.println("+-------------------------+");
        System.out.println(" PROGRAM KONVERSI SUHU AIR ");
        System.out.println("+-------------------------+");
        do {
            Scanner input = new Scanner(System.in);
        
            System.out.println("Input Data");
            System.out.println("----------");
            System.out.println("Suhu Dalam Celcius  : ");C = input.nextDouble();
            R = (4 * C)/5;
            F = (9 * C)/5 + 32;
            K = C + 273.15;

            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.println("Pilih   : ");pilihan = input.nextInt();

            if (pilihan == 1 ){
                System.out.println("Suhu Dalam Celcius      : "+ C + "°C");
                System.out.println("Suhu Dalam Fahrenheit   : "+ F + "°F");
                System.out.println("Suhu Dalam Reamur       : "+ R + "°R");
                System.out.println("Suhu Dalam Kelvin       : "+ K + "°K");
                System.out.println("Kondisi Air Normal.");
                pilihan = 2;
            } else if (pilihan == 2 ){
                System.out.println(" ");
            }else if (pilihan == 3 ){
                System.out.println("Exit");
            } else {
                System.out.println("opsi tidak ada, Mohon masukan opsi dengan benar!");
                pilihan = 2;
            }
            
        }while(pilihan==2);
    }
    
}