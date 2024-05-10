public class Pistol {
	
	private int bulletInMagazine;
	private final int  maxBullet = 20;
	private final int  priceOfBullet = 5;
	private final double misfireRate = 0.3; 
	
	public Pistol() {
		bulletInMagazine = maxBullet;
	}
	
	public int getBulletInMagazine() {
		return bulletInMagazine;
	}

	public void setBulletInMagazine(int bulletInMagazine) {
		this.bulletInMagazine = bulletInMagazine;
	}
	
	public double getMisfireRate() {
		return misfireRate;
	}
	
	public int getMaxBullet() {
		return maxBullet;
	}

	@Override
	public String toString() {
		return "Bullet in magazaine: " + getBulletInMagazine();
	}
	
	public int priceForLoadMagazine() {
		return priceOfBullet *(maxBullet - bulletInMagazine);
	}

}
