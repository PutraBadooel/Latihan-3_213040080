/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SB601-30
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
public class Latihan3 extends JFrame {
    private boolean checkboxSelected;

    Latihan3() {
        this.checkboxSelected = false;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelnama = new JLabel("Nama :");labelnama.setBounds(15,40,350,15);
        JLabel labelnomor = new JLabel("Nomor :");labelnomor.setBounds(15,100,350,15);
        JLabel labelradio = new JLabel("Jenis Kelamin :");labelradio.setBounds(15,160,350,15);

        JTextField textnama = new JTextField();textnama.setBounds(15,60,200,30);
        JTextField textnomor = new JTextField();textnomor.setBounds(15,120,200,30);
        JTextArea txtoutput = new JTextArea();txtoutput.setBounds(15,320,350,100);
        JScrollPane scroll = new JScrollPane (txtoutput, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        JButton button = new JButton("Simpan");button.setBounds(15,260,100,40);

        JCheckBox checkbox = new JCheckBox("Warga negara Asing");checkbox.setBounds(15,230,200,30);

        JRadioButton radioButton_1 = new JRadioButton("Laki-laki", true);radioButton_1.setBounds(15,180,200,30);
        JRadioButton radioButton_2 = new JRadioButton("Perempuan");radioButton_2.setBounds(15,200,200,30);

        ButtonGroup  bg = new ButtonGroup();
        bg.add(radioButton_1);
        bg.add(radioButton_2);

        checkbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                checkboxSelected = e.getStateChange() == 1;
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jenismember = "", nama = textnama.getText(), nomor = textnomor.getText(), wna;
                if(radioButton_1.isSelected()) jenismember = radioButton_1.getText();
                if(radioButton_2.isSelected()) jenismember = radioButton_2.getText();
                txtoutput.append("Nama \t: "+nama+"\n");
                txtoutput.append("Nomor HP \t: "+nomor+"\n");
                txtoutput.append("Jenis Kelamin \t:"+jenismember+"\n");
                if (checkboxSelected) wna = "Ya" ;else wna = "Tidak";
                txtoutput.append("WNA \t:"+wna+"\n");
                textnama.setText("");
                textnomor.setText("");
            }
        });

        this.add(labelnama);
        this.add(labelnomor);
        this.add(labelradio);
        this.add(checkbox);
        this.add(textnama);
        this.add(textnomor);
        this.add(txtoutput);
        this.add(button);
        this.add(scroll);

        this.add(radioButton_1);
        this.add(radioButton_2);

        this.setSize(400,500);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Latihan3().setVisible(true);
            }
        });
    }
}


