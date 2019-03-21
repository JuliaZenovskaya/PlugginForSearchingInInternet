import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchingPlaceChoosing {
    private MakeSearching makeSearching;

    private JRadioButton GitHub;
    private JRadioButton Habr;
    private JRadioButton StackOverflow;
    private JPanel Choice;
    private JRadioButton Toster;

    public SearchingPlaceChoosing (MakeSearching makeSearching){
        this.makeSearching = makeSearching;

        GitHub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeSearching.choice = "https://github.com/search?q==";
            }
        });

        Habr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeSearching.choice = "https://habr.com/ru/search/?q=";
            }
        });

        StackOverflow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeSearching.choice = "https://ru.stackoverflow.com/search?q=";
            }
        });

        Toster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeSearching.choice = "https://toster.ru/search?q=";
            }
        });
    }

}
