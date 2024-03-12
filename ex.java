import java.util.Scanner;

public class ex {
    public static void main (String [] args) {
        try (Scanner scanner = new Scanner (System.in)) { // Ao usar o bloco try com o Scanner, você pode garantir que o método close() seja chamado 
            System.out.println("What's your name? ");
            String name = scanner.nextLine();
            System.out.println("How old are you?");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("What's yout favorite food?");
            String food = scanner.nextLine();


            System.out.println("Hello" + name);
            System.out.println("You are " + age + "years old");
            System.out.println("You like" + food);
        }
    }
}
