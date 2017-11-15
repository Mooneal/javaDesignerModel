package simpleFactory;

/**
 * Created  on 2017/10/25.
 *
 * @author horse
 */

public class AmericaFactory implements IFactory {
	@Override
	public Car getCar() {
		return new AmericaCar();
	}
}
