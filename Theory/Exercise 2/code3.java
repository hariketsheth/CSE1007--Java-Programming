
package university;

public class University{
    
    void declare(){
        int average = 93;

        class Result{
        public void display(){
                System.out.println("This batch have performed well. Average: "+average);
        }
    }
    
    Result r1 = new Result();
    r1.display();
}

    public static void main (String args[] ){
        University u1 = new University();
        u1.declare();
    }
}