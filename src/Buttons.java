import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Buttons extends Main implements MouseListener {
    JFrame frame = new JFrame("Wuhuuu batns");
    JButton move = new JButton("TRÁJ MÍ!!");

    void init() {
        frame.setSize(700, 700);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    void button() {
        move.addMouseListener(this);

        move.setBounds(0, 0, 100, 50);
        frame.add(move);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
        move.setBounds(randomInt(0,600), randomInt(0,600),100,50);
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public int randomInt(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

}
