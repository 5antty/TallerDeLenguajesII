package entregable.monstruos;

import java.util.Arrays;

import entregable.ataques.GomaGoma;
import entregable.ataques.Tsunami;
import game.components.Monster;
import game.components.PathBox;
import game.types.Type;

public class WaterSlime extends Monster{

	//private List<Attack> skills = Arrays.asList(new GomaGoma(), new Tsunami());  
	
	public  WaterSlime(String name) {
		this.life= 600;
		this.monsterName = name;
		this.activeSkill = new GomaGoma();
		this.types=Arrays.asList(Type.SLIME, Type.WATER);
	}
	
	@Override
	public void attack(Monster monster) {
		monster.onDamageReceive(this.activeSkill.damage(monster), this);
	}
	
	@Override
	public void move(PathBox oldPathBox, PathBox newPathBox) {
        super.move(oldPathBox, newPathBox);
        if(activeSkill instanceof GomaGoma) {
            this.activeSkill = new Tsunami();
        }
    }
}
