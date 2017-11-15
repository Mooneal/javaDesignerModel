package simpleFactory;

/**
 * Created  on 2017/10/25.
 *
 * @author horse
 */

public class AmericaCar implements  Car {
	@Override
	public void run() {
		System.out.println(this.getClass().getName()+"运行");
	}
}
