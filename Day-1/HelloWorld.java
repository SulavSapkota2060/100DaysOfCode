public class HelloWorld{

	public static int larger(int x, int y){
			if(x > y){
				return x;
			}else{
				return y;
			}
		}
	public static void main(String[] args){

		int largeNum; // Declaring a variable for storing large number

		largeNum = larger(5,-10);

		System.out.print("Large Number: ");
		System.out.println(largeNum);
		
	}
}