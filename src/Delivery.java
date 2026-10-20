abstract class Delivery {
    protected int distance;
    protected int weight;

    public Delivery() {
        this.distance = 0;
        this.weight = 0;
    }

    public Delivery(int distance, int weight) {
        this();
        this.distance = distance;
        this.weight = weight;
    }

    public abstract long calculateFee();
}