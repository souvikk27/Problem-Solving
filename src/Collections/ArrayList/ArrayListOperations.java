package Collections.ArrayList;

import java.util.*;

public class ArrayListOperations {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        System.out.println("Adding Cars to Garage: ");
        System.out.println();
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Mustang");
        cars.add("Bugatti");
        cars.add("Ferarri");
        System.out.println("Calling my favorite ride: ");
        System.out.println(cars.get(0));
        System.out.println("Modifying the collection: ");
        System.out.println(cars.set(3, "Porshe"));
        System.out.println("I dont like this one: ");
        System.out.println(cars.remove(1));
        System.out.println("Lets count all of them again: ");
        for (String x : cars) {
            System.out.print(x + ", ");
        }
        System.out.println();
        System.out.println("Lets sort them in a manner: ");
        Collections.sort(cars);
        for (String x : cars) {
            System.out.print(x + ", ");
        }
    }

}
