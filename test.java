package testUpgrd;


class test {
    public static void main(String[] args) {
    	
    	//Uses of Abstraction 
    	Student s1=new Student();
    	s1.displayProfile();
    	System.out.println("Percentage of s1 is "+s1.findPercentage());
     
    }
}

class Student {
    public int rollno;
    public String name;
    public double cgpa;

    // Declare constructor of 'Student' class here
    public Student(){
    	this.rollno=1056;
    	this.cgpa=8.8;
    	this.name="karan";
    
    }
    public void displayProfile() {
        System.out.println(rollno + " " + name + " " + cgpa);
    }
    public double findPercentage() {
        double percent = cgpa * 10;
        return percent;
    }
}

