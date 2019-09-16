import java.util.Objects;

public class Toy {
    private String name;
    private int number;

    public Toy(){
        name="G.I. Joe";
        number=1;
    }

    public Toy makeCopy(){
        Toy r = new Toy();
        r.name = this.name;
        r.number = this.number;
        return r;
    }

    public Toy set(String s, int n){
        name = s;
        number = n;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return getNumber() == toy.getNumber() &&
                getName().equals(toy.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumber());
    }

    @Override
    public String toString(){
        return name + " " + number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
