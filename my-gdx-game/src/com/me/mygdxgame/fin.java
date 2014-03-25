package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class fin extends InputListener {

	Fin adios;
	fin (Fin p) {
		super ();
		adios = p;
	}
	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)	{
		adios.setVisible(true);
		return false;


		}
}