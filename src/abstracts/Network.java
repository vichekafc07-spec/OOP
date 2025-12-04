package abstracts;


public class Network extends ABook{

    @Override
    public String bookTitle() {

        return "Network Server 2025";
    }

    public Network(){
        super(); // refer to ABook() constructor
    }
    public Network(String str){
        super(str); // refer to ABook(String title)
    }

}
