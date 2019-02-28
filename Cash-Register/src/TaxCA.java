
public class TaxCA implements Tax{

	@Override
	public double calculatate(double purchase) {
		purchase = purchase + (purchase*0.075);
		return purchase;
	}

}
