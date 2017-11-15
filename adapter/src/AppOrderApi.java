/**
 * Created by horse on 2017/7/18.
 */

/**
 * 根据需求，客户端提出了一种新的接口。
 */
public interface AppOrderApi {
	//只需要传入订单Id即可
	public void updateDate(String orderId,String client);
}
