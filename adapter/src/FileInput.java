/**
 * Created by horse on 2017/7/19.
 */

public class FileInput extends Input {
	/**
	 * 抽象类的方法可以实现，也可以不实现。
	 * 但这个类要实例化，必须通过继承它的子类来实现。
	 */
	@Override
	public void read() {
		System.out.println("文件流");
		super.read();
	}

	@Override
	public void write() {
		System.out.println("文件流");
		super.write();
	}
}
