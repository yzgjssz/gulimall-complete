package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallThirdPartyApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Resource
    private OSSClient ossClient;

    @Test
    public void testUpload() throws FileNotFoundException {
// 上传文件流。
        InputStream inputStream = new FileInputStream("/Users/yinzhigang/Downloads/iShot2020-12-03 16.40.19.png");
        ossClient.putObject("edu-yzg", "20201207002.png", inputStream);

// 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("上传完成");
    }
}
