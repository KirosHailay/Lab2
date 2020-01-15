package Lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class OrderLine {

    private String lineNum;
    private double price;
    private int quantity;
    private Order order;

    OrderLine(String lineNum, double price, int quantity, Order order) {
        this.lineNum = lineNum;
        this.price = price;
        this.quantity = quantity;
        this.order = order;
    }

    public String getLineNum() {
        return lineNum;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return "The order num is: "+ order.getOrderNum() + "The lineNum: "+ lineNum + "The Price is: "+ price +
                "The Quantity is: "+ quantity + "\n";
    }

    public Order getOrder() {
        return order;
    }
}
