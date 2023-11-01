package prob2B;

public class OrderLineDetails {
    public OrderLineDetails(int lineNum, double price, int quantity) {
        this.lineNum = lineNum;
        this.price = price;
        this.quantity = quantity;
    }

    int lineNum;
    double price;
    int quantity;
}
