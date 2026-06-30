import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số thập phân: ");
        int decimalNumber = scanner.nextInt();

        int originalNumber = decimalNumber;
        Stack<Integer> stack = new Stack<>();
        if (decimalNumber == 0) {
            stack.push(decimalNumber);
        }
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber = decimalNumber / 2;
        }

        String binaryString = "";
        while (!stack.isEmpty()) {
            binaryString += stack.pop();
        }
        System.out.println("Số thập phân " + originalNumber + " chuyển sang nhị phân là: " + binaryString);
        scanner.close();
    }
}