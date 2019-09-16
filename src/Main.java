
public class Main {
    public static void main(String[] args) {
        new Toy().toString();
        Toy t = new Toy();
        Toy u = t.makeCopy().set("Bob", 2);
        System.out.println( u.toString());
        Toy s = t;
        System.out.println( "s.equals(t) == " + s.equals(t) );
        Toy v = t.makeCopy();
        System.out.println( "v.equals(t) == " + v.equals(t) );
        s.set("Buzz",3);
        System.out.println( "s == " + s.toString());
        System.out.println( "t == " + t.toString());
        v = t.makeCopy();
        System.out.println( "v.equals(t) == " + v.equals(t) );
        System.out.println( t.toString());

    }
}
