package com.me.mygdxgame;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


public class pelotitamala extends Image{
	public pelotitamala(int x, int y, Fin adios) {
		super(new Texture("data/pelotitamala.png"));
		addListener(new miinputmala(this,adios));
		this.setX(x);
		this.setY(y);
	}
	public void act(float delta)
	{		setX(getX()+1);
		if(getX()>420){
			setX(0);
			}
		if(getY()>200)
		{
		setY(0);}


	}


}


