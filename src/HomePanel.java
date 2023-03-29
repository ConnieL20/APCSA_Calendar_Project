import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePanel extends JPanel implements ActionListener {
    private CalendarApp calendarApp;
    private SpringLayout springLayout;
    private JButton next;
    private JButton previous;
    private JButton edit;
    private JLabel month;
    private JLabel year;
    private JTextArea calendarInterface;

    public HomePanel(CalendarApp mainApplicationRef){
        calendarApp = mainApplicationRef;
        springLayout = new SpringLayout();
        next = new JButton("Next");
        previous = new JButton("Previous");
        edit = new JButton("Edit Calendar");
        month = new JLabel("Month: ");
        year = new JLabel("Year: ");

        setUpPanel();
        setUpLayout();
        setUpListeners();

    }

    private void setUpPanel(){
        setLayout(springLayout);
        add(next);
        add(previous);
        add(edit);
        add(month);
        add(year);
    }


    private void setUpLayout(){
        springLayout.putConstraint(SpringLayout.WEST, next, 500, SpringLayout.EAST, edit);
        springLayout.putConstraint(SpringLayout.HORIZONTAL_CENTER, month, -130,SpringLayout.WEST, next);
//        springLayout.putConstraint();
//        springLayout.putConstraint(SpringLayout.WEST, next, 500, SpringLayout.EAST, edit);

//
//        springLayout.putConstraint(SpringLayout.NORTH, edit, 20, SpringLayout.SOUTH, next);



    }

    private void setUpListeners(){
        next.addActionListener(this);
        previous.addActionListener(this);
        edit.addActionListener(this);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
