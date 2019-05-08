//Jerry Zhu
//Ms. Krasteva
//October 15, 2018
// *****SAVE FOR LATER LOOK AT THE PROGRAMMING STYLE PICKUP

import java.awt.*; //imports the Abstract Window Toolkit
import hsa.Console; //imports the console class

public class Hyena implements Runnable //Hyena class
{
    private Console c; //creates an instance of this class

    //local colour variable for the airplane wing
    Color silver = new Color (192, 192, 192);
    //local colour variable for the airplane body
    Color gray = new Color (128, 128, 128);
    //local colour variable for the seaweed
    Color goldenRod = new Color (218, 165, 32);
    //local colour variable for the pink seaweed
    Color gold = new Color (255, 215, 0);
    //local colour variable for the roof
    Color olive = new Color (128, 128, 0);

    public void drawHyena ()  //draw method
    {

	//for loop to animate the hyena
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (Color.blue);
	    c.fillRect (641 - x, 400, 135, 81); //erase
	    c.setColor (goldenRod);
	    c.fillRect (661 - x, 416, 66, 40); //body
	    c.drawLine (727 - x, 430, 747 - x, 430); //tail
	    c.drawLine (747 - x, 430, 747 - x, 450); //tail
	    c.fillRect (640 - x, 400, 7, 15); //left ear
	    c.fillRect (655 - x, 400, 7, 15); //left ear
	    c.fillOval (640 - x, 410, 22, 22); //head
	    c.setColor (Color.black);
	    c.fillRect (643 - x, 416, 5, 5); //left eye
	    c.fillRect (653 - x, 416, 5, 5); //left eye
	    c.setColor (gold);
	    c.fillOval (666 - x, 423, 6, 6); //top body spot
	    c.fillOval (683 - x, 423, 6, 6); //top body spot
	    c.fillOval (700 - x, 423, 6, 6); //top body spot
	    c.fillOval (717 - x, 423, 6, 6); //top body spot
	    c.fillOval (666 - x, 440, 6, 6); //bottom body spot
	    c.fillOval (683 - x, 440, 6, 6); //bottom body spot
	    c.fillOval (700 - x, 440, 6, 6); //bottom body spot
	    c.fillOval (717 - x, 440, 6, 6); //bottom body spot
	    c.setColor (olive);
	    c.fillRect (707 - x, 455, 5, 26); //right leg
	    c.fillRect (714 - x, 455, 5, 26); //right leg
	    c.fillRect (672 - x, 455, 5, 26); //left leg
	    c.fillRect (679 - x, 455, 5, 26); //left leg
	    c.fillArc (645 - x, 420, 10, 10, 180, 180); //mouth

	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }


	}

    } //draw method


    public Hyena (Console con)
    {
	c = con;

    }


    public void run ()
    {
	drawHyena ();
    }
} //class




