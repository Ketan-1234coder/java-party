package party;

public class WeddingParty implements Party {

	@Override
	public void wish(String name) {
	System.out.println("Happy Marriage to ..." + name);

	}
	public void wish(String groomName , String brideName) {
	System.out.println("Happy Marriage" + groomName + brideName);

	}

	@Override
	public void playMusic() {
	System.out.println("wedding songs");

	}

	@Override
	public int seatingArrangements(int numberOfGuest) {
		
		return 20;
	}
	public void namesss() {
		System.out.println("hhhahahhaha");
		
	}

}
