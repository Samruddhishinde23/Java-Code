package statement;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      add(); //calling static method 
	  FunctionDemo obj1=new FunctionDemo();// creating object
      obj1.sub();//calling non-static method using object
      int result=obj1.div();
      System.out.println("Div:"+result);
	}
    public static void add() {
    	int a=1;
    	int b=2;
    	int total=a+b;
    	System.out.println("Add:"+total);
    }
    public  void sub() {
    	int a=1;
    	int b=2;
    	int total=a-b;
    	System.out.println("Sub:"+total);
    }
    public int div() {
    	int a=1;
    	int b=2;
    	int total=a/b;
    	return total;
    	
    }
}