package pro.sky.order;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope(WebApplicationContext.SCOPE_SESSION)
public class OrderServiceImpl implements OrderService {
    List<Order> shoppingList = new ArrayList<>();
    @Override
    public List<Order> add(List<Integer> list){
        for(Integer purchase : list){
            shoppingList.add(new Order(purchase));
        }
        return list.stream()
                .map(Order::new)
                .toList();
    }
    @Override
    public List<Order> getAll(){
        return shoppingList;
    }
}
