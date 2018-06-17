package by.stepovoy.task07.model.entities;

public class Archer extends Unit {
    private int accuracyPoints;

    public Archer() {
    }

    public Archer(String name, int healthPoints,
                  int damagePoints, String skill, int accuracyPoints) {
        super(name, healthPoints, damagePoints, skill);
        this.accuracyPoints = accuracyPoints;
    }


    public Archer(Archer archer) {
        super(archer.getName(), archer.getHealthPoints(),
                archer.getDamagePoints(), archer.getSkill());
        accuracyPoints = archer.accuracyPoints;

    }

    public int getAccuracyPoints() {
        return accuracyPoints;
    }

    public void setAccuracyPoints(int accuracyPoints) {
        this.accuracyPoints = accuracyPoints;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        if (!super.equals(object))
            return false;
        Archer archer = (Archer) object;
        return accuracyPoints == archer.getAccuracyPoints();
    }

    @Override
    public int hashCode() {
        return ODD_PRIME_NUMBER * DEFAULT_HASHCODE
                + accuracyPoints
                + super.hashCode();
    }

    @Override
    public String toString() {
        return "\nArcher :"
                + super.toString()
                + "accuracyPoints = " + accuracyPoints + "\n";
    }
}
