package by.stepovoy.task07.model.entities;

public class Magician extends Unit {
    private int manaPoints;

    public Magician() {
    }

    public Magician(String name, int healthPoints,
                    int damagePoints, String skill, int manaPoints) {
        super(name, healthPoints, damagePoints,skill);
        this.manaPoints = manaPoints;
    }

    public Magician(Magician magician) {
        super(magician.getName(), magician.getHealthPoints(),
                magician.getDamagePoints(), magician.getSkill());
        manaPoints = magician.getManaPoints();
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass())
            return false;
        if (!super.equals(object))
            return false;
        Magician magician = (Magician) object;
        return manaPoints == magician.getManaPoints();
    }

    @Override
    public int hashCode() {
        return ODD_PRIME_NUMBER * DEFAULT_HASHCODE
                + manaPoints
                + super.hashCode();
    }

    @Override
    public String toString() {
        return "\nMagician :"
                + super.toString()
                + "manaPoints = " + manaPoints + "\n";
    }
}
