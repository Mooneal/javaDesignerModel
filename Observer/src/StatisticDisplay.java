/**
 * Created  on 2017/10/23.
 *
 * @author horse
 */

public class StatisticDisplay implements Observer, DisplayElement {

	private float temperature; // 温度
	private float humidity; // 湿度
	private Subject weatherData = null;

	int port=8080;
	Runnable a=() -> System.out.println(port);

	public StatisticDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Statistics: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
}
