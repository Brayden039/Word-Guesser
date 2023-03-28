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
    int guesses = word.length();
    int incorrectGuess = 0;
    int correctGuesses = 0;
    boolean correct = false;
    boolean incorrect = false;

    //testing
    System.out.println(word);
    for(int i = 0; i < word.length(); i++)
    {
      System.out.print("*");
    }

    System.out.println();
    Scanner keyboard = new Scanner(System.in);
    while(guesses > 0)
    {
      incorrect = true;
      System.out.println("Enter a single letter as your guess:");
      char keyGuess = keyboard.next().charAt(0);
      for(int i = 0; i < word.length(); i++)
      {
        if(word.charAt(i) == keyGuess)
        {
          System.out.println("Correct Guess!");
          incorrect = false;
          correct = true;
          correctGuesses++;
        }
        
        

      } //forloop ends
      if(incorrect == true)
      {
        incorrectGuess++;
        System.out.println("Incorrect Guess.");
        System.out.println("You have" + incorrectGuess + " incorrect guesses so far!");
      }
      

     
      
      guesses--;
    }

    if(guesses == 0 && correctGuesses == word.length())
    {
      System.out.println("\nYou WIN!");
    }
    else
    {
      System.out.println("\nYou Lose.");
    }
    
  }
}