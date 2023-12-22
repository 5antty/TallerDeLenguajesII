package entregable.monstruos;

import java.util.Arrays;
import java.util.List;

import entregable.ataques.GomaGoma;
import entregable.ataques.Tsunami;
import game.attacks.Attack;
import game.components.Monster;
import game.components.PathBox;
import game.types.Type;

public class BigSlime extends Monster{

	//private List<Attack> skills = Arrays.asList(new GomaGoma(), new Tsunami());  
	
	public  BigSlime(String name) {
		this.life= 600;
		this.monsterName = name;
		this.activeSkill = new GomaGoma();
		this.types=Arrays.asList(Type.SLIME, Type.WATER);
	}
	
	@Override
	public void attack(Monster enemy) {
		System.out.println(this.monsterName+" se vuelca contra "+enemy);
		int dmg=this.activeSkill.damage(enemy);
        enemy.onDamageReceive(dmg, this);
        int rec=dmg/100;
        System.out.println(this.monsterName+" recupera "+rec+" puntos de vida");
		this.life= this.life+rec;
	}
	
	@Override
	public void move(PathBox oldPathBox, PathBox newPathBox) {
        super.move(oldPathBox, newPathBox);
        if(activeSkill instanceof GomaGoma) {
            this.activeSkill = new Tsunami();
        }
    }
	@Override
	public void onDamageReceive(Integer dmg, Monster mosnter) {
    	this.life = this.life - dmg;
        if(this.life < 0) {
            this.life = 0;
            System.out.println("A "+this.monsterName+" no le queda mas slime :c");
        }
        System.out.println("Se le derraman "+ dmg + " litros de slime a " + this.monsterName);
    }
}
