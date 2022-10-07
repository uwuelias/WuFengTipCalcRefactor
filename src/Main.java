import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the bill amount.");
        double bill = scan.nextDouble();
        System.out.println();
        System.out.print("Please enter the percentage you want to tip.");
        int tip = scan.nextInt();
        System.out.println();
        System.out.print("Please enter the number of people you want to spilt the bill amongst.");
        int people = scan.nextInt();
        TipCalculator tipCalc = new TipCalculator(bill, tip, people);
        System.out.println("Total cost before tip: $" + String.format("%.2f",tipCalc.getTotalBillBeforeTip()));
        System.out.println("Tip percentage: " + tipCalc.getTipPercentage()*100 + "%");
        System.out.println("Total tip amount: $" + String.format("%.2f",tipCalc.tipAmount()));
        System.out.println("Total bill after tip: $" + String.format("%.2f",tipCalc.totalBill()));
        System.out.println("Per person cost before tip: $" + String.format("%.2f",tipCalc.perPersonCostBeforeTip()));
        System.out.println("Per person tip amount: $" + String.format("%.2f",tipCalc.perPersonTipAmount()));
        System.out.println("Per person cost after tip: $" + String.format("%.2f",tipCalc.perPersonTotalCost()));
    }
}
