import java.lang.reflect.Proxy;

/**
 * Created by horse on 2017/7/18.
 */

public class SourceOrderApiImp implements SourceOrderApi {
	@Override
	public void updateDate(String orderId, String date, String client) {
		System.out.println(client+"已将订单"+orderId+"的有效期延长至"+date);
	}
}
