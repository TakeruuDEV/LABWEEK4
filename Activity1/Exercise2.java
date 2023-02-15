package ACTIVITY1;

public class Exercise2 {
	public static double potencia(double x, int n) {
	    if (n == 0) {
	        return 1;
	    } else if (n > 0) {
	        return x * potencia(x, n - 1);
	    } else {
	        return 1 / potencia(x, -n);
	    }
	}
	public static double Delta(double a, double b, double c) {
	    double bQuadrado = potencia(b, 2);
	    double delta = bQuadrado - 4 * a * c;
	    return delta;
	}
	public static void main(String[] args) {
	    double a = 1.0;
	    double b = 2.0;
	    double c = -3.0;

	    double delta = Delta(a, b, c);

	    System.out.println("Delta = " + delta);
	}

}
