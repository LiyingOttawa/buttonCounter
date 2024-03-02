/**
 * File name: ButtonCounterTester.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 1
 * Date: 2023-09-17
 * Professor: Sandra Iroakazi
 * Purpose: The test class on ButtonCounter
 */
/**
 * @author Liying Guo
 * @version 1.0
 * @since 2023-09-17
 */
public class ButtonCounterTester
{
	/**
	 * main method to test ButtonCounter
	 * @param args The command line arguments.
	 */
   public static void main(String[] args)
   {
	  //Reference Type variable declaration and initialization
	  //Instantiate ButtonCounter class
      ButtonCounter tally = new ButtonCounter();
      //Calls 3 times worker method click() to increase counter value 3 times
      tally.click();
      tally.click();
      tally.click();
      //Prints the current counter's value, it should be 3 now
      System.out.println(tally.getValue());
      System.out.println("Expected: 3");
      //Decreases the counter's value by 1 via another worker method
      tally.undo();
      System.out.println(tally.getValue());
      System.out.println("Expected: 2");
      tally.undo();
      tally.undo();
      //Decreases the counter's value over 3 times, the value should still be 0 instead of -1
      tally.undo();
      System.out.println(tally.getValue());
      System.out.println("Expected: 0");
   }
}
