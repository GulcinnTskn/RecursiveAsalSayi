import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        asal();
    }
        static void asal(){

            Scanner input = new Scanner(System.in);
            int number;
            System.out.print("Bir sayı giriniz: ");
            number = input.nextInt();

            int sayac = 0;
            for(int i = 2 ; i < number ; i++){
                if(number % i == 0){
                    sayac++;
                }
            }
            if(sayac == 0){
                System.out.println(number + " sayısı ASALDIR ! ");
            }else{
                System.out.println(number + " sayısı ASAL değildir !");

            }
        }
}