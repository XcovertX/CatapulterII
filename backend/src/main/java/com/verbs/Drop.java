package com.verbs;

import com.game.Game;
import com.objects.Thing;

public class Drop extends Action {
	
	public Drop() {
		setRequiresNoun( true );
	}

	@Override
	public void run() {
	}
	
	
	@Override
	public void run( String thingName ) {
		// if( Game.currentGame.getPlayer().getThings().thingExists( thingName ) == false ) {
		// 	Game.currentGame.getUI().println( "You are not carrying a " + thingName );
		// } else {
		// 	Thing thing = Game.currentGame.getPlayer().getThings().findThisObject( thingName );
		// 	Game.currentGame.getPlayer().getThings().removeFirstOccurrence( thing ); //removes item from inventory
		// 	Game.currentTile.addThing( thing ); // adds thing to tile where player is located
		// 	thing.setLocationInRoom( "floor" );
		// 	Game.currentGame.getUI().println( "You drop the " + thing + " on the " + thing.getLocationInRoom() );
		// }
	}
	
	@Override
	public void run( String thingName, String preposition ) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void run( String thingNameOne, String preposition, String thingNameTwo ) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean requiresNoun() {
		return requiresNoun;
	}

	@Override
	public void setRequiresNoun( boolean requiresNoun ) {
		this.requiresNoun = requiresNoun;
	}


	public boolean isDirection() {
		return isDirection;
	}


	public void setIsDirection(boolean isDirection) {
		this.isDirection = isDirection;
	}

	@Override
	public boolean canHaveNoun() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCanHaveNoun(boolean requiresNoun) {
		// TODO Auto-generated method stub
		
	}
}
