package by.stepovoy.task07.model.entities;


public class Warrior extends Unit {
    private String heroClass;


    public Warrior() {
    }

    public Warrior(String name, int healthPoints,
                   int damagePoints, String skill, String heroClass) {
        super(name, healthPoints, damagePoints, skill);
        this.heroClass = heroClass;
    }

    public Warrior(Warrior warrior) {
        super(warrior.getName(), warrior.getHealthPoints(),
                warrior.getDamagePoints(), warrior.getSkill());
        heroClass = warrior.heroClass;
    }

    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        if (!super.equals(object))
            return false;
        Warrior warrior = (Warrior) object;
        return heroClass == warrior.getHeroClass()
                || (heroClass != null && heroClass.equals(warrior.getHeroClass()));
    }

    @Override
    public int hashCode() {
        return ODD_PRIME_NUMBER * DEFAULT_HASHCODE
                + (heroClass == null ? 0 : heroClass.hashCode())
                + super.hashCode();
    }

    @Override
    public String toString() {
        return "\nWarrior :"
                + super.toString()
                + "heroClass = " + heroClass + "\n";
    }
}
