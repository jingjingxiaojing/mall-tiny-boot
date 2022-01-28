package com.macro.mall.tiny;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 基本的集成测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class MallTinyBootApplicationTests {

    /*@Autowired
    private PmsBrandService pmsBrandService;*/

    @Test
    void contextLoads() {
    }

/*    @Test
    public void testMethod() {
        List<PmsBrand> brandList = pmsBrandService.listAllBrand();
        log.info("testMethod:{}", brandList);
    }*/

}
