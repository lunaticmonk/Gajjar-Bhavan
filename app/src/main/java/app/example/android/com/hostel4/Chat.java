package app.example.android.com.hostel4;

/**
 * Created by Sumedh on 05/04/2016.
 */
public class Chat {
    private String message;
    private String author;
    long stackID;
    // Required default constructor for Firebase object mapping
    @SuppressWarnings("unused")
    private Chat() {
    }

    Chat(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
    public long getStackID(){
        return stackID;
    }

}

