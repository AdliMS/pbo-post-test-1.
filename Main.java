class Rectangle {

    // atribut kelas
    private int length, width;

    // constructor kelas
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // method untuk mengembalikan nilai length
    public int get_length() {
        return this.length;
    }

    // method untuk mengembalikan nilai width
    public int get_width() {
        return this.width;
    }

    // method untuk mengembalikan/menghasilkan luas persegi panjang
    public int get_luas() {
        return this.length * this.width;
    }

    // method untuk mengembalikan/menghasilkan kelling persegi panjang
    public int get_keliling() {
        return 2 * (this.length + this.width);
    }

}

public class Main {
    public static void main(String[] args) {

        Rectangle[] rectangles = new Rectangle[5];

        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i] = new Rectangle(5 + 1 * i, 2 + 1 * i);
        }

        for (Rectangle rectangle : rectangles) {
            System.out.println("\nPersegi panjang dengan : ");
            System.out.println("panjang = " + rectangle.get_length() + " cm" + "\nlebar = " + rectangle.get_width() + " cm");
            System.out.println("Memiliki keliling = " + rectangle.get_keliling() + " cm"+ " dan luas = " + rectangle.get_luas() + " cm2");
        }
        
    }       
}
