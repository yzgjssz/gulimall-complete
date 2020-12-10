package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
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
public class GulimallProductApplicationTests {
    @Resource
    private BrandService brandService;
//    @Resource
//    private OSSClient ossClient;
//
//    @Test
//    public void testUpload() throws FileNotFoundException {
//// 上传文件流。
//        InputStream inputStream = new FileInputStream("/Users/yinzhigang/Downloads/iShot2020-12-03 16.40.19.png");
//        ossClient.putObject("edu-yzg", "20201207001.png", inputStream);
//
//// 关闭OSSClient。
//        ossClient.shutdown();
//        System.out.println("上传完成");
//    }

    @Test
    public void test1() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
    }

}
