import java.util.Date;

public class Main {
    public static void main(String[] args) {
       /** Box деген generic класс тузунуз.Ичинде Box деген объектти кайтарган статический generic метод болсун**/

        Box <String> stringBox = new Box <> ();
        Box.print("Aiperi Ibraimova"+  "   is");
        Box  <Integer>integerBox = new Box<>();
        Box.print(27);


    }

}

