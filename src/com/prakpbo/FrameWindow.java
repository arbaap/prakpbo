package com.prakpbo;

import javax.swing.*;
import java.awt.*;

class FrameWindow extends JFrame {
  String kalimat1 = "12070500016";
  String kalimat2 = "Arba Adhy Pamungkas";
  JLabel label1 = new JLabel();
  JLabel label2 = new JLabel();

  public FrameWindow() {
    setLayout(null);

    label1.setText(kalimat1);
    label1.setFont(new Font("Tahoma", 1, 18));
    label1.setBounds(10, 10, 250, 40);
    label1.setHorizontalAlignment(JLabel.CENTER);
    add(label1);

    label2.setText(kalimat2);
    label2.setFont(new Font("Tahoma", 1, 18));
    label2.setBounds(10, 30, 250, 40);
    label2.setHorizontalAlignment(JLabel.CENTER);
    add(label2);

    setTitle("PBO : Frame Java");
    setVisible(true);
    setSize(290, 120);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
    new FrameWindow();
  }
}
