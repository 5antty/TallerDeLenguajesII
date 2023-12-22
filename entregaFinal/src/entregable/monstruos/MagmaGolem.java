package entregable.monstruos;

import java.util.Arrays;

import entregable.ataques.Earthquake;
import game.components.Monster;
import game.components.PathBox;
import game.types.Type;

public class MagmaGolem extends Monster{
	
	public MagmaGolem(String name) {
		this.life=500;
		this.monsterName=name;
		this.types= Arrays.asList(Type.STONE, Type.FIRE);
		this.activeSkill=new Earthquake();
	}
	
	@Override
	public void attack(Monster enemy) {
		System.out.println(this.monsterName+" derribo a "+enemy+" con un "+ this.activeSkill.getClass().getSimpleName());
		int dmg=this.activeSkill.damage(enemy);
        enemy.onDamageReceive(dmg, this);
 
	}
	
	@Override
	public void move(PathBox oldPathBox, PathBox newPathBox) {
        super.move(oldPathBox, newPathBox);
        System.out.println(this.monsterName+" se regenera con las piedras del terreno");
        this.life+=15;
    }
	@Override
	public void onDamageReceive(Integer dmg, Monster mosnter) {
    	this.life = this.life - dmg;
        if(this.life < 0) {
            this.life = 0;
            System.out.println("El golem se quedo sin piedras para regenerarse");
        }
        System.out.println("Se le desprendieron "+ dmg + " piedras al golem "+ this.monsterName);
    }

}
