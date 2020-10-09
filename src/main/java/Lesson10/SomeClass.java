
import java.io.Serializable;

public class SomeClass implements Serializable {
    private final int number;
    private final char letter;

    public SomeClass() {
        number = 0;
        letter = 'A';
    }

    public SomeClass(int theNumber, char theLetter) {
        number = theNumber;
        letter = theLetter;
    }

    public String toString() {
        return "Number = " + number
                + " Letter = " + letter;
    }

}
