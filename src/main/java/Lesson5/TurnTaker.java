
public class TurnTaker {
    private static int turn = 0;
    private final String name;
    private int myTurn;

    public TurnTaker(String theName, int theTurn) {
        name = theName;
        if (theTurn >= 0)
            myTurn = theTurn;
        else {
            System.out.println("Fatal Error.");
            System.exit(0);
        }
    }

    public TurnTaker() {
        name = "No name yet";
        myTurn = 0;//Indicating no turn.
    }

    public static int getTurn() {
        turn++;
        return turn;
    }

    public String getName() {
        return name;
    }

    public boolean isMyTurn() {
        return (turn == myTurn);
    }
}
