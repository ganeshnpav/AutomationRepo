package functions;

public class accessmodifiers {
	
	public static void main(String[] args)
	{
		accessmodifiers obj=new accessmodifiers();
		obj.publicfunction();
		obj.privatefunction();
		obj.protectedfunction();
		obj.noaccessspecifier();
	}
	
	public void publicfunction()
	{
		System.out.println("public function");
	}
	private void privatefunction()
	{
		System.out.println("private function");
	}
	
	protected void protectedfunction()

	{
		System.out.println("protected function");
	}
	void noaccessspecifier()
	{
		System.out.println("No access modifier funcion");
	}
	
	}
