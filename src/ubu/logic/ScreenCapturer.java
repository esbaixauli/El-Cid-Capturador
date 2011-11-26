package ubu.logic;
/**
 *
 * @author Rubén
 */
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
 
public class ScreenCapturer {

	public static void captureScreen(String fileName, String format) 
                throws Exception {
 
	   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	   Rectangle screenRectangle = new Rectangle(screenSize);
	   Robot robot = new Robot();
	   BufferedImage image = robot.createScreenCapture(screenRectangle);
	   ImageIO.write(image, format, new File(fileName+"."+format));
	}
}
