/**
 * Created by horse on 2017/7/18.
 */

public class AppOrderApiImp implements AppOrderApi {
	private SourceOrderApi sourceOrderApi;
	public AppOrderApiImp(){
		sourceOrderApi=new SourceOrderApiImp();
	}
	@Override
	public void updateDate(String orderId, String client) {
		//这样就完成了旧接口到新接口的适配
		sourceOrderApi.updateDate(orderId,"",client);
	}
}
