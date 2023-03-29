import javax.swing.*;
import java.awt.*;

public class CalendarFrame extends JFrame {

    private CreatePanel createPanel;
    private JPanel panelCards;
    private HomePanel homePanel;
    private CalendarApp calendarApp;
    public CalendarFrame(CalendarApp mainApplicationRef){
        super();
        calendarApp = mainApplicationRef;
        createPanel = new CreatePanel(calendarApp);
        homePanel = new HomePanel(calendarApp);
        panelCards = new JPanel(new CardLayout());
        setUpFrame();



    }

    public void setUpFrame(){
        setTitle("Calendar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setVisible(true);
        getContentPane().setBackground(new Color(38, 38, 46));
        add(panelCards);

        panelCards.add(createPanel, "CREATE");
        panelCards.add(homePanel, "HOME");

        replace("HOME");


    }


    private void replace(String constraint){
        LayoutManager layout = panelCards.getLayout();
        CardLayout cardLayout = (CardLayout) layout;
        cardLayout.show(panelCards, constraint);
    }
}
