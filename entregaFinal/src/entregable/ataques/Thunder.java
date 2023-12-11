package entregable.ataques;

import game.components.Monster;
import game.random.RandomGenerator;
import game.types.Type;

public class Thunder implements Electricity{
	
	@Override
	public int damage(Monster monster) {
		int dmg = RandomGenerator.getInstance().calculateDamage(75, 125);
		if(monster.getTypes().contains(Type.WATER)) {
			dmg = dmg*2;
		}
		else if(monster.getTypes().contains(Type.STONE)){
			dmg = 0;
		}
		return dmg;
	}

}
