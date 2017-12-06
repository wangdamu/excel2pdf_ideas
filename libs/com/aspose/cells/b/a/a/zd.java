package com.aspose.cells.b.a.a;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class zd<K, V>
  implements Iterable<za<K, V>>
{
  private K[] b = (Object[])new Object[16];
  private V[] c = (Object[])new Object[16];
  private int d;
  private Comparator<? super K> e = null;
  private zd<K, V>.za f;
  private zd<K, V>.zc g;
  private final int h = 16;
  
  public zd() {}
  
  public zd(Comparator paramComparator)
  {
    this();
    if (paramComparator != null) {
      this.e = paramComparator;
    }
  }
  
  public void a(K paramK, V paramV)
  {
    int i = a(this.b, 0, this.d, paramK, this.e);
    if (i >= 0) {
      throw new IllegalArgumentException("duplicate");
    }
    a(i ^ 0xFFFFFFFF, paramK, paramV);
  }
  
  public void a(int paramInt)
  {
    if (paramInt != this.b.length)
    {
      if (paramInt < this.d) {
        throw new IndexOutOfBoundsException("value");
      }
      if (paramInt > 0)
      {
        Object[] arrayOfObject1 = (Object[])new Object[paramInt];
        Object[] arrayOfObject2 = (Object[])new Object[paramInt];
        if (this.d > 0)
        {
          System.arraycopy(this.b, 0, arrayOfObject1, 0, this.d);
          System.arraycopy(this.c, 0, arrayOfObject2, 0, this.d);
        }
        this.b = arrayOfObject1;
        this.c = arrayOfObject2;
      }
      else
      {
        this.b = ((Object[])new Object[16]);
        this.c = ((Object[])new Object[16]);
      }
    }
  }
  
  public int b()
  {
    return this.d;
  }
  
  public boolean a(K paramK)
  {
    return e(paramK) >= 0;
  }
  
  public boolean b(K paramK)
  {
    return e(paramK) >= 0;
  }
  
  public boolean c(V paramV)
  {
    return f(paramV) >= 0;
  }
  
  private void e(int paramInt)
  {
    int i = this.b.length == 0 ? 16 : this.b.length << 1;
    if (i < paramInt) {
      i = paramInt;
    }
    a(i);
  }
  
  public V b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.d)) {
      throw new IndexOutOfBoundsException("index");
    }
    return (V)this.c[paramInt];
  }
  
  public Iterator<za<K, V>> iterator()
  {
    return new zb(null);
  }
  
  public K c(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.d)) {
      throw new IndexOutOfBoundsException("index");
    }
    return (K)this.b[paramInt];
  }
  
  public Iterable<K> c()
  {
    return d();
  }
  
  public List<K> d()
  {
    if (this.f == null) {
      this.f = new za(this);
    }
    return this.f;
  }
  
  public List<V> e()
  {
    if (this.g == null) {
      this.g = new zc(this);
    }
    return this.g;
  }
  
  public Iterable<V> f()
  {
    return e();
  }
  
  public V d(K paramK)
  {
    int i = e(paramK);
    if ((i >= 0) && (i < this.d)) {
      return (V)this.c[i];
    }
    return null;
  }
  
  public void b(K paramK, V paramV)
  {
    if (paramK == null) {
      throw new NullPointerException("key");
    }
    int i = a(this.b, 0, this.d, paramK, this.e);
    if (i >= 0)
    {
      this.c[i] = paramV;
      return;
    }
    a(i ^ 0xFFFFFFFF, paramK, paramV);
  }
  
  public int e(K paramK)
  {
    if (paramK == null) {
      throw new NullPointerException("key");
    }
    int i = a(this.b, 0, this.d, paramK, this.e);
    return i >= 0 ? i : -1;
  }
  
  public int f(V paramV)
  {
    return com.aspose.cells.b.a.za.a(this.c, paramV, 0, this.d);
  }
  
  private void a(int paramInt, K paramK, V paramV)
  {
    if (this.d == this.b.length) {
      e(this.d + 1);
    }
    if (paramInt < this.d)
    {
      System.arraycopy(this.b, paramInt, this.b, paramInt + 1, this.d - paramInt);
      System.arraycopy(this.c, paramInt, this.c, paramInt + 1, this.d - paramInt);
    }
    this.b[paramInt] = paramK;
    this.c[paramInt] = paramV;
    this.d += 1;
  }
  
  public void d(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.d)) {
      throw new IndexOutOfBoundsException("index");
    }
    this.d -= 1;
    if (paramInt < this.d)
    {
      System.arraycopy(this.b, paramInt + 1, this.b, paramInt, this.d - paramInt);
      System.arraycopy(this.c, paramInt + 1, this.c, paramInt, this.d - paramInt);
    }
    this.b[this.d] = null;
    this.c[this.d] = null;
  }
  
  public void g(K paramK)
  {
    int i = e(paramK);
    if (i >= 0) {
      d(i);
    }
  }
  
  public static int a(Object[] paramArrayOfObject, int paramInt1, int paramInt2, Object paramObject)
  {
    if ((!a) && (paramArrayOfObject == null)) {
      throw new AssertionError();
    }
    if ((!a) && ((paramInt1 < 0) || (paramInt2 < 0))) {
      throw new AssertionError();
    }
    if ((!a) && (paramArrayOfObject.length - paramInt1 < paramInt2)) {
      throw new AssertionError();
    }
    int i = paramInt1;
    int j = paramInt1 + paramInt2 - 1;
    while (i <= j)
    {
      int k = i + j >> 1;
      Comparable localComparable = (Comparable)paramArrayOfObject[k];
      int m = localComparable.compareTo(paramObject);
      if (m < 0) {
        i = k + 1;
      } else if (m > 0) {
        j = k - 1;
      } else {
        return k;
      }
    }
    return i ^ 0xFFFFFFFF;
  }
  
  public static <T> int a(T[] paramArrayOfT, int paramInt1, int paramInt2, T paramT, Comparator<? super T> paramComparator)
  {
    if ((!a) && (paramArrayOfT == null)) {
      throw new AssertionError();
    }
    if ((!a) && ((paramInt1 < 0) || (paramInt2 < 0))) {
      throw new AssertionError();
    }
    if ((!a) && (paramArrayOfT.length - paramInt1 < paramInt2)) {
      throw new AssertionError();
    }
    if (paramComparator == null) {
      return a(paramArrayOfT, paramInt1, paramInt2, paramT);
    }
    int i = paramInt1;
    int j = paramInt1 + paramInt2 - 1;
    while (i <= j)
    {
      int k = i + j >> 1;
      T ? = paramArrayOfT[k];
      int m = paramComparator.compare(?, paramT);
      if (m < 0) {
        i = k + 1;
      } else if (m > 0) {
        j = k - 1;
      } else {
        return k;
      }
    }
    return i ^ 0xFFFFFFFF;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("\r\n");
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      za localza = (za)localIterator.next();
      localStringBuilder.append(localza.getKey()).append(" => ").append(localza.getValue()).append("\r\n");
    }
    return localStringBuilder.toString();
  }
  
  private class zc
    implements List<V>
  {
    private zd<K, V> b;
    
    zc()
    {
      zd localzd;
      this.b = localzd;
    }
    
    public boolean add(V o)
    {
      throw new UnsupportedOperationException();
    }
    
    public void add(int index, V element)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection<? extends V> c)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(int index, Collection<? extends V> c)
    {
      throw new UnsupportedOperationException();
    }
    
    public void clear()
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean contains(Object value)
    {
      return this.b.c(value);
    }
    
    public boolean containsAll(Collection<?> c)
    {
      throw new UnsupportedOperationException();
    }
    
    public V get(int index)
    {
      return (V)this.b.b(index);
    }
    
    public int indexOf(Object value)
    {
      return com.aspose.cells.b.a.za.a(zd.d(this.b), value, 0, this.b.b());
    }
    
    public boolean isEmpty()
    {
      return this.b.b() == 0;
    }
    
    public Iterator<V> iterator()
    {
      return new za(null);
    }
    
    public int lastIndexOf(Object o)
    {
      throw new UnsupportedOperationException();
    }
    
    public ListIterator<V> listIterator()
    {
      throw new UnsupportedOperationException();
    }
    
    public ListIterator<V> listIterator(int index)
    {
      throw new UnsupportedOperationException();
    }
    
    public V remove(int index)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean remove(Object o)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean removeAll(Collection<?> c)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean retainAll(Collection<?> c)
    {
      throw new UnsupportedOperationException();
    }
    
    public V set(int index, V element)
    {
      throw new UnsupportedOperationException();
    }
    
    public int size()
    {
      return zd.c(this.b);
    }
    
    public List<V> subList(int fromIndex, int toIndex)
    {
      throw new UnsupportedOperationException();
    }
    
    public Object[] toArray()
    {
      throw new UnsupportedOperationException();
    }
    
    public <V> V[] toArray(V[] a)
    {
      throw new UnsupportedOperationException();
    }
    
    private class za
      implements Iterator<V>
    {
      private int b = -1;
      
      private za() {}
      
      public boolean hasNext()
      {
        return this.b + 1 < zd.this.b();
      }
      
      public V next()
      {
        if (++this.b >= zd.this.b()) {
          throw new NoSuchElementException("Iteration has no more elements.");
        }
        return (V)zd.this.b(this.b);
      }
      
      public void remove()
      {
        throw new UnsupportedOperationException();
      }
    }
  }
  
  private class za
    implements List<K>
  {
    private zd<K, V> b;
    
    za()
    {
      zd localzd;
      this.b = localzd;
    }
    
    public boolean add(K o)
    {
      throw new UnsupportedOperationException();
    }
    
    public void add(int index, K element)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection<? extends K> c)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(int index, Collection<? extends K> c)
    {
      throw new UnsupportedOperationException();
    }
    
    public void clear()
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean contains(Object value)
    {
      return this.b.b(value);
    }
    
    public boolean containsAll(Collection<?> c)
    {
      throw new UnsupportedOperationException();
    }
    
    public K get(int index)
    {
      return (K)this.b.c(index);
    }
    
    public int indexOf(Object key)
    {
      if (key == null) {
        throw new NullPointerException("key");
      }
      int i = zd.a(zd.a(this.b), 0, this.b.b(), key, zd.b(this.b));
      if (i >= 0) {
        return i;
      }
      return -1;
    }
    
    public boolean isEmpty()
    {
      return this.b.b() == 0;
    }
    
    public Iterator<K> iterator()
    {
      return new za(null);
    }
    
    public int lastIndexOf(Object o)
    {
      throw new UnsupportedOperationException();
    }
    
    public ListIterator<K> listIterator()
    {
      throw new UnsupportedOperationException();
    }
    
    public ListIterator<K> listIterator(int index)
    {
      throw new UnsupportedOperationException();
    }
    
    public K remove(int index)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean remove(Object o)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean removeAll(Collection<?> c)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean retainAll(Collection<?> c)
    {
      throw new UnsupportedOperationException();
    }
    
    public K set(int index, K element)
    {
      throw new UnsupportedOperationException();
    }
    
    public int size()
    {
      return zd.c(this.b);
    }
    
    public List<K> subList(int fromIndex, int toIndex)
    {
      throw new UnsupportedOperationException();
    }
    
    public Object[] toArray()
    {
      throw new UnsupportedOperationException();
    }
    
    public <K> K[] toArray(K[] a)
    {
      throw new UnsupportedOperationException();
    }
    
    private class za
      implements Iterator<K>
    {
      private int b = -1;
      
      private za() {}
      
      public boolean hasNext()
      {
        return this.b + 1 < zd.this.b();
      }
      
      public K next()
      {
        if (++this.b >= zd.this.b()) {
          throw new NoSuchElementException("Iteration has no more elements.");
        }
        return (K)zd.this.c(this.b);
      }
      
      public void remove()
      {
        throw new UnsupportedOperationException();
      }
    }
  }
  
  private class zb
    implements Iterator<za<K, V>>
  {
    private int b = -1;
    
    private zb() {}
    
    public boolean hasNext()
    {
      return this.b + 1 < zd.this.b();
    }
    
    public za<K, V> a()
    {
      if (++this.b >= zd.this.b()) {
        throw new NoSuchElementException("Iteration has no more elements.");
      }
      return new za(zd.this.c(this.b), zd.this.b(this.b));
    }
    
    public void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/a/zd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */