package p1;

public class PlatinumAccount extends GoldAccount{

	@Override
	public void rateOfIntrest() {
		System.out.println("6%/ yesr");
	}

	@Override
	public void Chqbooks() {
		System.out.println("Unlimited");
		
	}
	public static void main(String[] args) {
		GoldAccount g = new GoldAccount();
		g.OnlineBanking();
		g.rateOfIntrest();
		g.Chqbooks();
		System.out.println("________________");
		
		PlatinumAccount p = new PlatinumAccount();
		p.OnlineBanking();
		p.Chqbooks();
		p.rateOfIntrest();
	}


}
