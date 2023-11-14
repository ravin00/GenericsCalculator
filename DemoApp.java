package NamelessPaper;

public class DemoApp {

	public static void main(String[] args) {
	TCalculation<Integer> arr1 = new TCalculation<Integer>();
	
			arr1.append(50);
			arr1.append(20);
			
	TCalculation<Double> arr2 = new TCalculation<Double>();
	
			arr2.append(10.00);
			arr2.append(20.00);
			
			System.out.println("Array 01 average" + arr1.average());
			System.out.println("Array 02 average " + arr2.average());



	}

}
