package link;

/**
 * Created by Mingpoint on 2018/6/3.
 *
 * @Description:
 */
public class TestSinglyList {
    public static void main(String[] args) {
        SinglyList<Integer> lista = new SinglyList<Integer>();
        System.out.println("<----------------头插法---------------------------->");
        lista.addFirst(new Node<Integer>(1,null));
        lista.addFirst(new Node<Integer>(3,null));
        lista.addFirst(new Node<Integer>(2,null));
        lista.addFirst(new Node<Integer>(9,null));
        lista.traverseLinks();
        System.out.println("<-----------------尾插法--------------------------->");
        SinglyList<Integer> listb = new SinglyList<Integer>();
        listb.addLast(new Node<Integer>(66,null));
        listb.addLast(new Node<Integer>(11,null));
        listb.addLast(new Node<Integer>(10,null));
        listb.addLast(new Node<Integer>(0,null));
        listb.traverseLinks();
        System.out.println("<-----------------删除--------------------------->");
        Node<Integer> remove = listb.remove(new Node<Integer>(10, null));
        System.out.println("remove:"+remove);
        listb.traverseLinks();
        System.out.println("<-----------------根据下标查询--------------------------->");
        Node<Integer> getNode = lista.get(2);
        System.out.println("getNode:"+getNode);
        System.out.println("<-----------------根据位置插入--------------------------->");
        lista.set(4,new Node<Integer>(5,null));
        lista.traverseLinks();
        System.out.println("<-----------------逆序--------------------------->");
        lista.reverse();
        lista.traverseLinks();

    }
}

