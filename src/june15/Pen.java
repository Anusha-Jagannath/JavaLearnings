package june15;

import java.util.Objects;

public class Pen {

    String color;
    int price;

    public Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
        return Objects.hash(color, price);
    }
}
