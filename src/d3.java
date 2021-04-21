import java.util.ArrayList;
import java.util.HashSet;

public class d3 {
    public static void main(String[] args) {
        ArrayList<Integer> mark = new ArrayList<Integer>();
        mark.add(3);
        mark.add(4);
        mark.add(4);
        mark.add(3);
        System.out.println(mark);

        ArrayList<String> surname = new ArrayList<String>();
        surname.add("Donatan");
        surname.add("Armu");
        surname.add("Don");
        surname.add("Atan");
        String [] array = surname.toArray(new String[surname.size()]);
        System.out.println(surname);



    }
}


