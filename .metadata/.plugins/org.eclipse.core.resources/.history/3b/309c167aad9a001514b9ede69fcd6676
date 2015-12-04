import java.util.ArrayList;

public class Player {
	String strName = "";
	Deck playerDeck = new Deck();
	ArrayList<Sector> SectorList = new ArrayList<Sector>();
	
	public Player(){
		
	}
	public Player(String input){
		
	}
	public void setName(String input){
		strName = input;
	}
	public void addCard(Card input){
		Deck.add(input);
	}
	public void removeCard(Card input){
		Deck.remove(input);
	}
	public Object[] getPlayerDeckObject(){
		return Deck.toObject();
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
	public Object[] getSectorObject(){
		return new Object[0];
	}
}
