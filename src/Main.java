//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int coffeeType = 2; // 1=Espresso, 2=Latte, 3=Cappuccino
        boolean hasMoney = true;
        int temperature = 85; // Machine temperature in Celsius

        // BUG ALERT! 🐛 The coffee machine is misbehaving!
        // Fix the conditions so it works properly

        if (hasMoney == true) { // Problem 1: Assignment instead of comparison
            System.out.println("💸 Insert coins, you cheapskate!");
            // Problem 2: Wrong temperature check
        } else if (temperature < 50) {
            System.out.println("🔥 Machine too hot! Wait 2 minutes.");
            // Problem 3: Assignment instead of comparison
        } else if (coffeeType != 1)  {
            System.out.println("☕ Here's your bitter Espresso, enjoy the caffeine kick!");
        } else if (coffeeType == 2) {
            System.out.println("🥛 One creamy Latte coming up!");
        } else if (coffeeType == 3) {
            System.out.println("☕ Fancy Cappuccino with extra foam!");
        } else {
            System.out.println("🤖 Error 404: Coffee not found. Try turning me off and on again!");
        }

    }
}