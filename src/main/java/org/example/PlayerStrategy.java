package org.example;

public interface PlayerStrategy {
    // this is where the player attach methods will be defined
    abstract void attackSmall();
    abstract  void attackMedium();
    abstract void attackLarge();
}
