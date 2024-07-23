import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int inputNumber= 0, total=0;
        Scanner input = new Scanner(System.in);

        while(inputNumber >= 0){
            System.out.print("Bir sayı giriniz: ");
            inputNumber = input.nextInt();

            if (inputNumber == 1){
                System.out.println(inputNumber + " Mükemmel sayı değildir..");

            } else {
                total=0;
                for(int i = 1; i < inputNumber; i++){
                    if(inputNumber % i == 0){
                        total+= i;
                    }
                }

                if (total == inputNumber){
                    System.out.println(inputNumber + " Mükemmel sayıdır.");
                } else {
                    System.out.println(inputNumber + " Mükemmel sayı değildir..");
                }
                System.out.println("===================");
            }
        }
    }
}