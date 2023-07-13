public class PyramidPattern{
	
	public static void main(String[] args) {
	
						
			for(int row=1; row<=5;row++) {
				
				for(int sp=1;sp <=5-row ;sp++)
					{
						System.out.print(" ");
					}
				
				for(int sy=1; sy<=row;sy++)	{
					
					System.out.print("* ");
					
				}
				
					System.out.println();
				
			}		
	}
	
}
		