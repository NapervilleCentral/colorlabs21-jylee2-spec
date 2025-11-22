 


/**
 * change photo of me
 * 
 * @author (Joshua lee) 
 * @version (11/13/25)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /**/
         //String fileName = FileChooser.pickAFile();
         //Picture pictObj = new Picture(fileName);
         //pictObj.explore();
         
         //relative path
         Picture apic = new Picture("images\\Josh.jpg");
         //change with selfie picture
         import java.awt.*;

public class SheparFaireyLab
{
    public static void main(String[] args)
    {
        Picture me1 = new Picture("images/Josh.jpg");
        Picture me2 = new Picture("images/Josh.jpg");
        Picture me3 = new Picture("images/Josh.jpg");

        // ===== METHOD 1 (fixed intervals) =====
        method1(me1);
        me1.explore();

        // ===== METHOD 2 (dynamic intervals using s and b) =====
        method2(me2);
        me2.explore();

        // ===== METHOD 3 (custom palette using same logic as method 2) =====
        method3(me3);
        me3.explore();
    }

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
            int gray = p.getRed(); // all channels same now

            // ----- Fill in your 4 colors here -----
            Color color1 = new Color(0, 0, 120);      // dark blue
            Color color2 = new Color(200, 0, 0);      // red
            Color color3 = new Color(120, 160, 255);  // light blue
            Color color4 = new Color(240, 240, 220);  // off white

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

    // -------------------------
    // METHOD 2 – dynamic s and b
    // -------------------------
    public static void method2(Picture pic)
    {
        Pixel[] pixels = pic.getPixels();
        int s = 255;
        int b = 0;

        // compute s and b
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

            // ----- Fill in your 4 colors here -----
            Color darkBlue   = new Color(0, 0, 120);
            Color redColor   = new Color(200, 0, 0);
            Color lightBlue  = new Color(120, 160, 255);
            Color offWhite   = new Color(240, 240, 220);

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

    // -------------------------
    // METHOD 3 – custom palette
    // -------------------------
    public static void method3(Picture pic)
    {
        Pixel[] pixels = pic.getPixels();
        int s = 255;
        int b = 0;

        // compute s and b again
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

            // ----- Your custom colors here (choose anything!) -----
            Color orange   = new Color(255, 140, 0);
            Color yellow   = new Color(255, 255, 120);
            Color green    = new Color(100, 255, 120);
            Color pastel   = new Color(210, 200, 255);

            if (gray < s + interval)
                p.setColor(orange);
            else if (gray < s + 2*interval)
                p.setColor(yellow);
            else if (gray < s + 3*interval)
                p.setColor(green);
            else
                p.setColor(pastel);
        }
    }
}

         
    }//main       
}//class
