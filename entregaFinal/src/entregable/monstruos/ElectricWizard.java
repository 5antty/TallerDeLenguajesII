package entregable.monstruos;

import java.util.Arrays;

import entregable.ataques.Espectopatronum;
import entregable.ataques.Thunder;
import game.components.Monster;
import game.components.PathBox;
import game.types.Type;

public class ElectricWizard extends	Monster{
	
	
	public ElectricWizard(String name) {
		this.life = 375;
		this.monsterName = name;
		this.activeSkill = new Thunder();
		this.types = Arrays.asList(Type.ELECTRICITY, Type.WIZARD);
	}
	
	@Override
    public void attack(Monster enemy) {
		System.out.println("El poderoso "+this.monsterName+" lanza un "+this.activeSkill.getClass().getSimpleName());
		int dmg=this.activeSkill.damage(enemy);
        enemy.onDamageReceive(dmg, this);
        
    }
	
	//En la parte de move me puedo poner como que aumente el daño, cambie de tipo, consiga un escudo, cualquier cosa
    @Override
    public void move(PathBox oldPathBox, PathBox newPathBox) {
        super.move(oldPathBox, newPathBox);
        if(activeSkill instanceof Thunder) {
            this.activeSkill = new Espectopatronum();
        }
        
    }
    
    @Override
    public void onDamageReceive(Integer dmg, Monster enemy) {
    	this.life = this.life - dmg;
        if(this.life < 0) {
        	System.out.println("Antes de morir "+this.monsterName+" lanza un trueno ");
        	this.activeSkill = new Thunder();
        	enemy.onDamageReceive(activeSkill.damage(enemy), this);
            this.life = 0;
        }
    	System.out.println("Hirieron al gran "+this.monsterName+" con "+dmg+" puntos de daño");
    }

}
