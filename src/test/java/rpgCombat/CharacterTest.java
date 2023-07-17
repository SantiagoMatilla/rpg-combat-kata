package rpgCombat;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CharacterTest {
    int health = 1000;
    int level = 1;
    boolean alive = true;
    int strength = 100;

    int healing = 150;

    Character character1 = new Character(health, level, alive, strength, healing);

    @Test
    public void health_should_start_at_1000(){
        assertTrue(character1.health<=1000);
    }

    @Test
    public void level_should_start_at_1(){
        assertTrue(character1.level==1);
    }

    @Test
    public void alive_should_be_true(){
        assertTrue(character1.alive);
    }

    @Test
    public void strength_should_be_100(){
        assertTrue(character1.strength==100);
    }
    @Test
    public void damage_should_substract_from_health(){
        assertEquals("The character has recieved " + 50 + " points of DAMAGE. Current HEALTH = " +this.health+ " points",character1.receiveDamage(50));
    }
    @Test
    public void healing_should_be_150(){
        assertTrue(character1.healing==150);
    }

}