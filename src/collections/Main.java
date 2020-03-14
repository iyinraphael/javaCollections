package collections;

public class Main
{
	public static void main(String[] args) {
		
		//fixed index
		//fixed element type
		//fixed length
		System.out.println("*** Arrays ***");
		//Dogs dogArr[];
		//dogArr = new Dogs[5]; 0 - 4
		Dogs[] dogArr = new Dogs[5];
		dogArr[0] = new Dogs("Springer", 50, false);
		dogArr[4] = new Dogs("Corgie", 35, true);
		dogArr[1] = new Dogs("Bulldog", 50, true);
		dogArr[2] = new Dogs("Collie", 50, false);
		dogArr[3] = new Dogs("Chihuahua", 5, true);
		
		for (int i= 0; i < dogArr.length; i++)
		{
			System.out.println(dogArr[i]);
		}


		//fixed index
		//fixed element type
		//varied lenght
		System.out.println("*** ArayList ***");

		//choice in index
		//fixed element type
		//varied lenght
		System.out.println("*** HashMaps ***");
	}
}
