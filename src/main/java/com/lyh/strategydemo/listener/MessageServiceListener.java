package com.lyh.strategydemo.listener;

import java.util.Map;

import com.lyh.strategydemo.context.MessageContext;
import com.lyh.strategydemo.handle.MessageService;
import com.lyh.strategydemo.handle.MsgTypeHandler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * ClassName: MessageServiceListener <br/>
 * Function:  在spring的启动过程中，通过解析注解，将消息类型->消息处理对象的映射关系保存到MessageServiceContext对象中<br/>
 * Reason:  在spring的启动过程中，通过解析注解，将消息类型->消息处理对象的映射关系保存到MessageServiceContext对象中<br/>
 * date: 2019/12/17 <br/>
 *
 * @author lyh
 * @version 1.0.0
 * @since JDK 1.8
 */
@Component
public class MessageServiceListener implements ApplicationListener<ContextRefreshedEvent> {

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    Map<String,Object> beans = event.getApplicationContext().getBeansWithAnnotation(MsgTypeHandler.class);
    MessageContext messageContextHandler = event.getApplicationContext().getBean(MessageContext.class);

    beans.forEach((name,bean) ->{
      MsgTypeHandler typeHandler = bean.getClass().getAnnotation(MsgTypeHandler.class);
      messageContextHandler.putMessageService(typeHandler.value().code,(MessageService)bean);
    });
  }
}
