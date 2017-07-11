package org.liang;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
public class DisplayNameBeanPostProcessor implements BeanPostProcessor, Ordered{
	
	private int order;
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("DisplayNameBeanPostProcessor: In After Initialization method. Bean name is: " + beanName);
		System.out.println("Order is: " + order);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		
		System.out.println("DisplayNameBeanPostProcessor: In Before Initialization method. Bean name is: " + beanName);
		return bean;
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 public void setOrder(int order) {
	        this.order = order;
	    }

}
