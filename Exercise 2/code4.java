
package university;

class Announcement{
 
        public void display(){
                System.out.println("Tomorrow is a non-instructional day");
        }
}

public class University{
    public static void main (String args[] ){
        Announcement a1 = new Announcement()
        {
                public void display(){
                        System.out.println("Tomorrow is an instructional day");
                }
        };
        a1.display();
    }
}