package ACTIVITY1;
	import java.util.Scanner;
public class Exercise3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite a dimensão da matriz: ");
	        int n = scanner.nextInt();
	        double[][] matriz = lerMatriz(n, scanner);

	        System.out.println("Matriz:");
	        imprimirMatriz(matriz);

	        double det = determinante(matriz);
	        System.out.println("Determinante: " + det);

	        boolean simetrica = verificarSimetria(matriz);
	        System.out.println("Simétrica? " + simetrica);
	    }
	    public static double[][] lerMatriz(int n, Scanner scanner) {
	        double[][] matriz = new double[n][n];

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
	                matriz[i][j] = scanner.nextDouble();
	            }
	        }

	        return matriz;
	    }
	    public static void imprimirMatriz(double[][] matriz) {
	        int n = matriz.length;

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	    public static double determinante(double[][] matriz) {
	        int n = matriz.length;

	        if (n == 1) {
	            return matriz[0][0];
	        } else {
	            double det = 0;

	            for (int j = 0; j < n; j++) {
	                double[][] submatriz = new double[n - 1][n - 1];
	                for (int i = 1; i < n; i++) {
	                    for (int k = 0; k < n; k++) {
	                        if (k < j) {
	                            submatriz[i - 1][k] = matriz[i][k];
	                        } else if (k > j) {
	                            submatriz[i - 1][k - 1] = matriz[i][k];
	                        }
	                    }
	                }
	                det += matriz[0][j] * Math.pow(-1, j) * determinante(submatriz);
	            }
	            return det;
	        }
	    }
	    public static boolean verificarSimetria(double[][] matriz) {
	        int n = matriz.length;

	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (matriz[i][j] != matriz[j][i]) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	}


