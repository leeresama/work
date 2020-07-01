package Poker;

public class TodoList{
    private Todo head = new Todo("","");

    public void add(String title, String body){
        Todo todo = new Todo(title,body);
        Todo temp = head;
        while(true){
            if(temp.next == null){
                break;
            }
            else
                temp = temp.next;
        }
        temp.next = todo;
    }

    public void delete(int num){
        Todo temp = head;
        while(num>1){
            temp = temp.next;
            num--;
        }
        temp.next = temp.next.next;
    }

}