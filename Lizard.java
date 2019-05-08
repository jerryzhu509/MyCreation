//Jerry Zhu
//Ms. Krasteva
//October 15, 2018
// *****SAVE FOR LATER LOOK AT THE PROGRAMMING STYLE PICKUP

import java.awt.*; //imports the Abstract Window Toolkit
import hsa.Console; //imports the console class

public class Lizard implements Runnable //Lizard class
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

    public void drawLizard ()  //draw method
    {

	//for loop to animate the lizard
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (Color.blue);
	    c.fillRect (641 - x, 425, 135, 67); //erase
	    c.setColor (olive);
	    c.fillOval (660 - x, 450, 45, 24); //body
	    c.fillOval (640 - x, 450, 22, 22); //head
	    c.setColor (Color.black);
	    c.fillOval (643 - x, 455, 7, 7); //eye
	    c.setColor (Color.white);
	    c.fillOval (645 - x, 457, 3, 3); //eye white
	    c.fillRect (642 - x, 465, 6, 4); //mouth
	    c.drawArc (650 - x, 457, 4, 8, 270, 180); //first arc
	    c.drawArc (653 - x, 457, 4, 8, 270, 180); //second arc
	    c.drawArc (656 - x, 457, 4, 8, 270, 180); //third arc
	    c.drawLine (703 - x, 461, 733 - x, 461); //tail
	    c.setColor (Color.black);
	    c.fillRect (670 - x, 472, 6, 18); //bottom left leg
	    c.fillRect (660 - x, 482, 10, 8); //bottom left leg
	    c.fillRect (670 - x, 434, 6, 18); //top left leg
	    c.fillRect (660 - x, 434, 10, 8); //top left leg
	    c.fillRect (692 - x, 472, 6, 18); //bottom right leg
	    c.fillRect (682 - x, 482, 10, 8); //bottom right leg
	    c.fillRect (692 - x, 434, 6, 18); //top right leg
	    c.fillRect (682 - x, 434, 10, 8); //top right leg
	    c.setColor (Color.white);
	    c.drawLine (654 - x, 481, 660 - x, 484); //bottom left leg line
	    c.drawLine (654 - x, 486, 660 - x, 486); //bottom left leg line
	    c.drawLine (654 - x, 491, 660 - x, 488); //bottom left leg line
	    c.drawLine (654 - x, 433, 660 - x, 436); //top left leg line
	    c.drawLine (654 - x, 438, 660 - x, 438); //top left leg line
	    c.drawLine (654 - x, 443, 660 - x, 440); //top left leg line
	    c.drawLine (676 - x, 481, 682 - x, 484); //bottom right leg line
	    c.drawLine (676 - x, 486, 682 - x, 486); //bottom right leg line
	    c.drawLine (676 - x, 491, 682 - x, 488); //bottom right leg line
	    c.drawLine (676 - x, 433, 682 - x, 436); //top right leg line
	    c.drawLine (676 - x, 438, 682 - x, 438); //top right leg line
	    c.drawLine (676 - x, 443, 682 - x, 440); //top right leg line


	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
    } //draw method


    public Lizard (Console con)
    {
	c = con;

    }


    public void run ()
    {
	drawLizard ();
    }
} //class




