package com.yzg.springbootdatamogodb;

import com.yzg.springbootdatamogodb.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class SpringBootDataMogodbApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBootDataMogodbApplication.class, args);
        MongoTemplate mongoTemplate = applicationContext.getBean(MongoTemplate.class);
        User user = new User();
        user.setId("yourdad");
        user.setName("yinzhigang");
        //user.setSons(new String[]{"wujiji","caojiji","afeng~"});
        mongoTemplate.insert(user);
    }

}
