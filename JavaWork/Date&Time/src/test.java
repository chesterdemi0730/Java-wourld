import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

public class test {

	public static void main(String[] args) throws Exception {
		
		
		String captcha = "09875";
		
		int width = 55;
		int height = 20;
		
		Color fontColor = new Color(36 , 85 , 92);
		Color lineColor = new Color(65 , 161 , 175);
		Color bgColor = new Color(208 , 226 , 229);
		
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
		BufferedImage image = new BufferedImage(width , height , BufferedImage.TYPE_INT_RGB);
		
		Graphics g = image.getGraphics();
		
		g.setColor(bgColor);
		g.fillRect(0, 0, width, height);
		
		g.setColor(lineColor);
		for (int i = 0 ; i < 20 ; i++) {
			g.drawLine(random.nextInt(width), 0, random.nextInt(width), height);
		}
		
		g.setFont(new Font("Atlantic Inline",Font.BOLD,20));
		g.setColor(fontColor);
		g.drawString(captcha, 0, 18);
		
		g.setColor(lineColor);
		for(int i = 0 ; i < 4 ; i++) {
			g.drawLine(0, random.nextInt(height), width, random.nextInt(height));
		}
		
		g.dispose();
		
		ImageIO.write(image, "png", new File("test.png"));
		
	}
	
}
