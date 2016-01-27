package lambda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Michi on 27.01.2016.
 */
public class Lamda implements Inter{

    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Regensburg", "Basel", "Munich", "Bonn",
                "Hamburg", "Munich", "Berlin");

        cities.stream().distinct().forEach(element -> System.out.println(element));

    }





}
