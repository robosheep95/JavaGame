public class JavaGameMain {
	
	public static void main(String[] args) {
		Method Method = new Method();
		//Method.YesNoPrompt("Test", "Test2");
		Method.StartGame();
		boolean notDone = true;
		while (notDone){
			boolean attacking = true;
			//Method.getTroops
			while (attacking){
				Method.Battle();
				attacking = (Method.YesNoPrompt("Would you like to attack again?","Attack"));
			}
			if (Method.CheckWin()){
				System.out.println(Method.winner+" has won!");
				notDone = false;
			}
			else{
				boolean moving = true;
				//while(moving){
					//Method.Maneuver
					//moving = (Method.YesNoPrompt("Would you like to move troops again?","Moving"));
				}
				Method.DrawCard();
				Method.nextPlayer();
				Method.Present();
			//}
		}
	}
}