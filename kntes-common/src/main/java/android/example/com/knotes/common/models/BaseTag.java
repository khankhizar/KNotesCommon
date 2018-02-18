package android.example.com.knotes.common.models;

public class BaseTag {

    private String text;
    private int count;


    public BaseTag() {
        super();
    }


    public BaseTag(String text, int count) {
        this.text = text;
        this.count = count;
    }


    public int getCount() {
        return count;
    }


    public void setCount(int count) {
        this.count = count;
    }


    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }
}