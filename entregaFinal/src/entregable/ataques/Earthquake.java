package entregable.ataques;

import game.components.Monster;
import game.random.RandomGenerator;
import game.types.Type;

public class Earthquake implements Stone{
	@Override
	public int damage(Monster monster) {
		int dmg = RandomGenerator.getInstance().calculateDamage(125, 155);
		 if(monster.getTypes().contains(Type.SWORD)||monster.getTypes().contains(Type.ELECTRICITY)) {
			 dmg = dmg * 2;
		 }
		 else if(monster.getTypes().contains(Type.SWORD)) {
			 dmg=0;
		 }
		return dmg;
	}
}