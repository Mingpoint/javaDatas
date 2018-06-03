package link;

/**
 * Created by Mingpoint on 2018/6/3.
 *
 * @Description:
 */
public class Node <T> {
    public T data;
    public Node<T> next;
    public Node() {

    }
    public Node(T data,Node<T> next) {
        this.data = data;
        this.next = next;
    }
    public String toString() {
        return this.data.toString();
    }
}
