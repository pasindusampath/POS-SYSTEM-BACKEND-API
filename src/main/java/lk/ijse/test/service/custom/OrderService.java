package lk.ijse.test.service.custom;

import lk.ijse.test.dto.custom.OrderDto;
import lk.ijse.test.dto.custom.OrderItemDto;
import lk.ijse.test.service.CrudService;

import java.util.List;

public interface OrderService extends CrudService<OrderDto,Integer> {
    public boolean add(OrderDto order, List<OrderItemDto> items);
}
