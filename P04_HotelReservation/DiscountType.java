package P04_HotelReservation;

public enum DiscountType {
    VIP(0.8),
    SECOND_VISIT(0.9),
    NONE(1.00);

    private double percent;

    DiscountType(double percent){
        this.percent = percent;
    }

    public double getPercent() {
        return this.percent;
    }
}
