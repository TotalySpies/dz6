import java.util.*;

public class d1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 30; i++)
            numbers.add(random.nextInt(30));
        System.out.println(numbers);

        Set<Integer> setUniqueNumber = new HashSet<Integer>(numbers);
        for (int a : setUniqueNumber) {
         setUniqueNumber.add(a);
            System.out.println("Unique"+a);

        }
    }
}





