public class Car {

    //De ce faci contor-ul sa fie static dar id ca si variabila ramane nestatica?
    //Nu sunt inca sigura ce fac static si ce nestatic
    private int id;
    private String brand;
    private int year;
    private int weight;
    private int numberOfDoors;

    private static int counter=0;

    public Car( String brand, int year, int weight, int numberOfDoors) {
        this.id = counter++;
        this.brand = brand;
        this.year = year;
        this.weight = weight;
        this.numberOfDoors = numberOfDoors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public  int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Car.counter = counter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "ID=" + id +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", weight=" + weight +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
