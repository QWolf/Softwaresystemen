package ss.week1;

public class Password {
	public static final String INITIAL = "000000";
	public String pass = INITIAL;

	
	public Password() {
		pass = INITIAL;
	}
	
	public boolean acceptable(String suggestion) {
		if ((suggestion.length() >= 6 ) && (suggestion.indexOf(' ') == -1)){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean setWord(String oldpass, String newpass){
		if ((oldpass == pass) && acceptable(newpass)){
			pass = newpass;
			return true;			
		} else{
			return false;
		}
	}
	
	public boolean testWord(String test){
		if (test == pass){
			return true;
		} else {
			return false;
		}
	}
}
