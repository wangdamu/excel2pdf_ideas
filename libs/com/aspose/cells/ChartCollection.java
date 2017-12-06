package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ChartCollection
  extends CollectionBase
{
  private Worksheet a;
  
  ChartCollection(Worksheet sheet)
  {
    this.a = sheet;
  }
  
  Worksheet a()
  {
    return this.a;
  }
  
  public int addFloatingChart(int type, int left, int top, int width, int height)
  {
    Chart localChart = new Chart(this.a, type);
    zf.a(this.InnerList, localChart);
    this.a.getShapes().c(localChart.getChartObject());
    if (this.a.getType() == 2) {
      localChart.getChartObject().a(0, false, 0, 0, 900, 600);
    } else {
      localChart.getChartObject().a(0, false, left, top, width, height);
    }
    return getCount() - 1;
  }
  
  public int add(int type, int upperLeftRow, int upperLeftColumn, int lowerRightRow, int lowerRightColumn)
  {
    Chart localChart = new Chart(this.a, type);
    zf.a(this.InnerList, localChart);
    this.a.getShapes().c(localChart.getChartObject());
    if (this.a.getType() == 2) {
      localChart.getChartObject().a(0, false, 0, 0, 900, 600);
    } else {
      localChart.getChartObject().moveToRange(upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn);
    }
    return getCount() - 1;
  }
  
  int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    Chart localChart = new Chart(this.a, paramInt1);
    zf.a(this.InnerList, localChart);
    this.a.getShapes().c(localChart.getChartObject());
    if (this.a.getType() == 2) {
      localChart.getChartObject().a(0, false, 0, 0, 900, 600);
    } else {
      localChart.getChartObject().a(paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
    }
    return getCount() - 1;
  }
  
  public Chart get(int index)
  {
    return (Chart)this.InnerList.get(index);
  }
  
  public Chart get(String name)
  {
    for (int i = 0; i < getCount(); i++)
    {
      Chart localChart = get(i);
      String str = localChart.getName();
      if ((str != null) && (zw.b(str, name))) {
        return localChart;
      }
    }
    return null;
  }
  
  void b()
  {
    Iterator localIterator1 = iterator();
    while (localIterator1.hasNext())
    {
      Chart localChart = (Chart)localIterator1.next();
      Iterator localIterator2 = localChart.getNSeries().iterator();
      while (localIterator2.hasNext())
      {
        Series localSeries = (Series)localIterator2.next();
        if ((localSeries.m() != null) && (localSeries.m().c != null)) {
          localSeries.m().v();
        }
        if ((localSeries.o() != null) && (localSeries.o().c != null)) {
          localSeries.o().v();
        }
        if ((localSeries.p() != null) && (localSeries.p().c != null)) {
          localSeries.p().v();
        }
      }
    }
  }
  
  void a(int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    byte[] arrayOfByte = null;
    Iterator localIterator1 = iterator();
    while (localIterator1.hasNext())
    {
      Chart localChart = (Chart)localIterator1.next();
      Iterator localIterator2 = localChart.getNSeries().iterator();
      while (localIterator2.hasNext())
      {
        Series localSeries = (Series)localIterator2.next();
        Object localObject = localSeries.l();
        if ((localObject != null) && ((localObject instanceof byte[])))
        {
          arrayOfByte = (byte[])localObject;
          zaaq.a(paramWorksheet, paramBoolean, paramInt1, paramInt2, 0, 0, -1, -1, arrayOfByte);
        }
        if ((localSeries.m() != null) && (localSeries.m().c != null))
        {
          arrayOfByte = localSeries.m().c;
          zaaq.a(paramWorksheet, paramBoolean, paramInt1, paramInt2, 0, 0, -1, -1, arrayOfByte);
          if ((localSeries.m().b != null) && (localSeries.m().k())) {
            localSeries.m().b = null;
          }
        }
        if ((localSeries.o() != null) && (localSeries.o().c != null))
        {
          arrayOfByte = localSeries.o().c;
          zaaq.a(paramWorksheet, paramBoolean, paramInt1, paramInt2, 0, 0, -1, -1, arrayOfByte);
          if ((localSeries.o().b != null) && (localSeries.o().k())) {
            localSeries.o().b = null;
          }
        }
        if ((localSeries.p() != null) && (localSeries.p().c != null))
        {
          arrayOfByte = localSeries.p().c;
          zaaq.a(paramWorksheet, paramBoolean, paramInt1, paramInt2, 0, 0, -1, -1, arrayOfByte);
        }
      }
    }
  }
  
  void a(ChartCollection paramChartCollection, int paramInt1, int paramInt2, int paramInt3) {}
  
  void b(int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    byte[] arrayOfByte = null;
    Iterator localIterator1 = iterator();
    while (localIterator1.hasNext())
    {
      Chart localChart = (Chart)localIterator1.next();
      Iterator localIterator2 = localChart.getNSeries().iterator();
      while (localIterator2.hasNext())
      {
        Series localSeries = (Series)localIterator2.next();
        Object localObject = localSeries.l();
        if ((localObject != null) && ((localObject instanceof byte[])))
        {
          arrayOfByte = (byte[])localObject;
          zaaq.b(paramWorksheet, paramBoolean, paramInt1, paramInt2, 0, 0, -1, -1, arrayOfByte);
        }
        if ((localSeries.m() != null) && (localSeries.m().c != null))
        {
          arrayOfByte = localSeries.m().c;
          zaaq.b(paramWorksheet, paramBoolean, paramInt1, paramInt2, 0, 0, -1, -1, arrayOfByte);
        }
        if ((localSeries.o() != null) && (localSeries.o().c != null))
        {
          arrayOfByte = localSeries.o().c;
          zaaq.b(paramWorksheet, paramBoolean, paramInt1, paramInt2, 0, 0, -1, -1, arrayOfByte);
        }
        if ((localSeries.p() != null) && (localSeries.p().c != null))
        {
          arrayOfByte = localSeries.p().c;
          zaaq.b(paramWorksheet, paramBoolean, paramInt1, paramInt2, 0, 0, -1, -1, arrayOfByte);
        }
      }
    }
  }
  
  void a(CellArea paramCellArea, int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean)
  {
    byte[] arrayOfByte = null;
    Iterator localIterator1 = iterator();
    while (localIterator1.hasNext())
    {
      Chart localChart = (Chart)localIterator1.next();
      Iterator localIterator2 = localChart.getNSeries().iterator();
      while (localIterator2.hasNext())
      {
        Series localSeries = (Series)localIterator2.next();
        Object localObject = localSeries.l();
        if ((localObject != null) && ((localObject instanceof byte[])))
        {
          arrayOfByte = (byte[])localObject;
          zaaq.a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, arrayOfByte, -1, -1, 0, 0, 0, 0);
        }
        zjk localzjk = localSeries.m();
        if ((localzjk != null) && (localzjk.c != null))
        {
          arrayOfByte = localzjk.c;
          zaaq.a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, arrayOfByte, -1, -1, 0, 0, 0, 0);
          if (!localzjk.k())
          {
            localzjk.b = new ArrayList();
            zf.a(localzjk.b, znq.h);
          }
        }
        if ((localSeries.o() != null) && (localSeries.o().c != null))
        {
          arrayOfByte = localSeries.o().c;
          zaaq.a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, arrayOfByte, -1, -1, 0, 0, 0, 0);
        }
        if ((localSeries.p() != null) && (localSeries.p().c != null))
        {
          arrayOfByte = localSeries.p().c;
          zaaq.a(paramCellArea, paramInt1, paramInt2, paramWorksheet, paramBoolean, arrayOfByte, -1, -1, 0, 0, 0, 0);
        }
      }
    }
  }
  
  void a(HashMap paramHashMap)
  {
    byte[] arrayOfByte = null;
    Iterator localIterator1 = iterator();
    while (localIterator1.hasNext())
    {
      Chart localChart = (Chart)localIterator1.next();
      Iterator localIterator2 = localChart.getNSeries().iterator();
      while (localIterator2.hasNext())
      {
        Series localSeries = (Series)localIterator2.next();
        Object localObject = localSeries.l();
        if ((localObject != null) && ((localObject instanceof byte[])))
        {
          arrayOfByte = (byte[])localObject;
          zaaq.b(arrayOfByte, -1, -1, paramHashMap, this.a.c());
        }
        if ((localSeries.m() != null) && (localSeries.m().c != null))
        {
          arrayOfByte = localSeries.m().c;
          zaaq.b(arrayOfByte, -1, -1, paramHashMap, this.a.c());
        }
        if ((localSeries.o() != null) && (localSeries.o().c != null))
        {
          arrayOfByte = localSeries.o().c;
          zaaq.b(arrayOfByte, -1, -1, paramHashMap, this.a.c());
        }
        if ((localSeries.p() != null) && (localSeries.p().c != null))
        {
          arrayOfByte = localSeries.p().c;
          zaaq.b(arrayOfByte, -1, -1, paramHashMap, this.a.c());
        }
      }
    }
  }
  
  boolean a(int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(paramInt), znq.e);
    b(localHashMap);
    return ((Boolean)localHashMap.get(Integer.valueOf(paramInt))).booleanValue();
  }
  
  void b(HashMap paramHashMap)
  {
    byte[] arrayOfByte = null;
    Iterator localIterator1 = iterator();
    while (localIterator1.hasNext())
    {
      Chart localChart = (Chart)localIterator1.next();
      Iterator localIterator2 = localChart.getNSeries().iterator();
      while (localIterator2.hasNext())
      {
        Series localSeries = (Series)localIterator2.next();
        Object localObject = localSeries.l();
        if ((localObject != null) && ((localObject instanceof byte[])))
        {
          arrayOfByte = (byte[])localObject;
          zaaq.a(arrayOfByte, -1, -1, paramHashMap, this.a.c());
        }
        if ((localSeries.m() != null) && (localSeries.m().c != null))
        {
          arrayOfByte = localSeries.m().c;
          zaaq.a(arrayOfByte, -1, -1, paramHashMap, this.a.c());
        }
        if ((localSeries.o() != null) && (localSeries.o().c != null))
        {
          arrayOfByte = localSeries.o().c;
          zaaq.a(arrayOfByte, -1, -1, paramHashMap, this.a.c());
        }
        if ((localSeries.p() != null) && (localSeries.p().c != null))
        {
          arrayOfByte = localSeries.p().c;
          zaaq.a(arrayOfByte, -1, -1, paramHashMap, this.a.c());
        }
      }
    }
  }
  
  void a(Chart paramChart)
  {
    zf.a(this.InnerList, paramChart);
  }
  
  public void remove(Chart chart)
  {
    this.InnerList.remove(chart);
  }
  
  public void removeAt(int index)
  {
    Chart localChart = get(index);
    if (this.a.getType() == 1) {
      this.a.getShapes().b(localChart.getChartObject());
    } else {
      this.InnerList.remove(index);
    }
  }
  
  void c()
  {
    this.InnerList.clear();
  }
  
  public void clear()
  {
    if (getCount() > 0)
    {
      this.InnerList.clear();
      for (int i = 0; i < this.a.getShapes().getCount(); i++)
      {
        Shape localShape = this.a.getShapes().get(i);
        if (localShape.getMsoDrawingType() == 5)
        {
          this.a.getShapes().a(localShape);
          i--;
        }
      }
    }
  }
  
  static boolean b(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    case 4: 
    case 5: 
    case 9: 
    case 10: 
    case 11: 
    case 13: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 43: 
    case 45: 
    case 48: 
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
    case 69: 
    case 70: 
    case 71: 
    case 72: 
      return true;
    }
    return false;
  }
  
  static boolean a(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return true;
    }
    switch (paramInt1)
    {
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
      switch (paramInt2)
      {
      case 14: 
      case 15: 
      case 16: 
      case 17: 
      case 18: 
      case 19: 
      case 20: 
        return true;
      }
      return false;
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
      switch (paramInt2)
      {
      case 37: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      case 43: 
        return true;
      }
      return false;
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      switch (paramInt2)
      {
      case 0: 
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 5: 
        return true;
      }
      return false;
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      switch (paramInt2)
      {
      case 60: 
      case 61: 
      case 62: 
      case 63: 
      case 64: 
        return true;
      }
      return false;
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
      switch (paramInt2)
      {
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
      case 11: 
        return true;
      }
      return false;
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
      switch (paramInt2)
      {
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 48: 
      case 49: 
        return true;
      }
      return false;
    case 35: 
    case 36: 
      switch (paramInt2)
      {
      case 35: 
      case 36: 
        return true;
      }
      return false;
    case 57: 
    case 58: 
    case 59: 
      switch (paramInt2)
      {
      case 57: 
      case 58: 
      case 59: 
        return true;
      }
      return false;
    case 69: 
    case 70: 
    case 71: 
    case 72: 
      switch (paramInt2)
      {
      case 69: 
      case 70: 
      case 71: 
      case 72: 
        return true;
      }
      return false;
    case 12: 
    case 13: 
      switch (paramInt2)
      {
      case 12: 
      case 13: 
        return true;
      }
      return false;
    case 65: 
    case 66: 
    case 67: 
    case 68: 
      switch (paramInt2)
      {
      case 65: 
      case 66: 
      case 67: 
      case 68: 
        return true;
      }
      return false;
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
      switch (paramInt2)
      {
      case 21: 
      case 22: 
      case 23: 
      case 24: 
      case 25: 
      case 26: 
      case 27: 
        return true;
      }
      return false;
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
      switch (paramInt2)
      {
      case 28: 
      case 29: 
      case 30: 
      case 31: 
      case 32: 
      case 33: 
      case 34: 
        return true;
      }
      return false;
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
      switch (paramInt2)
      {
      case 50: 
      case 51: 
      case 52: 
      case 53: 
      case 54: 
      case 55: 
      case 56: 
        return true;
      }
      return false;
    }
    return false;
  }
  
  static boolean b(int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return true;
    }
    if ((b(paramInt1)) || (b(paramInt1))) {
      throw new IllegalArgumentException("You could not combin 2-D and 3-D chart types");
    }
    switch (paramInt1)
    {
    case 0: 
    case 1: 
    case 2: 
    case 14: 
    case 15: 
    case 16: 
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      switch (paramInt2)
      {
      case 0: 
      case 1: 
      case 2: 
      case 14: 
      case 15: 
      case 16: 
      case 37: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      case 60: 
      case 61: 
      case 62: 
      case 63: 
      case 64: 
        return true;
      }
      return false;
    case 6: 
    case 7: 
    case 8: 
      switch (paramInt2)
      {
      case 6: 
      case 7: 
      case 8: 
        return true;
      }
      return false;
    case 44: 
    case 46: 
    case 49: 
      switch (paramInt2)
      {
      case 44: 
      case 46: 
      case 49: 
        return true;
      }
      return false;
    case 57: 
    case 58: 
      switch (paramInt2)
      {
      case 57: 
      case 58: 
        return true;
      }
      return false;
    case 59: 
      switch (paramInt2)
      {
      case 59: 
        return true;
      }
      return false;
    case 35: 
    case 36: 
      switch (paramInt2)
      {
      case 35: 
      case 36: 
        return true;
      }
      return false;
    }
    return false;
  }
  
  static boolean c(int paramInt)
  {
    switch (paramInt)
    {
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
    case 76: 
    case 77: 
      return true;
    }
    return false;
  }
  
  static boolean d(int paramInt)
  {
    switch (paramInt)
    {
    case 35: 
    case 36: 
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
      return false;
    }
    return true;
  }
  
  static boolean e(int paramInt)
  {
    switch (paramInt)
    {
    case 69: 
    case 70: 
    case 71: 
    case 72: 
      return true;
    }
    return false;
  }
  
  static boolean f(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
    case 17: 
    case 27: 
    case 34: 
    case 43: 
    case 56: 
    case 69: 
    case 70: 
    case 71: 
    case 72: 
      return true;
    }
    return false;
  }
  
  static boolean g(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 73: 
    case 74: 
    case 75: 
    case 78: 
      return true;
    }
    return false;
  }
  
  static boolean h(int paramInt)
  {
    switch (paramInt)
    {
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
      return true;
    }
    return false;
  }
  
  static boolean i(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
    case 4: 
    case 7: 
    case 10: 
    case 15: 
    case 19: 
    case 22: 
    case 25: 
    case 29: 
    case 32: 
    case 38: 
    case 41: 
    case 51: 
    case 54: 
      return true;
    }
    return false;
  }
  
  static boolean j(int paramInt)
  {
    switch (paramInt)
    {
    case 9: 
    case 10: 
    case 11: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
      return true;
    }
    return false;
  }
  
  static boolean k(int paramInt)
  {
    switch (paramInt)
    {
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      return true;
    }
    return false;
  }
  
  static boolean l(int paramInt)
  {
    switch (paramInt)
    {
    case 12: 
    case 13: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      return true;
    }
    return false;
  }
  
  static boolean m(int paramInt)
  {
    switch (paramInt)
    {
    case 35: 
    case 36: 
      return true;
    }
    return false;
  }
  
  static boolean n(int paramInt)
  {
    switch (paramInt)
    {
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
      return true;
    }
    return false;
  }
  
  static boolean o(int paramInt)
  {
    switch (paramInt)
    {
    case 57: 
    case 58: 
    case 59: 
      return true;
    }
    return false;
  }
  
  static boolean p(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      return true;
    }
    return false;
  }
  
  static boolean q(int paramInt)
  {
    switch (paramInt)
    {
    case 12: 
    case 13: 
      return true;
    }
    return false;
  }
  
  static boolean r(int paramInt)
  {
    switch (paramInt)
    {
    case 65: 
    case 66: 
    case 67: 
    case 68: 
      return true;
    }
    return false;
  }
  
  static boolean s(int paramInt)
  {
    switch (paramInt)
    {
    case 37: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
      return true;
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ChartCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */