import java.util.Stack;

public class App {
    public static void main(String[] args) {
        // Đảo ngược phần tử trong mảng số nguyên
        int[] nums = new int[] { 6, 2, 1, 3, 5, 4 };
        Stack<Number> nStack = new Stack<Number>();

        for (int i = 0; i < nums.length; i++) {
            nStack.push(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nStack.pop().intValue();
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("");
        // Đảo ngược chuỗi
        String chuoi = "CodeGym";
        String[] mWords = chuoi.split("");
        Stack<String> wStack = new Stack<String>();

        for (int i = 0; i < mWords.length; i++) {
            wStack.push(mWords[i]);
        }
        String outp = "";
        for (int i = 0; i < mWords.length; i++) {
            outp += wStack.pop();
        }
        System.out.println(outp);
    }
}
