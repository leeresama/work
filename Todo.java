package Poker;

public class Todo {
    protected String title;
    protected String body;
    protected Boolean isDone = false;
    protected Todo next;

    public Todo(String title,String body){
        this.title = title;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", isDone=" + isDone +
                '}';
    }

    public String content(){
        return body;
    }

    public void setIsDone(){
        isDone = true;
    }
}
