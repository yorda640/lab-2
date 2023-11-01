package prob2B;

import java.util.ArrayList;
import java.util.Arrays;

public class MAIN {
    static int orderNumber = 1;
    public static void main(String[] args) {
        ArrayList<OrderLineDetails> orderLinesList = new ArrayList<>();
        orderLinesList.add(new OrderLineDetails(1, 10, 100));
        orderLinesList.add(new OrderLineDetails(2, 15, 150));
        orderLinesList.add(new OrderLineDetails(3, 20, 200));
        Order order = Order.createOrder(orderNumber++, orderLinesList);

        if(order != null)
            System.out.println(Arrays.toString(order.getOrderLine().toArray()));
    }
}
