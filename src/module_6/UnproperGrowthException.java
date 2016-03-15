package module_6;

public class UnproperGrowthException extends Exception {
    private int growthValue;

    public UnproperGrowthException(int growthValue) {
        this.growthValue = growthValue;
    }

    public int getGrowthValue() {
        return growthValue;
    }
}

