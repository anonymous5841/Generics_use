package TaxiService;

public enum Status {

    AVAILABLE(1), NOT_AVAILABLE(0);

    int value;

    Status(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
