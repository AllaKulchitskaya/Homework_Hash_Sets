package task2_multiplicationTable;

import java.util.Objects;

public class MultiplicationTable {
    private int x;
    private int y;

    public MultiplicationTable(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiplicationTable that = (MultiplicationTable) o;
        return x == that.x && y == that.y || x == that.y && y == that.x;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(x) + Objects.hashCode(y);
    }

    @Override
    public String toString() {
        return x + " * " + y + " =";
    }
}
