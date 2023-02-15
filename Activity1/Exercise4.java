package ACTIVITY1;
import java.util.Scanner;
public class Exercise4 {
	public static int fibonacci(int n) {
	    if (n <= 1) {
	        return n;
	    } else {
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
		System.out.print("Digite a posição para saber o valor: ");
		int n = scanner.nextInt();
	    int resultado = fibonacci(n);
	    System.out.println("O " + n + "º número na sequência de Fibonacci é " + resultado);
	scanner.close();
	}
}
