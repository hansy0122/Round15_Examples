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
			throw new MyException("test !");     //e�� ���� test! ��°� �Էµȴ�. super.gerMessage�� return�Ѵ� ������
		}catch(MyException e){
			System.out.println(e.getMessage());
		}
	}

}
