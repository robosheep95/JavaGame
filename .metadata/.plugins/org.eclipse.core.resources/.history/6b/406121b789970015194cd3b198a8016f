import javax.swing.JOptionPane;

public class JavaGameMain {

	public static void main(String[] args) {
		//Start by setting up board with txt input using board init
		//Prompt for number of players 2-5
		//Sector attack = new Sector();
		//attack.setTroops(5);
		//Sector defend = new Sector();
		//defend.setTroops(1);
		//Method.Battle(attack, defend);
		
		Board.setBoard();
		
		
		Object[] possabillities = {"2","3","4","5"};
		int choice = OptionBox("Select Number of Players","Players",possabillities,"2");
		if(choice == 2){
			TwoPlayerSetUp();
		}
		else{;
			PlayerSetUp(choice);
		}
	}
	private static void TwoPlayerSetUp(){
		
	}
	private static void PlayerSetUp(int iPlayerCount){
		
	}
	
/*
 *if(someone has won){
 * output that they won. terminate game
 * go to next persons turn
 * Start Place phase
 * Then start attack phase
 * then move troops phase
 * then draw cards if possible
 * start next turn
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static int OptionBox(String text,String title,Object[] possabllities,String defaultOption){
		boolean notDone = true;
		while(notDone){
			String sInteger = (String)JOptionPane.showInputDialog(null, text, title, JOptionPane.PLAIN_MESSAGE, null, possabllities, defaultOption);
			//System.out.println(playerCount);
			if (sInteger == null){
				System.out.println("Incorrect Input");
			}
			else{
				notDone = false;
				return Integer.parseInt(sInteger);
				
			}
		}
		return 0;
	
	}
	
	public static void QuitPrompt(){ // Will prompt for player to quit Y/N. 
		int choice = JOptionPane.showConfirmDialog(null, "Would you like to quit?","Quit?",JOptionPane.YES_NO_OPTION);
		if (choice == 0){
			System.exit(0);
		}
		else if (choice == 1){
			return;
		}
		else{
			System.out.println("Error. Incorrect option chosen. Terminating :(");
			System.exit(0);
		}
	}
}
