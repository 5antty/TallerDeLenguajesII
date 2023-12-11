package entregable.ataques;

import game.components.Monster;
import game.types.Type;

public class GomaGoma implements Slime {
	@Override
	public int damage(Monster monster) {
		int dmg = 240;
		if (monster.getTypes().contains(Type.SWORD)||monster.getTypes().contains(Type.DEMON)) {
			dmg = (int) (dmg*1.5);
		}
		return dmg;
	}
}
