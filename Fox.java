//Jerry Zhu
//Ms. Krasteva
//October 15, 2018
// *****SAVE FOR LATER LOOK AT THE PROGRAMMING STYLE PICKUP

import java.awt.*; //imports the Abstract Window Toolkit
import hsa.Console; //imports the console class

public class Fox implements Runnable //Fox class
{
    private Console c; //creates an instance of this class

    //local colour varioable for blah
    Color reddishBrown = new Color (216, 14, 14);
    //local colour variable for the roof
    Color olive = new Color (128, 128, 0);
    //local colour variable for the pink seaweed
    Color gold = new Color (255, 215, 0);
    //local colour variable for the magenta seaweed
    Color darkGoldenRod = new Color (184, 134, 11);

    public void drawFox ()  //draw method
    {

	//for loop to animate the fox
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (Color.blue);
	    c.fillRect (641 - x, 400, 135, 81); //erase
	    c.setColor (darkGoldenRod);
	    c.fillArc (687 - x, 415, 80, 20, 270, 180); //tail
	    c.setColor (reddishBrown);
	    c.fillRect (661 - x, 416, 66, 40); //body
	    c.drawLine (730 - x, 425, 760 - x, 425); //tail line
	    c.fillRect (640 - x, 400, 7, 15); //left ear
	    c.fillRect (655 - x, 400, 7, 15); //right ear
	    c.fillOval (640 - x, 410, 22, 22); //head
	    c.setColor (Color.black);
	    c.fillOval (643 - x, 416, 5, 5); //left eye
	    c.fillOval (653 - x, 416, 5, 5); //right eye
	    c.fillArc (645 - x, 420, 10, 10, 180, 180); //mouth
	    c.setColor (gold);
	    c.drawLine (690 - x, 426, 717 - x, 424); //top body line
	    c.drawLine (690 - x, 434, 717 - x, 434); //middle body line
	    c.drawLine (690 - x, 442, 717 - x, 444); //bottom body line
	    c.setColor (olive);
	    c.fillRect (707 - x, 455, 5, 26); //right leg
	    c.fillRect (714 - x, 455, 5, 26); //right leg
	    c.fillRect (672 - x, 455, 5, 26); //left leg
	    c.fillRect (679 - x, 455, 5, 26); //left leg

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }


	}


    } //draw method


    public Fox (Console con)
    {
	c = con;

    }


    public void run ()
    {
	drawFox ();
    }
} //class




