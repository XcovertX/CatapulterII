package com.inputProcessor;

import java.util.HashMap;
import java.util.Map;

import com.verbs.Action;
import com.verbs.Ask;
import com.verbs.Attack;
import com.verbs.Climb;
import com.verbs.Close;
import com.verbs.Cut;
import com.verbs.Drink;
import com.verbs.Drop;
import com.verbs.Eat;
import com.verbs.Get;
import com.verbs.Give;
import com.verbs.Go;
import com.verbs.Light;
import com.verbs.List;
import com.verbs.Look;
import com.verbs.Loot;
import com.verbs.Open;
import com.verbs.Put;
import com.verbs.Read;
import com.verbs.Say;
import com.verbs.Sleep;
import com.verbs.Stab;
import com.verbs.Take;
import com.verbs.Unlock;
import com.verbs.Use;
import com.verbs.Wear;
import com.verbs.Whisper;
import com.verbs.Yell;

public class KnownVerbs {
	
	private Map< String, Action > commands = new HashMap<>();
	
	public KnownVerbs() {
		commands.put( "ask", new Ask() ); 
		commands.put( "attack", new Attack() );
		commands.put( "close", new Close() );
		commands.put( "climb", new Climb() );
		commands.put( "cut", new Cut() );
		commands.put( "drink", new Drink() );
		commands.put( "drop", new Drop() );
		commands.put( "e", new Go() );
		commands.put( "eat", new Eat() );
		commands.put( "get", new Get() );
		commands.put( "give", new Give() );
		commands.put( "go", new Go() );
		commands.put( "i", new List() );
		commands.put( "inv", new List() );
		commands.put( "inventory", new List() );
		commands.put( "k", new Attack() );
		commands.put( "kil", new Attack() );
		commands.put( "kill", new Attack() );
		commands.put( "move", new Go() );
		commands.put( "l", new Look() );
		commands.put( "light", new Light() );
		commands.put( "lok", new Look() );
		commands.put( "look", new Look() );
		commands.put( "loot", new Loot() );
		commands.put( "n", new Go() );
		commands.put( "open", new Open() );
		commands.put( "put", new Put() );
		commands.put( "read", new Read() );
		commands.put( "s", new Go() );
		commands.put( "say", new Say() );
		commands.put( "scream", new Yell() );
		commands.put( "sleep", new Sleep() );
		commands.put( "stab", new Stab() );
		commands.put( "t", new Take() );
		commands.put( "tak", new Take() );
		commands.put( "take", new Take() );
		commands.put( "talk", new Say() );
		commands.put( "w", new Go() );
		commands.put( "wear", new Wear() );
		commands.put( "whisper", new Whisper() );
		commands.put( "unlock", new Unlock() );
		commands.put( "use", new Use() );
		commands.put( "yell", new Yell() );
		
	}
	
	public Action getAction( String verb ) {
		try {
			return commands.get( verb );
		} catch( IllegalArgumentException e ) {
			return null;
		} 
	}
	
	public boolean check( String s ) {
		return commands.containsKey( s );
	}
}
