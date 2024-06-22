package com.liam.jsonpojo.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import com.liam.jsonpojo.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Json {
    @Test
    public void testReadJson1() throws JsonProcessingException {
        //实例化 persion 对象,将 persion 对象转换为 json 串
        Dog dog = new Dog("小黄");
        Persion persion = new Persion("张三", 20, dog);

        //json 转换(Gson,Jackson,Fastjson)
        ObjectMapper objectMapper = new ObjectMapper();
        String persionStr = objectMapper.writeValueAsString(persion);
        System.out.println(persionStr);
    }
    @Test
    public void testReadJson02() throws JsonProcessingException {
        String personStr= "{\"name\":\"张三\",\"age\":20,\"dog\":{\"name\":\"小黄\"}}";
        ObjectMapper objectMapper = new ObjectMapper();
        Persion persion = objectMapper.readValue(personStr, Persion.class);
        System.out.println(persion);

    }

    @Test
    public void testMapjson() throws JsonProcessingException {
        Map data = new HashMap();
        data.put("a","value");
        data.put("b","value");

        //map 集合转 json
        //与对象转 json 输出格式相同
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(data);
        System.out.println(s);

    }
    @Test
    public void testListjson() throws JsonProcessingException {
        //数组和 list 输出的结果一样
       /* ArrayList data = new ArrayList();
        data.add("a");
        data.add("b");
        data.add("c");
*/
        Dog dog = new Dog("小黄");
        Persion persion = new Persion("张三", 20, dog);
        ArrayList data = new ArrayList();
        data.add(persion);

        //map 集合转 json
        //与对象转 json 输出格式相同
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(data);
        System.out.println(s);

    }

}
