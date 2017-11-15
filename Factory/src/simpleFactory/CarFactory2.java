package simpleFactory;

/**
 * Created  on 2017/10/25.
 * 简单工厂的变种，多静态方法工厂模式。
 * @author horse
 */

public class CarFactory2 {
	public static Car getChainCar(){
		return new ChinaCar();
	}

	public static Car getAmericaCar(){
		return new AmericaCar();
	}
}
