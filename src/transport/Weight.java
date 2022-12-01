package transport;

public enum Weight {

    N1 (0,3.5),
    N2(3.5,12),
    N3(12,100);

    private final double from;
    private final double to;

    Weight(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}
