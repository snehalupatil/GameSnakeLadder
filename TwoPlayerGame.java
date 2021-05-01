
public class TwoPlayerGame {

	public static void main(String[] args) {
		int position1=0;
		int position2=0;
        int option1, option2;
        int newPosition1=0;
        int newPosition2=0;
        int previousPosition1 = 0;
        int previousPosition2 = 0;
        
        while(newPosition1 < 100  && newPosition2 < 100){
        	
        	
            position1 = (int) ((Math.random() * 6) + 1);
            option1=(int)((Math.random()*3)+1);
            switch (option1){
                case 1:
                    //ladder
                    previousPosition1=newPosition1;
                    newPosition1=newPosition1+position1;
                    System.out.println("Dice Number for Player1: "+position1);
                    System.out.println("Player1 Position: "+newPosition1);
                    

                    if(newPosition1 > 100){
                        newPosition1=previousPosition1;
                    }
                    break;
                    
                case 2:
                    //snake
                    if (previousPosition1 > newPosition1){
                        newPosition1 = newPosition1 - position1;
                        
                    }
                    break;
                    
                default:
                    newPosition1 = newPosition1;
                    //stay as it is
            }
            
            
            position2 = (int) ((Math.random() * 6) + 1);
            option2=(int)((Math.random()*3)+1);
            switch (option2){
                case 1:
                    //ladder
                    previousPosition2=newPosition2;
                    newPosition2=newPosition2+position2;
                    System.out.println("Dice Number for Player2:"+position2);
                    System.out.println("Player2 Position: "+newPosition2);
                    

                    if(newPosition2 > 100){
                        newPosition2=previousPosition2;
                    }
                    break;
                    
                case 2:
                    //snake
                    if (previousPosition2 > newPosition2){
                        newPosition2 = newPosition2 - position2;
                        
                    }
                    break;
                    
                default:
                    newPosition2 = newPosition2;
                    //stay as it is
            }
            
            
        }
        
        if (newPosition1==100) {
        	System.out.println("Player 1 won");
        }
        else {
        	System.out.println("Player 2 won");
        }
        
  }
}



