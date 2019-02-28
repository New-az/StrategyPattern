
public class TaxThailand implements Tax{

	@Override
	public double calculatate(double purchase) {
		purchase = purchase + (purchase*0.07);
		return purchase;
	}

}
