package cn.edu.cqupt.erp.erpaccount.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.cqupt.erp.erpaccount.entity.Register;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Sender {
	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(Register register) {
		String context = "hello " + register.toString();
		log.info("Sender: " + register.toString());
		this.rabbitTemplate.convertAndSend("hello", context);
	}
}
