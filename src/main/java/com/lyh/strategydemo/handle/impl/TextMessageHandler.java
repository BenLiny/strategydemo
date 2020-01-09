package com.lyh.strategydemo.handle.impl;

import com.lyh.strategydemo.handle.MessageService;
import com.lyh.strategydemo.handle.MsgTypeHandler;
import com.lyh.strategydemo.vo.MSG_TYPE;
import com.lyh.strategydemo.vo.MessageInfo;

import org.springframework.stereotype.Service;

/**
 * ClassName: TextMessageHandle <br/>
 * Function:  文本消息实现类<br/>
 * Reason:  <br/>
 * date: 2019/12/17 <br/>
 *
 * @author lyh
 * @version 1.0.0
 * @since JDK 1.8
 */
@Service
@MsgTypeHandler(value = MSG_TYPE.TEXT)
public class TextMessageHandler implements MessageService {

  @Override
  public void handleMessage(MessageInfo messageInfo) {

    System.out.println("处理文本消息： " + messageInfo.getContent());
  }

}
