package Main.DestinationClass;

import org.springframework.stereotype.Service;

@Service
public class FirstService {

	public void method1(int x) {
		
		System.out.println("Method 1 execution");
	}
	public void method2(String text) {
		
		System.out.println("Method 2 execution");
	}
	@OwnAnnotation// this is a custom annotation created on Main.MainDestination.OwnAnnotation
	public void method3() {
		
		System.out.println("Method 3 execution");
	}
	
	@TestAnnotation// this is a custom annotation created on Main.MainDestination.OwnAnnotation
	public void method4() {
		
		System.out.println("Method 4 execution");
	}

}
