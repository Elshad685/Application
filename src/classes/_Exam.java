package classes;


 interface Test {
    int INT = 5000;

    void test();
}

class TestImpl implements Test {

    @Override
    public void test() {
        System.out.println("print");
    }
}

public class _Exam {
    public static void main(String[] args) {
        new TestImpl().test();
    }
}
