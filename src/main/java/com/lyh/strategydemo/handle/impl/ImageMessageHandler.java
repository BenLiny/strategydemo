package com.lyh.strategydemo.handle.impl;

import com.lyh.strategydemo.handle.MessageService;
import com.lyh.strategydemo.handle.MsgTypeHandler;
import com.lyh.strategydemo.vo.MSG_TYPE;
import com.lyh.strategydemo.vo.MessageInfo;

import org.springframework.stereotype.Service;

/**
 * ClassName: ImageMessageHandle <br/>
 * Function:  图片消息处理<br/>
 * Reason:  <br/>
 * date: 2019/12/17 <br/>
 *
 * @author lyh
 * @version 1.0.0
 * @since JDK 1.8
 */
@Service
@MsgTypeHandler(value = MSG_TYPE.IMAGE)
public class ImageMessageHandler implements MessageService {

  @Override
  public void handleMessage(MessageInfo messageInfo) {
    System.out.println("处理图片消息： " + messageInfo.getContent());
  }

}
