import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel{
    public ButtonPanel(){
        setLayout(new GridLayout(1,1));
        JButton but1 = new JButton("Press me");
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("BUTTON WAS PRESSED");
            }
        });
        add(but1);
    }


}
