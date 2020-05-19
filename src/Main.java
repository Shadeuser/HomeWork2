public class Main {
    public static void main(String[] args) {
        //String[][] ar = new String[4][4];
        String[][] ar = {
                {"1", "2","3", "4"},
                {"5", "6","7", "8"},
                {"9", "10","11", "ooops!", },
                {"13", "14","15", "16"},
        };

        try {
            System.out.println(getArray(ar));
        } catch (MyArraySizeException e){
            System.out.println(e.getMessage());

        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage() + "["+e.getX()+"]["+e.getY()+"]="+"'"+e.getValue()+"'");
        }
    }
    public static int getArray(String[][] ar) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (ar.length != 4) {
            throw new MyArraySizeException("Неверное кол-во ячеек массива");
        }
        for (int a = 0; a <= ar.length - 1; a++) {
            if (ar[a].length != 4) {
                throw new MyArraySizeException("Неверное кол-во ячеек массива");
            }
            for (int b = 0; b <= ar[a].length - 1; b++) {
                try {
                    sum += Integer.parseInt(ar[a][b]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Невозможно преобразовать значение ячейки ", a, b, ar[a][b]);
                }
            }
        }
        return sum;
    }
}
