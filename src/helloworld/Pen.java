package helloworld;

import java.util.Objects;

public class Pen {

    int price;
    String color;

    public Pen(int price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return price == pen.price && Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color);
    }
}
