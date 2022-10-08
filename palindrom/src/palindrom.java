import java.util.Scanner;

public class palindrom {

    static boolean isPalindrom(int number){
        int tempNumber = number, reverseNumber = 0, lastNumber;
        while (tempNumber!=0){
            lastNumber = tempNumber%10; // Girdiğimiz sayının son karakterini al.
            reverseNumber = (reverseNumber * 10) + lastNumber; // reverse number 0'dan başladığı için ilk reverse number last numbera eşit olacak
            tempNumber /=10; //Girilen sayının son basamağını siler int/int = int olduğundan dolayı

        }

        if (reverseNumber==number) {
            System.out.println("Girdiğiniz sayı Palindrom sayıdır.");
            return true;
        }
        else {
            System.out.println("Girdiğiniz sayı Palindrom sayı değildir.");
            return false;
        }
    }

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Lütfen bir sayı giriniz: ");
            int p = input.nextInt();
            System.out.print(isPalindrom(p));
    }
}
