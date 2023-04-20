package daysix;

public class City extends State{
	private String CityName;
	private float area;
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "City [CityName=" + CityName + ", area=" + area
				+ ", getCityName()=" + getCityName() + ", getArea()="
				+ getArea() + "]";
	}
	

}
