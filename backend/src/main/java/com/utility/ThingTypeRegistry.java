package com.utility;

import java.util.HashMap;
import java.util.Map;

import com.actor.Actor;
import com.actor.NonPlayerActor;
import com.objects.Bottle;
import com.objects.Chest;
import com.objects.Container;
import com.objects.Furniture;
import com.objects.Key;
import com.objects.Lock;
import com.objects.Table;
import com.objects.Thing;
import com.objects.ThingHolder;
import com.objects.ThingList;
import com.objects.Treasure;
import com.objects.Water;
// import com.weapons.Weapon;
// import com.wearableObjects.Ring;
// import com.wearableObjects.WearableThing;
import com.world.GameMap;
import com.world.GameRoom;
import com.world.GameTile;
import com.world.GameWorld;

public class ThingTypeRegistry {
	
	private Map< String, Class< ? extends Thing > > thingTypeRegistry;
	
	public ThingTypeRegistry() {
		this.thingTypeRegistry = new HashMap<>();
		registerType( "Actor", Actor.class );
		registerType( "Bottle", Bottle.class );
		registerType( "Container", Container.class );
		registerType( "Chest", Chest.class );
		registerType( "Furniture", Furniture.class );
		registerType( "Key", Key.class );
		registerType( "Lock", Lock.class );
		registerType( "Map", GameMap.class );
		registerType( "NonPlayerActor", NonPlayerActor.class );
		// registerType( "Ring", Ring.class );
		registerType( "Room", GameRoom.class );
		registerType( "Table", Table.class );
		registerType( "ThingHolder", ThingHolder.class );
//		registerType( "ThingList", ThingList.class );
		registerType( "Tile", GameTile.class );
		registerType( "Treasure", Treasure.class );
		registerType( "Water", Water.class );
		// registerType( "Weapon", Weapon.class );
		// registerType( "WearableThing", WearableThing.class );
		registerType( "World", GameWorld.class );
	}
	
	public void registerType( String thingTypeName, Class< ? extends Thing > thingType ) {
		
		thingTypeRegistry.put( thingTypeName, thingType );
	}
	
	public Map< String, Class< ? extends Thing > > getRegistry() {
		return thingTypeRegistry;
	}
	
	public Class<? extends Thing> getClass( String className ) {
		return this.thingTypeRegistry.get( className );
	}
}
