package com.prakpbo;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Counter extends JFrame implements ActionListener {

  JLabel lblJumlah;
  JButton btnTambah;
  JButton btnKurang;
  JButton btnClear;
  JButton btnHitung;
  int jumlah = 0;

  public Counter() { // Constructor
    setLayout(null);
    createComponents();

    setSize(120, 150);
    setVisible(true);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void createComponents() {// menyiapkan komponen yang dibutuhkan

    lblJumlah = new JLabel("0");
    lblJumlah.setHorizontalAlignment(JLabel.CENTER);
    lblJumlah.setFont(new Font("Arial", 1, 48));
    lblJumlah.setForeground(new Color(255, 0, 0));
    btnHitung = new JButton("Add");
    btnHitung.setFont(new Font("Vendana", 1, 18));
    btnHitung.addActionListener(this);

    lblJumlah.setBounds(10, 20, 100, 50);
    btnHitung.setBounds(10, 80, 100, 20);

    add(lblJumlah);
    add(btnHitung);
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == btnHitung)
      tambah();
  }

  public void tambah() {
    jumlah++;
    lblJumlah.setText(String.valueOf(jumlah));
  }

  public static void main(String[] args) {
    new Counter();
  }
}
