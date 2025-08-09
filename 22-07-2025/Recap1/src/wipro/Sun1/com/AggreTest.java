package wipro.Sun1.com;

public class AggreTest {

	public static void main(String[] args) {
		Bank b = new Bank("ASB434", "HDFC", 132002.32f);
		Aggre a = new Aggre(200, "Soujanya", "Banglore", b);//Aggregation, passing object of Bank as an argument
		a.show();
	}

}
