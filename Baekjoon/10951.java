import java.util.Scanner;

public class Main {
//Memory 14500 Time 128
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			System.out.println(i+j);
		}

	//아래와 같이 가능하긴 하지만 런타임 에러 : EOF가 명확하지 않음
	//엔터를 한 번 더 쳐야 END로 인식하기 때문
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		
		while (true) {
			String line = br.readLine();
			if(line.isEmpty()) {
				break;
			}
			StringTokenizer str = new StringTokenizer(line, " ");

			int a = Integer.parseInt(str.nextToken());
			int b = Integer.parseInt(str.nextToken());
			
			sb.append((a+b) + "\n");
		}
		System.out.println(sb);
		
    }
}
