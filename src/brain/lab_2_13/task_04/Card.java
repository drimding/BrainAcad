package brain.lab_2_13.task_04;

/**
 * Created by drimcatcher on 12.07.2016.
 */
public class Card {
    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    public Suit getCardSuit() {
        return cardSuit;
    }

    public Rank getCardRank() {
        return cardRank;
    }

    @Override
    public String toString() {
        return String.format("The Card: %s_%s", cardRank.name(), cardSuit.name());
    }
}
