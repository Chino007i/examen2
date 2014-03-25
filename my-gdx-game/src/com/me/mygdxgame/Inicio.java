package com.me.mygdxgame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Inicio extends Image {
	public Inicio()
	{
		super(new Texture("data/fondoexa2.png"));
		this.addListener(new InputInicio(this));
	}
	

}
