package comparators;

import entity.Filmas;

import java.util.Comparator;

public class FilmasByPelningumas implements Comparator<Filmas> {
    @Override
    public int compare(Filmas o1, Filmas o2) {
        return Double.compare(o1.getPelningumas(), o2.getPelningumas());
    }
}
