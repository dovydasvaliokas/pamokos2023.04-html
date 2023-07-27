package comparators;

import entity.Filmas;

import java.util.Comparator;

public class FilmasByStudija implements Comparator<Filmas> {

    @Override
    public int compare(Filmas o1, Filmas o2) {
        return o1.getStudija().compareToIgnoreCase(o2.getStudija());
    }
}
