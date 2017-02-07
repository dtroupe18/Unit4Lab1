class Pair< F, S> {

    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public String toString() {
        return "Pair = " + first + " " + second;
    }
}

class Tester {
    public static void main(String[] args) {
        String f = "First";
        String s = "Second";

        Pair p1 = new Pair(f, s);
        Pair p2 = new Pair(5, "Five" );
        Pair p3 = new Pair(.05, "Double");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        System.out.println(p1.getFirst());
        System.out.println(p2.getSecond());
        System.out.println(p3.getFirst());

    }
}