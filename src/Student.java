public class Student extends User{

    public int numberOfBooks;
    private int maxAmountOfBooks = 3;


    public Student() {
        super();

    }

    public Student(int userId, String userName, int userType, String password) {
        super(userId, userName, userType, password);
        Student.super.setUserType(0);//vet inte om detta kommer funga
    }

}
