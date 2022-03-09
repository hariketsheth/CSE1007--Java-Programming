package lab3;

class Overload {
    int a,b,c;
    float d,e,f;
    int operation(int a, int b){
        return a+b;
    }
    int operation(int a, int b, int c){
        return (a+c-b);
    }
    float operation(float a, float b){
        return (a*b);
    }
    float operation(float a, float b, float c){
        return(a*c+b);
    }
    
};

class Lab4 {
    public static void main(String[] args) {
        Overload o1 = new Overload();
        System.out.println("Result: "+o1.operation(2,3,5));
        System.out.println("Result: "+o1.operation(2.4f,3.9f));
        System.out.println("Result: "+o1.operation(9,3));
        System.out.println("Result: "+o1.operation(9.8f, 3.4f, 4.5f));
    }
}