package entregable.ataques;

import game.components.Monster;
import game.random.RandomGenerator;
import game.types.Type;

public class Tsunami implements Water{
	@Override
	public int damage(Monster monster) {
		int dmg = RandomGenerator.getInstance().calculateDamage(150, 220);
		if(monster.getTypes().contains(Type.FIRE)||monster.getTypes().contains(Type.STONE)) {
			dmg = dmg*3;
		}
		return dmg;
	}

}
