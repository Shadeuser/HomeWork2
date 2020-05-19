//Добавлен в pull request
public class MyArrayDataException extends Throwable {

    int x = -1;
    int y = -1;
    String value ="";

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getValue() {
        return value;
    }

    public MyArrayDataException(String message, int x, int y, String value) {
        super(message);
        this.x = x;
        this.y = y;
        this.value = value;
    }
}
