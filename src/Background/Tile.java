package Background;

import main.Game;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Tile
{
    Game game;
    public BufferedImage tileTexture = null;
    public String direction;
    public int x = 0,y = 0;

    public Tile(Game gm, String direction)
    {
        this.direction = direction;
        this.game = gm;

        loadImage();
    }

    public void loadImage()
    {
        try
        {
            tileTexture = ImageIO.read(getClass().getResourceAsStream(direction));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
