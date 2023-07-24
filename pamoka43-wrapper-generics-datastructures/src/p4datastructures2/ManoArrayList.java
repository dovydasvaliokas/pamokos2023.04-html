package p4datastructures2;

import java.util.Arrays;

public class ManoArrayList<T> {
    private int dydis;
    private int maksimalusDydis;
    private T[] masyvas;

    public ManoArrayList() {
        maksimalusDydis = 8;
        dydis = 0;
        masyvas = (T[]) new Object[maksimalusDydis];
    }

    public ManoArrayList(int maksimalusDydis) {
        this.maksimalusDydis = maksimalusDydis;
        dydis = 0;
        masyvas = (T[]) new Object[maksimalusDydis];
    }

    public void padidintiMasyva() {
        maksimalusDydis *= 2;
        T[] naujasMasyvas = (T[]) new Object[maksimalusDydis];
        for (int i = 0; i < masyvas.length; i++) {
            naujasMasyvas[i] = masyvas[i];
        }
        masyvas = naujasMasyvas;
    }

    public void prideti(T elementas) {
        if (dydis == maksimalusDydis) {
            padidintiMasyva();
        }
        masyvas[dydis] = elementas;
        dydis++;
    }

    @Override
    public String toString() {
        String isvedimas = "[";
        for (int i = 0; i < dydis; i++) {
            isvedimas += masyvas[i];
            isvedimas += ", ";
        }
        isvedimas += "]";
        return isvedimas;
    }
}
