 


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
         int red, blue, green;
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
            Wr = (int)(red * 0.961);
            Wg = (int)(green * 0.95);
            Wb = (int)(blue * 0.963);
            Color Light = new Color(Lr,Lg,Lb);
            Color Dark = new Color(0,0,Db);
            Color PureR = new Color(RED,0,0);
            Color Owhite = new Color (Wr,Wg,Wb);
            if (red > 20 && red < 120 && green > 70 && green < 150 && blue > 130 && blue < 240)
            {
                Change1.setColor(PureR); // Make blue shirt RED
            }
            if (red > 25 && red < 145 && green > 5 && green < 140 && blue > 5 && blue < 120) // Make hair and background off white
            {
                Change1.setColor(Light);
            }
            if (red > 110 && red < 170 && green > 120 && green < 170 && blue > 120 && blue < 170)// Change lighter background around head to dark blue
            {
                Change1.setColor(Dark);
            }
            if(red > 145 && red < 250 && green > 120 && green < 240 && blue > 70 && blue < 200) // chang eface to light blue
            {
                Change1.setColor(Owhite);
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
