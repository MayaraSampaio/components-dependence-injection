package com.mayara.components_dependence_injection.services;
import com.mayara.components_dependence_injection.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order){
        if(order.getBasic()<100.00){
            return 20.00;
        } else if (order.getBasic()>=100.00 || order.getBasic()<200 ) {
            return 12.00;
        }
        return 0.00;
    }
}
