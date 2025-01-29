package com.mayara.components_dependence_injection;

import com.mayara.components_dependence_injection.entities.Order;
import com.mayara.components_dependence_injection.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ComponentsDependenceInjectionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ComponentsDependenceInjectionApplication.class, args);
	}

	@Autowired
	OrderService orderService;


	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dados do pedido :");
		System.out.println("Código:");
		Integer code = sc.nextInt();
		System.out.println("Valor básico:");
		Double basic = sc.nextDouble();
		System.out.println("porcentagem de desconto:");
		Double discount = sc.nextDouble();

		Order order = new Order(code,basic,discount);
		Double total = orderService.total(order);

		System.out.println("Pedido código " + order.getCode() + "\nValor total : R$" + String.format("%.2f",total));


		sc.close();
	}

}
