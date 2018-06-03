package link;

/**
 * Created by Mingpoint on 2018/6/3.
 *
 * @Description: 单链表
 */
public class SinglyList<T> {
    Node<T> header = null;
    public int len;

    public SinglyList() {
        header = new Node<T>();
        len = 1;
    }
    public boolean isEmpty() {
        return header.next == null;
    }

    //  尾部插入
    public int addLast(Node<T> node) {
        if (isEmpty()){
            header.next = node;
            len++;
            return 1;
        }
        Node<T> p = header.next;
        while (null != p.next) {
            p = p.next;
        }
        p.next = node;
        len++;
        return 1;
    }

    //  头部插入
    public int addFirst(Node<T> node) {
        if (isEmpty()){
            header.next = node;
            len++;
            return 1;
        }
        Node<T> p = header.next;
        header.next = node;
        node.next = p;
        len++;
        return 1;
    }
    public Node<T> remove (Node<T> node) {
        Node<T> p = header.next;
        if (p == null) {
            return null;
        }
        Node<T> front = p;
        while (null != p) {
            if (node.data.equals(p.data)) {
                front.next = p.next;
                len--;
                return p;
            }
            front = p;
            p = p.next;
        }
        len--;
        return null;
    }

    public void traverseLinks() {
        Node<T> p = header.next;
        while (null != p) {
            System.out.println(p.data);
            p = p.next;
        }
    }
    public Node<T> get(int i) {
        int index = 0;
        if (i > len) {
            throw new ArrayIndexOutOfBoundsException("list size is "+len+" your index is "+ i);
        }
        Node<T> p = header.next;
        while (null != p) {
            if (index == i) {
                break;
            }
            index++;
            p = p.next;
        }
        return p;
    }
    public void set(int i,Node<T> node){
        int index = 0;
        if (i > len) {
            throw new ArrayIndexOutOfBoundsException("list size is "+len+" your index is "+ i);
        }
        Node<T> p = header.next;
        Node<T> front = p;
        while (null != p) {
            if (index == i) {
                break;
            }
            index++;
            front = p;
            p = p.next;
        }
        front.next = node;
        node.next = p;
    }
    public int size() {
        return len;
    }
    public void reverse () {
        Node<T> front = null;
        Node<T> p = header.next;
        while (null != p) {
            Node<T> succ = p.next;
            p.next = front;
            front = p;
            p = succ;
        }
        header.next = front;
    }
}
