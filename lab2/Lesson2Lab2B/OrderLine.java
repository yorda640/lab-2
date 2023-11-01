package prob2B;

public class OrderLine {
    int lineNum;
    double price;
    int quantity;
    Order order;

    public OrderLine(int lineNum, double price, int quantity, Order order) {
        this.lineNum = lineNum;
        this.price = price;
        this.quantity = quantity;
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "lineNum=" + lineNum +
                ", price=" + price +
                ", quantity=" + quantity +
                ", order=" + order +
                '}';
    }
}
