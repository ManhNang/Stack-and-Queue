import java.util.Map;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        String text = "Chào em! Anh đứng đây từ chiều. Em có thể cho anh...";
        Map<String, Integer> wordMap = new TreeMap<>();

        String[] words = text.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase()
                    .replaceAll("[^a-zA-Z0-9àáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễđìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹ]", "");

            if (word.isEmpty()) {
                continue;
            }

            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }
        System.out.println("Kết quả đếm từ (theo thứ tự bảng chữ cái):");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}