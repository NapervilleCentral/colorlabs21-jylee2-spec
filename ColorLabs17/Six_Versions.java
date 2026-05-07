
/**
 * Write a description of class Six_Versions here.
 *
 * @author (Joshua Lee)
 * @version (5/5/26)
 */
import java.awt.*; // brings color class
import java.util.*;
import java.util.List;

public class Six_Versions
{
    /**
     * Create 6 versions of 1 photo
     *  Gray scale
     *  Negation/Negative photo
     *  reflection on Y-axis
     *  Sepia
     *  down scaling image
     */
     
    public static void main (String [] args)
    {
     // Original
     Picture Version1 = new Picture ("images/Bob.jpg");
     
     // Grayscale
     Picture Version2 = new Picture ("images/Bob.jpg");
     
     // Negation
     Picture Version3 = new Picture ("images/Bob.jpg");
     
     // Reflect on Y-axis
     Picture Version4 = new Picture ("images/Bob.jpg");
     
     // Sepia
     Picture Version5 = new Picture ("images/Bob.jpg");
     
     // Scaling down into top left corner (recursivly done)
     Picture Version6 = new Picture ("images/Bob.jpg");
     
     Version1.explore();
     
     method1(Version2);
     Version2.explore();
     Version2.write("images/Version2.jpg");
     
     method2(Version3);
     Version3.explore();
     Version3.write("images/Version3.jpg");

     method3(Version4);
     
     method4(Version5);
     
     method5(Version6 , 6 , 200 , 200);

    
    }
    
    public static void method1 (Picture Version2)
    {
        Pixel[] pixels = Version2.getPixels();

        for (Pixel p : pixels)
        {
            int r = p.getRed();
            int g = p.getGreen();
            int b = p.getBlue();
            int gray = (r + g + b) / 3;
            p.setColor(new Color(gray, gray, gray));
        }

        
    }
    
    public static void method2 (Picture Version3)
    {
        Pixel[] pixels = Version3.getPixels();

        for (Pixel p : pixels)
        {
            int r = p.getRed();
            int g = p.getGreen();
            int b = p.getBlue();
            int gray = (r + g + b) / 3;
            p.setColor(new Color(gray, gray, gray));
        }

        for (Pixel p : pixels)
        {
            int gray = p.getRed();

            Color color1 = new Color(0, 0, 120);
            Color color2 = new Color(200, 0, 0);
            Color color3 = new Color(120, 160, 255);
            Color color4 = new Color(240, 240, 220);

            if (gray < 64)
                p.setColor(color1);
            else if (gray < 128)
                p.setColor(color2);
            else if (gray < 192)
                p.setColor(color3);
            else
                p.setColor(color4);
        }
    }
    
    public static void method3 (Picture Version4)
    {
        int width = Version4.getWidth();
        int height = Version4.getHeight();
    
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        
    
        for (int y = 0; y < height; y++) 
        {
            for (int x = 0; x < width / 2; x++) 
            {
                leftPixel = Version4.getPixel(x, y);
                rightPixel = Version4.getPixel(width - 1 - x, y);
    
                rightPixel.setColor(leftPixel.getColor());
            }
        }
        Version4.explore();
    }
    
    public static void method4 (Picture Version5)
    {
        Pixel[] pixels = Version5.getPixels();
        
        // sets image to gray scale in prep for color change
        /**
        for (Pixel p: pixels)
        {
            int r = p.getRed();
            int b = p.getBlue();
            int g = p.getGreen();
            
            int gray = (r + g + b) / 3;
            p.setColor(new Color(gray, gray, gray));
        }
        **/
        // changes color of gray image to sepia, percentage based rgb values
        for (Pixel p: pixels)
        {
            int r = p.getRed();
            int b = p.getBlue();
            int g = p.getGreen();
            
            r = (int) (r * 0.83);
            b = (int) (b * 0.71);
            g = (int) (g * 0.58);
            
            p.setRed(r);
            p.setBlue(b);
            p.setGreen(g);
            
        }
        Version5.explore();
    }
    
    public static void method5 (Picture Version6, int times , int Iwidth, int Iheight)
    {
        // recursivley repeat the method until you have 6 images in total
        if ( times == 6)
        {
            Version6.explore();
            method5(Version6 , times - 1, Iwidth/2, Iheight/2);
        }
        
        if (times > 0 && times < 6)
        {
            
            method5(Version6 , times - 1, Iwidth/2, Iheight/2);
        }
    }
}