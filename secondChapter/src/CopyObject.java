import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mingpoint on 2018/6/3.
 *
 * @Description:
 */
public class CopyObject {
    public static void main(String[] args) {
        List<StringBuffer> lista = new ArrayList<>();
        List<StringBuffer> listb = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        sb.append("a").append("b").append("c");
        lista.add(sb);
        listb.add(sb);
        lista.addAll(listb);
        listb.get(0).append("bs");
        for (int i = 0; i < lista.size();i++) {
            StringBuffer str = lista.get(i);
            System.out.println("value:"+str);
            System.out.println("class:"+str.hashCode());
            System.out.println("i:"+i);
        }
    }
}
