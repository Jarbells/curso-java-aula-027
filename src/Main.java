import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			int square = i * i;
			int cube = i * i * i;			
			System.out.println(i + " " + square + " " + cube);
		}
		
		sc.close();
	}
}
