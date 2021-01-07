public enum RoomType {

    SINGLE(50),
    DOUBLE(80);

    private final int value;

    RoomType(int value) { this.value = value; }

    public int getValue() {
        return value;
    }
}
