package com.world;

import com.actor.Actor;
import com.actor.NonPlayerActor;
import com.objects.Thing;
import com.inputProcessor.MovementController;
import com.inputProcessor.MovementControllerList;

public class UpdateWalking extends UpdateWorld {
	
	private MovementController mc;

	@Override
	public void run(Thing aThing) {
		
		if( aThing.isActor() ) {
			Actor actor = ( Actor ) aThing;
			if( actor.isNPC() ) {
				NonPlayerActor npc = ( NonPlayerActor ) actor;
				
				MovementControllerList mcl = new MovementControllerList( npc );
				if( npc.getMC() == null ) {
					// MovementControllerList mcl = new MovementControllerList( npc );
					npc.setMC( mcl.getController( npc ) );

					System.out.println(npc.getControllerType());
				}
				
				mc = npc.getMC();
				mc.incrementCounter();
				
				if( mc.getCounter() > npc.getStats().getDexterity() ) {
					System.out.println("updating walking");
					if( mc.getMovementType().equals( "inRoomWander" ) ) {	

						System.out.println("updating in room wander");
						mc.moveToRandomTile( mc.getCurrentTile().getTileExits() );
					
					} else if( mc.getMovementType().equals( "inMapWander" ) ) {	
						
						mc.inRoomWander( mc.getCurrentTile().getTileExits() );
					
					} else if( mc.getMovementType().equals( "inWorldWander" ) ) {	
						
						mc.moveToRandomTile( mc.getCurrentTile().getTileExits() );
					
					} else if( mc.getMovementType().equals( "customWander" ) ) {	
						System.out.println("updating custom");
						mc.customWander( mc.getCurrentTile().getTileExits() );
					
					} else if( mc.getMovementType().equals( "purposeDriven" ) ) {	
						
						mc.purposeDriven( mc.getCurrentTile().getTileExits() );
					
					} else {
						
						//TODO build customer walking directions/instructions
					}
				}
			} else {
				
			}
		}
	}
}
