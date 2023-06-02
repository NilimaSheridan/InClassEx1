package exercise1;

import java.util.Scanner;
import java.util.*;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Nilima G May 26 2023.
 *
 */
public class CardTrick {
    
    public static void main(String[] args) {
      //card.setSuit(Card.SUITS(((Math.random().nextInt(4)))));
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            
        Card[] hand = new Card[7];
        
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
           card.setValue((int) Math.random()*13+1);
           
        }
         // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        Random random = new Random();
        card.setSuit(Card.SUITS[random.nextInt(4)]);
        hand[i] = card;
    
        Scanner input = new Scanner(System.in);
System.out.print("Enter your guess value for card");
int num = input.nextInt();
System.out.println("Enter your guess for suit");
int suit_value =input.nextInt();
String suit_Name = Card.SUITS[suit_value-1];
for(int guess = 0;guess<hand.length;guess++){
    if(num==hand[guess].getValue() && suit_Name.equals(hand[guess].getSuit())){
    CardTrick.printInfo();
}

}
       }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    
    //I am Done
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Nilima, but you can call me Agent Nemo");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- To go places and reach better heights ");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println("-- To successfully complete this program while I enjoy learning!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Photography");
	System.out.println("--Gardening");
        System.out.println("-- Cooking");
        System.out.println("-- Driving or long drives");

        System.out.println();
        
    
    }

}
