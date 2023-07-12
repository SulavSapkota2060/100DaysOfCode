// Test.java might or might not appear in all the folders. 
// The main purpose of this folder is to "test" as the name suggests! I will be testing different features and coding approaches here.
// Here I'm testing, the use of "break" and "continue"


public class Test{
	public static void main(String[] args){
		String[] animals = {"cat", "dog", "asian horse", "red panda"};

		for(int x=0; x<=animals.length-1; x++){
			if(animals[x].contains("dog")){
				continue;
			}

			for(int y=0; y<=2; y++){
				System.out.print(animals[x]+ " ");
			}
			System.out.println("");
		}

		System.out.println("NOW USING break;");

		for(int x=0; x<=animals.length-1; x++){
			if(animals[x].contains("asian")){
				break;
			}

			for(int y=0; y<=2; y++){
				System.out.print(animals[x]+ " ");
			}
			System.out.println("");
		}
	}
}