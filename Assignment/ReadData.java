
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class provides a utility to prompt the user for input and
 * return the given data as String object.
 * @author Kinley Tshering
 * @version 1.0
 */

public class ReadData {
   /**
    * Promots the user and returns the input as String
    * @param prompt The prompt to be displayed to user
    * @return The input from user as String Object
    */
   public static String acceptString(String prompt) {
      String stringData = null;
      try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
         System.out.print(prompt + ": ");
         stringData=input.readLine();
      }
      catch(IOException ioException){
         System.out.println("Error in accepting data.");
      }
      catch(Exception exc) {
         System.out.println("Unexpected Error!");
      }
      return stringData;
   }
   
}
