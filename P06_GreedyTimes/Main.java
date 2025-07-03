package P06_GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            long capacity = Long.parseLong(scanner.nextLine());
            String[] tokens = scanner.nextLine().split("\\s+");

            Bag bag = new Bag(capacity);

            for (int i = 0; i < tokens.length; i += 2) {
                String name = tokens[i];
                long quantity = Long.parseLong(tokens[i + 1]);

                Item item = new Item(name, quantity);
                bag.addItem(item); // опитваме да добавим
            }

            bag.printContents();
        }
    }

