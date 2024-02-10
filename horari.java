package ex1;
import java.util.Scanner;

public class horari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora;

        System.out.print("Ingresa un número entre 0 y 23: ");
        if (scanner.hasNextInt()) {
            hora = scanner.nextInt();
            if (hora >= 9 && hora <= 17) {
                System.out.println("Treball");
            } else {
                System.out.println("No Treball");
            }
        } else {
            System.out.println("Entrada invalida");
        }
    }
}