package main.pattern.command;

public class Beaker {

    private Double water;
    private Double salt;
    private Boolean flagIsSaltMelted;

    public static Integer DEFAULT_AMOUNT_ADD_SALT = 1;
    public static Integer DEFAULT_AMOUNT_ADD_WATER = 10;

    public Beaker(Double water, Double salt) {
        this.water = water;
        this.salt = salt;
        flagIsSaltMelted = false;
        mix();
    }

    public void addSalt(Integer amount) {
        salt += amount;
    }

    public void addWater(Integer amount) {
        water += amount;
    }

    public void mix() {
        flagIsSaltMelted = calculateSaltIsMelted();
    }

    private boolean calculateSaltIsMelted() {
        return getConcentration() < 26.4;
    }

    public void experiment(Action action) {
        switch (action) {
            case ADD_WATER: actionAddWater(); break;
            case ADD_SALT: actionAddSalt(); break;
            default: break;
        }
    }

    private void actionAddWater() {
        while (isNotSaltMelted()) {
            addWater(DEFAULT_AMOUNT_ADD_WATER);
            mix();
        }
        note();
    }

    private void actionAddSalt() {
        while (isSaltMelted()) {
            addSalt(DEFAULT_AMOUNT_ADD_SALT);
            mix();
        }
        note();
    }
    public enum Action {
        ADD_SALT,
        ADD_WATER,
    }

    public boolean isSaltMelted() { return flagIsSaltMelted; }

    public boolean isNotSaltMelted() { return ! isSaltMelted(); }

    public Double getSalt() {
        return salt;
    }

    public Double getWater() {
        return water;
    }

    public Double getConcentration() {
        return (salt / (salt + water)) * 100;
    }

    public void note() {
        writeOneLine(String.format("water is %f g.", getWater()));
        writeOneLine(String.format("salt is %f g.", getSalt()));
        writeOneLine(String.format("concentration is %f %%.", getConcentration()));
    }

    public void writeOneLine(String line) {
        System.out.print(line);
    }
}
