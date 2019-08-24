import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		int[] arr = new int[num];
		
		for (int i = 0; i < num ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int j = 0; j < num; j++) {
			for(int k = 1; k < num ; k++) {
				
				if(arr[k-1] > arr[k] ) {
					int temp = arr[k];
					arr[k] = arr[k-1];
					arr[k-1] = temp;
				}
			}
		}
		
		for(int a : arr) {
			bw.write(String.valueOf(a));
			bw.newLine();
		}
		
		bw.flush();
	}
}
