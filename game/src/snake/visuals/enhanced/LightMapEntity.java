package snake.visuals.enhanced;

import snake.engine.GameWorld;
import snake.map.MapEntity;

/**                              Developed By:
 *                                  NoDark
 *                               sessaGlasses
 *                               
 * <br> Entity that belongs to a VisualGameWorld </br>             
 * 
 * @author Mr.Strings
 * 
 */

public abstract class LightMapEntity extends MapEntity{

	public LightMapEntity(GameWorld world) {
		super(world);
	}
	
	public abstract boolean hasLights();
	
	public abstract void createLights();
	
	
	public abstract void disposeLights();

}
