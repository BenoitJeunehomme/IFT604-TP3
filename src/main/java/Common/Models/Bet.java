package Common.Models;

import java.io.Serializable;

/**
 * Micha�l Beaulieu         13048132
 * Benoit Jeunehomme        13055392
 * Bruno-Pier Touchette     13045732
 */
public class Bet implements Serializable {
    private double amount;
    private String betOn;
    private int gameID;
    private double amountGained;

    public Bet(double amount, String team, int gameID) {
        this.amount = amount;
        this.betOn = team;
        this.gameID = gameID;
        this.amountGained = 0;
    }

    public double getAmount() { return this.amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getBetOn() { return this.betOn; }
    public void setBetOn(String betOn) { this.betOn = betOn; }

    public double getAmountGained() {
        return amountGained;
    }

    public void setAmountGained(double amountGained) {
        this.amountGained = amountGained;
    }
}
