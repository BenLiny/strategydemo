package com.lyh.strategydemo;

import com.lyh.strategydemo.context.MessageContext;
import com.lyh.strategydemo.handle.MessageService;
import com.lyh.strategydemo.vo.MSG_TYPE;
import com.lyh.strategydemo.vo.MessageInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Autowired
  private MessageContext messageContextHandler;

  @Override
  public void run(String... args) throws Exception {
    MessageInfo messageInfo = new MessageInfo(MSG_TYPE.TEXT.code,"文本消息");

    MessageService messageService = messageContextHandler.getMessageService(messageInfo.getType());

    messageService.handleMessage(messageInfo);
  }
}
