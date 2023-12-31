package design3;
// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/

import java.io.*;

/**
 * This class prompts the user for a set of coordinates, and then
 * converts them from polar to cartesian or vice-versa.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @author Paul Holden
 * @version July 2000
 */
public class PointCPTest3 {
  // Class methods *****************************************************

  /**
   * This method is responsible for the creation of the PointCP
   * object. This can be done in two ways; the first, by using the
   * command line and running the program using <code> java 
   * PointCPTest2 &lt;coordtype (c/p)&gt; &lt;X/RHO&gt; &lt;Y/THETA&gt;
   * </code> and the second by getting the program to prompt the user.
   * If the user does not enter a valid sequence at the command line,
   * the program will prompte him or her.
   *
   * @param args[0] The coordinate type. P for polar and C for
   *                cartesian.
   * @param args[1] The value of X or RHO.
   * @param args[2] The value of Y or THETA.
   */
  public static void main(String[] args) {
    PointCP3 point;

    System.out.println("Cartesian-Polar Coordinates Conversion Program");

    // Check if the user input coordinates from the command line
    // If he did, create the PointCP object from these arguments.
    // If he did not, prompt the user for them.
    try {
      point = new PointCP3(Double.valueOf(args[0]).doubleValue(), Double.valueOf(args[1]).doubleValue());
    } catch (Exception e) {
      // If we arrive here, it is because either there were no
      // command line arguments, or they were invalid
      if (args.length != 0)
        System.out.println("Invalid arguments on command line");

      try {
        point = getInput();
      } catch (IOException ex) {
        System.out.println("Error getting input. Ending program.");
        return;
      }
    }
    System.out.println("\nYou entered:\n" + point);
  }

  /**
   * This method obtains input from the user and verifies that
   * it is valid. When the input is valid, it returns a PointCP
   * object.
   *
   * @return A PointCP constructed using information obtained
   *         from the user.
   * @throws IOException If there is an error getting input from
   *                     the user.
   */
  private static PointCP3 getInput() throws IOException {
    byte[] buffer = new byte[1024]; // Buffer to hold byte input
    String theInput = ""; // Input information

    // Information to be passed to the constructor
    double Rho = 0.0;
    double Theta = 0.0;

    System.out.print("Enter X: ");

    // Initialize the buffer before we read the input
    for (int k = 0; k < 1024; k++)
      buffer[k] = '\u0020';

    System.in.read(buffer);
    theInput = new String(buffer).trim();

    try {
      Rho = Double.valueOf(theInput).doubleValue();

      System.out.print("Enter Theta (angle in radians): ");

      // Clear the buffer again
      for (int k = 0; k < 1024; k++)
        buffer[k] = '\u0020';

      System.in.read(buffer);
      theInput = new String(buffer).trim();

      Theta = Double.valueOf(theInput).doubleValue();
    } catch (Exception e) {
      System.out.println("Incorrect input. Please enter valid polar coordinates.");
    }

    // Return a new PointCP object
    return new PointCP3(Rho, Theta);
  }
}