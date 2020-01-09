package com.lyh.strategydemo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * ClassName: MessageInfo <br/>
 * Function:  消息对象<br/>
 * Reason:  <br/>
 * date: 2019/12/17 <br/>
 *
 * @author lyh
 * @version 1.0.0
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
public class MessageInfo {

  /**
   * 消息类型
   */
  private Integer type;

  /**
   * 消息内容
   */
  private String content;
}
