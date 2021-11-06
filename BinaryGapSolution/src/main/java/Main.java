
public class Main {

    public static void main(String[] args) {
        // write your code here
        int answer = new Solution().solution(1041);
        System.out.println(answer);
    }
}
class Solution {
    public int solution(int N) {
        int maxGap = 0;
        int currentGap = 0;
        boolean isGapStarted = false;
        //positive integers
        while (N > 0) {
            int lastDigit = N % 2;
            N = N / 2;
            if (lastDigit == 1) {
                if (isGapStarted) {
                    maxGap = Math.max(maxGap, currentGap);
                    currentGap = 0;
                }
                isGapStarted = true;
            } else {
                if (isGapStarted) {
                    currentGap++;
                }
            }
        }
        return maxGap;
    }
}
