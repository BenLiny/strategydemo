package com.lyh.strategydemo.context;

import java.util.HashMap;
import java.util.Map;

import com.lyh.strategydemo.handle.MessageService;

import org.springframework.stereotype.Component;

/**
 * ClassName: MessageContextHandler <br/>
 * Function:  保存消息类型->消息处理对象的映射关系<br/>
 * Reason:  <br/>
 * date: 2019/12/17 <br/>
 *
 * @author lyh
 * @version 1.0.0
 * @since JDK 1.8
 */
@Component
public class MessageContext {

  private final Map<Integer, MessageService> handlerMap = new HashMap<>();

  public MessageService getMessageService(Integer type) {
    return handlerMap.get(type);
  }

  public void putMessageService(Integer code, MessageService messageService) {
    handlerMap.put(code, messageService);
  }

}
