package module_3.part_3;

public class Piano extends MusicalInstrument {

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Piano";
    }
}
