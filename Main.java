import java.util.Scanner;
/**
 *
 * @author Sevde Korkut 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner (System.in);
    System.out.println ("Please enter a temperature you would like to convert in degrees Celsius.");
  // declare a variable to store Fahrenreit
  
  //declare a variable to store Celcius
  int Celcius = input.nextInt ();
  
  int Fahrenreit = (Celcius*9)/5 + 32;

  System.out.println (Celcius +"C is the same as " + Fahrenreit +  "F") ;
  }
}
