import javax.swing.*;
import java.awt.event.ActionListener;

public class Design {

    private JButton EnterButton;

    public Design() {
        JFrame frame = new JFrame("QUẢN LÝ SINH VIÊN");
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Design();
    }
}
