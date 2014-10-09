package simulation.util;

public interface EarthCell<T> extends Cell<T> {
	
public void setLatitude(int lat);
	
	public int getLatitude();
	
	public void setLongitude(int longitude);
	
	public int getLongitude();
	
	public float calculateTemp(int time);

	public void setGridProps(int x, int y, int lat, int longi);

}
