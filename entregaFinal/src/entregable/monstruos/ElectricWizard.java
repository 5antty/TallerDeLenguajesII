package entregable.monstruos;

import java.util.Arrays;

import entregable.ataques.Espectopatronum;
import entregable.ataques.Thunder;
import game.components.Monster;
import game.components.PathBox;
import game.types.Type;

public class ElectricWizard extends	Monster{
	
	
	public ElectricWizard(String name) {
		this.life = 240;
		this.monsterName = name;
		this.activeSkill = new Thunder();
		this.types = Arrays.asList(Type.ELECTRICITY, Type.WIZARD);
	}
	
	@Override
    public void attack(Monster monster) {
        monster.onDamageReceive(this.activeSkill.damage(monster), this);
    }

    @Override
    public void move(PathBox oldPathBox, PathBox newPathBox) {
        super.move(oldPathBox, newPathBox);
        if(activeSkill instanceof Thunder) {
            this.activeSkill = new Espectopatronum();
        }
    }

}
