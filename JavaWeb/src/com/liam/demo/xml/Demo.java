package com.liam.demo.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import java.io.InputStream;
import java.util.List;

public class Demo {
    @Test
    public void testRead() throws Exception {
        //读取jdbc。xml文件，获取document对象
        SAXReader saxReader = new SAXReader();
        //通过类加载器，指向字节码根路径的指定文件的输入流
        InputStream resourceAsStream = Demo.class.getClassLoader().getResourceAsStream("jdbc.xml");
        //通过输入流 获得配置文件，解析成一个Demo对象
        Document document = saxReader.read(resourceAsStream);

        /*
        * Node
        *   Element: 元素节点
        *   attribute：属性节点
        *   text：文本节点
        * */
        //从document对象中获取文件信息
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());
        //获取元素下的子元素
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            System.out.println("\t"+element.getName());
            //从元素上获取属性
            Attribute id = element.attribute("id");
            System.out.println("\t\t"+id.getName() +"="+id.getValue());
            //继续读取子元素
            List<Element> eles = element.elements();
            for (Element ele : eles) {
                System.out.println("\t\t"+ele.getName()+":"+ele.getText());
            }
        }

    }
}
