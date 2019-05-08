//Jerry Zhu
//Ms. Krasteva
//October 15, 2018
// *****SAVE FOR LATER LOOK AT THE PROGRAMMING STYLE PICKUP

import java.awt.*; //imports the Abstract Window Toolkit
import hsa.Console; //imports the console class
import java.lang.*; // to access Thread class

public class StartingBackground //StartingBackground class
{
    private Console c; //creates an instance of this class

    public void draw ()  //draw method
    {
	//local colour variable for the sky
	Color cyan = new Color (0, 255, 255);
	//local colour variable for the ocean
	Color magenta = new Color (255, 0, 255);
	//local colour variable for the mountain
	Color silver = new Color (192, 192, 192);
	//local colour variable for the roof
	Color gray = new Color (128, 128, 128);
	//local colour variable for the hut
	Color maroon = new Color (128, 0, 0);
	//local colour variable for the roof
	Color olive = new Color (128, 128, 0);
	//local colour variable for the window
	Color darkGreen = new Color (0, 128, 0);
	//local colour variable for the pink seaweed
	Color gold = new Color (255, 215, 0);
	//local colour variable for the magenta seaweed
	Color darkGoldenRod = new Color (184, 134, 11);
	//local colour variable for the seaweed
	Color goldenRod = new Color (218, 165, 32);
	//local colour variable for the ground
	Color paleGoldenRod = new Color (238, 232, 170);
	//local colour variable for the seaweed
	Color khaki = new Color (240, 230, 140);
	//local colour variable for the seaweed
	Color bisque = new Color (255, 228, 196);
	//local colour variable for the seaweed
	Color moccasin = new Color (255, 228, 181);

	//loop used to make the ground and sky
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (Color.blue);
	    c.drawRect (0, 0, x, 320);
	    c.setColor (paleGoldenRod);
	    c.drawRect (0, 320, x, 180);
	}

	//loop used to create sun and some clouds
	for (int x = 0 ; x < 40 ; x++)
	{
	    //sun
	    c.setColor (Color.yellow); //sets colour
	    c.drawOval (560 + x, 40 + x, 40 - 2 * x, 40 - 2 * x); //sun
	    c.drawLine (610, 60, 630, 60); //lines around the sun
	    c.drawLine (600, 80, 620, 100);
	    c.drawLine (580, 90, 580, 110);
	    c.drawLine (560, 80, 540, 100);
	    c.drawLine (530, 60, 550, 60);
	    c.drawLine (540, 20, 560, 40);
	    c.drawLine (580, 10, 580, 30);
	    c.drawLine (600, 40, 620, 20);

	    //some clouds
	    c.setColor (Color.white); //sets colour
	    c.drawArc (195 - x / 2, 50 - x / 2, x, x, 0, 180);
	    c.drawOval (x + 40, x + 40, 80 - x * 2, 40 - x * 2); //leftmost cloud
	    c.drawOval (x + 400, x + 20, 60 - x * 2, 40 - x * 2); //rightmost cloud
	}

	//loop to make the two other clouds
	for (int x = 0 ; x < 80 ; x++)
	{
	    c.drawRect (140, 50, x, 30); //2nd leftmost cloud
	    c.drawRect (280, 40, x, 30); //2nd rightmost cloud

	}


	//loop used to make the semi circle on the cloud
	for (int x = 0 ; x < 30 ; x++)
	{
	    c.drawArc (163 - x / 2, 50 - x / 2, x, x, 0, 180);
	}


	//loop for the rocks
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (moccasin);
	    c.drawOval (10 + x, 299 + x, 20 - x * 2, 20 - x * 2); //leftmost rock
	    c.setColor (maroon);
	    c.drawRect (230, 299, x, 20); //2nd leftmost rock
	    c.setColor (cyan);
	    c.drawOval (610 + x, 299 + x, 20 - x * 2, 20 - x * 2); //righmost rock
	    c.setColor (olive);
	    c.drawRect (430, 299, x, 20);  //2nd rightmost rock
	}

	//loop to make the grass
	for (int x = 0 ; x < 10 ; x++)
	{
	    c.setColor (Color.green);
	    c.drawRect (182, 280, x, 40); //left grass
	    c.drawRect (192, 290, x, 30); //left grass
	    c.drawLine (182, 320, 170, 310); //grass
	    c.drawLine (182, 320, 178, 300); //grass
	    c.drawLine (182, 320, 173, 298); //grass
	    c.drawLine (202, 320, 214, 310); //grass
	    c.drawLine (202, 320, 206, 300); //grass
	    c.drawLine (202, 320, 211, 298); //grass

	    c.drawRect (390, 290, x, 30); //middle grass
	    c.drawLine (390, 320, 378, 310); //grass
	    c.drawLine (390, 320, 386, 300); //grass
	    c.drawLine (390, 320, 381, 298); //grass
	    c.drawLine (400, 320, 414, 310); //grass
	    c.drawLine (400, 320, 404, 300); //grass
	    c.drawLine (400, 320, 409, 298); //grass
	    
	    c.drawRect (580, 290, x/2, 30); //right grass
	    c.drawLine (580, 320, 568, 310); //grass
	    c.drawLine (580, 320, 576, 300); //grass
	    c.drawLine (580, 320, 571, 298); //grass
	    c.drawLine (585, 320, 604, 310); //grass
	    c.drawLine (585, 320, 594, 300); //grass
	    c.drawLine (585, 320, 599, 298); //grass

	}

	//loop used to make the cacti
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.setColor (darkGreen);
	    //leftmost cactus
	    c.drawRect (80, 259, x, 60); //body of the leftmost cactus
	    c.drawRect (40, 280, x, 20); //left arm of the leftmost cactus
	    c.drawRect (40, 220, x / 2, 60); //left arm of the leftmost cactus
	    c.drawRect (140, 220, x / 2, 40); //right arm of the leftmost cactus
	    c.drawRect (120, 259, x, 20); //right arm of the leftmost cactus
	    c.drawArc (99 - x / 2, 260 - x / 2, x, x, 0, 180); //head of the leftmost cactus

	    //middle cactus
	    c.drawRect (300, 239, x, 80); //body of the middle cactus
	    c.drawRect (260, 220, x / 2, 40); //left arm of the middle cactus
	    c.drawRect (260, 259, x, 20); //left arm of the middle cactus
	    c.drawRect (340, 259, x, 20); //right arm of the middle cactus
	    c.drawRect (360, 220, x / 2, 40); //right arm of the middle cactus

	    //rightmost cactus
	    c.drawRect (480, 259, x, 60); //body of the rightmost cactus
	    c.drawRect (440, 259, x, 20); //left arm of the rightmost cactus
	    c.drawRect (520, 280, x, 20); //right arm of the rightmost cactus
	    c.drawArc (499 - x / 2, 260 - x / 2, x, x, 0, 180); //head of the leftmost cactus

	}


	//for loop for the arc arms of the rightmost cactus
	for (int x = 0 ; x < 60 ; x++)
	{
	    c.drawArc (470 - x / 2, 260 - x / 2, x / 2, x, 0, 180); //left arm of the rightmost cactus
	    c.drawArc (559 - x / 2, 280 - x / 2, x / 2, x, 0, 180); //right arm of the rightmost cactus
	}

    }


    public StartingBackground (Console con)
    {
	c = con;
	draw ();
    }
} //class






