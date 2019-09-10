import java.util.Objects;

public class MyObject {

    String name;
    Integer count;

    public MyObject() {
        this.name = "Drew";
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return Objects.equals(name, myObject.name) &&
                Objects.equals(count, myObject.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }

    public static void main(String[] args) {
        MyObject o1 = new MyObject();
        MyObject o2 = o1;
        System.out.println("o1 == " + o1);
        System.out.println("o2 == " + o2);
    }
}
