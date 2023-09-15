public class Person {


    private int id;
    private String name;
    private int age;
    private  char gender;
    private int height;

    private static int counter=0;

    public Person(String name, int age, char gender, int height) {
        this.id = counter++;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                '}';
    }
}
