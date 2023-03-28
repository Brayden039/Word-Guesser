import java.util.*;
class Main
{
  public static void main(String[] args) 
  {
    ArrayList<String> words = new ArrayList<String>();
    words.add("Casey");
    words.add("Patrick");
    words.add("Brady");
    words.add("Words");
    words.add("Guess");
    String word = words.get((int) (Math.random() * 4));
    String currentWord = "";
    int guesses = word.length();
    int incorrectGuess = 0;
    int correctGuesses = 0;
    boolean correct = false;
    boolean incorrect = false;
    boolean end = false;

   
   
    for(int i = 0; i < word.length(); i++)
    {
      currentWord = currentWord + "*";
    }

    System.out.println(currentWord); //remote this
    Scanner keyboard = new Scanner(System.in);
    while(guesses > 0 && end != true)
    {
      incorrect = true;
      System.out.println("Enter a single letter as your guess:");
      char keyGuess = keyboard.next().charAt(0);
      for(int i = 0; i < word.length(); i++)
      {
        if(word.charAt(i) == keyGuess)
        {
          currentWord = currentWord.substring(0, i) + keyGuess + currentWord.substring(i + 1);
          System.out.println("Correct Guess!");
          incorrect = false;
          correct = true;
          correctGuesses++;
          System.out.println(currentWord);
        }
        
        

      } //forloop ends
      if(incorrect == true)
      {
        incorrectGuess++;
        System.out.println("Incorrect Guess.");
        System.out.println("You have " + incorrectGuess + " incorrect guesses so far!");
        if(incorrectGuess == 2)
        {
          System.out.println("\nYou have too many incorrect guesses. You Lose.");
          System.out.println("The word was: " + word);
          end = true;
        }
        
        
      }
           
      guesses--;
      if(guesses == 0)
        {
          System.out.println("\nYou ran out of guesses. You Lose.");
          System.out.println("The word was :" + word);
          end = true;
  
        }
    }

    if(guesses == 0 && correctGuesses == word.length())
    {
      System.out.println("You guessed that the word was: " + word);
      System.out.println("\nYou WIN!");
    }
    
  }
}