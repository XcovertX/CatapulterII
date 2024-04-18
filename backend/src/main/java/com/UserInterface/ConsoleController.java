package com.UserInterface;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.JTextArea;

public class ConsoleController {
	
	private JTextArea console;

	private URL location;
	
	private ResourceBundle resources;
	

	
	public ConsoleController() { };
	
	public JTextArea getConsole() { return console; }
	
	public void setText(String text) { console.setText( text ); }
	
	private void initialize() {
		
		System.out.println( "ConsoleController Initialized" );
		
	}
	
	/*
	 * Inserts text into the console and auto scrolls to the bottom.
	 */
	public void insertText( String s ) {
		
		console.setText( console.getText() + s );
		// console.positionCaret(s.length());
		// console.appendText("");
		// console.setScrollTop( Double.MAX_VALUE );

	}
	
	
}
