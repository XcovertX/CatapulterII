package com.game;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;     // required for ArrayList

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

// import com.UserInterface.GraphicalUserInterface;
import com.UserInterface.UserInterface;
import com.UserInterface.UserInterfaceNew;
import com.actor.Actor;
import com.actor.Cat;
import com.actor.Human;
import com.actor.NonPlayerActor;
// import com.application.GUI;
import com.environment.GameCalendar;
import com.objects.Thing;
import com.objects.ThingHolder;
import com.objects.ThingList;
import com.globals.Direction;
import com.inputProcessor.InputProcessor;
// import com.mapBuilder.RoomBuilder;
import com.utility.SignReader;
import com.world.GameMap;
import com.world.GameRoom;
import com.world.GameTile;
import com.world.GameWorld;
import com.world.UpdatePlayer;

public class Game {
    
	public static GameWorld currentWorld;
	public static GameMap currentMap;
	public static GameRoom currentRoom;
	public static GameTile currentTile;
    public static BufferedReader in;
    public static Game currentGame;
    public static GameCalendar calendar;
    
    // public Stage window;
    // public Parent root;
    // public GraphicalUserInterface gui;
    
	public static WorldReader worldReader;
    private String input;
    private String output;
    private UserInterfaceNew userInterface;
    private InputProcessor inputProcessor;
    private boolean roomChange = false;
    private Actor player;  // the player - provides 'first person perspective'
    
    public Game( boolean mapBuilderMode, boolean newGame ) {
    	
    	if( mapBuilderMode == true ) {
    		
    		// new RoomBuilder();
    		
    	} else if( newGame == true ) {

    		Game.currentGame = this;
    		
    		worldReader = new WorldReader();
    		
    		currentWorld = worldReader.getWorld( "files/worlds/catapulter", "catapulter.json" );
    		System.out.println( currentWorld);
			currentMap   = (GameMap)  ( currentWorld.getMaps().get( 0 ) );
    		currentRoom  = (GameRoom) ( currentMap.getRooms().get( 4 ) );
    		currentTile  = (GameTile) ( currentRoom.getTiles().get( 27 ) );
    		
    		currentWorld.setLocations();
    		
    		player = new Actor( "player", "This is a player", currentTile, new ThingList(), " @ " );
    		
    		userInterface = new UserInterfaceNew( player );
    		userInterface.getDisplay().setRoom( currentRoom );
 
	        calendar = new GameCalendar( currentGame );

	        setInputProcessor( new InputProcessor() );
	        
    	} else {
    		
    	}
    }

    // access methods
    public GameMap getMap() { return currentMap; } 

    public void setMap( GameMap aMap ) { currentMap = aMap; }

    public Actor getPlayer() { return player; }

    public void setPlayer( Actor aPlayer ) { player = aPlayer; }

    
//    // test method
//    public void initializeGUI() {
//
//    	gui = new GraphicalUserInterface();
//    	gui.setGUI();
//    	
//    }

//     public void showIntro(){
    	
//         String s;
//         SignReader welcome = new SignReader( "files/graphics", "welcome.txt" );
//         s = welcome.getText();
//         // userInterface.println( s );
//     }
    
    public void roomChange() { this.roomChange = true; }
    
    public UserInterfaceNew getUI() { return this.userInterface; }

	public InputProcessor getInputProcessor() { return inputProcessor; }

	public void setInputProcessor(InputProcessor inputProcessor) { this.inputProcessor = inputProcessor; }
	
	public void updateWorld() {
		new UpdatePlayer().run();
		currentWorld.allLists( "environment" );
//		currentWorld.allLists( "weather" );
		currentWorld.allLists( "actors" );
	}
	
	
}