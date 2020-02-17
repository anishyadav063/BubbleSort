
public class Student implements Cloneable {
         int id;
		 String name;
		 String course;
		 
		 
		public Student(int id, String name, String course) {
			this.id = id;
			this.name = name;
			this.course = course;
		}
		
		

      @Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", course=" + course + ", addre=" + addre + "]";
		}



	Address addre=new Address(100,"rudauli","mirzapur","up");
			public static void main(String[] args) throws CloneNotSupportedException {
		 
		 Student s1=new Student(100,"anish","mca");
         Student s2 =(Student)s1.clone();
         System.out.println(s1);
         System.out.println(s2);
         System.out.println(s1.hashCode()==s1.hashCode());
         System.out.println(s1.addre==s2.addre);
	}

}
