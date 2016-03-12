package module_3.part_3;

//aggregation

import java.util.ArrayList;
import java.util.List;

public class MusicShop {
    private List<MusicalInstrument> instruments = new ArrayList<>();
    private MusicalInstrument musicalInstrument;

    public List<MusicalInstrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<MusicalInstrument> instruments) {
        this.instruments = instruments;
    }

    public MusicalInstrument getMusicalInstrument() {
        return musicalInstrument;
    }

    public void setMusicalInstrument(MusicalInstrument musicalInstrument) {
        this.musicalInstrument = musicalInstrument;
    }

    void addInstruments (MusicalInstrument musicalInstrument) {
        instruments.add(musicalInstrument);
    }
}
