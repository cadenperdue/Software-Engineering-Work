import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Scanner;
public class Hangman extends Game{
    
    private ArrayList<Character> guessedChars = new ArrayList<Character>();
    private String wordToGuess;
    String [] words = //choose secret word from these
        {"geography", "cat", "today", "java", "truck", "opportunity",
            "fish", "token", "transportation", "bottom", "apple", "cake",
            "remote", "pocket", "terminology", "arm", "cranberry", "implement",
            "caterpillar", "fork", "watermelon", "laptop", "toe", "toad",
            "fundamental", "capitol", "garbage", "anticipate", "apple"}; 
    
    private int incorrectCount;
    private char[] theWord;
    
    public static void main(String[] args){
        Hangman x = new Hangman();
        x.run(); 
    }
    

    protected void initilize()
    {
        /*
        words = //choose secret word from these
            {"geography", "cat", "today", "java", "truck", "opportunity",
            "fish", "token", "transportation", "bottom", "apple", "cake",
            "remote", "pocket", "terminology", "arm", "cranberry", "implement",
            "caterpillar", "fork", "watermelon", "laptop", "toe", "toad",
            "fundamental", "capitol", "garbage", "anticipate", "apple"};   
        */
        incorrectCount = 0;        
    }

    //this method will pick a word from the words array to be the word the player needs to guess. 
    protected void loadContent()
    {
        int max = words.length;
        int randomNum = ThreadLocalRandom.current().nextInt(0, max);
        //change 1 to randomNum for a random word to be choosen. Right now it'll just choose cat
        wordToGuess = words[1];
        //make an array that is the length of the word and fill it with *s
        theWord = new char[wordToGuess.length() + 1];
        for(int i = 0; i < wordToGuess.length(); i++)
        {
            theWord[i] = '*';
        }
    }

    //this method will print out theWord, which is the array containing *s intially and is filled in
    //with letters as they're correctly guessed
    protected void draw(){
        System.out.print("Your word: ");
        for(int i = 0; i < theWord.length; i++)
        {
            System.out.print(theWord[i]);
        }
        System.out.println();
    }

    //this method might need a bit of work to detect if the game was won or lost. Right now it will detect 
    //if the game is lost and abort the game. Currently we're using incorrect guesses to see when the game 
    //will end but there needs to be a method that returns false when the theWord array contians no '*'s
    protected boolean evaluateState(){
        if(incorrectCount >= 7){
            System.out.println("Sorry, looks like you lost the game!");
            return false;
        }
        else{
            return true;
        }
    }

    //this method handles all the possible outcomes of a users action. It reads in a letter from the player, turns 
    //that letter into a character, then uses that character to determine the outcome of the action
    protected void userAction()
    {
         Scanner reader = new Scanner(System.in);
         System.out.println("Enter a character to guess");
         String guess = reader.next();
         char guessChar = guess.charAt(0);
         
         //if the character has already been guessed, tell the player and move on
         if(guessedChars.contains(guessChar))
         {
             System.out.println("You already guessed that one, try again");
         }

         //if the letter isn't in the word, tell the player, increase the amount of incorrect guesses, add the character
         //to the guessed list, then check to see if the game is now over.
         else if(wordToGuess.indexOf(guessChar) < 0)
         {
             System.out.println("That guess was incorrect");
             incorrectCount++;
             guessedChars.add(guessChar);
             myContinue=evaluateState(); 
         }

         //turn the wordToGuess into a char array to make it easier to iterate through, iterate through it
         //and at each letter check to see if it is equal to the character guessed. If it is, replace each *
         //it represents in the theWord array, then call evaluateState to check if the game is over.
         else
         {
             char[] wordToGuessArr = wordToGuess.toCharArray();
             for(int i = 0; i < theWord.length - 1; i++)
             {
                 if(wordToGuessArr[i] == guessChar)
                 {
                     theWord[i] = guessChar;
                 }
             }
             evaluateState();
          
         }
    }
}
    
    
