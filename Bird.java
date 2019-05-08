//Jerry Zhu
//Ms. Krasteva
//October 15, 2018
// *****SAVE FOR LATER LOOK AT THE PROGRAMMING STYLE PICKUP

import java.awt.*; //imports the Abstract Window Toolkit
import hsa.Console; //imports the console class

public class Bird implements Runnable //Bird class
{
    private Console c; //creates an instance of this class
    private Color birdColour;
    private int delay = 5;


    //local colour variable for the airplane wing
    Color silver = new Color (192, 192, 192);
    //local colour variable for the airplane body
    Color gray = new Color (128, 128, 128);

    public void drawBird ()  //draw method
    {
	//for loop to animate the bird
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (Color.blue);
	    c.fillRect (641 - x, 119, 73, 61); //erase
	    c.setColor (Color.red);
	    c.fillRect (640 - x, 134, 5, 8); //mouth
	    c.setColor (gray);
	    c.fillArc (644 - x, 130, 20, 20, 0, 180); //head
	    c.fillArc (644 - x, 120, 60, 40, 180, 180); //Body
	    c.setColor (Color.black);
	    c.fillOval (650 - x, 134, 4, 4); //eye
	    c.setColor (birdColour);
	    c.fillArc (670 - x, 120, 20, 40, 0, 180); //upper wing
	    c.fillArc (668 - x, 138, 20, 40, 180, 180); //lower wing
	    c.setColor (Color.yellow);
	    c.fillArc (672 - x, 140, 15, 10, 180, 180); //body wing
	    c.setColor (Color.green);
	    c.drawLine (676 - x, 146, 682 - x, 146); //body wing line

	    try
	    {
		Thread.sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	}
    } //draw method


    //basic bird
    public Bird (Console con)
    {
	c = con;

    }


    //bird with delay and colour
    public Bird (Console con, Color n)
    {
	c = con;
	birdColour = n;
    }


    //bird with different delay and colour
    public Bird (Console con, Color n, int z)
    {
	c = con;
	birdColour = n;
	delay = z;
    }


    public void run ()
    {
	drawBird ();
    }
} //class
