package tatje.jordi.ex1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introdueix un numero per saber la puntuació amb estrelles: ");
		int num = scanner.nextInt();
		
        if (num == 0) {
            System.out.println("-");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}