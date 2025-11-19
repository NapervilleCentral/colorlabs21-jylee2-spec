 


/**
 * Write a description of class SheparFaireyLab here.
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
         Picture me1 = new Picture("images/Josh.jpg");
         Picture me2 = new Picture("images/Josh.jpg");
         Picture me3 = new Picture("images/Josh.jpg");
         Pixel[] pixels;
         Pixel[] Mpixels1;
         Pixel[] Mpixels2;
         Pixel[] Mpixels3;
         Mpixels1 = me1.getPixels();
         Mpixels2 = me2.getPixels();
         Mpixels3 = me3.getPixels();
         me1.explore();
         /**
          * method 1 change
          */
         int b, s, interval;
         int red, blue, green, gray;
         int RED, Db,Lb,Lg,Lr, Wr, Wg, Wb; // balanced approach color buckets
         for(Pixel Change1: Mpixels1 )
         {
            red = Change1.getRed();
            blue = Change1.getBlue();
            green = Change1.getGreen();
            Lb = (int)(blue * 0.9);
            Lg = (int)(green * 0.85);
            Lr = (int)(red * 0.68);
            Db = (int)(blue * 0.545);
            RED = (int)(red * 1);
            Wr = (int)(red * 0.971);
            Wg = (int)(green * 0.96);
            Wb = (int)(blue * 0.973);
            Color Light = new Color(Lr,Lg,Lb);
            Color Dark = new Color(0,0,Db);
            Color PureR = new Color(RED,0,0);
            Color Owhite = new Color (Wr,Wg,Wb);
            gray = (int)(red + blue + green) / 3;
            Color graycolor = new Color (gray, gray, gray);
            Change1.setColor(graycolor);
            // gray scale the entire photo and then sort rgb value values in intervals of 64 (1-4) for what bucket gets which part of the photo
            if (red > 0 && red < 64 && green > 0 && green < 64 && blue > 0 && blue < 64)
            {
                Change1.setColor(PureR); // Make blue shirt RED
            }
            if (red > 64 && red < 128 && green > 64 && green < 128 && blue > 64 && blue < 128) // Make hair and background off white
            {
                Change1.setColor(Owhite);
            }
            if (red > 128 && red < 192 && green > 128 && green < 192 && blue > 128 && blue < 192)// Change lighter background around head to dark blue
            {
                Change1.setColor(Dark);
            }
            if(red > 192 && red < 256 && green > 192 && green < 256 && blue > 192 && blue < 256) // change face to light blue
            {
                Change1.setColor(Light);
            }
            
         }
         me1.explore();
         /**
          * method 2 change
          * 
          */
         for (Pixel Change2: Mpixels2)
          {
           
           red = Change2.getRed();
           blue = Change2.getBlue();
           green = Change2.getGreen();
           b = 0; // largest value in gray scale
           s = 255; // smallest value in gray scale
           
           gray = (red + blue + green) / 3;
           if (gray < s)
               s = gray;
           if (gray > b)
               b = gray;
           
           
           Color colorgray = new Color(gray,gray,gray);
           Change2.setColor(colorgray);
           interval = (b - s) / 4; // interval divided evenly by choice in color
           Lb = (int)(blue * 0.9);
           Lg = (int)(green * 0.85);
           Lr = (int)(red * 0.68);
           Db = (int)(blue * 0.545);
           RED = (int)(red * 1);
           Wr = (int)(red * 0.971);
           Wg = (int)(green * 0.96);
           Wb = (int)(blue * 0.973);
           Color Light = new Color(Lr,Lg,Lb);
           Color Dark = new Color(0,0,Db);
           Color PureR = new Color(RED,0,0);
           Color Owhite = new Color (Wr,Wg,Wb);
           if (gray >= s && gray < s + interval && gray >= s && gray < s + interval && gray >= s && gray < s + interval) // off white filling
           {  
            Change2.setColor(Owhite);
           }
           if (gray >= (s + interval) && gray < s + (interval*2) && gray >= (s + interval) && gray < s + (interval * 2) && gray >= (s + interval) && gray < 2 + (interval * 2)) // Pure Red filling
           {
            Change2.setColor(PureR);
           }
           if (gray >= s + (2 * interval) && gray < s + (3 * interval) && gray >=  s + (2 * interval) && gray < s + (3 * interval) && gray >=  s + (2 * interval) && gray < s + (3 * interval)) // Light Blue filling
           {
            Change2.setColor(Light);
           }
           if (gray >= s + (interval * 3) && gray <= b && gray >= s + (interval * 3) && gray <= b && gray >= s + (interval * 3) && gray <= b) // Dark Blue filling
           {
            Change2.setColor(Dark);
           }
        }
           me2.explore();
           // light green
           int Or, Ob, Og; // Intense orange
           int Pr, Pb, Pg; // Pastel
           int Yr, Yb, Yg; // Intense Yellow
           for (Pixel Change3: Mpixels3)
            {
             red = Change3.getRed();
             blue = Change3.getBlue();
             green = Change3.getGreen();
             gray = (red + blue + green) / 3;
             b = 215;
             s = 13;
             Color Cgray = new Color(gray,gray,gray);
             Change3.setColor(Cgray);
             // get colors for intense orange, Light green, Pastel, And intense yellow
             // using method 2 as the perfered method of coloring
             interval = (b - s) / 4; // interval divided evenly by choice in color
            }
           
        
           
           
         /**
          * custom color palette
          */

         
    }//main       
}//class
