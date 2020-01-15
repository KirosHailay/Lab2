package Lab2.prob2B.prob2BMain;

import Lab2.prob2B.Order;
import Lab2.prob2B.OrderLine;

import java.util.List;

public class Main {
    public static void main(String [] args) {
        Order order = new Order(1, "641 819 1181", 4000.00, 4);
        order.addOrderLine("641 819 1181", 4000.00, 4);
        System.out.println("The result is: "+ order);
        List<OrderLine>  orderLineList = order.getOrderLineList();

        OrderLine orderLine = orderLineList.get(0);
        System.out.println(orderLine.getOrder().toString());
    }
}
