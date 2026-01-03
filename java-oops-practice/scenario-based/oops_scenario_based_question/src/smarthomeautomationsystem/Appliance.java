package smarthomeautomationsystem;


public 	abstract class Appliance implements Controllable {
	    protected String name;
	    private boolean isOn;
	    private int powerConsumption; 
	   
	    public Appliance(String name) {
	        this.name = name;
	        this.powerConsumption = 100;
	        this.isOn = false;
	    }

	    public Appliance(String name, int powerConsumption) {
	        this.name = name;
	        this.powerConsumption = powerConsumption;
	        this.isOn = false;
	    }

	    protected void setOn(boolean status) {
	        isOn = status;
	    }

	    public boolean isOn() {
	        return isOn;
	    }

	    public int getPowerConsumption() {
	        return powerConsumption;
	    }

	    public void compareEnergy(Appliance other) {
	        if (this.powerConsumption > other.powerConsumption) {
	            System.out.println(this.name + " uses more power than " + other.name);
	        } else if (this.powerConsumption < other.powerConsumption) {
	            System.out.println(this.name + " uses less power than " + other.name);
	        } else {
	            System.out.println(this.name + " and " + other.name + " use equal power");
	        }
	    }
	}


