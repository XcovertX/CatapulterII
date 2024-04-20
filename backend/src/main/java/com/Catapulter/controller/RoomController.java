package com.Catapulter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.game.Game;
import com.world.*;

@RestController
public class RoomController {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/api/room")
    public String getMap() {
        return setRoom(Game.currentRoom);
    }

    public String setRoom(GameRoom aRoom) {
		
		String mapRep = "";
		String textMap = "";
		ArrayList<String> mapList = new ArrayList<String>();
		String[] mapArray = new String[ aRoom.getRoomWidth() * aRoom.getRoomLength() ];
		int tileNumberTotal = aRoom.getRoomLength() * aRoom.getRoomWidth();
		// mainFrame.setTitle( aRoom.getName() );
		
		int k = 0;
	    for( int i = aRoom.getRoomWidth(); i > 0; i-- ) {
	    	
	    	for( int j = aRoom.getRoomLength(); j > 0; j-- ) {
	    		
	    		int index = tileNumberTotal - j;
	    		mapRep += ( ( GameTile ) aRoom.getTiles().get( index ) ).getTileChar();
	    		textMap += ( " " + Integer.toString( index ) );
	    		mapList.add( Integer.toString( index ) );
	    		mapArray[ k ] = ( ( GameTile ) aRoom.getTiles().get( index ) ).getTileChar();
	    		k++;
	    	}
	    	textMap += "\r\n";
	    	if( i > 1 ) {
	    		mapRep += "\r\n";
	    	}
	    	mapList.add( "\r\n" );
	    	tileNumberTotal = tileNumberTotal - aRoom.getRoomLength();
    	}
		
	    int x = 0;
	    for(int i = 0; i < aRoom.getRoomWidth(); i++ ) {
	    	for( int j = 0; j < aRoom.getRoomLength(); j++ ) {
	    		System.out.print( mapArray[x] );
	    		x++;
	    	}
	    	System.out.println();
	    }
        return mapRep;
		// map.setText( mapRep ); // TODO remove once new GUI is in place

		
		// Game.currentGame.getUI().getGuiController().setMapChars( mapRep );
		
	}
}
