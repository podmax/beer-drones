package beer.drone.client;

import javax.swing.*;
import java.awt.*;
/**Public calss representing the Customer Client.
 * 
 * @author Edward Seymour
 * @version 1.0 (11/16/16)
 */
public class CustomerClient {
  private static final int DUMMY_DATA_LENGTH = 10;
  private static int dummyDataID = (int)(Math.random() * DUMMY_DATA_LENGTH);
  private static final String[] dummyNames = {"Emerson", "Anne", "Rae", "Buffy", "Reuben",
          "Elizabeth", "Cameron", "Astra", "Selma", "Hoyt"};
  private static final String[] dummyLocations = {"Chemistry Computer Science Building", "Lowbrow Palace",
          "Don Haskins Center", "Fox Fine Arts", "Hilton Garden Inn",
          "Miner Village", "Undergraduate Learning Center", "Miner Heights",
          "University Library", "Union Building East"};

  private JFrame clientFrame;
  private BorderLayout clientLayout;

  private JPanel infoPanel;
  private BoxLayout infoLayout;

  private JPanel buttonPanel;
  private FlowLayout buttonLayout;

  private JLabel labelTop;
  private JLabel labelBottom;
  private JButton button;

  private String name;
  private String location;

  public CustomerClient() {
    // Initialize customer data
    setCustomerData();

    // Create window
    clientFrame = new JFrame("Beer Drones");
    clientLayout = new BorderLayout();
    clientFrame.setLayout(clientLayout);

    // Create information panel
    infoPanel = new JPanel();
    infoLayout = new BoxLayout(infoPanel, BoxLayout.Y_AXIS);
    infoPanel.setLayout(infoLayout);
    labelTop = new JLabel("Hello " + name + "! Welcome to Beer Drones.");
    labelBottom = new JLabel("You're located near " + location + ".");
    labelTop.setAlignmentX(Component.CENTER_ALIGNMENT);
    labelBottom.setAlignmentX(Component.CENTER_ALIGNMENT);
    infoPanel.add(labelTop);
    infoPanel.add(labelBottom);

    // Create button panel
    buttonPanel = new JPanel();
    buttonLayout = new FlowLayout();
    buttonPanel.setLayout(buttonLayout);
    button = new JButton("Beer Me Up");
    buttonPanel.add(button);

    // Add client functionality
    clientFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // Add panels to frame
    clientFrame.add(infoPanel, BorderLayout.CENTER);
    clientFrame.add(buttonPanel, BorderLayout.SOUTH);

    // Display the Window
    clientFrame.setMinimumSize(new Dimension(400, 120));
    clientFrame.pack();
    clientFrame.setVisible(true);
  }

  private void setCustomerData() {
    name = dummyNames[dummyDataID];
    location = dummyLocations[dummyDataID];

    dummyDataID = (dummyDataID + 1) % DUMMY_DATA_LENGTH;
  }
}
