package learn.messaging.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import learn.messaging.model.Employee;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "${learn.rabbitmq.queue}")
	public void recievedMessage(Employee employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee);
	}
}
