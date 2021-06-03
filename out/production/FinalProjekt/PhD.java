public class PhD extends User{

    public int numberOfBooks;
    private int maxAmountOfBooks = 7;

    public PhD() {
        super();
    }

    public PhD(int userId, String userName, int userType, String password) {
        super(userId, userName, userType, password);
        PhD.super.setUserType(1);//vet inte om detta kommer funga
    }

}
