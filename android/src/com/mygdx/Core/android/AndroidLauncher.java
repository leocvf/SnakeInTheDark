package com.mygdx.Core.android;

/*                               Developed By:
 *                                  NoDark
 *                               sessaGlasses
 *  Module: Mr.Strings -- auto-generated
 */


import snake.engine.core.SnakeStart;
import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new SnakeStart(), config);
	}
}
