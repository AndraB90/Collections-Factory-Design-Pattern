import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PersonFactory {

    static Random generator = new Random();

    static ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Andra", "Tudor", "Maria", "George", "Mihai", "Ion"));
    static ArrayList<Integer> ageList = new ArrayList<>(Arrays.asList(23, 44, 55, 67, 23, 19));

    static ArrayList<Character> genderList = new ArrayList<>(Arrays.asList('f', 'm'));

    static ArrayList<Integer> heightList = new ArrayList<>(Arrays.asList(160, 187, 155, 178, 200, 166));


    public static Person generatePerson() {
        return new Person(
                nameList.get(generator.nextInt(nameList.size())),
                ageList.get(generator.nextInt(ageList.size())),
                genderList.get(generator.nextInt(genderList.size())),
                heightList.get(generator.nextInt(heightList.size())));
    }
}

/* Sa imi definesti clasa Car cu propietatiile Brand, Year, Weight, Number of Doors, ID (unic) si sa adaugi
2000 de masini in lista. Sa le sortez in functie de fiecare criteriul posibil.
 */
