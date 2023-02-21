package com.itcast.wuhan.receiver;

import com.itcast.wuhan.constant.MQConst;
import com.itcast.wuhan.dto.SmsDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
public class SmsReceiver {

     @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = MQConst.QUEUE_SMS_ITEM, durable = "true"),
            exchange = @Exchange(value = MQConst.EXCHANGE_TOPIC_SMS),
            key = {MQConst.ROUTING_SMS_ITEM}
    ))
    public void send(SmsDTO smsDTO) throws IOException {
         log.error("尚融宝正在向手机号{}发送短信...", smsDTO.getMobile());
//        log.info("SmsReceiver 消息监听");
//        Map<String,Object> param = new HashMap<>();
//        param.put("code", smsDTO.getMessage());
//        smsService.send(smsDTO.getMobile(), SmsProperties.TEMPLATE_CODE, param);
    }
}
