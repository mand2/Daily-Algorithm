import java.util.Scanner;


//메모리 14496  코드길이 380
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
       		int[] sum = new int[line];
		for(int i = 0; i < line ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum[i] = a+b;
		}
        
        	for(int a : sum){
			System.out.println(a);
       		}
	}
}

//메모리 14516  코드길이 276
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		for(int i = 0; i < line ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}
}

