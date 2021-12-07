package uw.cp510.lectures.lecture8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("At the tone, the time is" + Instant.ofEpochMilli(actionEvent.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
