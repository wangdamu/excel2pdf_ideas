package com.aspose.cells;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class CollectionBase<T>
  implements Iterable<T>
{
  protected ArrayList<T> InnerList;
  
  public CollectionBase()
  {
    this.InnerList = new ArrayList();
  }
  
  public CollectionBase(int capacity)
  {
    this.InnerList = new ArrayList(capacity);
  }
  
  public Iterator<T> iterator()
  {
    return this.InnerList.iterator();
  }
  
  public int getCount()
  {
    return this.InnerList.size();
  }
  
  public void clear()
  {
    this.InnerList.clear();
  }
  
  public int add(T o)
  {
    if (this.InnerList.add(o)) {
      return this.InnerList.size() - 1;
    }
    return -1;
  }
  
  public T get(int index)
  {
    return (T)this.InnerList.get(index);
  }
  
  public boolean contains(Object o)
  {
    return this.InnerList.contains(o);
  }
  
  public void removeAt(int index)
  {
    this.InnerList.remove(index);
  }
  
  public int indexOf(Object o)
  {
    return this.InnerList.indexOf(o);
  }
  
  protected void onClearComplete() {}
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/CollectionBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */