package Poker;

public class TodoList{
    private final Todo head = new Todo("", "");

    public void add(final String title, final String body) {
        final Todo todo = new Todo(title, body);
        Todo temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            } else
                temp = temp.next;
        }
        temp.next = todo;
    }

    public void delete(int num) {
        Todo temp = head;
        while (num > 1) {
            temp = temp.next;
            num--;
        }
        temp.next = temp.next.next;
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    public int size() {
        Todo temp = head;
        int length = 0;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        return length;
    }

    public Todo get(int num) {
        Todo temp = head;
        while (num > 0) {
            temp = temp.next;
            num--;
        }
        return temp;
    }

    public Todo get(final String title) {
        Todo temp = head;
        while(true){
            if(temp == null){
                break;
            }
            if(temp.title.equals(title)){
                break;
            }
            temp = temp.next;
        }
            return temp;
    }

    public void list(){
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        Todo temp = head.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

}