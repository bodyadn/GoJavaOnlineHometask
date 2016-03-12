package module_3.part_3;

public class Runner_3_3 {

    public static void main(String[] args) {
        MusicalInstrument musicalInstrument1 = new MusicalInstrument();
        MusicalInstrument musicalInstrument2 = new MusicalInstrument();
        MusicShop musicShop = new MusicShop();
        musicShop.addInstruments(musicalInstrument1);
        musicShop.addInstruments(musicalInstrument2);
        System.out.println();
    }
}
