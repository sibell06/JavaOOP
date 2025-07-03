package P03_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cardName = scanner.nextLine();
        String cardSuite = scanner.nextLine();

        int cardPower = RankPowers.valueOf(cardName).getPower() + SuitPowers.valueOf(cardSuite).getPower();
        System.out.printf("Card name: %s of %s; Card power: %d", cardName, cardSuite, cardPower);
    }
}
