package org.example;

public class Knight {
    private PlayerStrategy playerStrategy;

    public void setPlayerStrategy(PlayerStrategy playerStrategy) {
        this.playerStrategy = playerStrategy;
    }

    /*
        Todo: Using the PlayerStrategy instance in the Knight class, invoke the small, medium, and large attack
            methods (in that order).
        Hint: There should simply be three method invocations in this method.
     */
    public void attack() {
        playerStrategy.attackSmall();
        playerStrategy.attackSmall();
        playerStrategy.attackSmall();

    }

    /*
        Todo: Have the name of the current strategy be printed out by using this method (in accordance with the
            assignment details).

     */
    public void announceStrategy() {
        System.out.println(playerStrategy.type);
    }
}
