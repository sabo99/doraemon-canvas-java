import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set Color Palate Doraemon
        Color DARK_BROWN = Color.decode("#403C2C");
        Color SKY_BLUE = Color.decode("#03ADF0");
        Color RED = Color.decode("#E61737");
        Color YELLOW = Color.decode("#FED037");
        Color ORANGE = Color.decode("#F57C33");
        Color BACKGROUND = Color.LIGHT_GRAY;


        // Head
        g.setColor(SKY_BLUE);
        g.fillOval(200, 100, 150, 160);
        g.setColor(Color.WHITE);
        g.fillOval(210, 120, 130, 140);

        // Nose
        g.setColor(RED);
        g.fillOval(268, 133, 15, 15);
        g.setColor(Color.WHITE);
        g.fillOval(269, 137, 7, 7);

        // Left Eye
        g.setColor(DARK_BROWN);
        g.drawOval(250, 110, 25, 30);
        g.setColor(DARK_BROWN);
        g.drawOval(262, 122, 10, 13);
        g.setColor(Color.WHITE);
        g.fillOval(265, 128, 5, 5);

        // Right Eye
        g.setColor(DARK_BROWN);
        g.drawOval(274, 110, 25, 30);
        g.setColor(DARK_BROWN);
        g.drawOval(278, 122, 10, 13);
        g.setColor(Color.WHITE);
        g.fillOval(280, 128, 5, 5);

        // Line of Nose
        g.setColor(DARK_BROWN);
        g.drawLine(275, 175, 275, 148);

        // Cheek
        g.setColor(DARK_BROWN);
        g.drawArc(212, 150, 80, 30, 130, 150);
        g.drawArc(277, 150, 58, 28, 260, 150);

        // Mouth
        g.setColor(RED);
        g.fillArc(240, 148, 65, 70, 170, 200);

        // Tongue
        g.setColor(ORANGE);
        g.fillOval(258, 200, 33, 20);

        // Left Mustache
        g.setColor(DARK_BROWN);
        g.drawLine(260, 150, 210, 140);
        g.drawLine(260, 160, 210, 160);
        g.drawLine(260, 170, 210, 180);

        // Right Mustache
        g.drawLine(340, 140, 290, 150);
        g.drawLine(340, 160, 290, 160);
        g.drawLine(340, 180, 290, 170);

        // Body
        g.setColor(SKY_BLUE);
        g.fillRoundRect(215, 255, 120, 130, 40, 40);
        g.setColor(Color.white);
        g.fillOval(225, 230, 100, 120);

        // Bell
        g.setColor(RED);
        g.fillOval(234, 250, 82, 8);
        g.setColor(YELLOW);
        g.fillOval(258, 250, 30, 30);
        g.setColor(DARK_BROWN);
        g.drawArc(257, 260, 50, 20, 80, 80);
        g.drawArc(257, 263, 50, 20, 80, 80);
        g.setColor(RED);
        g.fillOval(270, 267, 8, 8);
        g.setColor(DARK_BROWN);
        g.drawArc(270, 270, 5, 25, 5, 70);


        // Left Hand
        g.setColor(SKY_BLUE);
        for(int i=0; i< 25; i++){
            g.drawLine(220, 261+i, 150, 300+i);
        }
        g.setColor(Color.WHITE);
        g.fillOval(135, 295, 27, 35);

        // Right Hand
        g.setColor(SKY_BLUE);
        for(int i=0; i< 25; i++){
            g.drawLine(400, 210+i, 325, 258+i);
        }
        g.setColor(Color.WHITE);
        g.fillOval(390, 205, 27, 35);

        // Magic Pocket
        g.setColor(DARK_BROWN);
        g.drawArc(240, 260, 65, 70, 170, 200);
        g.drawLine(240, 290, 305, 290);

        // Set Background
        setBackground(BACKGROUND);

        // Legs
        g.setColor(BACKGROUND);
        g.fillArc(245, 330, 60, 60, 250, 50);
        g.setColor(Color.WHITE);
        g.fillOval(210, 375, 60, 30);
        g.fillOval(280, 375, 60, 30);

    }

    public static void main(String[] args) {
        // Set Frame
        JFrame frame = new JFrame("Doraemon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Main());
        frame.setSize(550, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}