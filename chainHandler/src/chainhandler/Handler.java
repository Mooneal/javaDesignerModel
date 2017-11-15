package chainhandler;

/**
 * Created  on 2017/10/26.
 *
 * @author horse
 */

public abstract class Handler {
	//下一级的责任链
	public Handler handler;

	public void setSuccessor(Handler handler){
		this.handler=handler;
	}
	public abstract void request(int request);
}
