package domain.table;

import domain.order.Order;

public class Table {
    private final int number;
    private Order order;

    public Table(final int number) {
        this.number = number;
        this.order = new Order();
    }

    @Override
    public String toString() {
        return Integer.toString(number);
    }
}
