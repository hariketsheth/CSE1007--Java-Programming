package lab4;
abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    float m1, m2, m3;
    A(float m_1, float m_2, float m_3) {
        m1 = m_1;
        m2 = m_2;
        m3 = m_3;
    }
    double getPercentage() {
        return (m1 + m2 + m3) / 300.0 * 100;
    }
}

class B extends Marks {
    float m1, m2, m3, m4;
    B(float m_1, float m_2, float m_3, float m_4) {
        m1 = m_1;
        m2 = m_2;
        m3 = m_3;
        m4 = m_4;
    }
    double getPercentage() {
        return (m1 + m2 + m3 + m4) / 400.0 * 100;
    }
}

public class Lab4 {
    public static void main(String[] args) {
        A student1 = new A(90, 81, 99);
        B student2 = new B(69, 98, 73, 87);
        System.out.println("Percentage of student A : " + student1.getPercentage());
        System.out.println("Percentage of student B : " + student2.getPercentage());
    }
}