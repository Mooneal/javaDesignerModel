/**
 * Created  on 2017/10/23.
 *
 * @author horse
 */
public interface Subject  {

	/**
	 *  注册观察者接口
	 * @param o
	 */
	void registerObserver(Observer o);

	/**
	 *  移除观察者对象。
	 * @param o
	 */
	void removeObserver(Observer o);

	/**
	 *  通知所有的观察者
	 */
	void notifyObservers();

}
