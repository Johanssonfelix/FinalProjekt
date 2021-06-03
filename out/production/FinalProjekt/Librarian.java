public class Librarian extends User {
// Ev utan User arv.

    public int numberOfBooks;


    public Librarian() {
        super();
    }

    public Librarian(int userId, String userName, int userType, String password) {
        super(userId, userName, userType, password);
    }

}
