package ss.week1;

public class ThreeWayLamp {
	public static final int OFF = 0;
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;
	
	public  int setting = 0; 
	
	public int getLightLevel() {
		return setting;
	}
	
	public void setLightLevel() {
	setting = (setting + 1) % 4;
	}
	
	public ThreeWayLamp() {
		setting = OFF;
	}
	
	
	public static void main(String[] args) {
    }

}
