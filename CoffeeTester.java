// Ma'laijah Garris

import java.util.Scanner;

public class CoffeeTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Coffee Hour!!!");

        // Create first Coffee object
        Coffee coffee1 = new Coffee();
        System.out.print("What’s the name of the first coffee? ");
        coffee1.setName(input.nextLine());

        System.out.print("What’s the caffeine content? ");
        double caffeine1 = input.nextDouble();
        input.nextLine(); // clear buffer
        coffee1.setCaffeineContent(caffeine1);

        // Create second Coffee object
        Coffee coffee2 = new Coffee();
        System.out.print("What’s the name of the second coffee? ");
        coffee2.setName(input.nextLine());

        System.out.print("What’s the caffeine content? ");
        double caffeine2 = input.nextDouble();
        coffee2.setCaffeineContent(caffeine2);

        // Display the results
        System.out.println();
        System.out.printf("It would take %.1f cups of %s before it’s dangerous to drink more.%n",
                coffee1.riskyAmount(), coffee1.getName());
        System.out.printf("It would take %.1f cups of %s before it’s dangerous to drink more.%n",
                coffee2.riskyAmount(), coffee2.getName());

        input.close();
    }
}
