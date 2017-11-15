package java8Factory;


/**
 * Created  on 2017/10/25.
 *
 * @author horse
 */

public class ChinaCar implements Car {

	@Override
	public void run() {
		System.out.println(this.getClass().getName()+"运行");
	}
}
