package TddPart2;

public class TestCase {
	public String name ;
	public String wasRun ;
	
	TestCase(String name){
		this.name = name;
	}
	public void testMethod(){
		wasRun = "true";
	}
	
	public void run(){
		testMethod();
	}
}
