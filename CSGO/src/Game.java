
public class Game {

	public static void main(String[] args) {
		
		Player kayla = new Player (false, "kayla");
		Player katie = new Player (false, "katie");
        Player joseph = new Player (true, "joseph");
       
		System.out.println("Operation 1:Kayla shoots at katie");
		System.out.println("---------------------------------");
		kayla.shootAtTarget(katie);
		System.out.println();
		System.out.println("Operation 2:Kayla shoots at joseph");
		System.out.println("---------------------------------");
		kayla.shootAtTarget(joseph);
		System.out.println();
		System.out.println("Operation 3:Kayla shoots at joseph");
		System.out.println("---------------------------------");
		kayla.shootAtTarget(joseph);
		System.out.println();
		System.out.println("Operation 4:Kayla shoots at joseph");
		System.out.println("---------------------------------");
		kayla.shootAtTarget(joseph);
		System.out.println();
		System.out.println("Operation 5:Kayla shoots at joseph");
		System.out.println("---------------------------------");
		kayla.shootAtTarget(joseph);
		System.out.println();
		System.out.println("Operation 6:Kayla shoots at joseph");
		System.out.println("---------------------------------");
		kayla.shootAtTarget(joseph);
		System.out.println();
		System.out.println("Operation 7:Kayla shoots at joseph");
		System.out.println("---------------------------------");
		kayla.shootAtTarget(joseph);
		System.out.println();
		System.out.println("Operation 8:Kayla shoots at joseph");
		System.out.println("---------------------------------");
		kayla.shootAtTarget(joseph);
		System.out.println();
		System.out.println("Operation 9:joseph takes cure");
		System.out.println("---------------------------------");
		joseph.takeCure();
		System.out.println();
		System.out.println("Operation 10:Kayla loads magazine");
		System.out.println("---------------------------------");
		kayla.loadMagazine();
		System.out.println();
		System.out.println("Operation 11:Kayla loans money to joseph");
		System.out.println("---------------------------------");
		kayla.loanMoney(joseph, 100);
		System.out.println();
		System.out.println("Operation 12:Kayla loans money to katie");
		System.out.println("---------------------------------");
		kayla.loanMoney(katie, 100);
		
	}

}
