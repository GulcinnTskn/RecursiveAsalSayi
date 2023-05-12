import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        asal();
    }
        static void asal(){

            Scanner input = new Scanner(System.in);
            int sayi;
            System.out.print("Bir sayı giriniz: ");
            sayi = input.nextInt();

            int sayac = 0;
            for(int i = 2 ; i < sayi ; i++){
                if(sayi % i == 0){
                    sayac++;
                }
            }
            if(sayac == 0){
                System.out.println(sayi + " sayısı ASALDIR ! ");
            }else{
                System.out.println(sayi + " sayısı ASAL değildir !");

            }
        }
}