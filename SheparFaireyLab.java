 


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
         Picture me = new Picture("images/Josh.jpg");
         Picture me1 = new Picture("images/Josh.jpg");
         Picture me2 = new Picture("images/Josh.jpg");
         Pixel[] pixels;
         Pixel[] Mpixels1;
         Mpixels1 = me.getPixels();
         me1.explore();
         /**
          * method 1 change
          */
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
         me.explore();
         /**
          * method 2 change
          * 
          */
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
