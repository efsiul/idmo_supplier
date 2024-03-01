package com.idmo_supplier.idmo_supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestIdmoSupplierApplication {

	public static void main(String[] args) {
		SpringApplication.from(IdmoSupplierApplication::main).with(TestIdmoSupplierApplication.class).run(args);
	}

}
