package org.example.uispec;

import org.example.uispec.impl.MyEngine;

import javax.swing.*;

public class Main extends JPanel {
  public Main() {
    add(new JLabel(new MyEngine().getLabel()));
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Main Panel");
    frame.setContentPane(new Main());
    frame.setSize(200,100);
    frame.setVisible(true);
  }
}
