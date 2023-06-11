
public class SilenceTv extends Tv{

	// 음소거 속성을 키거나 끈다
	boolean silence = false;
	
	// 이전 볼륨의 값
	int previousVolume = 0;
	
	/** 
	 * 음소거버튼 기능구현
	 * 버튼을 누를때 마다 음소거 상태는 변경
	 * 음소거 속성이 켜졌는지, 꺼져있는지 
	 * 켜져있으면 ...
	 * 소리를 끈다
	 * 꺼져있으면...
	 * 이전 볼륨으로
	 */
	void silenceButton(){
		silence = !silence;
		if(silence){
			previousVolume = volume;
			volume = 0;
		}else{
			volume = previousVolume;
		}
	}
	
}
