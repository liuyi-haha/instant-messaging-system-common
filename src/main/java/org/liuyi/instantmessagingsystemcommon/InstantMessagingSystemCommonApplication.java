package org.liuyi.instantmessagingsystemcommon;

import domain.IdGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InstantMessagingSystemCommonApplication {

    public static void main(String[] args) {
        String id = IdGenerator.generate();
        System.out.println(id);  // 输出类似 "2cVj9a"
        // 长度通常在 6-10 位，远短于 UUID
        SpringApplication.run(InstantMessagingSystemCommonApplication.class, args);
    }

}
