

public interface Ordered {
    boolean precedes(Object other);

    /**
     * For objects of the class o1 and o2,
     * o1.follows(o2) == o2.preceded(o1).
     */
    boolean follows(Object other);
}

