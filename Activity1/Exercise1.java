package ACTIVITY1;

public class Exercise1 {
	public static double potencia(double x, int n) {
	    if (n == 0) {
	        return 1;
	    } else if (n > 0) {
	        return x * potencia(x, n - 1);
	    } else {
	        return 1 / potencia(x, -n);
	    }
	}
	public static void main(String[] args) {
	    double x = 2.0;
	    int n = 5;
	    double resultado = potencia(x, n);
	    System.out.println("O resultado de " + x + " elevado a " + n + " é: " + resultado);
	}

}
