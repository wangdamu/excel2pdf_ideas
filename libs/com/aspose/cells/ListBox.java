package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

public class ListBox
  extends Shape
{
  private ArrayList b;
  private int c;
  private int d;
  private int e = 0;
  private int f = 0;
  private int C = 1;
  private int D = 8;
  int a = 15;
  
  ListBox(ShapeCollection shapes)
  {
    super(shapes, 18, shapes);
  }
  
  public int getItemCount()
  {
    if (this.w == null) {
      return 0;
    }
    Range localRange = ag();
    if (localRange == null) {
      return 0;
    }
    return localRange.getRowCount();
  }
  
  public int getSelectedIndex()
  {
    if ((this.b == null) || (this.b.size() == 0)) {
      return -1;
    }
    return ((Integer)this.b.get(0)).intValue();
  }
  
  public void setSelectedIndex(int value)
  {
    Cell localCell = e(true);
    if (localCell != null)
    {
      int i;
      int j;
      if (this.c == 1)
      {
        if (localCell.getType() == 4)
        {
          i = localCell.getIntValue();
          j = getItemCount();
          if (i > j) {
            i = j;
          }
          localCell.putValue(i);
        }
        else
        {
          localCell.putValue(0);
        }
      }
      else if (value >= 0)
      {
        i = value + 1;
        j = getItemCount();
        if (i > j) {
          i = j;
        }
        localCell.putValue(i);
      }
      else
      {
        localCell.putValue((String)null);
      }
    }
    if (value == -1)
    {
      this.b = null;
      return;
    }
    if ((value < 0) || (value > 65535)) {
      throw new IllegalArgumentException("Invalid selected index.");
    }
    if (this.b == null) {
      this.b = new ArrayList();
    }
    this.b.clear();
    zf.a(this.b, Integer.valueOf(value));
  }
  
  void a(int paramInt)
  {
    if (paramInt == -1)
    {
      this.b = null;
      return;
    }
    this.b = new ArrayList();
    zf.a(this.b, Integer.valueOf(paramInt));
  }
  
  public void selectedItem(int itemIndex, boolean isSelected)
  {
    if ((itemIndex < 0) || (itemIndex >= getItemCount())) {
      throw new IllegalArgumentException("Invalid selected index.");
    }
    if ((getSelectionType() == 0) || (this.b == null) || (this.b.size() == 0))
    {
      if (isSelected) {
        setSelectedIndex(itemIndex);
      } else {
        setSelectedIndex(-1);
      }
      return;
    }
    int i = 0;
    for (int j = 0; j < this.b.size(); j++) {
      if ((((Integer)this.b.get(j)).intValue() & 0xFFFF) == itemIndex)
      {
        i = 1;
        if (isSelected) {
          break;
        }
        this.b.remove(j);
        break;
      }
    }
    if ((isSelected) && (i == 0)) {
      zf.a(this.b, Integer.valueOf(itemIndex));
    }
  }
  
  public boolean isSelected(int itemIndex)
  {
    if ((this.b == null) || (this.b.size() == 0)) {
      return false;
    }
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      if ((i & 0xFFFF) == itemIndex) {
        return true;
      }
    }
    return false;
  }
  
  public Cell[] getSelectedCells()
  {
    if ((this.w == null) || (this.b == null) || (this.b.size() == 0)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    Range localRange = d(this.w);
    if (localRange != null)
    {
      localObject = this.b.iterator();
      while (((Iterator)localObject).hasNext())
      {
        i = ((Integer)((Iterator)localObject).next()).intValue();
        zf.a(localArrayList, localRange.get(i & 0xFFFF, 0));
      }
    }
    Object localObject = new Cell[localArrayList.size()];
    for (int i = 0; i < localObject.length; i++) {
      localObject[i] = ((Cell)localArrayList.get(i));
    }
    return (Cell[])localObject;
  }
  
  ArrayList a()
  {
    return this.b;
  }
  
  void a(ArrayList paramArrayList)
  {
    this.b = paramArrayList;
  }
  
  public boolean getShadow()
  {
    return this.B;
  }
  
  public void setShadow(boolean value)
  {
    this.B = value;
  }
  
  public int getSelectionType()
  {
    return this.c;
  }
  
  public void setSelectionType(int value)
  {
    this.c = value;
  }
  
  int b()
  {
    return this.d;
  }
  
  void b(int paramInt)
  {
    this.d = paramInt;
  }
  
  int c()
  {
    return this.e;
  }
  
  void c(int paramInt)
  {
    this.e = paramInt;
  }
  
  int d()
  {
    return this.f;
  }
  
  void d(int paramInt)
  {
    this.f = paramInt;
  }
  
  int e()
  {
    return this.C;
  }
  
  void e(int paramInt)
  {
    this.C = paramInt;
  }
  
  public int getPageChange()
  {
    return this.D;
  }
  
  public void setPageChange(int value)
  {
    this.D = value;
  }
  
  void a(ListBox paramListBox, CopyOptions paramCopyOptions)
  {
    super.a(paramListBox, paramCopyOptions);
    this.d = paramListBox.d;
    this.e = paramListBox.e;
    this.f = paramListBox.f;
    this.C = paramListBox.C;
    this.D = paramListBox.D;
    this.c = paramListBox.c;
    this.B = paramListBox.B;
    this.w = zaam.a(paramListBox.w, 0, 0, 0, paramCopyOptions);
    if (paramListBox.b != null)
    {
      this.b = new ArrayList();
      Iterator localIterator = paramListBox.b.iterator();
      while (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        zf.a(this.b, Integer.valueOf(i));
      }
    }
    else
    {
      this.b = null;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ListBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */