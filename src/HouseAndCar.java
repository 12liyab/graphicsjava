import javax.swing.*;
import java.awt.*;

public class HouseAndCar extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the background (sky and grass)
        g.setColor(new Color(135, 206, 235)); // Light blue for the sky
        g.fillRect(0, 0, getWidth(), getHeight() / 2);
        g.setColor(new Color(34, 139, 34)); // Green for the grass
        g.fillRect(0, getHeight() / 2, getWidth(), getHeight() / 2);

        // Draw the house
        g.setColor(new Color(139, 69, 19)); // Brown for the house body
        g.fillRect(100, 200, 200, 150); // House body
        g.setColor(new Color(128, 0, 0)); // Dark red for the roof
        g.fillPolygon(new int[]{100, 200, 300}, new int[]{200, 100, 200}, 3); // Roof
        g.setColor(new Color(192, 192, 192)); // Gray for the chimney
        g.fillRect(250, 120, 20, 80); // Chimney
        g.setColor(Color.WHITE);
        g.fillRect(150, 250, 50, 100); // Door
        g.setColor(Color.BLACK);
        g.fillRect(180, 280, 10, 10); // Door knob
        g.setColor(new Color(255, 223, 186)); // Light yellow for windows
        g.fillRect(120, 220, 40, 40); // Window 1
        g.fillRect(240, 220, 40, 40); // Window 2

        // Draw the driveway
        g.setColor(new Color(105, 105, 105)); // Gray for the driveway
        g.fillRect(300, 300, 100, 50); // Driveway

        // Draw the modified car
        g.setColor(Color.RED);
        g.fillRoundRect(400, 250, 150, 50, 20, 20); // Car body with rounded edges
        g.fillRect(450, 200, 50, 50); // Car top
        g.setColor(Color.CYAN);
        g.fillRect(460, 210, 30, 30); // Window
        g.setColor(Color.YELLOW);
        g.fillOval(400, 260, 20, 20); // Left headlight
        g.fillOval(530, 260, 20, 20); // Right headlight
        g.setColor(Color.BLACK);
        g.fillOval(410, 290, 40, 40); // Wheel 1
        g.fillOval(500, 290, 40, 40); // Wheel 2
        g.setColor(Color.DARK_GRAY);
        g.drawLine(450, 250, 450, 300); // Vertical line to separate car top and body
        g.drawLine(400, 275, 550, 275); // Horizontal line to represent the car's lower body
        g.setColor(Color.WHITE);
        g.drawString("JAVA", 470, 285); // License plate
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("House and Car Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.add(new HouseAndCar());
        frame.setVisible(true);
    }
}