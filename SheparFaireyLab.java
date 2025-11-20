 


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
           
            
            gray = (int)(red + blue + green) / 3;
            Color graycolor = new Color (gray, gray, gray);
            Change1.setColor(graycolor);
            // gray scale the entire photo and then sort rgb value values in intervals of 64 (1-4) for what bucket gets which part of the photo
            
            
            /*
            Color Light = new Color(Lr,Lg,Lb);
            Color Dark = new Color(0,0,Db);
            Color PureR = new Color(RED,0,0);
            Color Owhite = new Color (Wr,Wg,Wb);
            */
         }
         // set for loop to create shepard fairy, must pull from grayscale, not original photo
         
         
         
         
         
         
         
         
         
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
           if (red >= s && red < s + interval && green >= s && green < s + interval && blue >= s && blue < s + interval) // off white filling
           {  
            Change2.setColor(Owhite);
           }
           if (red >= (s + interval) && red < s + (interval*2) && green >= (s + interval) && green < s + (interval * 2) && blue >= (s + interval) && blue < 2 + (interval * 2)) // Pure Red filling
           {
            Change2.setColor(PureR);
           }
           if (red >= s + (2 * interval) && red < s + (3 * interval) && green >=  s + (2 * interval) && green < s + (3 * interval) && blue >=  s + (2 * interval) && blue < s + (3 * interval)) // Light Blue filling
           {
            Change2.setColor(Light);
           }
           if (red >= s + (interval * 3) && red <= b && green >= s + (interval * 3) && green <= b && blue >= s + (interval * 3) && blue <= b) // Dark Blue filling
           {
            Change2.setColor(Dark);
           }
        }
           me2.explore();
           // light green
           int Or, Ob, Og; // orange
           int Pr, Pb, Pg; // Pastel
           int Yr, Yb, Yg; // Intense Yellow
           for (Pixel Change3: Mpixels3)
            {
             red = Change3.getRed();
             blue = Change3.getBlue();
             green = Change3.getGreen();
             gray = (red + blue + green) / 3;
             Color colorgray = new Color(gray,gray,gray);
             b = 0;
             s = 255;
             if (gray < s)
               s = gray;
             if (gray > b)
               b = gray;
             Or = (int)(red * 1);
             Og = (int)(green * 0.647);
             Ob = (int)(blue * 0);
             Pr = (int)(red * 1);
             Pg = (int)(green * 0.41);
             Pb = (int)(blue * 0.38);
             Yr = (int)(red * 1);
             Yg = (int)(blue * 0.937);
             Yb = (int)(green * 0.161);
             Lb = (int)(blue * 0.9);
             Lg = (int)(green * 0.85);
             Lr = (int)(red * 0.68);
             Color Light = new Color(Lr,Lg,Lb);
             Color Pastel = new Color(Pr,Pg,Pb);
             Color Iyellow = new Color(Yr,Yg,Yb);
             Color Orange = new Color (Lr,Lg,Lb);
             Change3.setColor(colorgray);
             // get colors for intense orange, Light green, Pastel, And intense yellow
             // using method 2 as the perfered method of coloring
             interval = (b - s) / 4; // interval divided evenly by choice in color
             if (red >= s && red < s + interval && green >= s && green < s + interval && blue >= s && blue < s + interval)
             {
              Change3.setColor(Light);
             }
             if (red >= (s + interval) && red < s + (interval*2) && green >= (s + interval) && green < s + (interval * 2) && blue >= (s + interval) && blue < 2 + (interval * 2))
             {
              Change3.setColor(Pastel);
             }
             if (red >= s + (2 * interval) && red < s + (3 * interval) && green >=  s + (2 * interval) && green < s + (3 * interval) && blue >=  s + (2 * interval) && blue < s + (3 * interval))
             {
              Change3.setColor(Iyellow);
             }
             if (red >= s + (interval * 3) && red <= b && green >= s + (interval * 3) && green <= b && blue >= s + (interval * 3) && blue <= b)
             {
              Change3.setColor(Orange);
             }
            }
        me3.explore();
        
           
           
         /**
          * custom color palette
          */

         
    }//main       
}//class
