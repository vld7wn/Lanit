package Aviary;

public enum AviarySize {
    SMALL(1),
    MEDIUM(2),
    LARGE(3),
    HUGE(4);

    private int size;

    AviarySize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
