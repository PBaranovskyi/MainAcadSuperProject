package brainsuper.practice28;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by citsym on 07.05.17.
 */
public class MyFrame extends JFrame {

    private JMenuBar barMenu; private JMenu main;
    private JMenuItem about, exit;
    private JMenu help;

    public MyFrame(String nameApplication) {
//        super(nameApplication);

        this.setTitle(nameApplication);
        this.setBounds(200, 200, 500, 400);
        this.createMenu();
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    private void createMenu() {
        this.barMenu = new JMenuBar();
        this.setJMenuBar(barMenu);
        this.main = new JMenu("Main");
        this.help = new JMenu("Help");
        this.about = new JMenuItem("Above");
        about.addActionListener(e -> JOptionPane.showMessageDialog(null, "Simple menu-application!!!"));
        main.add(about);
        main.addSeparator();
        this.exit = new JMenuItem("Exit");
        exit.addActionListener(e -> System.exit(0));
        main.add(exit);
        barMenu.add(main);


        help.add(new JMenuItem("Help me"));
        help.add(new JMenuItem("Help me"));
        help.addSeparator();
        help.add(new JMenuItem("Help me"));
        help.add(new JMenuItem("I want to go to the kitchen"));

        barMenu.add(help);
    }
}
