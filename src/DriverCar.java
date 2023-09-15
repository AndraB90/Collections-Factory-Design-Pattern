import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DriverCar {
    public static void main(String[] args) {

        //De ce folosesti ArrayList si nu List<Car>

        ArrayList<Car> carArrayList = new ArrayList<>();

        for (int i = 0; i < 2000; i++) {
            carArrayList.add(CarFactory.generateCar());
        }

        //Sortam in functie de brand

        Comparator<Car> brandComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        };

        Collections.sort(carArrayList, brandComparator);

        //Varianta cu Expresie Lambda

        Collections.sort(carArrayList,(o1,o2)->o1.getBrand().compareTo(o2.getBrand()));

        //Sortam in functie de an

        Comparator<Car> yearComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.getYear(), o2.getYear());
            }
        };

        Collections.sort(carArrayList, yearComparator);

        //Varianta cu Expresie Lambda

        Collections.sort(carArrayList,(o1,o2)->Integer.compare(o1.getYear(), o2.getYear()));


        //Sortam in functie de greutate

        Comparator<Car> weightComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.getWeight(), o2.getWeight());
            }
        };

        Collections.sort(carArrayList, weightComparator);

        //Varianta cu Expresie Lambda

        Collections.sort(carArrayList,(o1,o2)->Integer.compare(o1.getWeight(), o2.getWeight()));

        //Sortam in functie de numarul de usi

        Comparator<Car> doorsComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.getNumberOfDoors(), o2.getNumberOfDoors());
            }
        };

        Collections.sort(carArrayList,doorsComparator);

        //Varianta cu Expresie Lambda

        Collections.sort(carArrayList,(o1,o2)->Integer.compare(o1.getNumberOfDoors(), o2.getNumberOfDoors()));


        for (Car car : carArrayList) {
            System.out.println(car);
        }
    }
}
