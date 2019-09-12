import java.util.Objects;

public class MyObject {

    String name;
    Integer count;

    public MyObject() {
        name = "Drew";
        count = 0;
    }

    @Override
    public String toString() {
        return "MyObject is amazing{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return name.equals(myObject.name) &&
                count.equals(myObject.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }

    public static void main(String[] args) {
        MyObject o1 = new MyObject();
        System.out.println(o1);
    }
}
