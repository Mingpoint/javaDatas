/**
 * Created by Mingpoint on 2018/6/3.
 *
 * @Description: 顺序线性表
 */
public class SortedSeqList<T extends Comparable<? super T>> extends SeqList<T> {
    public SortedSeqList() {
        super();
    }

    public SortedSeqList(int len) {
        super(len);
    }

    public SortedSeqList(T[] values) {
        super(values.length);
        for (int i = 0; i < values.length; i++) {
            this.insert(values[i]);
        }
    }

    public void insert(T t) {
        int i = 0;
        if (this.isEmpty() || t.compareTo(this.get(this.n - 1)) > 0) {
            i = this.n;
        } else {
            while (i < this.n && t.compareTo(this.get(i)) > 0) {
                i++;
            }
        }
        super.insert(i, t);
    }

    public int insertDifferent(T t) {
        int search = search(t);
        if (search < 0) {
            insert(t);
            return 1;
        }
        return -1;
    }

    public int search(T t) {
        for (int i = 0; i < this.n && t.compareTo(this.get(i)) >= 0; i++) {
            if (t.compareTo(this.get(i)) > 0) {
                return i;
            }
        }
        return -1;
    }
    public T remove(T key) {
        int search = search(key);
        if (search < 0) {
            return null;
        }
        T t = this.get(search);
        super.remove(key);
        return t;
    }

}
