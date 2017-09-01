package hashcode2;//created package hashcode2
import hashcode.Student; //implementing the hash code using an object

public class StudentDemo {     //here we creating another class studentdemo and two objects to print the hash code 

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		//Here public is a access modifier which defines who can access this method
		   //Here static a keyword which identifies class related thing
		  //void is used to define return type of the method,void means method wont return any value
		  //main is name of method
		  //declares method String[]
		 //String[]args means arguments will be passed into main method and says that main() as parameter
  Student tharani = new Student();             // here we  the student objects,one object has uma and the other has shanthi
  Student bhavitha =new Student();
  
  System.out.println("Hash code =" +tharani.hashCode());  //here it prints the hashcodes of both of them
  System.out.println("Hash code =" +bhavitha.hashCode());//system is used to return code
	                                                 //out is a static number
                                              //Println is used to print textand gives output
	}

}
