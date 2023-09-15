import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeNumere = new ArrayList<>(Arrays.asList(1,5,8,3,22,100, 99,22, 10, 90, 12));
        Collections.sort(listaDeNumere);
        System.out.println(listaDeNumere);
    }
}
