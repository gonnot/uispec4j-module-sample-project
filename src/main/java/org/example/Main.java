package org.example;

import javax.swing.*;

public class Main extends JPanel {
  public Main() {
    add(new JLabel("Boris"));
  }

  public static void main(String[] args) {
    JFrame essai = new JFrame("Essai");
    essai.setContentPane(new Main());
    essai.setSize(200,100);
    essai.setVisible(true);

  }
}
