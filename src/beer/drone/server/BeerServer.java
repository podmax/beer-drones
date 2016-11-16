package beer.drone.server;

import beer.drone.client.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Edward Seymour
 */
public class BeerServer {
  public static ArrayList<AdministratorClient> administrators = new ArrayList<>();
  public static ArrayList<CustomerClient> customers = new ArrayList<>();

  public static void main(String[] args) {
    System.out.println("Type \"admin\" or \"customer\" to start respective GUIs.");
    System.out.println("Type \"exit\" to exit the shell.");
    shellLoop();

    // We use System.exit because other threads may exist with a GUI. So this closes them.
    System.exit(0);
  }

  private static void shellLoop() {
    Scanner keyboard = new Scanner(System.in);

    boolean exit;
    do {
      System.out.print("> ");
      String line = keyboard.nextLine();
      String args = processLine(line);
      exit = execute(args);
    } while(!exit);
  }

  private static String processLine(String line) {
    return line.toLowerCase().trim();
  }

  private static boolean execute(String args) {
    switch(args) {
      case "":
        break;
      case "exit":
        return true;
      case "admin":
        administrators.add(new AdministratorClient());
        break;
      case "customer":
        customers.add(new CustomerClient());
        break;
      default:
        System.out.println("Unexpected command \"" + args + "\".");
    }

    return false;
  }
}