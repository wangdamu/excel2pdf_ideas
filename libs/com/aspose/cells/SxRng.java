package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.za;
import java.util.ArrayList;
import java.util.Iterator;

public class SxRng
{
  boolean a;
  boolean b;
  int c;
  ArrayList d;
  byte[] e = new byte[2];
  DateTime f;
  DateTime g;
  double h;
  double i;
  double j = 1.0D;
  int k = -1;
  int l = -1;
  zbtv m;
  ArrayList n;
  
  SxRng(zbtv fdb)
  {
    this.m = fdb;
    this.a = true;
    this.b = true;
  }
  
  void a(SxRng paramSxRng)
  {
    this.a = paramSxRng.a;
    this.b = paramSxRng.b;
    this.c = paramSxRng.c;
    if (null != paramSxRng.e) {
      this.e = ((byte[])za.a(paramSxRng.e));
    }
    this.f = paramSxRng.f;
    this.g = paramSxRng.g;
    this.h = paramSxRng.h;
    this.i = paramSxRng.i;
    this.j = paramSxRng.j;
    this.k = paramSxRng.k;
    this.l = paramSxRng.l;
    if (paramSxRng.d != null)
    {
      int i1 = paramSxRng.d.size();
      this.d = new ArrayList(i1);
      for (int i2 = 0; i2 < i1; i2++)
      {
        zbos localzbos = new zbos();
        localzbos.a((zbos)paramSxRng.d.get(i2));
        zf.a(this.d, localzbos);
      }
    }
    if (paramSxRng.n != null) {
      this.n = ((ArrayList)paramSxRng.n.clone());
    }
  }
  
  public Object isAutoStart()
  {
    return Boolean.valueOf(this.a);
  }
  
  public Object isAutoEnd()
  {
    return Boolean.valueOf(this.b);
  }
  
  public Object getStart()
  {
    if (this.c == 0) {
      return Double.valueOf(this.h);
    }
    return this.f;
  }
  
  public Object getEnd()
  {
    if (this.c == 0) {
      return Double.valueOf(this.i);
    }
    return this.g;
  }
  
  public Object getBy()
  {
    return Double.valueOf(this.j);
  }
  
  public boolean[] getGroupByTypes()
  {
    boolean[] arrayOfBoolean = { false, false, false, false, false, false, false, false };
    if ((this.m != null) && (this.m.a() != null))
    {
      ArrayList localArrayList = this.m.a().i;
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        zbtv localzbtv = (zbtv)localIterator.next();
        if ((localzbtv.n()) && (localzbtv.j.k == this.k))
        {
          int i1 = localzbtv.j.c;
          switch (i1)
          {
          case 0: 
            arrayOfBoolean[0] = true;
            break;
          case 1: 
            arrayOfBoolean[1] = true;
            break;
          case 2: 
            arrayOfBoolean[2] = true;
            break;
          case 3: 
            arrayOfBoolean[3] = true;
            break;
          case 4: 
            arrayOfBoolean[4] = true;
            break;
          case 5: 
            arrayOfBoolean[5] = true;
            break;
          case 6: 
            arrayOfBoolean[6] = true;
            break;
          case 7: 
            arrayOfBoolean[7] = true;
          }
        }
      }
    }
    return arrayOfBoolean;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SxRng.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */