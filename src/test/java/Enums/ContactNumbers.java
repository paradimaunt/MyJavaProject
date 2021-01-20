package Enums;

public enum ContactNumbers {
    OVERSIZED_AND_HEAVY_CARGO("+380 67 636 2028"),
    PASSENGER_AND_CARGO_TRANSPORTATION_UKRAINE_SPAIN("+380 63 932 2581");
    String number;
    ContactNumbers(String number) {
        this.number= number;
    }
    public String getNumber() {
        return number;
    }
}
