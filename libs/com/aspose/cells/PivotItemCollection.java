package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.Iterator;

public class PivotItemCollection
{
  PivotField a;
  ArrayList b;
  
  PivotItemCollection(PivotField pivotField)
  {
    this.a = pivotField;
    this.b = new ArrayList();
  }
  
  int a(PivotItem paramPivotItem)
  {
    zf.a(this.b, paramPivotItem);
    return getCount() - 1;
  }
  
  public PivotItem get(int index)
  {
    return (PivotItem)this.b.get(index);
  }
  
  public PivotItem get(String itemValue)
  {
    for (int i = 0; i < getCount(); i++)
    {
      Object localObject = get(i).getValue();
      if (localObject == null)
      {
        if (itemValue == null) {
          return get(i);
        }
      }
      else if (zs.a(localObject).equals(itemValue)) {
        return get(i);
      }
    }
    return null;
  }
  
  public int getCount()
  {
    return this.b.size();
  }
  
  void a(int paramInt)
  {
    this.b.remove(paramInt);
  }
  
  void a()
  {
    this.b.clear();
  }
  
  int b()
  {
    int i = 0;
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      PivotItem localPivotItem = (PivotItem)localIterator.next();
      if (localPivotItem.isHidden()) {
        i++;
      }
    }
    return i;
  }
  
  public void changeitemsOrder(int sourceIndex, int destIndex)
  {
    Object localObject1 = this.b.get(destIndex);
    Object localObject2 = this.b.get(sourceIndex);
    this.b.set(destIndex, localObject2);
    this.b.set(sourceIndex, localObject1);
  }
  
  void a(int paramInt1, int paramInt2)
  {
    Object localObject = this.b.get(paramInt1);
    this.b.add(paramInt2 + 1, localObject);
    this.b.remove(paramInt1);
  }
  
  void b(int paramInt1, int paramInt2)
  {
    Object localObject = this.b.get(paramInt1);
    this.b.add(paramInt2, localObject);
    this.b.remove(paramInt1 + 1);
  }
  
  int b(PivotItem paramPivotItem)
  {
    int i = -1;
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      PivotItem localPivotItem = (PivotItem)localIterator.next();
      i++;
      if (paramPivotItem == localPivotItem) {
        return i;
      }
    }
    return -1;
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    zbuy localzbuy = new zbuy();
    Object localObject = this.b.iterator();
    while (((Iterator)localObject).hasNext())
    {
      PivotItem localPivotItem = (PivotItem)((Iterator)localObject).next();
      localzbuy.a(localPivotItem);
      localzbuy.a(paramzrg);
    }
    localObject = this.a;
    if ((((PivotField)localObject).isAutoSubtotals()) && ((((PivotField)localObject).c.a & 0xFFFF & 0x1) != 0))
    {
      localzbuy.a((short)1, 0, 65535, null);
      localzbuy.a(paramzrg);
      return;
    }
    if (((PivotField)localObject).getSubtotals(0)) {
      return;
    }
    int i = ((PivotField)localObject).c.a;
    for (int j = 1; j < 14; j++) {
      if (((i & 0xFFFF) >> j & 0x1) != 0)
      {
        localzbuy.a((short)(j + 1), 0, 65535, null);
        localzbuy.a(paramzrg);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PivotItemCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */