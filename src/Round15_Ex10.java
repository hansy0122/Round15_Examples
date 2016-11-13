
	public class Round15_Ex10 {
		public static void aaa(){
			try {
				System.out.println("a");
				int tot=10/2;
				System.out.println(tot);
				return;
			
			}catch(ArithmeticException e){
				System.out.println("o xxxx");
				return;
			}finally{
				System.out.println("process end");
			}
		}
		public static void main(String ar[]){
			aaa();
		}
}
