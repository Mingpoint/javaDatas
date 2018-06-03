/**
 * Created by Mingpoint on 2018/6/3.
 *
 * @Description:
 */
public class TestSortedSeqList {
    public static void main(String[] args) {
        Integer[] values = {70,20,30,40,90,80};
        SeqList<Integer> lista = new SeqList<Integer>(values);
        SortedSeqList<Integer> listb = new SortedSeqList<Integer>(values);
        System.out.println("SeqList:"+lista.toString());
        System.out.println("SortedSeqList:"+listb.toString());
    }
}

