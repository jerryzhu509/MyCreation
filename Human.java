//Jerry Zhu
//Ms. Krasteva
//October 15, 2018
// *****SAVE FOR LATER LOOK AT THE PROGRAMMING STYLE PICKUP

import java.awt.*; //imports the Abstract Window Toolkit
import hsa.Console; //imports the console class

public class Human extends Thread //Human class
{
    private Console c; //creates an instance of this class

    //local colour variable for the face
    Color bisque = new Color (255, 228, 196);
    //local colour variable for the ground
    Color paleGoldenRod = new Color (238, 232, 170);
    //local colour variable for the body
    Color magenta = new Color (255, 0, 255);
    //local colour variable for the legs
    Color maroon = new Color (128, 0, 0);
    //local colour variable for the arm
    Color khaki = new Color (240, 230, 140);
    //local colour variable for the hand
    Color gold = new Color (255, 215, 0);

    public void drawHuman ()  //draw method
    {
	//for loop to animate the human
	for (int x = 0 ; x < 630 ; x++)
	{
	    c.setColor (paleGoldenRod); //erase colour
	    c.fillRect (631 - x, 321, 61, 177); //human erase
	    c.setColor (bisque); //head colour
	    c.fillOval (641 - x, 322, 40, 40); //human's head
	    c.setColor (magenta); //body colour
	    c.fillRect (642 - x, 361, 40, 59); //human body
	    c.setColor (maroon);
	    c.fillRect (647 - x, 420, 10, 70); //left leg
	    c.fillRect (667 - x, 420, 10, 70); //right leg
	    c.fillRect (641 - x, 490, 16, 7); //left foot
	    c.fillRect (661 - x, 490, 16, 7); //right foot
	    c.fillRect (632 - x, 361, 10, 39); //left arm
	    c.fillRect (681 - x, 361, 10, 39); //right arm
	    c.setColor (gold);
	    c.fillRect (632 - x, 400, 10, 10); //left hand
	    c.fillRect (681 - x, 400, 10, 10); //right hand
	    c.setColor (Color.black);
	    c.drawLine (650 - x, 330, 655 - x, 330); //left eyebrow
	    c.drawLine (665 - x, 330, 670 - x, 330); //right eyebrow
	    c.fillOval (650 - x, 335, 5, 5); //left eye
	    c.fillOval (665 - x, 335, 5, 5); //right eye
	    c.drawLine (660 - x, 340, 660 - x, 348); //nose
	    c.setColor (Color.red);
	    c.drawArc (655 - x, 345, 10, 10, 180, 180); //mouth

	    try
	    {
		Thread.sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}


    } //draw method


    public Human (Console con)
    {
	c = con;

    }


    public void run ()
    {
	drawHuman ();
    }
} //class





