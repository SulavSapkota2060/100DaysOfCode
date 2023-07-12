public class MaxNumber{

	public static int maxInt(int[] list){
		int greatestNum = 0;
		for(int y = 0; y <= list.length-1; y++){
			if(list[y] > greatestNum){
				greatestNum = list[y];
			}
		}
		return greatestNum;
	}
	
	public static void main(String[] args){
		int[] myList = new int[20];
		myList[0] = 10;
		for(int x = 0; x < myList.length-1; x++){
			myList[x] = x;
		}

		myList[6]=76;
		myList[9] = 102;
		myList[14] = 324;
		myList[3] = 1000;

		System.out.println(maxInt(myList));
	}
}