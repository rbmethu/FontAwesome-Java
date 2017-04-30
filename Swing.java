
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * swing sample usage
 * @author methu
 */
public class Swing extends JFrame{
    
    public Swing(){
        this.intComponents();
    }
    
    private void intComponents(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Font fa= null;
        try {
            fa = Font.createFont(Font.TRUETYPE_FONT, FA.getFont());
        } catch (FontFormatException | IOException ex) {
            System.out.println(ex.getMessage());
        }
        //register font to graphic fo use anywhere in application
        GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(fa);
        
        //button with icon as label
        JButton btn = new JButton();
        btn.setText(FA.THUMBS_UP);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("i like it");
            }
        });
        
        //sample text with icons
        JLabel label= new JLabel();
        label.setText(FA.EDIT+" This is a sample icon text on "+FA.GITHUB);
        
        // sample text with icons
        // note we set label font. this should be avoided with icon fonts as
        // they dont have text characters. the Font.loadFont function
        // loads the font to application and will be availabe as system font
        JLabel label1= new JLabel();
        label1.setText(FA.EDIT+" This is a sample icon text on "+FA.GITHUB);
        label1.setFont(fa);
        
        /**
         * swing layout
         */
        this.setTitle(FA.FONT_AWESOME+" Icon Font!");
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addGap(100)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(label1)
                                        .addComponent(label)
                                        .addComponent(btn))
                                .addGap(0, 100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addGap(100)
                                .addComponent(btn)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(label)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(label1)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGap(0, 100, Short.MAX_VALUE))
        );
        this.pack();
    }
    
    /**
     * start application
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Swing().setVisible(true);
            }
        });
    }
}
