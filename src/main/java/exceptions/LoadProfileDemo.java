package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LoadProfileDemo {


  /**
   * Loads and returns the profile stored in the given file.
   *
   * @param filename the name of the file containing the profile
   * @return the profile stored in the file
   * @throws FileNotFoundException if the specified file cannot be found
   * @throws IOException if an error occurs while reading the file
   * @throws IllegalArgumentException if filename does not name a JSON file
   */
  public static String loadProfile(String filename) throws IOException {
    throw new IOException();
  }



  public static void main(String[] args) {

    try {
      String profile = loadProfile("profile.json");
    } catch (FileNotFoundException e) { // catch-blocks behaves like if-elif (only one block can run)
      System.out.println("Something went wrong!");
    } catch (IOException e) { // Note: even with just this one catch block, the code would compile.
      System.out.println("an IOException has been caught!");
    } catch (IllegalArgumentException e) { // can optionally also catch IllegalArgumentException
      System.out.println("caught unchecked exception!");
    }
    // could also catch Exception as long as after FileNotFoundException and IOException,
    // since those are lower in the hierarchy; Exception isn't specific enough, so one really
    // should just stick with a more specific exception. Since IOException is a checked exception,
    // it, or something above it in the hierarchy must be caught (or main declare it throws)
    // Could also catch Throwable, but we should not.
  }

}
