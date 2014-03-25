package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class InputInicio extends InputListener {
Inicio a;
InputInicio(Inicio param)
{
	super();
	a=param;
}
public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
{
	

	a.setVisible(false);
	

	return true;
	

}
}