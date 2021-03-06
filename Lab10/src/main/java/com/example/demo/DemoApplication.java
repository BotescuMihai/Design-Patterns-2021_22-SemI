package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import com.example.demo.Controllers.*;
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {


		ApplicationContext context =SpringApplication.run(DemoApplication.class, args);

		TransientComponent transientBean = context.getBean(TransientComponent.class);
		transientBean.operation();

		transientBean = context.getBean(TransientComponent.class);
		transientBean.operation();


		SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
		singletonBean.operation();

		singletonBean = context.getBean(SingletonComponent.class);
		singletonBean.operation();

		ClientComponent c = context.getBean(ClientComponent.class);

		c.operation();
		c = (ClientComponent)context.getBean("clientComponent");
		c.operation();

	//	HelloController hc = new HelloController(c);


	}
}
