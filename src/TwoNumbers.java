public class TwoNumbers {

    public static int twoNumbers(int num1, int num2, int num3) {
        int sum = num1 + num2;
        int result = sum * num3;
        return result;
    }

    public static void main(String[] args) {
        int answer1 = twoNumbers(8, 4, 5);
        System.out.println("Test 1: (8 + 4) * 5 = " + answer1);

        int answer2 = twoNumbers(3, 7, 2);
        System.out.println("Test 2: (3 + 7) * 2 = " + answer2);

        int answer3 = twoNumbers(10, 5, 3);
        System.out.println("Test 3: (10 + 5) * 3 = " + answer3);
    }
}