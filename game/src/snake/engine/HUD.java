package snake.engine;

import snake.engine.creators.HUDSettings;
import com.badlogic.gdx.scenes.scene2d.Group;


/**                               Developed By:
 *                                   NoDark
 *                                sessaGlasses
 *                                
 *  <br> Generic game HUD -- information screens </br>
 * @author Mr.Strings
 */


public abstract class HUD extends Group {

	public HUD() {
		this.setBounds(0, 0, HUDSettings.getHudWidth(), HUDSettings.getHudHeight());
	}
	
	public String getPrefferedStage() {
		return new String ("LevelStage");
	}
	
	public abstract void show();
	
	public abstract void dispose();
}
