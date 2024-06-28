public class MyArrayDataException extends NumberFormatException {

    private final int firstIndex;
    private final int secondIndex;
    public MyArrayDataException(int firstIndex,int secondIndex) {
        super("Incorrect convert at index: " + firstIndex + " " + secondIndex);
        this.firstIndex = firstIndex;
        this.secondIndex = secondIndex;
    }

}
