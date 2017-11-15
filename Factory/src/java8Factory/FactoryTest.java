package java8Factory;

import org.junit.Test;

import java.util.function.Function;

/**
 * Created  on 2017/11/2.
 *
 * @author horse
 */

public class FactoryTest {
	@Test
	public void test(){
		Function<String ,Car> function=(x) -> new ChinaCar();
		Car car=function.apply("china");

	}

	public Car getCar(AbstractFactory factory){
		return factory.getCar();
	}
}
