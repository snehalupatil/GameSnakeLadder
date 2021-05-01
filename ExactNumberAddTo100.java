
public class ExactNumberAddTo100 {

	public static void main(String[] args) {
		int position=0;
        int dieNumber,option;
        int newPosition=0;
        int previousPosition = 0;
        
        while(newPosition!=100){
            position = (int) ((Math.random() * 6) + 1);
            option=(int)((Math.random()*3)+1);
            switch (option){
                case 1:
                    //ladder
                    previousPosition=newPosition;
                    newPosition=newPosition+position;
                    System.out.println(newPosition);

                    if(newPosition>100){
                        newPosition=previousPosition;
                        
                    }
                    
                    break;
                case 2:
                    //snake
                    if (previousPosition>newPosition){
                        newPosition=newPosition-position;
                        
                    }
                    break;
                default:
                    newPosition=newPosition;
                    //stay as it is
            }
        }
	}

}
