package org.bouncycastle.openpgp;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

class KeyRingIterator
    implements Iterator
{
    private final Iterator iterator;
    private final Map rings;

    KeyRingIterator(List ids, Map rings)
    {
        this.iterator = ids.iterator();
        this.rings = rings;
    }

    public boolean hasNext()
    {
        return iterator.hasNext();
    }

    public Object next()
    {
        return rings.get(iterator.next());
    }
    
    public void remove()
    {
        throw new UnsupportedOperationException("remove not available");
    }
}
