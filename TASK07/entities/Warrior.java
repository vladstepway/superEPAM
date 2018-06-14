package entities;

import java.util.Objects;

public class Warrior extends Unit {
    private String heroClass;
    private String skill;

    public Warrior() {
    }

    public Warrior(String name, int healthPoints,
                   int damagePoints, String heroClass, String skill) {
        super(name, healthPoints, damagePoints);
        this.heroClass = heroClass;
        this.skill = skill;
    }

    public Warrior(Warrior warrior) {
        this(warrior.getName(), warrior.getHealthPoints(),
                warrior.getDamagePoints(), warrior.heroClass, warrior.skill);
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
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
                || (heroClass != null && heroClass.equals(warrior.getHeroClass()))
                && skill == warrior.getSkill()
                || (skill != null && skill.equals(warrior.getSkill()));
    }

    @Override
    public int hashCode() {
        return ODD_PRIME_NUMBER * DEFAULT_HASHCODE
                + (heroClass == null ? 0 : heroClass.hashCode())
                + (skill == null ? 0 : skill.hashCode())
                + super.hashCode();
    }

    @Override
    public String toString() {
        return "\nWarrior{" +
                "  name='" + getName() + '\'' +
                ", healthPoints=" + getHealthPoints() +
                ", damagePoints=" + getDamagePoints() +
                ", race='" + getHeroClass() + '\'' +
                ", skill='" + getSkill() + '\'' +
                '}'+'\n';
    }
}
