package prob2B;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private int orderNum;
    private Date orderDate;

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<OrderLine> getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(ArrayList<OrderLine> orderLine) {
        this.orderLine = orderLine;
    }

    private ArrayList<OrderLine> orderLine = new ArrayList<>();

    private Order(int orderNum, ArrayList<OrderLine> orderLine) {
        this.orderNum = orderNum;
        this.orderDate = new Date();
        this.orderLine = orderLine;
    }

    @Override
    public String toString() {
        return "orderNum=" + orderNum;
    }

    public static Order createOrder(int orderNum, ArrayList<OrderLineDetails> orderLineDetails) {
        if(orderLineDetails.size() >= 1) {
            ArrayList<OrderLine> orderLinesList = new ArrayList<OrderLine>();
            Order order = new Order(orderNum, orderLinesList);
            for(OrderLineDetails element : orderLineDetails) {
                orderLinesList.add(new OrderLine(element.lineNum, element.price, element.quantity, order));
            }
            return new Order(orderNum, orderLinesList);
        }
        return null;
    }
}
