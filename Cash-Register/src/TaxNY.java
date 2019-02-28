
public class TaxNY implements Tax{

	@Override
	public double calculatate(double purchase) {
		if (purchase > 100)
			purchase = purchase + (purchase*0.08);
		return purchase;
	}

}
