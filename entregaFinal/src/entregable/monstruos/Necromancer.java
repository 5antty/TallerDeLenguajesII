package entregable.monstruos;

import java.util.Arrays;
import java.util.List;

import entregable.ataques.Espectopatronum;
import game.attacks.Attack;
import game.attacks.Curse;
import game.components.Monster;
import game.components.PathBox;
import game.types.Type;

public class Necromancer extends Monster{
	private List<Attack> skills = Arrays.asList(new Curse(), new Espectopatronum());
	
	public Necromancer(String name) {
		this.life= 300;
		this.monsterName = name;
		this.activeSkill = skills.get(0);
		this.types=Arrays.asList(Type.DEMON, Type.WIZARD);
	}
	
	public void move(PathBox oldPathBox, PathBox newPathBox) {
        super.move(oldPathBox, newPathBox);
        if(activeSkill instanceof Curse) {
            this.activeSkill = new Espectopatronum();
        }
        
    }
	
	@Override
    public void attack(Monster enemy) {
		System.out.println("El poderoso "+this.monsterName+" lanza un "+this.activeSkill.getClass().getSimpleName());
		int dmg=this.activeSkill.damage(enemy);
        enemy.onDamageReceive(dmg, this);
        
    }
}
