class fclass1 {
    public void method1() {
        System.out.println("Бұл fclass1 әдісі");
    }

    public static void main(String[] args) {
        fclass2 obj = new fclass2();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}

class fclass3 extends fclass1 {
    public void method2() {
        System.out.println("Бұл fclass3 әдісі");
    }
}

class fclass2 extends fclass3 {
    public void method3() {
        System.out.println("Бұл fclass2 әдісі");
    }
}
