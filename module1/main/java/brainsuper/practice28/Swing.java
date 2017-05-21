package brainsuper.practice28;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

/**
 * Created by citsym on 07.05.17.
 */
public class Swing {

    public static void main(String[] args) {
        JFrame myApp = new JFrame("My button App");


//        myApp.setLocation(100, 150);
//
//        JButton button = new JButton("Push me");
//        button.setSize(120, 50);
//        ActionListener action = e -> JOptionPane.showMessageDialog(myApp,
//                "Eggs are not supposed to be green.");
//        button.addActionListener(actionListener);
//
//        myApp.setVisible(true);
//        myApp.add(button);


        MyFrame jfrm = new MyFrame("My Program");
        jfrm.setSize(300, 300);
        JPanel jpan = new JPanel();
        jpan.setLayout(new FlowLayout());

        for (int i = 0; i < 12; i++) {
        JButton comp = new JButton("Validate");
            jpan.add(comp);

        }



        JTextField comp1 = new JTextField(30);
//        comp1.setSize(100, 200);
        jpan.add(comp1);

        comp1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String upperCaseText = comp1.getText().toUpperCase();
                comp1.setText(upperCaseText);
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });




//        comp.addActionListener(e-> {
//            for (char c : comp1.getText().toCharArray()) {
//                if (!Character.isUpperCase(c)){
//                    JOptionPane.showMessageDialog(myApp,
//                            "Ivalid value");
//                  createFileChooser();
//
//                }
//            }
//
//        });



        jfrm.setVisible(true);
        jfrm.add(jpan);
    }

    private static void createFileChooser() {
        JFileChooser dialog = new JFileChooser();
        dialog.setFileSelectionMode(JFileChooser.FILES_ONLY);
        dialog.showOpenDialog(null);
        File file = dialog.getSelectedFile();

        JOptionPane.showMessageDialog(null,
                "Is Directory : " + file.isDirectory());
    }
}
