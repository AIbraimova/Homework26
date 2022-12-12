public class Box  <T> {
    private T element;

    public static <T> void print(T element) {
        System.out.println(element.getClass().getName()
                + " = " + element);
    }
}
