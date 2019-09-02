import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


//메모리41512 시간276 코드길이1587
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.parseInt(br.readLine());

		int[] num = new int[8001]; // 가능한 수가 절대값 4000 이내임
		int sum = 0;
		int max = -4000;
		int min = 4000;
		int temp;

		for (int i = 0; i < line; i++) {
			temp = Integer.parseInt(br.readLine());
			sum += temp;
			if (max < temp) {
				max = temp;
			}
			if (min > temp) {
				min = temp;
			}
			num[temp + 4000]++;
		}

		// 산술
		int avg = (int) Math.round((double) sum / line);

		int median = 0, mode = 0, accumulate = 0;
		boolean chk = false;
		ArrayList<Integer> modelist = new ArrayList<Integer>();

		int half = line % 2 == 1 ? line / 2 + 1 : line / 2; //중앙값을위함

		for (int i = 0; i < 8001; i++) {
			if (mode < num[i]) { //최빈값갱신	
				mode = num[i];
				modelist.clear();
				modelist.add(i);
			} else if (mode == num[i]) {
				modelist.add(i);
			}
			accumulate += num[i];
			if(!chk && accumulate >= half) {
				chk = true;
				median = i - 4000;
			}
		}
		if(modelist.size() == 1) {
			mode = modelist.get(0) - 4000;
		} else {
			mode = modelist.get(1) - 4000;
		}
		
		int range = max - min;
				
		System.out.println(avg);
		System.out.println(median);
		System.out.println(mode);
		System.out.println(range);
	}

}
