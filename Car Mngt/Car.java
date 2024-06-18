package car.pack;

public class Car {
	
	 private String doors;

	 private String engine;

	 private String driver;

	 private int speed;
	 
	 public Car() {
		 doors="closed";
		 driver="Seated";
		 speed=10;
		 engine="on";
	 }

	 public void setSpeed(int speed) {
		  this.speed=speed;
		 }

		public int getSpeed() {
		  return speed;
		 }

		public String getDoors() {
			return doors;
		}

		public void setDoors(String doors) {
			this.doors = doors;
		}

		public String getEngine() {
			return engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getDriver() {
			return driver;
		}

		public void setDriver(String driver) {
			this.driver = driver;
		}
		
		public String run() {
			if(driver.equals("Seated") && engine.equals("on") && doors.equals("closed") && speed>0) {
				return "Running";
			}else {
				return "Not Running";
			}
				
			
			
		}
		  
}
