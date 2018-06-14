package entities;

import java.util.Objects;

public class Magician extends Unit {
    private String spell;
    private int manaPoints;

    public Magician() {
    }

    public Magician(String name, int healthPoints,
                    int damagePoints, String spell, int manaPoints) {
        super(name, healthPoints, damagePoints);
        this.spell = spell;
        this.manaPoints = manaPoints;
    }

    public Magician(Magician magician) {
        this(magician.getName(), magician.getHealthPoints(),
                magician.getDamagePoints(), magician.getSpell(), magician.getManaPoints());
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }


    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
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
        return manaPoints == magician.getManaPoints()
                && getSpell() == magician.getSpell()
                || (getSpell() != null && getSpell().equals(magician.getSpell()));
    }

    @Override
    public int hashCode() {
        return ODD_PRIME_NUMBER * DEFAULT_HASHCODE
                + ((getSpell() == null) ? 0 : getSpell().hashCode())
                + manaPoints
                + super.hashCode();
    }

    @Override
    public String toString() {
        return "\nMagician{" +
                "  name='" + getName() + '\'' +
                ", healthPoints=" + getHealthPoints() +
                ", damagePoints=" + getDamagePoints() +
                ", spell='" + getSpell() + '\'' +
                ", manaPoints=" + getManaPoints() +
                '}'+'\n';
    }
}
