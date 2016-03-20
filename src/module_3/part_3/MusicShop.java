package module_3.part_3;

//aggregation

import java.util.ArrayList;
import java.util.List;

public class MusicShop {

    private List<Guitar> guitars = new ArrayList<>();
    private List<Piano> pianos = new ArrayList<>();
    private List<Trumpet> trumpets = new ArrayList<>();

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public List<Piano> getPianos() {
        return pianos;
    }

    public List<Trumpet> getTrumpets() {
        return trumpets;
    }
}
