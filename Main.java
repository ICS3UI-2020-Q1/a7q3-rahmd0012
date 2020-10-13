import java.util.Scanner;
/**
 * a program that produced a random number of asteriks from 1 to 5
 * @author Daniel Rahmani
 */
public class Main {
  

  public static void chaotic(int lines){
    for(int i = 0; i < lines; i++){
      System.out.println();
      int randNum = (int)(Math.random()*(5 - 1 + 1))+ 1;
      for(int j = 0; j < randNum; j++){
        System.out.print("*");
      }
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user how many lines they want
    System.out.println("Please enter the number of lines you want");
    int lines = input.nextInt();
    chaotic(lines);

    
  }
}
