//*********************************************************************************
// Question 1 (Part 3) - TrafficLightDriver.java            Author: Evan Jackson
//
// Creates the main frame for the traffic light program.
//*********************************************************************************

import java.awt.*;
import javax.swing.*;

public class TrafficLightDriver
{
	//-----------------------------------------------------------
	// Creates the main program frame.
	//-----------------------------------------------------------
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Traffic Light");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new TrafficControlPanel());
		frame.pack();
		frame.setVisible(true);
	}
}