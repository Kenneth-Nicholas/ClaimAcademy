package weekThreeMondayLecture;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Toyota toyota = new Toyota();
		
		Car toyotaCar = new Toyota();
		
		Mercedes mercedes = new Mercedes();
		
		Car mercedesCar = new Mercedes();
		
		Car honda = new Honda();
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(toyota);
		
		cars.add(mercedes);
		
		cars.add(toyotaCar);
		
		cars.add(honda);
		
		cars.add(mercedesCar);
		
		// For each element loop
		for(Car car : cars) {
			
			System.out.println(car.sendText());
			
		}
		
	}

}
