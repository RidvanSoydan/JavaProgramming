package day31_Constructors.FreeTask;

public class HouseItems {

    public String name;
    public String color;
    public int amount;

    public void setInfo (String itemName, String itemColor, int ItemCount) {
        name = itemName;
        color = itemColor;
        amount = ItemCount;
    }

    public String toString() {
        return "HouseItems{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", amount=" + amount +
                '}';
    }
}
