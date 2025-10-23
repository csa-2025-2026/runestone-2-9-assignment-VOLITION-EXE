import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner N = new Scanner(System.in);
    System.out.println("Enter a word:");
    String word = N.nextLine();
    String maxLetter = "";
    int lengthWord = 0;
    for (int i = 0; i < word.length(); i++)
    {
      String target = word.substring(i, i+1);
      int count = 0;
      for (int j = 0; j < word.length(); j++)
      {
        String currentLetter = word.substring(j, j+1);
        if (currentLetter.equals(target))
        {
          count++;
        }
      }
      if(lengthWord<count){
        maxLetter=target;
        lengthWord=count;
      }
    }
    System.out.println("The letter " + maxLetter + " appears the most times.");
  }
}
