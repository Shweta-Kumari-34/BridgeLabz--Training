package sortingAlgorithms.icecreamrushapp;

public class IceCream implements Comparable<IceCream>{
private String name;
private int weeklySales;

public IceCream(String name, int weeklySales) {
	this.name= name;
	this.weeklySales=weeklySales;
}

public String getName() {
	return name;
}

public int getWeeklySales() {
	return weeklySales;
}

@Override
public int compareTo(IceCream other) {
	return Integer.compare(this.weeklySales, other.weeklySales);

}


}
