import java.util.*;

public class Application {
    public static void main (String[] args) {

        Deque<String> dequeA = new ArrayDeque<>();
        Random generator = new Random();

        for (int i=0; i < 50; i++) {
            String letterA = "" ;
            int generatedQuantity = generator.nextInt(50);
            for (int n=0; n <= generatedQuantity; n++) {
                letterA = letterA +"a";
            }
            dequeA.offer(letterA);
        }

        Iterator<String> dequeAiter = dequeA.iterator();
        while (dequeAiter.hasNext()) {
            String currentA = dequeAiter.next();
            System.out.println(currentA);
        }

        EvenAndOdd eAo = new EvenAndOdd();
        eAo.executeSeparation(dequeA);



    }
}
