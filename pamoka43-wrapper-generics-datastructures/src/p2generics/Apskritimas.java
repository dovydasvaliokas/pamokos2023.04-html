package p2generics;

public class Apskritimas<T> {
    private T spindulys;

    public Apskritimas() {
    }

    public Apskritimas(T spindulys) {
        this.spindulys = spindulys;
    }

    public T getSpindulys() {
        return spindulys;
    }

    public void setSpindulys(T spindulys) {
        this.spindulys = spindulys;
    }

    @Override
    public String toString() {
        return "Apskritimas{" +
                "spindulys=" + spindulys +
                '}';
    }

    public Double plotas() {
        return (Double)spindulys * (Double)spindulys * Math.PI;
    }
}
