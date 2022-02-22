
package university;

class Batch{
    private int average = 93;

    public class Result{
        public int declare(){
            System.out.println("This batch have performed well");
            return average;
        }
    }

}

public class University {
    public static void main (String args[] ){
        Batch b1 = new Batch();
        Batch.Result r1 = b1.new Result();
        System.out.println(r1.declare());
    }
}