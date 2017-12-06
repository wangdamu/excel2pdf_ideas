package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.HashMap;

class zrr
{
  private DataSorter a;
  private int b = -1;
  private int c = 0;
  private int d = 0;
  private Style e;
  private int f = -1;
  private int g;
  private int h = 0;
  private String i;
  private HashMap j;
  
  zrr(DataSorter paramDataSorter)
  {
    this.a = paramDataSorter;
  }
  
  void a(zrr paramzrr)
  {
    this.b = paramzrr.b;
    this.c = paramzrr.c;
    this.d = paramzrr.d;
    if (paramzrr.e != null)
    {
      this.e = new Style(this.a.a.getWorksheets());
      this.e.copy(paramzrr.e);
    }
    this.g = paramzrr.g;
    this.h = paramzrr.h;
    this.i = paramzrr.i;
  }
  
  DataSorter a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public int d()
  {
    return this.d;
  }
  
  void c(int paramInt)
  {
    this.d = paramInt;
  }
  
  void a(Style paramStyle)
  {
    this.e = paramStyle;
  }
  
  int e()
  {
    return this.f;
  }
  
  void d(int paramInt)
  {
    this.f = paramInt;
  }
  
  public HashMap f()
  {
    if (this.i == null) {
      return null;
    }
    if (this.j == null)
    {
      this.j = new HashMap();
      String[] arrayOfString = zw.d(this.i, ',');
      for (int k = 0; k < arrayOfString.length; k++) {
        this.j.put(arrayOfString[k], Integer.valueOf(k + 1));
      }
    }
    return this.j;
  }
  
  public String g()
  {
    return this.i;
  }
  
  public void a(String paramString)
  {
    this.i = paramString;
    this.d = 0;
  }
  
  void a(String[] paramArrayOfString)
  {
    if (this.j == null) {
      this.j = new HashMap();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (int k = 0; k < paramArrayOfString.length; k++)
    {
      this.j.put(paramArrayOfString[k], Integer.valueOf(k + 1));
      localStringBuilder.append(paramArrayOfString[k]);
      localStringBuilder.append(',');
    }
    this.i = zs.a(localStringBuilder);
  }
  
  void a(int paramInt1, int paramInt2)
  {
    this.d = 3;
    this.g = paramInt1;
    this.h = paramInt2;
  }
  
  public int h()
  {
    return this.g;
  }
  
  public int i()
  {
    return this.h;
  }
  
  public Style j()
  {
    return this.e;
  }
  
  public void b(Style paramStyle)
  {
    this.e = paramStyle;
    this.d = 1;
  }
  
  public Style k()
  {
    return this.e;
  }
  
  public void c(Style paramStyle)
  {
    this.e = paramStyle;
    this.d = 2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zrr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */