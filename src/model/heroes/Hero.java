package model.heroes;

public abstract class Hero {
    protected int availableStatsPoints;
    protected String name;
    protected int strength;
    protected int defence;
    protected int intelligence;
    protected int dexterity;
    protected int agility;
    protected int speed;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDefence() {
        return defence;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getAvailableStatsPoints() {
        return availableStatsPoints;
    }

    public void levelUp() {
        availableStatsPoints += 10;
    }

    protected abstract void modifyStrength();
    protected abstract void modifyDefence();
    protected abstract void modifyIntelligence();
    protected abstract void modifyDexterity();
    protected abstract void modifyAgility();
    protected abstract void modifySpeed();
    public void raiseStr() {
        if(availableStatsPoints<=0) return;
        modifyStrength();
        availableStatsPoints--;
    }

    public void raiseDef() {
        if(availableStatsPoints<=0) return;
        modifyDefence();
        availableStatsPoints--;
    }

    public void raiseInt() {
        if(availableStatsPoints<=0) return;
        modifyIntelligence();
        availableStatsPoints--;
    }

    public void raiseDex() {
        if(availableStatsPoints<=0) return;
        modifyDexterity();
        availableStatsPoints--;
    }

    public void raiseAgi() {
        if(availableStatsPoints<=0) return;
        modifyAgility();
        availableStatsPoints--;
    }

    public void raiseSpd() {
        if(availableStatsPoints<=0) return;
        modifySpeed();
        availableStatsPoints--;
    }
}
