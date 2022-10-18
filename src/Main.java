import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many line and columns?");
		
		int n = scanner.nextInt();
		int[][] matriz = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("Value: ");
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		int count = 0;
		
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n; j++) {
				if(matriz[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers in the matrix: " + count);
		
		scanner.close();
	}
}
