/**
 * Created by Mingpoint on 2018/6/2.
 * Josephuse环
 *
 * @Description:
 */
public class Josephus {
    public static void main(String[] args) {
        Josephus j = new Josephus();
        String josephus = j.josephus(5, 0, 2);
        System.out.println(josephus);
    }
    public String josephus (int num,int start, int distance) {
        SeqList<String> list = new SeqList<>(num);
        for (int i = 0; i < num; i++) {
            list.insert(i,(char)('A'+i)+"");
        }
        System.out.println("("+list.toString()+")");
        int size = list.size();
        while (size != 1) {
            start = (start+distance-1) % size;
            System.out.println("被删除的是:"+list.remove(start)+"("+list.toString()+")");
            size = list.size();
        }
        return list.get(0);

    }
}
