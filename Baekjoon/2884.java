import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < 45) {
			m = m + 60;
			h--;
			if(h < 0) {
				h = 23;
			}
		} 
		System.out.println(h + " " + (m-45));
	}
}
