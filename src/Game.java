import javax.swing.*;
import java.awt.*;

public class Game extends JPanel implements Runnable
{
    final int originalTileSize = 16;
    final int scale = 3;

    final int tileSize = originalTileSize * scale;
    final int screenM = 16;
    final int screenN = 7;
    final int screenWidth = screenM * tileSize;
    final int screenHeight = screenN * tileSize;

    final int FPS = 60;

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

        double drawingInterval = (double) 1000000000 /FPS;
        double deltaTime = 0;
        long currentTime = System.nanoTime();
        long lastTime = currentTime;
        long lastSecond = currentTime;
        int drawCount = 0;
        long timer = 0;
        while(gameThread != null)
        {
            currentTime = System.nanoTime();

            deltaTime = (currentTime - lastTime) / drawingInterval;
            timer = currentTime - lastSecond;


            if(deltaTime >= 1)
            {
                update();

                repaint();

                deltaTime--;
                drawCount++;
                lastTime = currentTime;
            }

            if(timer >= 1000000000)
            {
                System.out.println(drawCount);
                lastSecond = currentTime;
                drawCount = 0;
                timer = 0;
            }
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
