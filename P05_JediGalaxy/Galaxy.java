package P05_JediGalaxy;

public class Galaxy {
    private Field field;

    public Galaxy(Field field) {
        this.field = field;
    }

    public void evilMove(int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0) {
            if (field.isInBounce(evilRow, evilCol)) {
                field.setValue(evilRow, evilCol, 0);
            }
            evilRow--;
            evilCol--;
        }
    }

    public long moveJedi(int row, int col) {
        long collectedPower = 0;

        while (row >= 0 && col < this.field.getColLength(1)) {

            if (this.field.isInBounce(row, col)) {
                collectedPower += this.field.getValue(row, col);
            }
            col++;
            row--;
        }
        return collectedPower;
    }
}
