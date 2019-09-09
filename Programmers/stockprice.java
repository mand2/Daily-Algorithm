// 입력값 〉	[1, 2, 3, 2, 3]
// 기댓값 〉	[4, 3, 1, 1, 0]
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0 ; i < prices.length-1 ; i++){

            for(int j = i+1 ; j < prices.length ; j++){
 
                answer[i] = j-i;                    

                if(prices[i] > prices[j]){
                    break;
                }
            }

        }
            
        return answer;
    }
}