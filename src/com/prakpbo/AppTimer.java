package com.prakpbo;

import javax.swing.*;
import java.awt.event.*;

public class AppTimer extends JFrame implements ActionListener {
  String[] kota = {
      "Bandung", "Jogjakarta", "Ciamis", "Garut", "Indramayu",
      "Jakarta", "Karawang", "Papua", "NTT" };
  int no;
  Timer timer;
  JLabel lbKota = new JLabel("Wait…");

  public AppTimer() {
    setLayout(null);
    timer = new Timer(1000, this);
    timer.start();
    no = 0;

    lbKota.setBounds(10, 20, 130, 20);
    add(lbKota);
    setTitle("Timer…");
    setSize(150, 100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == timer)
      pilihKota(ae);
  }

  public void pilihKota(ActionEvent ae) {
    if (ae.getSource() == timer) {
      lbKota.setText("Timer " + no + " : " + kota[no]);
      if (no < kota.length - 1)
        no++;
      else
        no = 0;
    }
  }

  public static void main(String[] args) {
    new AppTimer();
  }
}
