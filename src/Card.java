
public class Card {
	private String strCardName = "";
	private int intStars;
	public Card(String strInput, int intInput) {
		setCardName(strInput);
		setCardStars(intInput);
	}
	public void setCardName(String input){
		strCardName = input;
	}
	public void setCardStars(int input){
		intStars = input;
	}
	public String getCardName(){
		return strCardName;
	}
	public int getStars(){
		return intStars;
	}
	public String toString(){
		return strCardName + " | " + intStars;
	}
}
