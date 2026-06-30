import java.util.ArrayDeque;
import java.util.Queue;

class Record {
    private String name;
    private String gender;
    private String birthDay;

    public Record(String name, String gender, String birthDay) {
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " | " + gender + " | " + birthDay;
    }
}

class DemergingService {
    public static Queue<Record> demergeRecords(Queue<Record> inputList) {
        Queue<Record> nuQueue = new ArrayDeque<>();
        Queue<Record> namQueue = new ArrayDeque<>();

        while (!inputList.isEmpty()) {
            Record p = inputList.poll();
            if ("NU".equalsIgnoreCase(p.getGender())) {
                nuQueue.offer(p);
            } else if ("NAM".equalsIgnoreCase(p.getGender())) {
                namQueue.offer(p);
            }
        }

        Queue<Record> output = new ArrayDeque<>();
        while (!nuQueue.isEmpty()) {
            output.offer(nuQueue.poll());
        }

        while (!namQueue.isEmpty()) {
            output.offer(namQueue.poll());
        }

        return output;
    }
}

public class App {
    public static void main(String[] args) {
        Queue<Record> inputList = new ArrayDeque<>();
        inputList.offer(new Record("Nang", "Nam", "13/11/2000"));
        inputList.offer(new Record("Vinh", "Nam", "13/8/2005"));
        inputList.offer(new Record("Tra", "Nu", "12/2/2007"));
        inputList.offer(new Record("My", "Nu", "22/2/2008"));

        Queue<Record> output = DemergingService.demergeRecords(inputList);

        while (!output.isEmpty()) {
            System.out.println(output.poll().toString());
        }
    }
}