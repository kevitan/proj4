package eecs285.proj4;
import javax.swing.*;
import java.awt.*;

/*
	Project 4: Go285
	@author Shannon Pawloski, Kevin Tan, David Rushdoony, Michael Noonan
	@date Nov 20, 2012
	Listener.java
	Implements the game window with which the user interacts
*/

public class GameWindow extends JFrame
{
	JPanel controlPanel;
	JPanel topPanel;
	JPanel midPanel;
	JPanel bottomPanel;
	JButton passButton;	
	JButton resignButton;
	JLabel whoseMoveLabel;
	JLabel turnNumLabel;
	JLabel whitePrisonersLabel;	//prisoners that white has taken
	JLabel blackPrisonersLabel;	//prisoners that black has taken
	JPanel boardPanel;
	
	public GameWindow()
	{
		super("Go 285!");
		
		//Set up Control Panel
		controlPanel = new JPanel();
		topPanel = new JPanel();
		midPanel = new JPanel();
		bottomPanel = new JPanel();
		
		passButton = new JButton("Pass");
		resignButton = new JButton("Resign");
		topPanel.add(passButton, BorderLayout.WEST);
		topPanel.add(resignButton, BorderLayout.EAST);
		
		turnNumLabel = new JLabel("Turn Number 1");	//this will be updated throughout
		whoseMoveLabel = new JLabel("Black's move");//this will be updated throughout
		midPanel.add(turnNumLabel, BorderLayout.NORTH);
		midPanel.add(whoseMoveLabel, BorderLayout.SOUTH);

		whitePrisonersLabel = new JLabel("White's Prisoners: 0");//this will be updated throughout
		blackPrisonersLabel = new JLabel("Black's Prisoners: 0");//this will be updated throughout
		bottomPanel.add(whitePrisonersLabel, BorderLayout.NORTH);
		bottomPanel.add(blackPrisonersLabel, BorderLayout.SOUTH);
		
		controlPanel.add(topPanel, BorderLayout.NORTH);
		controlPanel.add(midPanel, BorderLayout.CENTER);
		controlPanel.add(bottomPanel, BorderLayout.SOUTH);
		
		
		//Set up board area
		boardPanel = new JPanel();
		
		//Add everything to window
		add(boardPanel, BorderLayout.NORTH);
		add(controlPanel, BorderLayout.EAST);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 400);
		setVisible(true);
		//pack();
	}

	
	
	
}