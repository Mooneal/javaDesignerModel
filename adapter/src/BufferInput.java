/**
 * Created by horse on 2017/7/19.
 */

public class BufferInput extends FilterInput{
	public BufferInput(Input in) {
		super(in);

	}
	public void read() {
		buffer();
		in.read();
	}
	public void write() {
		buffer();           //给传过来的input家族的类增加功能。
		in.write();
	}
	private void  buffer(){
		System.out.println("添加缓冲功能");
	}
}
