package lab3;

class Employee{
  String name;
  int basic_pay = 250000, da=12500, hra=2500, agp=995, ta=1040;
  String department;
  int salary = basic_pay;

  public void printSalary(){
    System.out.println("Salary: "+basic_pay);
  }
  
  public void print(){
      System.out.println("Name: "+name);
      System.out.println("Department: "+department);
      System.out.println("Salary: "+salary);
  }
}

class ProjectManager extends Employee{
    public void print(){
      salary = basic_pay + da + hra + agp;
      super.print();
  }
}

class SystemEngineer extends Employee{
    public void print(){
      salary = basic_pay + ta;
      super.print();
  }
}

class TechnicalAssistant extends Employee{
    public void print(){
      super.print();
  }
}

class Lab3 {
    public static void main(String[] args) {
        ProjectManager p1 = new ProjectManager();
        p1.name = "Java_Programming_1";
        p1.department = "Data Science";
        p1.print();
        System.out.println();
        SystemEngineer s1 = new SystemEngineer();
        s1.name = "Java_Programming_2";
        s1.department = "Web Development";
        s1.print();
        System.out.println();
        TechnicalAssistant t1 = new TechnicalAssistant();
        t1.name = "Java_Programming_3";
        t1.department = "Computer Science";
        t1.print();
    }
    
}
