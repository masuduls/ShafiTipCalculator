import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to the tip calculator!");
        System.out.print("Enter the amount of people in your group: ");
        int totalPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the tip percentage (0-100): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();
        double dishCost = 0;
        double totalCost = 0;
        while (dishCost != -1) {
            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            dishCost = scan.nextDouble();
            totalCost += dishCost;
            scan.nextLine();
        }
        totalCost ++;
        System.out.println("Total bill before tip: " + formatter.format(totalCost));
        System.out.println("Tip percentage: " + tipPercentage + "%");
        double totalCostWithTip = totalCost * (((double) tipPercentage / 100) + 1);
        System.out.println("Total tip: " + (formatter.format(totalCostWithTip - totalCost)));
        System.out.println("Total bill with tip: " + formatter.format(totalCostWithTip));
        System.out.println("Per person cost before tip: " + (formatter.format(totalCost / totalPeople)));
        System.out.println("Tip per person: " + formatter.format(((totalCostWithTip - totalCost) / totalPeople)));
        System.out.println("Total cost per person: " + formatter.format((totalCostWithTip / totalPeople)));
    }
}
