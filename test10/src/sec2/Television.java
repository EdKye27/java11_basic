package sec2;

public class Television implements Screen {

	int volume;
	int lightness;
	int darkness;
	int zoom;
	
	@Override
	public void turnOff() {
		System.out.println("전원 off");
	}

	@Override
	public void turnOn() {
		System.out.println("전원 on");
	}

	@Override
	public void setVolume(int volume) {
	    if(volume > MAX) {
	        this.volume = MAX; // MAX 값으로 설정
	    } else if(volume < MIN) {
	        this.volume = MIN; // MIN 값으로 설정
	    } else {
	        this.volume = volume; // 주어진 값으로 설정
	    }
	}

	@Override
	public int light() {
	    if(this.lightness < 255 && this.lightness > 0) {
	        this.lightness++;
	    }
	    return this.lightness;
	}

	@Override
	public int dark() {
	    if(this.darkness < 255 && this.darkness > 0) {
	        this.darkness++;
	    }
	    return this.darkness;
	}

	@Override
	public int zoomin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int zoomout() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
