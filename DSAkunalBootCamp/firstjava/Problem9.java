package KunalDSABootCamp.firstjava;
// WAP to find an armstrong number between two given numbers
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("Armstrong number between "+firstNumber+" and "+secondNumber+"are: ");
        for (int i=firstNumber;i<=secondNumber;i++){
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum= num;
        int sum = 0;
        while (num>0){
            int digit = num%10;
            sum += Math.pow(digit,3);
            num/=10;
        }
        return originalNum == sum;
    }
}
