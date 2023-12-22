import java.util.Arrays;
import java.util.List;

import entregable.monstruos.BigSlime;
import entregable.monstruos.ElectricWizard;
import entregable.monstruos.MagmaGolem;
import entregable.monstruos.Necromancer;
import game.components.Monster;
import game.components.RumbleGame;

public class Test {
	public static void main(String[] args) {
		RumbleGame rumbleGame = RumbleGame.getInstance();
        rumbleGame.init();

        List<Monster> monstersOne = Arrays.asList(new ElectricWizard("mago1"), new Necromancer("brujo1"), new ElectricWizard("mago2"), new Necromancer("brujo2"));
        rumbleGame.getPlayerOne().setMonsters(monstersOne);
        List<Monster> monstersTwo = Arrays.asList(new BigSlime("blob"), new BigSlime("blob2"), new MagmaGolem("golem1"));
        rumbleGame.getPlayerTwo().setMonsters(monstersTwo);
        rumbleGame.startGame();
	}
}
