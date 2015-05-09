package snake.engine.creators;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import snake.engine.GameStart;
import snake.engine.GameWorld;
import snake.engine.HUD;
import snake.hud.SnakeHUD;



/**                               Developed By:
 *                                  NoDark
 *                               sessaGlasses
 * @author Mr.Strings (Modifiable according to need)
 * 
 * Controls HUD Parameters, such as size, camera infos, etc.
 */

public abstract class HUDSettings {
	private static float HUD_SIZEX = 1280, HUD_SIZEY = 720;
	private static float CAMERAPOSITIONX = 640, CAMERAPOSITIONY = 360;
	
	public static HUD createHUD (GameWorld world) {
		return new SnakeHUD (world); //can be changed for another HUD
	}
	
	public static Viewport createHUDViewport(HUD hud) {
		Camera camera = new OrthographicCamera();
		return new StretchViewport(HUD_SIZEX, HUD_SIZEY, camera); //Aspect ratio Strategy for multiple screen resolutions
	}
	
	public static Stage createHUDStage (GameStart game,HUD hud) {
		Stage stage;
		stage = new Stage(HUDSettings.createHUDViewport(hud), game.getBatch());
		
		float width = stage.getViewport().getCamera().viewportWidth;
		float height = stage.getViewport().getCamera().viewportHeight;
		
		stage.getViewport().getCamera().translate(CAMERAPOSITIONX - width/2, CAMERAPOSITIONY - height/2, 0);
		
		return  stage;
	}
	
	
	/* ------------------------------ Getters ------------------------------ */
	public static float getHudWidth() {
		return HUD_SIZEX;
	}
	
	public static float getHudHeight() {
		return HUD_SIZEY;
	}
	
	public static float getCameraPosX() {
		return CAMERAPOSITIONX;
	}
	
	public static float getCameraPosY() {
		return CAMERAPOSITIONY;
	}
	
	/* ------------------------------ Setters ------------------------------ */
	public static void setCameraPosition(float posX, float posY) {
		CAMERAPOSITIONX = posX;
		CAMERAPOSITIONY = posY;
	}
	public static void setHUDSSize(float sizex, float sizey) {
		HUD_SIZEX = sizex;
		HUD_SIZEY = sizey;
	}
	
	
}
