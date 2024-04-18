package com.Catapulter;

import com.game.Game;
import com.game.GameLoop;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatapulterApplication {

	public static void main(String[] args) {
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXX Starting XXXXXXXXXXXXXXXXXXXXXXXXXX");
		SpringApplication.run(CatapulterApplication.class, args);

		boolean mapBuilderMode = false;
		boolean newGame = true;

		Game game = new Game( mapBuilderMode, newGame );
		Thread gameThread = new Thread( new GameLoop( game ) );
		gameThread.setName( "Game_Thread" );
		gameThread.start();
		// game.getInputProcessor().updateOutput( 0 ); // change this update once new login process implemented
	}

}
