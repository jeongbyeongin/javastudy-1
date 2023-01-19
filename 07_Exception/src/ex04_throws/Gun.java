package ex04_throws;

public class Gun {

	private int bullet;
	public static final int MAX_BULLET = 10;
	
	// 총알 넣기
	public void reload(int bullet) {
		if(this.bullet + bullet > MAX_BULLET) {
			return;
		}
		this.bullet += bullet;
	}
	
	// 총 쏘기
	public void shoot() {
		if(bullet == 0) {
			return;
		}
		bullet--;
	}

	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
}
