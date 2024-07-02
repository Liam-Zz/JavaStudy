package com.liam.schedule.test;

import com.liam.schedule.util.MD5Util;
import org.junit.Test;

/**
 * @Classname: JavaStudy
 * @Date: 2024/7/1 22:02
 * @Author: Liam
 * @Description:
 */

public class TestMD5Utils {
    @Test
    public void testEncrypt(){
        String encrypt = MD5Util.encrypt("123456");
        System.out.println(encrypt);
    }
}
