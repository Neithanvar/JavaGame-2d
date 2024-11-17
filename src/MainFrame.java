
import javax.swing.JFrame;

public class MainFrame
{
    public static void main(String[] args)
    {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2DGame");

        Game game = new Game();
        window.add(game);

        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);


    }
}