// RIRIN ASTIANI 13020210132

public class Test0132 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //(a)
        Balok balok1 = new Balok();
        //(b)
        Balok balok2 = new Balok(20, 35, 15);
        //(c)
        balok1.setL(5);
        //(d)
        balok1.setP(25);
        //(e)
        balok2.setT(10);
        //(f)
        balok1.info();
        //(g)
        balok2.info();
    }
}

//class Balok
class Balok extends PersegiPanjang {
    private int t;
    
    public Balok() {
        //(h) 
        super(); //memanggil konstruktor default superclass
        this.t = 15; //inisialisasi variabel t
    }
    
    public Balok(int p, int l, int t) {
        //(i)
        super(p, l); //memanggil konstruktor superclass dengan parameter p dan l
        this.t = t; //inisialisasi variabel t
    }
    
    //(j) 
    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    //(k)
    public int volume() {
        return getP() * getL() * t;
    }
    
    //(l)
    public void info() {
        System.out.println("Panjang = " + getP());
        System.out.println("Lebar = " + getL());
        System.out.println("Tinggi = " + t);
        System.out.println("Luas = " + luas());
        System.out.println("Volume = " + volume());
    }
}

// class Persegi Panjang
class PersegiPanjang {
    private int p, l;
    
    public PersegiPanjang() {
        //(m)
        this.p = 30; //inisialisasi variabel p
        this.l = 20; //inisialisasi variabel l
    }
    
    public PersegiPanjang(int p, int l) {
        //(n)
        this.p = p; //inisialisasi variabel p
        this.l = l; //inisialisasi variabel l
    }
    
    //(o)
    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
    
    //(q)
    public int luas() {
        return p * l;
    }
    
    //(r)
    public int keliling() {
        return 2 * (p + l);
    }
}