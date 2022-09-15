import java.util.Scanner;

public class ConsoleStuff {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        sayHi();

    }

    public static void sayHi(){
        System.out.println("true = " + true);
    }
}
