 


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
         int RED, Dblue, Lblue, Owhite; // balanced approach color buckets
         for(Pixel Change1: Mpixels1 )
         {
            red = Change1.getRed();
            blue = Change1.getBlue();
            green = Change1.getGreen();
            Dblue = (int)(blue * 3);
            Lblue = (int)(blue * 0.5);
         }
         /**
          * method 2 change
          * 
          */
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
