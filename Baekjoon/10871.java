import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
//Ǯ�� 1: �޸� 15684 �ڵ���� 854
/*
BufferedReader / Writer �� ���� �ڵ尡 ���������,
�Է� �޴� �� �������� ���������� 
�޸� �뷮�� Scanner���� ������!
*/
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = br.readLine();
		StringTokenizer str = new StringTokenizer(line, " ");
		
		int N = Integer.parseInt(str.nextToken());
		int X = Integer.parseInt(str.nextToken());
		
		line = br.readLine();
		str = new StringTokenizer(line, " ");
		for(int i = 0; i < N ; i++) {
			int small = Integer.parseInt(str.nextToken());
			if(small < X) {
				bw.write(String.valueOf(small + " "));
			}
		}
		bw.flush();
		
	}
}



import java.util.Scanner;
public class Main {
//Ǯ�� 2: �޸� 29188 �ڵ���� 345
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		for(int a : arr) {
			if(a < X) {
				System.out.print(a + " ");
			}
		}
	}
}