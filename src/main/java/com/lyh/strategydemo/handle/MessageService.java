package com.lyh.strategydemo.handle;

import com.lyh.strategydemo.vo.MessageInfo;

public interface MessageService {

  /**
   * 消息处理接口
   */
  void handleMessage(MessageInfo messageInfo);
}
