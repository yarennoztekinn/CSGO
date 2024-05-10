
public class Player {
	
	private String name;
	private double money;
	private double health;
	private boolean isTerrorist;
	private Pistol pistol;
	private final double iniial_health = 100; 
	private final double iniial_money = 1000; 
	private final double priceOfCure = 500;
	private final int healthDecrease = 20;
	
	public Player(String name, double money, double health, boolean isTerrorist, Pistol pistol) {
		this.name = name;
		this.money = money;
		this.health = health;
		this.isTerrorist = isTerrorist;
		this.pistol = pistol;
	}

	public Player(boolean isTerrorist, String name) {
		this.name = name;
		this.isTerrorist = isTerrorist;
		this.health = iniial_health;
		this.money = iniial_money;
		pistol = new Pistol();
	}
	
	@Override
	public String toString() {
		return  "name: " + getName() + "\n" + 
				"money: " + getMoney() + "\n" + 
				"health: " + getHealth() + "\n" + 
				"isTerrorist: " + isTerrorist + "\n" + 
				pistol+ "\n" + 
				"-----------------------------------";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	public boolean isTerrorist() {
		return isTerrorist;
	}
	public void setTerrorist(boolean isTerrorist) {
		this.isTerrorist = isTerrorist;
	}
	public Pistol getPistol() {
		return pistol;
	}
	public void setPistol(Pistol pistol) {
		this.pistol = pistol;
	}


	public void shootAtTarget(Player targetPlayer){
		if (!targetPlayer.isTerrorist) {
			System.out.println("Failed!" +targetPlayer.getName() + " is on the same side!");
		}
		else if (targetPlayer.health == 0) {
			System.out.println("Failed! The enemy is already dead!");
		}
		else if (this.pistol.getBulletInMagazine() == 0) {
			System.out.println("Failed! No bullet left in magazine!");
		}
		else if (Math.random() < pistol.getMisfireRate()) {
			System.out.println("Failed! Pistol misfired!");
		}
		else {
			pistol.setBulletInMagazine(pistol.getBulletInMagazine() - 1);
			targetPlayer.setHealth(targetPlayer.getHealth() - healthDecrease);
			System.out.println("Success! Pinpoint accuracy!\n" + 
					"Info: There are " + pistol.getBulletInMagazine() + " bullet(s) left in " + this.name + "'s magazine.\n" +
					"Info: "+ targetPlayer.getName() +"'s health level is decreased to " + targetPlayer.getHealth() );
		}
	}
	
	public void takeCure() {
		if (this.money < priceOfCure) {
			System.out.println("Failed!" + this.name + " cannot afford it now!");
		}else {
			this.health = this.iniial_health;
			this.money = this.money - priceOfCure;
			System.out.println("Success! " +this.name+ " is now as fit as s(he) has never been before!\n"
					+ "Info: " + this.name + "'s health level is now " + this.health + ".\n"
					+ "Info: " + this.name + " has now " + this.money + " dollars!");
		}
	}
	
	public void loadMagazine() {
		if (this.money < pistol.priceForLoadMagazine()) {
			System.out.println("Failed!" + this.name + " cannot afford it now!");
		}else {
			pistol.setBulletInMagazine(pistol.getMaxBullet());
			this.money = this.money - pistol.priceForLoadMagazine();
			System.out.println("Success! The real war begins now!\n"
					+ "Info: " + this.name + " has now " + pistol.getBulletInMagazine() + " bullets in the magazine!\n"
					+ "Info: " + this.name + " has now " + this.money + " dollars!");
		}
	}
	
	public void loanMoney(Player borrower, int amountOfDebt){
		if (borrower.isTerrorist) {
			System.out.println("Failed! Come on! Too young to be a spy!");
		}
		else if (amountOfDebt > this.money) {
			System.out.println("Failed!" + this.name + " cannot afford it now!");
		}
		else {
			this.money = this.money - amountOfDebt;
			borrower.money = borrower.money + amountOfDebt;
			System.out.println("Success!" + this.name + "is a perfect philanthropist!\n"
					+ "Info: " + this.name + " has now " + this.money + " dollars!\n"
					+ "Info: " + borrower.name + " has now " + borrower.money + " dollars!");
		}	
	}
}
