//Jerry Zhu
//Ms. Krasteva
//October 15, 2018
// *****SAVE FOR LATER LOOK AT THE PROGRAMMING STYLE PICKUP

import java.awt.*; //imports the Abstract Window Toolkit
import hsa.Console; //imports the console class

public class Airplane implements Runnable //Airplane class
{
    private Console c; //creates an instance of this class

    //local colour variable for the airplane wing
    Color silver = new Color (192, 192, 192);
    //local colour variable for the airplane body
    Color gray = new Color (128, 128, 128);

    public void draw ()  //draw method
    {
	//for loop to animate the plane
	for (int x = 0 ; x < 840 ; x++)
	{
	    c.setColor (Color.blue);
	    c.fillRect (641 - x, 119, 131, 102); //erase
	    c.setColor (gray);
	    c.fillOval (640 - x, 148, 120, 44); //body
	    c.setColor (silver);
	    c.fillRect (690 - x, 120, 20, 30); //upper wing
	    c.fillRect (690 - x, 190, 20, 30); //lower wing
	    c.fillArc (741 - x, 148, 30, 45, 270, 180); //tail
	    c.setColor (Color.red);
	    c.fillMapleLeaf (680 - x, 150, 40, 40); //air canada logo
	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }


	}


    } //draw method


    public Airplane (Console con)
    {
	c = con;

    }


    public void run ()
    {
	draw ();
    }
} //class




