package com.zzj;

import com.zzj.util.ActiveMQUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring_jms.xml")
public class TestConsumer {
	@Before
    public void checkServer() {
    	ActiveMQUtil.checkServer();
    }

    @Test
    public void test(){
        try {
            List list=new ArrayList();

            //写这个是为了不让当前测试退出。  因为 spring的配置， MyMessageListener 会自动启动
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }        
    }

    public int aa(){
	    return 1;
    }


}