import java.io.BufferedInputStream;

/**
 * Created by horse on 2017/7/18.
 */

public class FilterInput extends Input {
	protected Input in;
	public FilterInput(){
	}
	public FilterInput(Input in){
		this.in=in;
	}
	public void read() {
		in.read();
	}

	public void write() {
		in.read();
	}
}
