/**
 * File name: ButtonCounter.java
 * Author: Liying Guo, 040858257
 * Course: CST8284 OOP
 * Assignment: Lab 1
 * Date: 2023-09-17
 * Professor: Sandra Iroakazi
 * Purpose: The domain class to keep the record of user's action on "Click" Or "Undo"
 */
/**
 * This class models a tally button counter.
 * @author Liying Guo
 * @version 1.0
 * @since 2023-09-17
 */
public class ButtonCounter {
	/**
	 * The variable keeps the current value of the counter.
	 */
	private int value;

	/**
	 * Gets the value.
	 * 
	 * @return an <code>integer</code> specifying the value.
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Increases value by 1.
	 */
	public void click() {
		value++;
	}

	/**
	 * Resets the value to 0.
	 */
	public void reset() {
		value = 0;
	}

	/**
	 * Decreases the value by 1 if the value is still greater than 0.
	 */
	public void undo() {
		if (value > 0)
			value--;
	}
}
