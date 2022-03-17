package doublylinkedlist;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubly lst=new doubly();
		student s=new student(22,"ece","ece12");
		student s1=new student(23,"eee","ece12");
		student s2=new student(24,"cse","cse12");
		System.out.println(lst.getsize());
		System.out.println(lst.isEmpty());
		lst.addfront(s);
		lst.addfront(s1);
		lst.addfront(s2);
		lst.printall();
		
		System.out.println("-------");
		//lst.printall();
		
		

	}

}
