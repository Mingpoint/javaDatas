package link;

/**
 * Created by Mingpoint on 2018/6/3.
 *
 * @Description:
 */
public class TestCircleSinglyList {
    public static void main(String[] args) {
        CircleSinglyList<String> lista = new CircleSinglyList<String>();
        lista.addLast(new Node<String>("A",null));
        lista.addLast(new Node<String>("B",null));
        lista.addLast(new Node<String>("C",null));
        lista.traverseLinks();
    }
}
