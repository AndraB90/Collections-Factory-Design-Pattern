import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CarFactory {

    static Random generator = new Random();

    static ArrayList<String> brandList = new ArrayList<>(Arrays.asList("Audi", "Volkswagen", "BMW", "Mercedes", "Porsche", "Maserati"));
    static ArrayList<Integer> yearList = new ArrayList<>(Arrays.asList(2000, 1990, 2022, 2010, 1988, 1950));

    static ArrayList<Integer> weightList = new ArrayList<>(Arrays.asList(3000, 2000, 1500, 2076, 2500, 4500));

    static ArrayList<Integer> numberOfDoorsList = new ArrayList<>(Arrays.asList(4,2));

    public static Car generateCar() {
        return new Car(
                brandList.get(generator.nextInt(brandList.size())),
                yearList.get(generator.nextInt(yearList.size())),
                weightList.get(generator.nextInt(weightList.size())),
                numberOfDoorsList.get(generator.nextInt(numberOfDoorsList.size())));
    }

}
