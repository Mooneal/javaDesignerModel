package simpleFactory;

import org.junit.Test;

/**
 * Created  on 2017/10/25.
 * 工厂模式的demo
 * @author horse
 */

public class FactoryDemo {


	/**
	 *  简单工厂
	 */
	@Test
	public void demo1(){
		Car chinaCar= CarFactory1.getCar("ChinaCar");
		Car americaCar= CarFactory1.getCar("AmericaCar");
		chinaCar.run();
		americaCar.run();
	}

	/**
	 *  简单工厂变化的变异，多静态方法
	 */
	@Test
	public void demo2(){
		Car chinaCar= CarFactory2.getChainCar();
		Car americaCar= CarFactory2.getAmericaCar();
		chinaCar.run();
		americaCar.run();
	}

	/**
	 *  简单工厂变化的变异，利用反射。
	 */
	@Test
	public void demo3(){
		Car car=(ChinaCar) CarFactory3.getCar(ChinaCar.class);
		car.run();
	}

	/**
	 *  一般工厂模式
	 */
	@Test
	public void demo4(){
		ChinaFactory chinaFactory=new ChinaFactory();
		chinaFactory.getCar().run();

		AmericaFactory americaFactory=new AmericaFactory();
		americaFactory.getCar().run();

	}
}
