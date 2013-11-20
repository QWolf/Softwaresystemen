package ss.week1;

public class LampTest {
	ThreeWayLamp lampje = new ThreeWayLamp();
	
	public void runTests() {

		testGetLightLevel();
		testSetLightLevel();
		testGetLightLevel();
		testSetLightLevel();
		testGetLightLevel();
		testSetLightLevel();
		testGetLightLevel();
		testSetLightLevel();
		testGetLightLevel();
		testSetLightLevel();
	}
	
	public void testSetLightLevel() {
		lampje.setLightLevel();
	}
	
	public void testGetLightLevel() {
		System.out.println(lampje.getLightLevel());
	}
	
	public static void main(String[] args) {
		LampTest blub = new LampTest();
		blub.runTests();
    }

}
