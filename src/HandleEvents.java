import javax.swing.plaf.basic.BasicTreeUI;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HandleEvents implements MouseListener
{
    public boolean isLeftPressed = false, isRightPressed = false;
    public int posX = 0, posY = 0;

    @Override
    public void mousePressed(MouseEvent e)
    {
        int code = e.getButton();
        posX = e.getX();
        posY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
