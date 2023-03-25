package pro.sky.order;

import java.util.List;

public interface OrderService {
    List<Order> add(List<Integer> list);
    List<Order> getAll();
}
