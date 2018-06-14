package entities;

public class Unit {

    private String name;
    private int healthPoints;
    private int damagePoints;
    protected final int ODD_PRIME_NUMBER = 31;
    protected final int DEFAULT_HASHCODE = 7;

    public Unit() {
        this.healthPoints = 100;
    }

    public Unit(String name, int healthPoints, int damagePoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.damagePoints = damagePoints;
    }

    public Unit(Unit unit) {
        this(unit.name, unit.healthPoints, unit.damagePoints);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }



    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Unit unit = (Unit) object;
        return healthPoints == unit.getHealthPoints()
                && damagePoints == unit.getDamagePoints()
                && name == unit.name || (name != null
                && name.equals(unit.getName()));
    }

    @Override
    public int hashCode() {

        return ODD_PRIME_NUMBER * DEFAULT_HASHCODE
                + ((name == null) ? 0 : name.hashCode())
                + healthPoints
                + damagePoints;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", damagePoints=" + damagePoints +
                '}';
    }

}
