package org.liang;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;



public class DrawingApp  {

	public static void main(String[] args) {
		/*
		//Diff types of factory, we use XML here
		//Spring.xml provide blueprint of objects to be initialized by beanFactory
		BeanFactory context = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)context);
		reader.loadBeanDefinitions(new ClassPathResource("spring.xml"));
		 */
		//ApplicationContext does everything beanFactory have and is more powerful. spring.xml should under classpath under src folder.
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		//Triangle is instantiated by spring, inside spring container. Preset value of Type using setter or constructor.
		
		Triangle triangle2 = (Triangle)context.getBean("triangle2");
		triangle2.draw();

		Test test = (Test)context.getBean("test");
		test.print();
		
	}

}
