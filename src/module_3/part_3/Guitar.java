package module_3.part_3;

public class Guitar extends MusicalInstrument {

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

/*    public Guitar(){
        System.out.println("New Guitar create!");
    }*/

    @Override
    public String toString() {
        return "Guitar";
    }
}
