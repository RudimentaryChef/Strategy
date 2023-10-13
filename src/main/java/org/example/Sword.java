package org.example;

public class Sword implements PlayerStrategy{
    /*
        TODO: Implement the player Strategy methods so that they behave in accordance with the assignment details
            These methods should print the following: “{name of pattern} - {size of attack}” where each of the braced
                items corresponds to the name and size of method being implement
        Hint: There are three methods that you need to implement from the PlayerStrategy class
     */
     public type = "Sword";
          public void attackSmall(){
        System.out.println("Sword" + "-" + "Small");
     }
     public void attackMedium(){
        System.out.println("Sword" + "-" + "Medium");
     }
     public void attackLarge(){
        System.out.println("Sword" + "-" + "Large");
     }
}
