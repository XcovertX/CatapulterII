package com.game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;

import com.actor.Actor;
import com.actor.Cat;
import com.actor.NonPlayerActor;
import com.objects.Apple;
import com.objects.Bone;
import com.objects.Bottle;
import com.objects.Chest;
import com.objects.Container;
import com.objects.Food;
import com.objects.Fruit;
import com.objects.Furniture;
import com.objects.HomogeneousContentContainer;
import com.objects.Key;
import com.objects.Lock;
import com.objects.Meat;
import com.objects.Skull;
import com.objects.Table;
import com.objects.Thing;
import com.objects.ThingHolder;
import com.objects.Treasure;
import com.objects.Vegetable;
import com.objects.Water;
import com.resources.res.ResourceLoader;
// import com.weapons.Gun;
// import com.weapons.Weapon;
// import com.wearableObjects.Ring;
// import com.wearableObjects.WearableThing;
import com.world.GameMap;
import com.world.GameRoom;
import com.world.GameTile;
import com.world.GameWorld;

public class WorldReader {
	
	GameWorld world;
	
	public WorldReader() {}
	
	public GameWorld getWorld( String folderPath, String mapName ) {
		
		File fileObj = ResourceLoader.getFilesFolder( folderPath, mapName );
		
		RuntimeTypeAdapterFactory< Thing > thingAdapterFactory = RuntimeTypeAdapterFactory.of( Thing.class, "type" );
		thingAdapterFactory.registerSubtype( Actor.class, "Actor" );
		thingAdapterFactory.registerSubtype( Apple.class, "Apple" );
		thingAdapterFactory.registerSubtype( Bottle.class, "Bottle" );
		thingAdapterFactory.registerSubtype( Bone.class, "Bone" );
		thingAdapterFactory.registerSubtype( Cat.class, "Cat" );
		thingAdapterFactory.registerSubtype( Container.class, "Container" );
		thingAdapterFactory.registerSubtype( Chest.class, "Chest" );
		thingAdapterFactory.registerSubtype( Food.class, "Food" );
		thingAdapterFactory.registerSubtype( Fruit.class, "Fruit" );
		thingAdapterFactory.registerSubtype( Furniture.class, "Furniture" );
		thingAdapterFactory.registerSubtype( HomogeneousContentContainer.class, "HomogeneousContentContainer" );
		// thingAdapterFactory.registerSubtype( Gun.class, "Gun" );
		thingAdapterFactory.registerSubtype( Key.class, "Key" );
		thingAdapterFactory.registerSubtype( Lock.class, "Lock" );
		thingAdapterFactory.registerSubtype( Meat.class, "Meat" );
		thingAdapterFactory.registerSubtype( GameMap.class, "Map" );
		thingAdapterFactory.registerSubtype( NonPlayerActor.class, "NonPlayerActor" );
		// thingAdapterFactory.registerSubtype( Ring.class, "Ring" );
		thingAdapterFactory.registerSubtype( GameRoom.class, "Room" );
		thingAdapterFactory.registerSubtype( Skull.class, "Skull" );
		thingAdapterFactory.registerSubtype( Table.class, "Table" );
		thingAdapterFactory.registerSubtype( ThingHolder.class, "ThingHolder" );
		thingAdapterFactory.registerSubtype( GameTile.class, "Tile" );
		thingAdapterFactory.registerSubtype( Treasure.class, "Treasure" );
		thingAdapterFactory.registerSubtype( Vegetable.class, "Vegetable" );
		thingAdapterFactory.registerSubtype( Water.class, "Water" );
		// thingAdapterFactory.registerSubtype( Weapon.class, "Weapon" );
		// thingAdapterFactory.registerSubtype( WearableThing.class, "WearableThing" );
		thingAdapterFactory.registerSubtype( GameWorld.class, "World" );
		
		BufferedReader br = null;
		
		Gson gson = new GsonBuilder()
		.registerTypeAdapterFactory( thingAdapterFactory )
		.enableComplexMapKeySerialization()
		.create();
		
		try {
			
			br = new BufferedReader( new FileReader( fileObj ) );
			world = gson.fromJson( br, GameWorld.class );
			// br.close();
			
		} catch( FileNotFoundException e ){
			
			System.out.println( "File not found" );
		}
		
		return world;
	}
}
