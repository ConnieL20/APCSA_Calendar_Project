import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreatePanel extends JPanel implements ActionListener {

    private CalendarApp calendarApp;
    private JButton reminderButton;
    private JButton eventButton;
    private JLabel createHeader;
    private JLabel showHeader;

    private JTextArea calendarInterface;
    private SpringLayout springLayout;
    private String successMessage;

    public CreatePanel(CalendarApp mainApplicationRef){
        super();
        calendarApp = mainApplicationRef;
        reminderButton = new JButton("Reminder");
        eventButton = new JButton("Event");
        createHeader = new JLabel("+ Create:");
        showHeader = new JLabel("Show:");
        calendarInterface = new JTextArea("", 30, 20);
        springLayout = new SpringLayout();
        successMessage = "You have successfully edited your calender!";

        setUpPanel();
        setUpLayout();
        setUpListeners();


    }

    private void setUpPanel(){
        setLayout(springLayout);
        add(reminderButton);
        add(eventButton);
        add(createHeader);
        add(showHeader);
        add(calendarInterface);

        createHeader.setFont(new Font("Helvetica", Font.BOLD,20));
        showHeader.setFont(new Font("Helvetica", Font.BOLD,20));

        calendarInterface.setWrapStyleWord(true);
        calendarInterface.setLineWrap(true);
        calendarInterface.setEditable(false);
    }

    private void setUpLayout(){

    }

    private void setUpListeners(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
