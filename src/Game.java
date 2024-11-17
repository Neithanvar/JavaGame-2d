import javax.swing.*;
import java.awt.*;

public class Game extends JPanel implements Runnable
{
    final int originalTileSize = 16;
    final int scale = 3;

    final int tileSize = originalTileSize * scale;
    final int screenM = 16;
    final int screenN = 12;
    final int screenWidth = screenM * tileSize;
    final int screenHeigh = screenN * tileSize;

    Thread gameThread;

    public Game()
    {
        this.setPreferredSize(new Dimension(screenWidth,screenHeigh));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }


    @Override
    public void run()
    {

    }
}
