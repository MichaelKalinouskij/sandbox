/**
 * Created by NotePad.by on 11.07.2017.
 */
public class MyFirstPr {

    public static void main(String[] args) {

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со стороной " + r.a + " и " + r.b + " = " + r.area());

    }
}
