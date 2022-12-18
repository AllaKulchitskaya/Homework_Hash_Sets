package task1_transport;

import java.util.Objects;

public class Sponsor {
    private final String name;
    private final int contribution;

    public Sponsor(String name, int contribution) {
        this.name = name;
        this.contribution = contribution;
    }

    public String getName() {
        return name;
    }

    public int getContribution() {
        return contribution;
    }

    public void makeContribution() {
        System.out.println("Заезд спонсирован " + getName() + ", сумма составляет " + getContribution() + " рублей");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return contribution == sponsor.contribution && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contribution);
    }

    @Override
    public String toString() {
        return name + " с суммой " + contribution + " рублей";
    }
}
