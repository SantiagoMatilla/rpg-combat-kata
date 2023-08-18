package rpgCombat;

public class Character {
    int health;
    int level;
    boolean alive;
    int strength;

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isAlive() {
        return alive;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }


    public Character(int health, int level, boolean alive, int strength) {
        this.health = health;
        this.level = level;
        this.alive = alive;
        this.strength = strength;
    }

    public String receiveDamage(double damage, Character Pepe){
         if(this!=Pepe){
             if(this.getHealth()<=0){
                 this.health = 0;
                 this.setAlive(false);
                 return "This character is DEAD";
             }else{
                 if(this.level - Pepe.level>=5){
                    damage=damage*0.5;
                    this.health-=damage;
                    return "Daño aplicado, reducido al 50% The character has recieved " + damage + " points of DAMAGE. Current HEALTH = " +this.health+ " points";

                 }else if(this.level - Pepe.level<=5){
                     damage=damage*1.5;
                     this.health-=damage;
                     return "Daño aplicado, reducido al 50% The character has recieved " + damage + " points of DAMAGE. Current HEALTH = " +this.health+ " points";

                 }else{
                     this.health-=damage;
                     return "The character has recieved " + damage + " points of DAMAGE. Current HEALTH = " +this.health+ " points";
                 }
             }
         }else{
             return "This character cannot attack himself";
         }
    }
    public String heal(Character Pepe){
        if(this==Pepe){
            if(alive){
                this.setHealth(1000);
                return "This Character has been healed.";
            }else{
                return "This Character is dead and cannot be healed";
            }
        }else{
            return "This Character cannot heal another character.";
        }
    }



}
