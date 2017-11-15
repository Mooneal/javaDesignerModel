package simpleFactory;

/**
 * Created  on 2017/10/25.
 * 一般工厂模式
 * @author horse
 */

public class ChinaFactory  implements IFactory{

	@Override
	public Car getCar() {
		return new ChinaCar();
	}
}
