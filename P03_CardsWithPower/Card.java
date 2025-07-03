package P03_CardsWithPower;

import java.util.Scanner;

public class Card {
    private RankPowers cardRank;
    private SuitPowers cardSuit;
    private int power;

    public Card(RankPowers cardRank, SuitPowers cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public RankPowers getCardRank() {
        return cardRank;
    }

    public SuitPowers getCardSuit() {
        return cardSuit;
    }

    public int getPower() {
        this.power = this.cardSuit.getPower() + this.cardRank.getPower();
        return power;
    }
}
