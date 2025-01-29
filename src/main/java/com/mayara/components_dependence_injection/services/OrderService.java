package com.mayara.components_dependence_injection.services;
import com.mayara.components_dependence_injection.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    public ShippingService shippingService;

    public Double total(Order order){
        return order.getBasic() + shippingService.shipment(order) - order.getDiscount();
    }
}
