class Book {
    String title ="OPP in Java";
    String author ="SAIMON ISLAM";
    String isbn ="875457457";
    
    public void get_details(){
        System.out.println("Title is: " +title);
        System.out.println("Author name is: " +author);
        System.out.println("ISBN number is: " +isbn);
    }
    }
    class BorrowedBook extends Book {
        String borrower_name = "MIRAJ ";
        String due_date ="04-07-2025";
        public void get_borrow_details(){
        get_details();
        System.out.println("Borrower name: " +borrower_name);
        System.out.println("due Date: " +due_date);
    }
    }
     class lab2{
    public static void main(String[] args){
        BorrowedBook B = new BorrowedBook();
        B.get_borrow_details();
    }
    }