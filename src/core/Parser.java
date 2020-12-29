package core;

import schema.Category;
import schema.Entity;
import schema.Type;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The parser for documents written in Express
 * To be improved step by step
 */
public class Parser {
    private static Entity parsed = new Entity();
    String filePath;

    public Parser() {
    }


    public static Entity parseFile(String filePath) throws FileNotFoundException {
        //Entity parsed = new Entity();
        Scanner scanner = new Scanner(new File(filePath));
        while (scanner.hasNext()) {
            String next = scanner.next();
            switch (next) {
                case "(*":
                    skipComments(scanner);
                case "SCHEMA":
                    schemaVisit(scanner);
                case "TYPE":
                    typeVisit(scanner);
                case "ENTITY":
                    entityVisit(scanner);
            }
        }

        scanner.close();

        return parsed;
    }

    private static void skipComments(Scanner scanner) {
        boolean skipped = false;
        do {
            String next = scanner.next();
            if (next.equals("*)")) {
                skipped = true;
            }
        } while (skipped);
        //the end location should be the first word after the comments
    }

    private static void schemaVisit(Scanner scanner) {
        //
        if (parsed.getTypes().hasMoreElements()) {
            throw new RuntimeException("Only one Schema is expected in a file.");
        } else {
            parsed.setCategory(Category.SCHEMA);
            parsed.setName(scanner.next());//e.g. in "SCHEMA car_registration"
        }
    }

    private static void typeVisit(Scanner scanner) {
        Type type = new Type();
        String name = scanner.next();
        type.setName(name);
        parsed.addAttribute(type);
    }

    private static void entityVisit(Scanner scanner) {

    }

}
