/**
 * change photo of me
 * 
 * @author (Joshua lee) 
 * @version (11/13/25)
 */
import java.awt.*;
import java.util.*;
import java.util.List;

public class SheparFaireyLab
{
    public static void main(String[] args)
    {
        Picture apic = new Picture("images\\Josh.jpg");
        Picture me1 = new Picture("images/Josh.jpg");
        Picture me2 = new Picture("images/Josh.jpg");
        Picture me3 = new Picture("images/Josh.jpg");
        Picture me4 = new Picture("images/Josh.jpg");
        Picture me5 = new Picture("images/Josh.jpg");
        Picture me6 = new Picture("images/Josh.jpg");

        // METHOD 1
        method1(me1);
        me1.explore();
        me1.write("images/Shepard1.jpg");

        // METHOD 2
        method2(me2);
        me2.explore();
        me2.write("images/Shepard2.jpg");

        // METHOD 3
        method3(me3);
        me3.explore();
        me3.write("images/Shepard3.jpg");

        // METHOD 4 – Fix green too large (Imaan)
        method4(me4);
        me4.explore();
        me4.write("images/Shepard4.jpg");

        // METHOD 5 – Fix yellow covers screen (Titus)
        method5(me5);
        me5.explore();
        me5.write("images/Shepard5.jpg");

        // METHOD 6 – Fix random color distribution (Shivome)
        method6(me6);
        me6.explore();
        me6.write("images/Shepard6.jpg");
    }

    // ===========================
    // METHOD 1 – fixed intervals
    // ===========================
    public static void method1(Picture pic)
    {
        Pixel[] pixels = pic.getPixels();

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

    // ===========================
    // METHOD 2 – dynamic s and b
    // ===========================
    public static void method2(Picture pic)
    {
        Pixel[] pixels = pic.getPixels();
        int s = 255;
        int b = 0;

        for (Pixel p : pixels)
        {
            int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
            if (gray < s) s = gray;
            if (gray > b) b = gray;
        }

        int interval = (b - s) / 4;

        for (Pixel p : pixels)
        {
            int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;

            Color darkBlue = new Color(0, 0, 120);
            Color redColor = new Color(200, 0, 0);
            Color lightBlue = new Color(120, 160, 255);
            Color offWhite = new Color(240, 240, 220);

            if (gray < s + interval)
                p.setColor(darkBlue);
            else if (gray < s + 2*interval)
                p.setColor(redColor);
            else if (gray < s + 3*interval)
                p.setColor(lightBlue);
            else
                p.setColor(offWhite);
        }
    }

    // ===========================
    // METHOD 3 – custom palette
    // ===========================
    public static void method3(Picture pic)
    {
        Pixel[] pixels = pic.getPixels();
        int s = 255;
        int b = 0;

        for (Pixel p : pixels)
        {
            int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
            if (gray < s) s = gray;
            if (gray > b) b = gray;
        }

        int interval = (b - s) / 4;

        for (Pixel p : pixels)
        {
            int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;

            Color orange = new Color(255, 140, 0);
            Color yellow = new Color(255, 255, 120);
            Color blue = new Color(173, 216, 230);
            Color pastel = new Color(210, 200, 255);

            if (gray < s + interval)
                p.setColor(orange);
            else if (gray < s + 2*interval)
                p.setColor(yellow);
            else if (gray < s + 3*interval)
                p.setColor(blue);
            else
                p.setColor(pastel);
        }
    }

    // ===========================
    // METHOD 4 – fix green too large (Imaan)
    // ===========================
    public static void method4(Picture pic)
    {
        Pixel[] pixels = pic.getPixels();
        int s = 255, b = 0;

        for (Pixel p : pixels) {
            int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
            if (gray < s) s = gray;
            if (gray > b) b = gray;
        }

        int interval = (b - s) / 6; // SHRINK green interval

        for (Pixel p : pixels)
        {
            int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;

            Color green   = new Color(0, 180, 0);
            Color red     = new Color(200, 0, 0);
            Color blue    = new Color(0, 100, 255);
            Color cream   = new Color(250, 240, 220);

            if (gray < s + interval)
                p.setColor(green);      // much smaller green range
            else if (gray < s + 3*interval)
                p.setColor(red);
            else if (gray < s + 5*interval)
                p.setColor(blue);
            else
                p.setColor(cream);
        }
    }

    // ===========================
    // METHOD 5 – fix yellow too large (Titus)
    // ===========================
    public static void method5(Picture pic)
    {
        Pixel[] pixels = pic.getPixels();
        int s = 255, b = 0;

        for (Pixel p : pixels) {
            int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
            if (gray < s) s = gray;
            if (gray > b) b = gray;
        }

        int interval = (b - s) / 5;

        for (Pixel p : pixels)
        {
            int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;

            Color yellow  = new Color(255, 255, 120);
            Color orange  = new Color(255, 150, 0);
            Color blue    = new Color(120, 160, 255);
            Color darkRed = new Color(160, 0, 0);

            if (gray < s + interval)
                p.setColor(darkRed);
            else if (gray < s + 2*interval)
                p.setColor(orange);
            else if (gray < s + 3*interval)
                p.setColor(yellow); // smaller yellow range
            else
                p.setColor(blue);
        }
    }

    // ===========================
    // METHOD 6 – fix random color placement (Shivome)
    // ===========================
    public static void method6(Picture pic)
    {
        Pixel[] pixels = pic.getPixels();
        int s = 255, b = 0;

        for (Pixel p : pixels) {
            int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;
            if (gray < s) s = gray;
            if (gray > b) b = gray;
        }

        int interval = (b - s) / 4;

        for (Pixel p : pixels)
        {
            int gray = (p.getRed() + p.getGreen() + p.getBlue()) / 3;

            // normalize grayscale → 0–255 range
            gray = (int)((gray - s) * 255.0 / (b - s));

            Color color1 = new Color(30, 30, 120);
            Color color2 = new Color(200, 50, 50);
            Color color3 = new Color(120, 200, 240);
            Color color4 = new Color(245, 245, 220);

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
}
