package game;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class BackEnd {
    private Integer numClicks = 0;
    private boolean gameStart = false;
    public Label clicks;

    public void gameStart(ActionEvent actionevent)
    {
        if (!gameStart)
        {
            gameStart = true;
        }
    }

    public void buttonClick()
    {
        numClicks++;
        clicks.setText("Number of Clicks" + numClicks);
    }
}
