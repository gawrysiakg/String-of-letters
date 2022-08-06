import java.util.*;

public class EvenAndOdd {
    public EvenAndOdd() {
    }

    public void executeSeparation (Deque<String> theQueue) {
        List<String> executedEven = new ArrayList<>();
        List<String> executedOdd = new ArrayList<>();
        String temporaryString = null;
        int queueSize = theQueue.size();
        System.out.println("Iliść stworzonych obiektów z literą \"a\": "+theQueue.size());

        for (int n=0; n < queueSize; n++) {
            temporaryString = theQueue.poll();
            if (temporaryString.length() % 2 == 0) {
                executedEven.add(temporaryString);
            } else {
                executedOdd.add(temporaryString);
            }
        }
        System.out.println("Ilość elementów parzystych: "+executedEven.size());
        System.out.println("Ilość elementów nieparzystych: "+executedOdd.size());
    }
}
