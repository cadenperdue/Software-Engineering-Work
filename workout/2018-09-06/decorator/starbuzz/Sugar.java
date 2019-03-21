//package headfirst.designpatterns.decorator.starbuzz;
 
public class Sugar extends CondimentDecorator {
	Beverage beverage;
 
	public Sugar(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Sugar";
	}
 
	public double cost() {
		return 0 + beverage.cost();
	}
}
