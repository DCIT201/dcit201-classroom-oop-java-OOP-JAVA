package org.vrms;

public interface LoyaltyScheme {
 /*This interface contains abstract methods for addng, redeeming and getting points that a user has  */
    public int points=0;
    void addPoints(String customerId, int points);
    void redeemPoints(String customerId, int points);
    int getPoints(String customerId);

    //creating overloading methods for addPoints
    void addPoints(int points);
}
