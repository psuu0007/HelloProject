
public class TvTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SilenceTv sTv = new SilenceTv();
		
		for (int i = 0; i < 7; i++) {
			sTv.volumeUp();
		}
		
		System.out.println("볼륨 업 " + sTv.volume);
		
		sTv.silenceButton();
		
		System.out.println("음소거 " + sTv.volume);
		
		sTv.silenceButton();
		System.out.println("음소거 끔 " + sTv.volume);
	}

}
