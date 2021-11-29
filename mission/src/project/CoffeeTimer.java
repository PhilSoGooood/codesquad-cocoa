package project;

public class CoffeeTimer {
	static V60Ready v60Ready = new V60Ready();
	public static void main(String[] args) {
		CoffeeTool ct = new CoffeeTool();
		ct.selectTool();
	}
}