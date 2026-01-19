public class Exam5 {
    public static void main(String[] args) {
        addition(5 ,3);
        subtraction(5 ,3);
        multiplication(5 ,3);
        division(5 ,3);
        remainder(5 ,3);
    }


    static int addition(int num1, int num2) {
        int answer = num1 + num2;
        System.out.println(answer);
        return answer;
    }

    static int subtraction(int num1, int num2) {
        int answer = num1 - num2;
        System.out.println(answer);
        return answer;
    }

    static int multiplication(int num1, int num2) {
        int answer = num1 * num2;
        System.out.println(answer);
        return answer;
    }
    static int division(int num1, int num2) {
        int answer = num1 / num2;
        System.out.println(answer);
        return answer;
    }

    static int remainder(int num1, int num2) {
        int answer = num1 % num2;
        System.out.println(answer);
        return answer;
    }

}
