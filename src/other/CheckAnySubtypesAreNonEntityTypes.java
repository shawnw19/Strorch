package other;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.Normalizer;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
It is known that subtyped entities can have only one supertype, and
it is necessary to know whether any supertypes are primitive types/non-entity
 */
public class CheckAnySubtypesAreNonEntityTypes {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("resources/IFC4.exp"));
        TreeSet<String> types = new TreeSet<>();
        TreeSet<String> entitySupers = new TreeSet<>();


        //System.out.println(scanner.next());

        LinkedList<String> array = new LinkedList<>();//for investigation of 2nd group
        //for (int i = 0; i <1000 ; i++)
        while (scanner.hasNext()) {
            String str = scanner.next();
            if (str.equals("TYPE")) {
                String name = scanner.next();

                //System.out.println("1st group: "+ name);//-

                types.add(name);
            } else if (str.equals("SUBTYPE")) {
                String name = scanner.next();
                name = scanner.next();//a parentheses wrapped name
                String normalized = Normalizer.normalize(name, Normalizer.Form.NFD);
                String result = normalized.replaceAll("[^A-Za-z0-9]", "");

                //System.out.println("2nd group: "+result);//-

                array.add(result);

                entitySupers.add(result);
            } else {
                //not related to this work
            }
        }

        array.stream()
                .collect(Collectors.groupingBy(s -> s))
                .forEach((k, v) -> System.out.println(k + " " + v.size()));

        //System.out.println("1st group size: "+ types.size());//391
        //System.out.println("2nd group size: "+ entitySupers.size());//207

        Set<String> intersection = (Set) types.clone();
        intersection.retainAll(entitySupers);

        if (intersection.isEmpty()) {
            System.out.println("No interesection found.");//true here!
        } else {
            intersection.stream().forEach(System.out::println);
        }
    }
}
