package org.giddap.dreamfactory.mitbbs.google;

import java.util.Iterator;
import java.util.List;

/**
 * http://www.mitbbs.com/bbsann2/life.faq/JobHunting/D13476000522s0/D13476011242s0/D13501136562O0/M.1353553011_2.q0/%5Bgoogle%E9%9D%A2%E8%AF%95%5Diterator%E8%AE%BF%E9%97%AE
 * <p/>
 * 给出一个二维vector，实现 flatten类
 * class flatten implements iterator{
 * public flatten(vector<vector<int>> a);
 * boolean hasNext();
 * iterator next();
 * }
 * <p/>
 * 可以用size求出所有的元素多少，但好像也不必，还要考虑到一些特殊case，比如里面
 * 的vector大小为空。大家能写个bug free很简洁的么，谢谢
 * <p/>
 * 面试官说可以用到vector的iterator
 */
public class GoogleIteratorVisitor<T> implements Iterator<T> {

    private final Iterator<List<T>> outer;
    private Iterator<T> inner;

    public GoogleIteratorVisitor(final List<List<T>> elements) {
        outer = elements.iterator();
    }

    @Override
    public boolean hasNext() {
        while (outer.hasNext() && (inner == null || !inner.hasNext())) {
            inner = outer.hasNext() ? outer.next().iterator() : null;
        }
        return inner == null ? false : inner.hasNext();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return inner.next();
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("This is not supported in current implementation.");
    }
}
