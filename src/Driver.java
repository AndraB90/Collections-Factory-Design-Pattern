import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(PersonFactory.generatePerson());
        }

        /* Sortare in functie de nume
        Comparator<Person> compareByName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(list, compareByName);

*/

        /* Sortare in functie de varsta

        Comparator<Person> compareByAge = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Collections.sort(list, compareByAge);*/

        //Collections.sort(list, (o1, o2)->o1.getName().compareTo(o2.getName()));

        //Collections.sort(list, (o1, o2)->Integer.compare(o1.getAge(), o2.getAge()));

         


        for (Person p : list) {

            System.out.println(p);

        }


    }
}
