package simpleFactory;

/**
 * Created  on 2017/10/25.
 * 简单工厂
 * @author horse
 */

public class CarFactory1 {
	public static Car getCar(String  carName){
		switch (carName){
			case "ChinaCar":
				return new ChinaCar();
			case "AmericaCar":
				return new AmericaCar();
			default:
				break;
		}
		return  null;
	}


}
