package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
public class miinputmala extends InputListener {

	pelotitamala t;
	Fin adios;
	miinputmala(pelotitamala param,Fin p)
	{
		super();
		t=param;
		adios = p;
		
	}
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
		

		adios.setVisible(true);
		return true;
		

	}
	}