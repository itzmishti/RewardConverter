import java.util.Scanner;

class RewardValue
{
    double v1,v2;
    // RewardValue(double val)   {
    //      v1=val;
    // }
    RewardValue(double cashValue)
    {
         v2= cashValue;
    }
    double getCashValue(double val)
    {
        return v2;
    }
    double getMilesValue()
    {
        return v2*0.0035;
    }
};
public class RewardsConverter {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Credit Card Rewards Converter!");
            System.out.println("Please enter a cash value to convert to airline miles: ");
            var input_value = scanner.nextLine();
            double cashValue;
            try {
                cashValue = Double.parseDouble(input_value);
            } catch (NumberFormatException exception) {
                System.out.println("Could not parse input value as a double, exiting");
                return;
            }
            System.out.println("converting $" + input_value + " to miles");
            var rewardsValue = new RewardValue(cashValue);
            System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
        }
    }
}