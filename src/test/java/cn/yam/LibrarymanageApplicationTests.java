package cn.yam;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class LibrarymanageApplicationTests {

    @Test
    void contextLoads() {
        // 创建Worker实例
        Worker worker = new Worker();

        // 创建CallbackHandler实例
        CallbackHandler callbackHandler = new CallbackHandler();

        // 调用doWork方法，并传递CallbackHandler实例作为回调
        worker.doWork(callbackHandler);
    }

}
