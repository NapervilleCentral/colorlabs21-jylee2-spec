 


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
         for(Pixel ChangeG1: Mpixels1 )
         {
            red = ChangeG1.getRed();
            blue = ChangeG1.getBlue();
            green = ChangeG1.getGreen();
           
            
            gray = (int)(red + blue + green) / 3;
            Color graycolor = new Color (gray, gray, gray);
            ChangeG1.setColor(graycolor);
            // gray scale the entire photo and then sort rgb value values in intervals of 64 (1-4) for what bucket gets which part of the photo
            
            
            /*
            Color Light = new Color(Lr,Lg,Lb);
            Color Dark = new Color(0,0,Db);
            Color PureR = new Color(RED,0,0);
            Color Owhite = new Color (Wr,Wg,Wb);
            */
         }
         for (Pixel Change1 : Mpixels1)
          {
           // gets gray scale values
           red = Change1.getColor(graycolor); // not valid
           green = Change1.getColor(graycolor);
           blue = Change1.getColor(graycolor);
           // rgb values of color types,using pixel value from gray scale photo
           Lr = (int)(red * 1);
           Lb = (int)(blue * 1);
           Lg = (int)(green * 1);
           Dr = (int)(red * 1);
           Dg = (int)(green * 1);
           Db = (int)(blue * 1);
           RED = (int)(red * 0.85);
           Wr = (int)(red * 1);
           Wb = (int)(blue * 1);
           Wg = (int)(green * 1);
           // set color below

           // check values with intervals of 64 into groups of 4 (0-64, 65-128, etc)
          }
         // set for loop to create shepard fairy, must pull from grayscale, not original photo
         
         
        me1.explore();
         /**
          * method 2 change
          * 
          */
         for (Pixel ChangeG2: Mpixels2)
          {
           red = Change2.getRed();
           blue = Change2.getBlue();
           green = Change2.getGreen();
           gray = (red + blue + green) / 3;
           Color colorgray = new Color(gray,gray,gray);
           Change2.setColor(colorgray);
           
           /*
           Color Light = new Color(Lr,Lg,Lb);
           Color Dark = new Color(0,0,Db);
           Color PureR = new Color(RED,0,0);
           Color Owhite = new Color (Wr,Wg,Wb);
           */  
        }
        for (Pixel Change2: Mpixels2)
         {
           red = Change2.getColor(colorgray);
           blue = Change2.getColor(colorgray);
           green = Change2.getColor(colorgray);
          // color values have already been set

          // set b and s values for equation for interval
          // interval is used to get range of largest rgb values and around equal filling
         }
           me2.explore();
           // light green
           int Or, Ob, Og; // orange
           int Pr, Pb, Pg; // Pastel
           int Yr, Yb, Yg; // Intense Yellow
         for (Pixel ChangeG3: Mpixels3)
          {
           red = ChangeG3.getRed();
           blue = ChangeG3.getBlue();
           green = ChangeG3.getGreen();
           gray = (red + blue + green) / 3;
           Color colorgray = new Color(gray,gray,gray);
           ChangeG3.setColor(colorgray);
          }
          for(Pixel Change3 : Mpixels3)
           {
            red = Change2.getColor(colorgray);
            blue = Change2.getColor(colorgray);
            green = Change2.getColor(colorgray);
            // color values have already been set

            // set b and s values for equation for interval
            // interval is used to get range of largest rgb values and around equal filling
           }
          me3.explore();
        
           
           
         /**
          * custom color palette
          */

         
    }//main       
}//class
