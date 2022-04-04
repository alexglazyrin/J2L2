public class MyArrayDataException extends Exception {
    // забыл содзать ветку


    public int i;
    public int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
