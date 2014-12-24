import java.util.ArrayList;

class machine {

}

class camera extends machine {

}

public class App {
	public static void main() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		showlist(list);
	}

	private static void showlist(ArrayList<String> list) {
		// TODO Auto-generated method stub
		for(String value:list){
			System.out.println(value);
		}
		
	}
}
