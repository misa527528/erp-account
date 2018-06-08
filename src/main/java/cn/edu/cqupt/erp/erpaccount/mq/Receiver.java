package cn.edu.cqupt.erp.erpaccount.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RabbitListener(queues = "hello")
public class Receiver {
	@RabbitHandler
	public void process(String message) {
		log.info("Receiver : " + message);
	}
}
