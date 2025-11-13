
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
        double redtolerance = 181; // change the values to the general values in picture
        double greentolerance = 130;
        double bluetolerance = 125;
        Picture mark1 = new Picture("images/blue-mark.jpg");
        Picture mark2 = new Picture("images/blue-mark.jpg");
        Picture mark3 = new Picture("images/blue-mark.jpg");
        Picture mark4 = new Picture("images/blue-mark.jpg");
        Picture mark5 = new Picture("images/blue-mark.jpg");
        Picture mark6 = new Picture("images/blue-mark.jpg");
        Picture mark7 = new Picture("images/blue-mark.jpg");

        
        Pixel[] pixels;
        Pixel[] Mpixels1;
        Pixel[] Mpixels2;
        Pixel[] Mpixels3;
        Pixel[] Mpixels4;
        Pixel[] Mpixels5;
        Pixel[] Mpixels6;
        Pixel[] Mpixels7;
        
        
        Mpixels1 = mark1.getPixels();
        Mpixels2 = mark2.getPixels();
        Mpixels3 = mark3.getPixels();
        Mpixels4 = mark4.getPixels();
        Mpixels5 = mark5.getPixels();
        Mpixels6 = mark6.getPixels();
        Mpixels7 = mark7.getPixels();
        
        int red, green, blue, negate;
        int gray, Reda, Bluea, Greena;
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
            red = (int)(red * 1.9);
            blue = change5.getBlue();
            blue = (int)(blue * 1.85);
            green = change5.getGreen();
            green = (int)(green * 1.83);
            change5.setRed(red);
            change5.setBlue(blue);
            change5.setGreen(green);
        }
        mark5.explore();
        for (Pixel change6 : Mpixels6)
        {
            blue = change6.getBlue();
            red = change6.getRed();
            green = change6.getGreen();
            if(red > 61 && red < redtolerance && green > 80 && green < greentolerance && blue > 30 && blue < bluetolerance)
            {
                blue = (int)(blue * 2);
                change6.setBlue(blue);
            }
        }
        mark6.explore();
        for (Pixel change7 : Mpixels7)
        {
            blue = change7.getBlue();
            Bluea = blue;
            red = change7.getRed();
            Reda = red;
            green = change7.getGreen();
            Greena = green;
            gray = (int)(Reda + Bluea + Greena) / 3;
            Color graycolor = new Color(gray,gray,gray);
            change7.setColor(graycolor);
        }
        mark7.explore();
    }
}
