package com.me.mygdxgame;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class MiInput extends InputListener{
	Pelotita p;
    MiInput(Pelotita param)
    {
    super();
    p=param;
    
    }
   
    	
    				  



	public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
	{
;
		
		System.out.println("pelotita presionada");
		p.remove();
		

		return true;
		
	
	}
}
