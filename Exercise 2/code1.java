
package university;

class Batch{
    int marks;

    private class Result{
        public void display(){
            System.out.println("This batch have performed well");
        }
    }

    void declare(){
        Result r1 = new Result();
        r1.display();
    }
}

public class University {
    public static void main (String args[] ){
        Batch b1 = new Batch();

        b1.declare();
    }
}