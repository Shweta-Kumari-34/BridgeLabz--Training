package sortingAlgorithms.medwarehouseapp;

public class Medicine implements Comparable<Medicine>{
private String date;
private String name;
	Medicine(String date, String name){
		this.date=date;
		this.name=name;
	}
	
	public String getDate() {
		return date;
	}
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Medicine other) {
		
		return this.date.compareTo( other.date);
	}

}
