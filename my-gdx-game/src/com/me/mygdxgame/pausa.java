package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class pausa extends InputListener {
	Pausa stop;
pausa (Pausa p) {
super ();
stop = p;
}



public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)	{
Pausa.pausar= !Pausa.pausar;
System.out.println("Juego Pausado");
return true;	
}
}

