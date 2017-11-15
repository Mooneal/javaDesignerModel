/**
 * Created  on 2017/10/23.
 *
 * @author horse
 */

public interface Observer {

	/**
	 *  用来更新布告板的接口方法。
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	void update(float temperature, float humidity, float pressure);
}
