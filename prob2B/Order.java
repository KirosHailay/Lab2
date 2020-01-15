package Lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNum;
    private List<OrderLine> orderLineList;

    public Order(int orderNum, String linenum, double price, int quantity) {

        orderLineList = new ArrayList<OrderLine>();
        orderLineList.add(new OrderLine(linenum, price, quantity, this));
        this.orderNum = orderNum;
    }

    public void addOrderLine(String linenum, double price, int quantity) {
        orderLineList.add(new OrderLine(linenum, price, quantity, this));
    }

    public int getOrderNum() {
        return orderNum;
    }

    public List<OrderLine> getOrderLineList() {
        return orderLineList;
    }

    public String toString() {
        System.out.println("The Order line for Order num is: "+ orderNum);
        String result = "";
        for (OrderLine orderLine: orderLineList) {
            result += orderLine.toString();
        }
        return result;
    }
}
