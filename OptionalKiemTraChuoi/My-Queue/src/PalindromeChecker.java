import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi cần kiểm tra: ");
        String inputString = scanner.nextLine();
        String cleanedString = inputString.toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < cleanedString.length(); i++) {
            char c = cleanedString.charAt(i);
            stack.push(c);
            queue.offer(c);
        }

        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + inputString + "\" LÀ chuỗi Palindrome.");
        } else {
            System.out.println("\"" + inputString + "\" KHÔNG PHẢI là chuỗi Palindrome.");
        }

        scanner.close();
    }
}