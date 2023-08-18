package rpgCombat;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CharacterTest {

    Character character1 = new Character(1000, 1, true, 100);
    Character character2 = new Character(800, 1, true, 200);

    @Test
    public void health_should_start_at_1000(){
        assertTrue(character1.getHealth()<=1000);
    }

    @Test
    public void level_should_start_at_1(){

        assertTrue(character1.getLevel()==1);
    }

    @Test
    public void alive_should_be_true(){

        assertTrue(character1.alive);
    }

    @Test
    public void strength_should_be_100(){

        assertTrue(character1.getStrength()==100);
    }
    @Test
    public void damage_should_substract_from_health(){
        character1.receiveDamage(50, character2);
        assertEquals(950, character1.getHealth());
    }
    @Test
    public void a_Character_can_Heal_a_Character(){
        character1.setHealth(900);
        character1.heal(character1);
        assertEquals(1000, character1.getHealth());
    }

    //iteration 2

    @Test
    public void A_Character_cannot_Deal_Damage_to_itself(){
        character1.receiveDamage(100, character1);
        assertEquals(1000, character1.getHealth());
    }
    @Test
    public void A_Character_can_only_heal_to_itself(){
        character1.heal(character1);
        assertEquals(1000, character1.getHealth());
    }
    @Test
    public void If_the_target_is_5_or_more_Levels_above_the_attacker_Damage_is_reduced_by_50_percent(){
        character1.setLevel(7);
        character2.setLevel(1);
        character1.receiveDamage(200, character2);
        assertEquals(900, character1.getHealth());
    }

    @Test
    public void If_the_target_is_5_or_more_Levels_below_the_attacker_Damage_is_increased_by_50_percent(){
        character1.setLevel(1);
        character2.setLevel(7);
        character1.receiveDamage(200, character2);
        assertEquals(700, character1.getHealth());
    }
}