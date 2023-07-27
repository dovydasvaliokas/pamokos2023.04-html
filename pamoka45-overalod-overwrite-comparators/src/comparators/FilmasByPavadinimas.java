package comparators;

import entity.Filmas;

import java.util.Comparator;

public class FilmasByPavadinimas implements Comparator<Filmas> {
    @Override
    public int compare(Filmas o1, Filmas o2) {
        return o1.getPavadinimas().compareToIgnoreCase(o2.getPavadinimas());
    }
}
