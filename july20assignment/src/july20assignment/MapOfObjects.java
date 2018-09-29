package july20assignment;
import java.util.*;
class Student{
	 int id;
	 String name;
	 int rollno;
	 double marks;
	
	public Student(int id,String name, int rollno, double marks){
		this.id=id;
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}


	}

public class MapOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<Integer, Student> smap= new HashMap<Integer, Student>();  //creating a map of students
       
       Student s1= new Student(1,"Aish",10,25.0);      //creating objects
       Student s2= new Student(2,"Shivani",53,28.0);
       Student s3= new Student(3,"Debu",15,30.0);
       
       smap.put(1,s1);        //adding objects to maps
       smap.put(2, s2);
       smap.put(3, s3);
       
       for( Map.Entry<Integer, Student> m: smap.entrySet()){
    	   int key= m.getKey();
    	   Student s=m.getValue();
    	   System.out.println(key + " Details:");
    	   System.out.println(s.id + " " + s.name + " " + " " + s.rollno + " " + s.marks);
    	   
       }
       
	}

}
