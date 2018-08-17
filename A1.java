	class A1{  
	void msg(){System.out.println("Hello");}}  
	class B{  
	void msg(){System.out.println("Welcome");}  
	}  
	 class C extends A1,B{//suppose if it were     
	 Public Static void main(String args[]){  
	   C obj=new C();  
obj.msg();//Now which msg() method would be invoked?  
	}  
	}  