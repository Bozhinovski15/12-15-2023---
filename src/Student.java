// Креирај класа Student - 2 контрукториж
//  Student(int i, String n)
// број и старост на студентот да се внесат
// објекти s1(2 параметри ) и s2(2 параметри )и s3( 2 параметри )



public class Student {
		int id;
		String ime;
		int starost;
		
	Student(int i, String n){
		id = i;
		ime = n;
	}
	Student(int i, String n, int a){
		id = i;
		ime = n;
		starost = a;
	}
	void display() {
		System.out.println(id+" "+ime+" "+starost);
	}
	public static void main(String args[]) {
		Student s1 = new Student(111, "Petar");
		Student s2 = new Student(222, "Marko", 25);
		s1.display();
		s2.display();
	}

	}

