package snake.levelSettings;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import snake.core.SnakeStart;
import snake.hud.SnakeHUD;
import snake.interfacesAndAbstract.GameWorld;
import snake.interfacesAndAbstract.HUD;



/*                               Developed By:
 *                                  NoDark
 *                               sessaGlasses
 * Module: Mr.Strings (modifiable according to need)
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
	
	public static Stage createHUDStage (SnakeStart game,HUD hud) {
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
