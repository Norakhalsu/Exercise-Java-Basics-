import java.util.Scanner;

public class Ex1Day2 {


    /*public static void main(String[] args) {
        /* 1.Develop a program that takes the weight (in kilograms) and height (in meters)
        as input and calculates the BMI, then prints it.
        • Input: Weight (kg) = 70, Height (m) = 1.75
        • Expected Output: BMI = 22.86   */

     /*   Scanner scan = new Scanner(System.in);

        System.out.println(" Enter your weight");
        double weight = scan.nextFloat();

        System.out.println("Enetr your height");
        double height = scan.nextFloat();

        double BMI = calculateBMI(weight, height);
        System.out.println( "you mbi id:  %.2f % n " + BMI );
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }   */


    /* public static void main(String[] args) {

   /* 2.Write a program that takes the obtained marks and total marks as input and
    calculates the percentage, then prints it.
    •Input: Obtained Marks = 85, Total Marks = 100
     • Expected Output: Percentage = 85.0%    */

      /* Scanner scan=new Scanner(System.in);

       System.out.println("Enter obtained mark ");
       double obtained= scan.nextDouble();
       System.out.println("Enter Total Marks ");
       double total=scan.nextDouble();

       double percentage=calculatesPercentage(obtained,total);
       System.out.println("your percentge is " + percentage);

}
    public static double calculatesPercentage(double obtained ,double total  ){
        double  v = (obtained / total) * 100;
        return  v;
    }  */


    public static void main(String[] args) {
        /* 3.Create a program that takes an amount in one currency and an exchange rate as
         input, then converts and prints the amount in another currency.
         • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
         • Expected Output: Amount in EUR = 85.0     */

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter amount in USD ");
        int amount= scan.nextInt();

        System.out.println("Enter  Exchange Rate ");
        double ExchangeRate= scan.nextDouble();

        //double AmountinEUR=take_amount _one_currency(amount,ExchangeRate);

    }




}
