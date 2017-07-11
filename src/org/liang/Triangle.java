package org.liang;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private List<Point> points;
	private ApplicationContext context = null;
	
	public void draw(){
		System.out.println("Point A: " + pointA.draw());
		System.out.println("Point B: " + pointB.draw());
		System.out.println("Point C: " + pointC.draw());
	}

	//Spring will set context for this object when context is initialized. Used when object required access to set of collaborating beans OR file resources, like MessazgeResource. 
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		// TODO Auto-generated method stub
		this.context = applicationContext;
		System.out.println("application context is set :" + applicationContext.getDisplayName());
		
	}
	
	public void printList(){
		int i=0;
		for(Point p:points){
			i++;
			System.out.println("Point" + i + " : " + p.draw());
		}
	}
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public List<Point> getPoints(){
		return points;
	}
	public void setPoints(List<Point> points){
		this.points = points;
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is: "+ beanName );
		
	}
	
	public void myInit(){
		System.out.println("Triangle bean is initialized");
	}
	
	public void destory(){
		System.out.println("Triangle bean is destoryed");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("System: Triangle bean is destoryed");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("System: Triangle bean is initialized");
		
	}

}
