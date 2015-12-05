import java.util.ArrayList;

public class Player {
	private String strName = "";
	private Deck playerDeck = new Deck();
	private ArrayList<Sector> SectorList = new ArrayList<Sector>();
	private boolean neutral = false;
	
	public Player(){
		
	}
	public Player(String input){
		setName(input);
	}
	public Player(String inputName,boolean inputNeutral,Card InputCard1,Card InputCard2,Card InputCard3,Card InputCard4,Card InputCard5,Card InputCard6){
		setName(inputName);
		neutral = inputNeutral;
		playerDeck.add(InputCard1);
		playerDeck.add(InputCard2);
		playerDeck.add(InputCard3);
		playerDeck.add(InputCard4);
		playerDeck.add(InputCard5);
		playerDeck.add(InputCard6);
	}
	public void setName(String input){
		strName = input;
	}
	public void addCard(Card input){
		playerDeck.add(input);
	}
	public void removeCard(Card input){
		playerDeck.remove(input);
	}
	public Object[] getPlayerDeckObject(){
		return playerDeck.toObject();
	}
	public void addSector(Sector input){
		SectorList.add(input);
	}
	public void removeSector(Sector input){
		for(int i = 0; i == SectorList.size();i++){
			Sector temp = SectorList.get(i);
			if (temp.getName() == input.getName()){
				SectorList.remove(i);
			}
		}
	}
	public ArrayList<Sector> getSectorList(){
		return SectorList;
	}
	public Object[] getSectorObject(){
		return new Object[0];
	}
	public String getPlayerName(){
		return strName;
	}
	public boolean isNeutral(){
		return neutral;
	}
}
