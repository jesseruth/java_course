package uw.cp510.lectures.lecture8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class TalkingClock {
    public static void main(String[] args) {
        TimePrinter listener = new TimePrinter();
        Timer timer = new Timer(2000, listener);
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);
    }

    public static class TimePrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("At the tone, the time is" + Instant.ofEpochMilli(actionEvent.getWhen()));
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
