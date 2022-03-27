package com.prakpbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;

public class MiniQuran extends JFrame implements ActionListener {

  String surat[] = { "Al-Ikhlas", "Al-Falaq", "An-Naas" };
  JLabel lbSurat = new JLabel("Surat-Surat Pilihan");
  JList lsSurat = new JList(surat);
  JButton bPlay = new JButton(" Play ");
  JLabel display = new JLabel();

  public MiniQuran() {
    this.setLayout(null);
    this.setTitle("Mini Quran");
    this.setSize(500, 300);
    this.setVisible(true);
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    lbSurat.setBounds(10, 10, 130, 20);
    lsSurat.setBounds(10, 40, 100, 80);
    bPlay.setBounds(10, 130, 100, 20);
    display.setBounds(120, 10, 400, 250);

    this.add(lbSurat);
    this.add(lsSurat);
    this.add(bPlay);
    this.add(display);

    bPlay.addActionListener(this);
  }

  public void actionPerformed(ActionEvent ae) {

    String suratPilihan = (String) lsSurat.getSelectedValue();
    this.tampilkan(suratPilihan.toUpperCase());
    this.jalankanSuara(suratPilihan.toUpperCase());
  }

  public void tampilkan(String file) {
    try {
      display.setIcon(new ImageIcon(this.getClass().getResource("/" + file + ".png")));
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Pilihlah nama suratnya");
    }
  }

  public void jalankanSuara(String file) {
    try {
      URL url = this.getClass().getClassLoader().getResource("/" + file + ".mp3");
      AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
      Clip clip = AudioSystem.getClip();
      clip.open(audioIn);
      clip.start();
    } catch (Exception ex) {
      return;
    }
  }

  public static void main(String[] args) {
    new MiniQuran();
  }
}
