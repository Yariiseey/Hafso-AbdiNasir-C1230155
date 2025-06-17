import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        // Sentinel Value
        int sum = 0;
        char n='n';

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to add \nPress n to exit: ");
        System.out.println("Enter an integer number: ");
        //int number = input.nextInt();
        String userinput = input.nextLine();

        while (!userinput.equalsIgnoreCase("n")) {
            int number=Integer.parseInt(userinput);

            sum += number ;

            System.out.println("Enter an integer number: ");
            //userinput=input.nextLine();
            userinput = input.nextLine();

        }


        System.out.println("The Sum: " + sum);
//        n++;
//        sum++;

    }
}