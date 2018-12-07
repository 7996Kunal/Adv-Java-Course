package p1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
/**
 *
 * @author Administrator
 */
public class Captcha
{
    public static void showImage(String text,OutputStream out)
    {
        BufferedImage image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);// Represents an image with 8-bit RGBA color components packed into integer pixels.
        Graphics2D graphics2d = image.createGraphics();
        Font font = new Font("Comic Sans MS", Font.BOLD, 24);
        graphics2d.setFont(font);
        FontMetrics fontmetrics = graphics2d.getFontMetrics();
        int width = fontmetrics.stringWidth(text);
        int height = fontmetrics.getHeight();
        graphics2d.dispose();
        image = new BufferedImage(150,50, BufferedImage.TYPE_INT_ARGB);
        graphics2d = image.createGraphics();
        graphics2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        graphics2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        graphics2d.setFont(font);
        fontmetrics = graphics2d.getFontMetrics();
        graphics2d.setColor(Color.RED);
        for(int i=0;i<text.length();i++)
        {
                String s=text.substring(i,i+1);
                int y=(int)(Math.random()*20+15);
                graphics2d.drawString(s,i*15+2,y);
        }
        graphics2d.setColor(Color.BLUE);
        graphics2d.drawLine(0,10,50,30);
        graphics2d.setColor(Color.BLACK);
        graphics2d.drawLine(30,30,100,10);
        graphics2d.setColor(Color.MAGENTA);
        graphics2d.drawLine(0,18,width,18);
        graphics2d.dispose();
        
        try {
            ImageIO.write(image, "png", out);            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
