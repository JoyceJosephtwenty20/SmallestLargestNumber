import java.util.Scanner;

public class SmallestLargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();
// Largest Number

        if (num1>num2 && num1 > num3){
            System.out.println("The largest number: " + num1);
            }
        else if (num2 > num3){
            System.out.println("The largest number: " + num2);
            }
        else {
            System.out.println("The largest number:" + num3);
        }
 // The Smallest Number

        if (num1<num2 && num1 < num3){
            System.out.println("The smallest number: " + num1);
        }
        else if (num2 < num3){
            System.out.println("The smallest number: " + num2);
        }
        else {
            System.out.println("The smallest number:" + num3);
        }
    }
}
