public class Master extends User{

    public int numberOfBooks;
    private int maxAmountOfBooks = 5;

    public Master() {
        super();
    }

    public Master(int userId, String userName, int userType, String password) {
        super(userId, userName, userType, password);
        Master.super.setUserId(2);//vet inte om detta kommer funga
    }
}
