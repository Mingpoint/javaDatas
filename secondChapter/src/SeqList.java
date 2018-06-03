/**
 * Created by Mingpoint on 2018/6/2.
 * 数组线性表类
 *
 * @Description:
 */
public class SeqList<T> extends Object {
    private Object[] objs;
    public int n;

    public SeqList(int len) {
        this.objs = new Object[len];
    }

    public SeqList() {
        this(16);
    }

    public SeqList(T[] values) {
        this(values.length);
        this.n = values.length;
        for (int i = 0; i < n; i++) {
            objs[i] = values[i];
        }
    }

    public boolean isEmpty() {
        return this.n == 0;
    }

    public int size() {
        return this.n;
    }

    public T get(int i) {
        if (isEmpty()) {
            return null;
        }
        if (i < 0 || i >= objs.length) {
            throw new ArrayIndexOutOfBoundsException(objs.length);
        }
        return (T) objs[i];
    }

    public void set(int i, T t) {
        check(i);
        objs[i] = t;
    }

    public void insert(int i, T t) {
        check(i);
        Object[] source = objs;
        if (this.n == objs.length) {
            this.objs = new Object[this.n * 2];
            for (int j = 0; j < this.n + 1; j++) {
                objs[j] = source[j];
            }
        }
        for (int j = n - 1; j >= i; j--) {
            objs[j + 1] = source[j];
        }
        objs[i] = t;
        n++;
    }

    public T remove(int i) {
        if (isEmpty()) {
            throw new RuntimeException("array length is zero");
        }
        check(i);
        Object obj = this.objs[i];
        for (int j = i; j < n - 1; j++) {
            this.objs[j] = this.objs[j + 1];
        }
        this.objs[n - 1] = null;
        n--;
        return (T) obj;
    }

    public void check(int i) {
        if (i < 0 || i >= objs.length) {
            throw new ArrayIndexOutOfBoundsException(objs.length);
        }
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < this.n; i++) {
            sb.append(objs[i]).append(" ");
        }
        return sb.toString();
    }

    public int search(T t) {
        for (int i = 0; i < this.n; i++) {
            if (((T) objs[i]).equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public int insertDifferent(T t) {
        int search = search(t);
        if (search < 0) {
            insert(n, t);
            return 1;
        }
        return -1;
    }

    public T remove(T key) {
        int i = search(key);
        return remove(i);
    }
}

