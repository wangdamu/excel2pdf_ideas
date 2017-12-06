package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

public class SparklineGroupCollection
  extends CollectionBase
{
  private Worksheet a;
  
  SparklineGroupCollection(Worksheet sheet)
  {
    this.a = sheet;
  }
  
  Worksheet a()
  {
    return this.a;
  }
  
  public SparklineGroup get(int index)
  {
    return (SparklineGroup)this.InnerList.get(index);
  }
  
  public int add(int type, String dataRange, boolean isVertical, CellArea locationRange)
  {
    clearSparklines(locationRange);
    SparklineGroup localSparklineGroup = new SparklineGroup(this, type, dataRange, isVertical, locationRange);
    zf.a(this.InnerList, localSparklineGroup);
    return getCount() - 1;
  }
  
  int a(SparklineGroup paramSparklineGroup)
  {
    zf.a(this.InnerList, paramSparklineGroup);
    return getCount() - 1;
  }
  
  void b()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = iterator();
    SparklineGroup localSparklineGroup;
    while (localIterator.hasNext())
    {
      localSparklineGroup = (SparklineGroup)localIterator.next();
      SparklineCollection localSparklineCollection = localSparklineGroup.getSparklineCollection();
      if (localSparklineCollection.getCount() == 0) {
        zf.a(localArrayList, localSparklineGroup);
      }
    }
    localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      localSparklineGroup = (SparklineGroup)localIterator.next();
      this.InnerList.remove(localSparklineGroup);
    }
  }
  
  public void clearSparklines(CellArea cellArea)
  {
    ArrayList localArrayList1 = new ArrayList();
    Iterator localIterator1 = iterator();
    SparklineGroup localSparklineGroup;
    while (localIterator1.hasNext())
    {
      localSparklineGroup = (SparklineGroup)localIterator1.next();
      SparklineCollection localSparklineCollection = localSparklineGroup.getSparklineCollection();
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator2 = localSparklineCollection.iterator();
      Sparkline localSparkline;
      while (localIterator2.hasNext())
      {
        localSparkline = (Sparkline)localIterator2.next();
        if (localSparkline.a(cellArea)) {
          zf.a(localArrayList2, localSparkline);
        }
      }
      localIterator2 = localArrayList2.iterator();
      while (localIterator2.hasNext())
      {
        localSparkline = (Sparkline)localIterator2.next();
        localSparklineCollection.remove(localSparkline);
      }
      if (localSparklineCollection.getCount() == 0) {
        zf.a(localArrayList1, localSparklineGroup);
      }
    }
    localIterator1 = localArrayList1.iterator();
    while (localIterator1.hasNext())
    {
      localSparklineGroup = (SparklineGroup)localIterator1.next();
      this.InnerList.remove(localSparklineGroup);
    }
  }
  
  public void clearSparklineGroups(CellArea cellArea)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = iterator();
    SparklineGroup localSparklineGroup;
    while (localIterator1.hasNext())
    {
      localSparklineGroup = (SparklineGroup)localIterator1.next();
      SparklineCollection localSparklineCollection = localSparklineGroup.getSparklineCollection();
      Iterator localIterator2 = localSparklineCollection.iterator();
      while (localIterator2.hasNext())
      {
        Sparkline localSparkline = (Sparkline)localIterator2.next();
        if (localSparkline.a(cellArea))
        {
          zf.a(localArrayList, localSparklineGroup);
          break;
        }
      }
    }
    localIterator1 = localArrayList.iterator();
    while (localIterator1.hasNext())
    {
      localSparklineGroup = (SparklineGroup)localIterator1.next();
      this.InnerList.remove(localSparklineGroup);
    }
  }
  
  void c()
  {
    for (int i = 0; i < getCount(); i++)
    {
      SparklineGroup localSparklineGroup = get(i);
      if (localSparklineGroup.b != null) {
        localSparklineGroup.b = zcv.a(localSparklineGroup.b, -1, 0, 0, false, null);
      }
      Iterator localIterator = localSparklineGroup.getSparklineCollection().iterator();
      while (localIterator.hasNext())
      {
        Sparkline localSparkline = (Sparkline)localIterator.next();
        if (localSparkline.a != null) {
          localSparkline.a = zcv.a(localSparkline.a, -1, 0, 0, false, null);
        }
      }
    }
  }
  
  void a(zcw paramzcw)
  {
    for (int i = 0; i < getCount(); i++)
    {
      SparklineGroup localSparklineGroup = get(i);
      if (localSparklineGroup.b != null) {
        localSparklineGroup.b = paramzcw.a(localSparklineGroup.b, -1);
      }
      Iterator localIterator = localSparklineGroup.getSparklineCollection().iterator();
      while (localIterator.hasNext())
      {
        Sparkline localSparkline = (Sparkline)localIterator.next();
        if (localSparkline.a != null) {
          localSparkline.a = paramzcw.a(localSparkline.a, -1);
        }
      }
    }
  }
  
  void a(Cells paramCells, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    for (int i = 0; i < this.InnerList.size(); i++) {
      if (get(i).a(paramCells, paramInt1, paramInt2, paramBoolean) == 0) {
        this.InnerList.remove(get(i));
      }
    }
  }
  
  void b(Cells paramCells, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    for (int i = 0; i < this.InnerList.size(); i++) {
      if (get(i).b(paramCells, paramInt1, paramInt2, paramBoolean) == 0) {
        this.InnerList.remove(get(i));
      }
    }
  }
  
  void a(SparklineGroupCollection paramSparklineGroupCollection, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions)
  {
    int i = paramSparklineGroupCollection.getCount();
    for (int j = 0; j < i; j++)
    {
      SparklineGroup localSparklineGroup1 = paramSparklineGroupCollection.get(j);
      int k = 0;
      for (int m = 0; m < localSparklineGroup1.getSparklineCollection().getCount(); m++)
      {
        Sparkline localSparkline = localSparklineGroup1.getSparklineCollection().get(m);
        int n = paramBoolean ? localSparkline.getRow() : localSparkline.getColumn();
        if ((n >= paramInt1) && (n <= paramInt1 + paramInt3 - 1))
        {
          k = 1;
          break;
        }
      }
      if (k != 0)
      {
        SparklineGroup localSparklineGroup2 = new SparklineGroup(this);
        a(localSparklineGroup2);
        localSparklineGroup2.a(localSparklineGroup1, paramBoolean, paramInt1, paramInt2, paramInt3, paramCopyOptions);
      }
    }
  }
  
  void a(SparklineGroupCollection paramSparklineGroupCollection, CopyOptions paramCopyOptions)
  {
    for (int i = 0; i < paramSparklineGroupCollection.getCount(); i++)
    {
      SparklineGroup localSparklineGroup1 = paramSparklineGroupCollection.get(i);
      SparklineGroup localSparklineGroup2 = new SparklineGroup(this);
      a(localSparklineGroup2);
      localSparklineGroup2.b(localSparklineGroup1, paramCopyOptions);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SparklineGroupCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */