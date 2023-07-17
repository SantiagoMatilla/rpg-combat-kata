package rpgCombat;

public class Character {
    int health;
    int level;
    boolean alive;
    int strength;
    int healing;
    public Character(int health, int level, boolean alive, int strength, int healing) {
        this.health = health;
        this.level = level;
        this.alive = alive;
        this.strength = strength;
        this.healing = healing;
    }

    public String receiveDamage(int damage){
         if(damage>this.health){
             this.health = 0;
            return "This character is DEAD";
        }else{
             return "The character has recieved " + damage + " points of DAMAGE. Current HEALTH = " +this.health+ " points";
         }
    }
    /*public String healCompanion(){
        if(health>0){
            health += healing;
            return "The character has been healed +"+healing+" health points";
        }else if(health){

        }
        if(this.alive == false){
            return "You can´t HEAL a DEAD Character";
        }else{
            while(this.health<1000){
                health += healing;
                return "The character has been healed +"+healing+" health points";
            }
        }
    }*/



}
