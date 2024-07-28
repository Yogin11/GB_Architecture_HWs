package org.example.store;

import java.sql.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Store store = new Store();
        Product product1 = new Product("Mleko", 150);
        Product product2 = new Product("Hleb", 50);
        Buyer buyer1 = new Buyer("Ivanoff");
        OrderItem orderItem1 = new OrderItem(product1, 2);
        OrderItem orderItem2 = new OrderItem(product2, 3);
        List<OrderItem> items = List.of(orderItem1, orderItem2);
        Order order1 = new Order(new Date(System.currentTimeMillis()), "ul.Finisha, 10", "+79014994545", buyer1, items);
        store.addOrder(order1);

    }
}
