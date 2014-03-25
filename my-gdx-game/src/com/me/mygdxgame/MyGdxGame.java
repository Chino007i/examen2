package com.me.mygdxgame;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


class Imagen extends Sprite
{
	Imagen(Texture texture)
	{
		super(texture);

	}
	InputListener l;
	void avanzar()
	{
		setX(getX()+0.01f);
		if(getX()>0.5f)
			setX(-0.5f);
	}

}


public class MyGdxGame implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	//private Texture texture_nave;

	private Sprite sprite;
	private Sprite sprite2;

	//private Sprite sprite_nave;
	private Imagen imagen;
	private Image i;
	Pelotita p;
	private Texture texture_nave;
	private Texture texture_fondo;
	//private Sprite sprite_nave;
	private Sprite sprite_fondo;
	int frame=0;
	Stage s;
	ArrayList<Sprite>sprites=new ArrayList<Sprite>();
	ArrayList<Pelotita>pelotitas=new ArrayList<Pelotita>();
	ArrayList<pelotitamala>pelotitasm=new ArrayList<pelotitamala>();
	int rotacion=0;
	Inicio la;
	
	@Override
	public void create()
	{		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();

		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();

		texture = new Texture(Gdx.files.internal("data/fondo.png"));
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);

		TextureRegion region = new TextureRegion(texture, 0, 0, 512, 275);

		sprite = new Sprite(region);

		sprite.setSize(0.9f, 0.9f * sprite.getHeight() / sprite.getWidth());
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(0,0);

		imagen = new Imagen(texture);
		imagen.setPosition(-0.5f,-0.5f);
		imagen.setSize(1.0f, 1.0f);

		s=new Stage();
		i=new Image(texture);
		s.addActor(i);



		Gdx.input.setInputProcessor(s);

		Pausa pausar = new Pausa();
		s.addActor(pausar);


		for(int i=0; i<=10; i++)
		{

			Pelotita p = new Pelotita((int)(Math.random()*1000%w),(int)(Math.random()*1000%h));
			s.addActor(p);
			pelotitas.add(p);
		}
		Fin adios = new Fin();

		for(int e=0; e<5; e++)
		{
			pelotitamala t = new pelotitamala((int)(Math.random()*1000%w),(int)(Math.random()*1000%h),adios);
			s.addActor(t);
			pelotitasm.add(t);
		}


		adios.setVisible(false);
		s.addActor(adios);

		la=new Inicio();
		s.addActor(la);

	}


	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render() {	
		sprite.setRotation(rotacion);

		//imagen.avanzar();

		Gdx.gl.glClearColor(4.5f, 8.3f, 2.2f, 8.2f);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

		batch.setProjectionMatrix(camera.combined);
		if(!Pausa.pausar)
		{
		s.act();
		s.draw();}

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}