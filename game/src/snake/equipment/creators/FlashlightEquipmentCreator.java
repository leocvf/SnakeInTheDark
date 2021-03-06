package snake.equipment.creators;

import snake.equipment.IEquipment;
import snake.equipment.IEquipmentCreator;
import snake.equipment.implementations.FlashlightEquipment;

/**                              Developed By:
 *                                  NoDarkGlasses
 *                        
 * @author bszazulla
 */

public class FlashlightEquipmentCreator implements IEquipmentCreator
{
	public IEquipment create()
	{
		return new FlashlightEquipment();
	}
}
