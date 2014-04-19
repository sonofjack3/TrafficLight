//*********************************************************************************
// Question 1 (Part 2) - TrafficControlPanel.java            Author: Evan Jackson
//
// Creates a panel using a TrafficLight object.
//*********************************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficControlPanel extends JPanel
{
	private JButton push;
	private TrafficLight light;

	//--------------------------------------------------
	// Constructor which sets up the GUI.
	//--------------------------------------------------
	public TrafficControlPanel()
	{
		light = new TrafficLight();

		push = new JButton("Change light");
		push.addActionListener(new ButtonListener());

		add (light);
		add (push);

		setPreferredSize(new Dimension (220, 410));
	}

	//**********************************************************
	// Represents a listener for button push (action) events.
	//**********************************************************
	public class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			light.change();
		}
	}
}