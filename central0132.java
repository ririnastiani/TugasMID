// RIRIN ASTIANI 13020210132

interface A {
    public void aaa();
}

interface B extends A {
}

class Central0132 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0175 obj = new Central0175();
        System.out.println("main");
        obj.aaa();
    }
}