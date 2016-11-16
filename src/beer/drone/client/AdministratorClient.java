package beer.drone.client;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * @author Edward Seymour
 */
public class AdministratorClient {
  private static final String[] droneTableNames = {"Drone", "Status"};
  private static final Object[][] droneTableData = {{1, "Ready"},
          {2, "Charging 35%"},
          {3, "Loading Order #3"},
          {4, "Delivering Order #2"},
          {5, "Returning Home"}};

  private static final String[] orderTableNames = {"Order", "Status"};
  private static final Object[][] orderTableData = {{1, "Delivered"},
          {2, "On Route to Fox Fine Arts"},
          {3, "Preparing to Leave"},
          {4, "Waiting"}};

  private JFrame clientFrame;
  private BorderLayout clientLayout;

  private JPanel infoPanel;
  private BorderLayout infoLayout;

  private JPanel mapPanel;

  private JTable droneTable;
  private JPanel dronePanel;
  private BorderLayout droneLayout;

  private JTable orderTable;
  private JPanel orderPanel;
  private BorderLayout orderLayout;

  public AdministratorClient() {
    try {
      // Create window
      clientFrame = new JFrame("Beer Drones Administrator Client");
      clientLayout = new BorderLayout();
      clientFrame.setLayout(clientLayout);

      // Create information panel
      infoPanel = new JPanel();
      infoLayout = new BorderLayout();
      infoPanel.setLayout(infoLayout);

      // Drone table
      dronePanel = new JPanel();
      droneLayout = new BorderLayout();
      dronePanel.setLayout(droneLayout);
      droneTable = new JTable(droneTableData, droneTableNames);
      JScrollPane droneScroll = new JScrollPane(droneTable);
      droneTable.setFillsViewportHeight(true);
      droneTable.getColumnModel().getColumn(0).setPreferredWidth(100);
      droneTable.getColumnModel().getColumn(1).setPreferredWidth(250);
      dronePanel.add(droneTable.getTableHeader(), BorderLayout.NORTH);
      dronePanel.add(droneTable, BorderLayout.SOUTH);

      // Order table
      orderPanel = new JPanel();
      orderLayout = new BorderLayout();
      orderPanel.setLayout(orderLayout);
      orderTable = new JTable(orderTableData, orderTableNames);
      JScrollPane orderScroll = new JScrollPane(orderTable);
      orderTable.setFillsViewportHeight(true);
      orderTable.getColumnModel().getColumn(0).setPreferredWidth(100);
      orderTable.getColumnModel().getColumn(1).setPreferredWidth(250);
      orderPanel.add(orderTable.getTableHeader(), BorderLayout.NORTH);
      orderPanel.add(orderTable, BorderLayout.SOUTH);

      // Add tables to information panel
      infoPanel.add(dronePanel, BorderLayout.NORTH);
      infoPanel.add(orderPanel, BorderLayout.CENTER);

      // Create map panel and draw map
      BufferedImage mapImage = ImageIO.read(getClass().getResource("/img/map.jpg"));
      mapPanel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
          super.paintComponent(g);
          g.drawImage(mapImage, 0, 0, null);
        }
      };
      mapPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);

      // Add client functionality
      clientFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

      // Add panels to frame
      clientFrame.add(infoPanel, BorderLayout.EAST);
      clientFrame.add(mapPanel, BorderLayout.CENTER);

      // Display the Window
      clientFrame.setMinimumSize(new Dimension(600, 200));
      clientFrame.pack();
      clientFrame.setVisible(true);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}