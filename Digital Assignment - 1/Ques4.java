package da1;
import java.util.*;
import java.lang.Math;   

abstract class SubClass {
    void announcement(int i) {};
    void registrations(int n){};
    void participants(int n){};
}

interface Input {
    void accept();
}

class Parent extends SubClass implements Input{
        public int num;
        void announcement(int i){
            System.out.println("This is the Announcement "+i+" for the New Event.");
        }
        void registrations(int n){
            System.out.println("The weightage of Social Media Round: "+(n+10*Math.random()));
        }
        void participants(int n){
            System.out.println("The weightage of scores: "+(n+90*Math.random()));
            System.out.println("Updated weightage of scores: "+(n+110*Math.random()));
        }
        public void accept(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of announcements for Event: ");
            num = sc.nextInt();
        }
}
public class DA1 {
    public static void main(String args[]) {
        Parent p1 = new Parent();
        p1.accept();
        for(int i=0; i<p1.num; i++){
            p1.announcement(i+1);
            p1.registrations(p1.num);
            p1.participants(p1.num);
        }
    }
}