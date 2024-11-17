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
    final int screenHeight = screenN * tileSize;

    HandleEvents eventsHandler = new HandleEvents();
    Thread gameThread;

    public Game()
    {
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addMouseListener(eventsHandler);
        this.setFocusable(true);
    }

    public void startGame()
    {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run()
    {
        while(gameThread != null)
        {

            update();

            repaint();
        }
    }

    public void update()
    {

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D newG = (Graphics2D) g;

        newG.setColor(Color.MAGENTA);

        newG.fillRect(100, 100, tileSize,tileSize);

        newG.dispose();
    }
}
