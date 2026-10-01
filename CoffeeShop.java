import java.util.Scanner;
public class CoffeeShop {
    public static void main(String[] args)
    {
        System.out.println("Menu");
        System.out.println("Coffee Shop");
        System.out.println("1 - Espresso");
        System.out.println("2 - Latte");
        System.out.println("3 - Cuppuccino");
        System.out.println("4 - Mocha");
        
        Scanner choice = new Scanner(System.in);
        System.out.println("Enter your choice (1-4)");
        int ch = choice.nextInt();
        
        switch(ch) {
            case 1:
            System.out.println("Espresso");
        break;
            case 2:
            System.out.println("Latte");
        break;
            case 3:
            System.out.println("Cuppuccino");
        break;
            case 4:
            System.out.println("Mocha");
        break;
        default:
            System.out.println("Invalid choice");
}
}
}
