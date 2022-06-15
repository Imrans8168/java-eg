public class sumofdiagonal {
  

	public static void main(String[] args) {
		
	int a [][]={{3,5,7,8},{4,7,8,4},{ 2,3,4,5},{2, 4,5,6}}; 
		
		 int principal = 0, secondary = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
     
                // Condition for principal
                // diagonal
                if (i == j)
                    principal += a[i][j];
     
                // Condition for secondary
                // diagonal
                if ((i + j) == (4 - 1))
                    secondary += a[i][j];
            }
        }     
        System.out.println("Principal Diagonal:"+ principal);
                                     
        System.out.println("Secondary Diagonal:"+ secondary);
                                    
        System.out.println("product of Diagonal" + (principal*secondary));
 }
		
 }



