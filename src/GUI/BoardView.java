package GUI;

import javax.swing.*;


public class BoardView extends JFrame {
	
	public static void main(String[] args){
		new BoardView();
	}
	
	public BoardView(){
		super();
		this.setVisible(true);
		this.setResizable(true);
		this.setTitle("ICFP Game");
		this.setSize(600, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		populate();
	}
	
	//Add the hexagons to the screen
	public void populate(){
		this.add(new HexPanel());
	}
}
