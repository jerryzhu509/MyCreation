//Jerry Zhu
//Ms.Krasteva
//October 15, 2018
//SAVE FOR LATER

import java.awt.*; //imports the abstract windows toolkit
import hsa.Console; //imports the console class

public class MyCreation //MyCreation class
{
    Console c; //creates an instance variable

    //adds the StartingBackground to MyCreation
    public void startingBackground ()  //startingBackground method
    {
	StartingBackground a = new StartingBackground (c);
    }


    //adds the Human thread to MyCreation
    public void human ()  //human method
    {
	//creates the thread
	Human b = new Human (c);

	//starts the thread
	b.start ();
    }


    //adds the Hyena thread to MyCreation
    public void hyena ()  //hyena method
    {
	//creates the thread
	Hyena d = new Hyena (c);

	//starts the thread
	d.run ();
    }


    //adds the Fox thread to MyCreation
    public void fox ()  //fox method
    {
	//creates the thread
	Fox e = new Fox (c);

	//starts the thread
	e.run ();
    }


    //adds the Lizard thread to MyCreation
    public void lizard ()  //lizard method
    {
	//creates the thread
	Lizard f = new Lizard (c);

	//starts the thread
	f.run ();
    }


    //adds the Airplane thread to MyCreation
    public void airplane ()  //lizard method
    {
	//creates the thread
	Airplane g = new Airplane (c);

	//starts the thread
	g.run ();
    }


    //adds the Bird thread to MyCreation
    public void bird ()  //bird method
    {
	//creates the threads
	Bird h1 = new Bird (c);
	//starts the threads
	h1.run ();
	Bird h2 = new Bird (c, Color.yellow);
	h2.run ();
	Bird h3 = new Bird (c, Color.gray, 50);
	h3.run ();
    }


    //creates a new window and gives window a title
    public MyCreation ()  //class constructor
    {
	c = new Console ("Oasis Search");
    }



    //main method
    public static void main (String[] args)
    {
	MyCreation d = new MyCreation (); //creates an object window of MyCreation

	//method execution
	d.startingBackground ();
	d.human ();
	d.hyena ();
	d.fox ();
	d.lizard ();
	d.bird ();
	d.airplane ();
    }
}


