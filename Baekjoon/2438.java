import java.util.Scanner;
//메모리15196 코드길이291
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		for(int i = 0; i < line; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}