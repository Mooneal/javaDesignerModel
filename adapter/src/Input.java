import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * Created by horse on 2017/7/18.
 */
public abstract  class Input {
	/**
	 * 抽象类的方法可以实现，也可以不实现。
	 * 但这个类要实例化，必须通过继承它的子类来实现。
	 */
	public void read(){
		System.out.println("read 流");
	};
	public void write(){
		System.out.println("write 流");
	};

}
