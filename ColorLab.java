
/**
 * Write a description of class ColorLab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*; // brings color class
import java.util.*;
import java.util.List;
public class ColorLab
{
    // instance variables - replace the example below with your own
    public static void main( String[] args)
    {
        Picture mark1 = new Picture("images/blue-mark.jpg");
        Picture mark2 = new Picture("images/blue-mark.jpg");
        Picture mark3 = new Picture("images/blue-mark.jpg");
        Picture mark4 = new Picture("images/blue-mark.jpg");
        Picture mark5 = new Picture("images/blue-mark.jpg");
        Picture mark6 = new Picture("images/blue-mark.jpg");
        
        Pixel[] pixels;
        Pixel[] Mpixels1;
        Pixel[] Mpixels2;
        Pixel[] Mpixels3;
        Pixel[] Mpixels4;
        Pixel[] Mpixels5;
        Pixel[] Mpixels6;
        Mpixels1 = mark1.getPixels();
        Mpixels2 = mark2.getPixels();
        Mpixels3 = mark3.getPixels();
        Mpixels4 = mark4.getPixels();
        Mpixels5 = mark5.getPixels();
        Mpixels6 = mark6.getPixels();
        
        int red, green, blue, negate;
        for (Pixel change1 : Mpixels1)
        {
            red = change1.getRed();
            red = (int)(red * 0.5);
            change1.setRed(red);
        }
        mark1.explore();
        for (Pixel change2 : Mpixels2)
        {
                green = change2.getGreen();
                green = (int)(green * 1.5);
                change2.setGreen(green);
        }
        mark2.explore();
        for (Pixel change3 : Mpixels3)
        {
            blue = change3.getBlue();
            blue = (int)(blue * 0.25);
            change3.setBlue(blue);
        }
        mark3.explore();
        for(Pixel change4 : Mpixels4)
        {
            red = change4.getRed();
            red = Math.abs((int)(red - 255)); // get the opposite max vlaue of color to get the negative value color corresponding
            green = change4.getGreen();
            green = Math.abs((int)(green - 255));
            blue = change4.getBlue();
            blue = Math.abs((int)(blue - 255));
            change4.setRed(red);
            change4.setGreen(green);
            change4.setBlue(blue);
        }
        mark4.explore();
        for (Pixel change5 : Mpixels5)
        {
            red = change5.getRed();// lighten the picture by reducing RGB color intensity
            blue = change5.getBlue();
            green = change5.getGreen();
        }
    }
}
