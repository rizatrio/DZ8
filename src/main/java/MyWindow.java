import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    public MyWindow() {
        Font font = new Font("Arial", Font.BOLD, 12);
        setTitle("Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,600,300);
        setLayout(null);
        JTextField field = new JTextField();
        field.setBounds(30,200,400,30);
        field.setFont(font);
        add(field);

        JButton button = new JButton("Отправить");
        button.setBounds(450,200,100,30);
        button.setFont(font);
        add(button);

        JLabel sendMessages = new JLabel();
        add(sendMessages);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sendMessages.setText(field.getText());
                System.out.println(sendMessages.getText());
            }
        });

        setVisible(true);
    }
}
