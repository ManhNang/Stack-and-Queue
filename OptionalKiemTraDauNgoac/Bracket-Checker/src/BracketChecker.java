import java.util.Scanner;
import java.util.Stack;

public class BracketChecker {

    public static boolean checkBrackets(String expression) {
        Stack<Character> bStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char sym = expression.charAt(i);
            if (sym == '(') {
                bStack.push(sym);
            } else if (sym == ')') {
                if (bStack.isEmpty()) {
                    return false;
                }
                char left = bStack.pop();
                if (left != '(') {
                    return false;
                }
            }
        }
        return bStack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào biểu thức cần kiểm tra: ");
        String expression = scanner.nextLine();

        if (checkBrackets(expression)) {
            System.out.println("Biểu thức sử dụng ĐÚNG dấu ngoặc");
        } else {
            System.out.println("Biểu thức sử dụng SAI dấu ngoặc");
        }

        scanner.close();
    }
}