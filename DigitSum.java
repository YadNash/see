public class DigitSum {
    public static void main(String[] args) {
        int digitSum = 999;
        while (digitSum >= 10) {
            digitSum = getDigitSum(digitSum);
            
        }
        System.out.println("Current Digit Sum: " + digitSum);
    }
        private static int getDigitSum(int num) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;

    }    
}
