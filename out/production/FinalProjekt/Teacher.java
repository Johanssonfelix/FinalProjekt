public class Teacher extends User {

    public int numberOfBooks = 0;
    private int maxAmountOfBooks = 10;

    public Teacher() {
        super();
    }

    public Teacher(int userId, String userName, int userType, String password) {
        super(userId, userName, userType, password);
        Teacher.super.setUserType(3);//vet inte om detta kommer funga
    }

    public void loanBook(Teacher user,int ISBN){
        // Fungerar inte
        if (user.numberOfBooks > maxAmountOfBooks){
            System.out.println("User has to many books, return some before loaning a new one");
        } else {
            LoanManager lm = new LoanManager();
           lm.getBookISBN(ISBN).setLanetagare(user);

            numberOfBooks++;
        }


    }
}
