package Week_1.OOPs;

interface LibraryUser{
    void registerAccount();
    void requestBook();
}

class KidUsers implements LibraryUser{
    int age;
    String bookType;

    public void registerAccount(){
        if(age<12){
            System.out.println("You have successfully registered under a Kids Account");
        }
        else{
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    public void requestBook(){
        if(bookType.equals("Kids")){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

class AdultUsers implements LibraryUser{
    int age;
    String bookType;

    public void registerAccount(){
        if(age>12){
            System.out.println("You have successfully registered under an Adult Account");
        }
        else{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    public void requestBook(){
        if(bookType.equals("Fiction")){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        //testcase1
        KidUsers k= new KidUsers();
        k.age=10;
        k.registerAccount();
        k.age=18;
        k.registerAccount();

        k.bookType ="Kids";
        k.requestBook();
        k.bookType ="Fiction";
        k.requestBook();


        //testcase2
        AdultUsers a= new AdultUsers();
        a.age=5;
        a.registerAccount();
        a.age=23;
        a.registerAccount();

        a.bookType="Kids";
        a.requestBook();
        a.bookType="Fiction";
        a.requestBook();
    }
}