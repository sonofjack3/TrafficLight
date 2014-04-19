//*********************************************************************************
// Question 1 (Part 1) - TrafficLight.java                 Author: Evan Jackson
//
// Represents a traffic light.
//*********************************************************************************

import java.awt.*;
import javax.swing.*;

public class TrafficLight extends JPanel
{
	private int GREEN = 1, YELLOW = 2, RED = 3;
	private int state;

	public TrafficLight()
	{
		state = GREEN;
		setPreferredSize(new Dimension(220, 360));
	}

	//----------------------------------------------------------
	// Draws a traffic light.
	//----------------------------------------------------------
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);

		page.setColor(Color.darkGray);
		page.fillRect(40, 40, 140, 280); //traffic light body

		if (state == GREEN)
			page.setColor(Color.green);
		else page.setColor(Color.BLACK);
		page.fillOval(80, 220, 60, 60); //bottom light

		if (state == YELLOW)
			page.setColor(Color.yellow);
		else page.setColor(Color.BLACK);
		page.fillOval(80, 150, 60, 60); //middle light

		if (state == RED)
			page.setColor(Color.red);
		else page.setColor(Color.BLACK);
		page.fillOval(80, 80, 60, 60); //top light
	}

	//-------------------------------------------------------------
	// Changes the state of the Traffic Light, thus changing
	// the light from green to yellow to red to green, and so on.
	//-------------------------------------------------------------
	public void change()
	{
		if (state == GREEN)
			state++;
		else if (state == YELLOW)
			state++;
		else if (state == RED)
			state = state - 2;
		repaint();
	}
}