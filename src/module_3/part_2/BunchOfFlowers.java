package module_3.part_2;

//composition потому что сделать такую диаграмму
//хотя по смыслу скорей всего это не композиция

public class BunchOfFlowers extends Flower{

    private Flower flower;
    public BunchOfFlowers() {
        flower = new Flower();
    }

    void createFlower() {
        this.flower = new Flower();
    }

    void setFlowerColor (String color) {
        flower.setColor(color);
    }

    String getFlowerColor () {
        return flower.getColor();
    }
}
