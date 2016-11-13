class MyException extends Exception{
	
	public MyException(String s){
	super(s);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "my message"+super.getMessage();
	}
	 
}
public class Round15_Ex11 {
	public static void main(String ar[]){
		try{
			throw new MyException("test !");     //e에 원인 test! 라는게 입력된다. super.gerMessage는 return한다 원인을
		}catch(MyException e){
			System.out.println(e.getMessage());
		}
	}

}
