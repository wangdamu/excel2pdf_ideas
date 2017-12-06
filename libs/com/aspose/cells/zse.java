package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

class zse
{
  private WorksheetCollection a;
  private zeu b;
  private zsd c;
  private ArrayList d;
  private int e;
  
  zse(WorksheetCollection paramWorksheetCollection, int paramInt)
  {
    this.a = paramWorksheetCollection;
    this.c = new zsd(this);
    this.e = paramInt;
  }
  
  void a(zse paramzse)
  {
    if (paramzse.d != null)
    {
      this.d = new ArrayList();
      Iterator localIterator = paramzse.d.iterator();
      while (localIterator.hasNext())
      {
        byte[] arrayOfByte1 = (byte[])localIterator.next();
        byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
        zf.a(this.d, arrayOfByte2);
      }
    }
    else
    {
      this.d = null;
    }
    if (paramzse.b != null)
    {
      this.b = new zeu(this);
      this.b.a(paramzse.b);
    }
    else
    {
      this.b = null;
    }
  }
  
  int a()
  {
    return this.e;
  }
  
  zeu b()
  {
    if (this.b == null) {
      this.b = new zeu(this);
    }
    return this.b;
  }
  
  zeu c()
  {
    return this.b;
  }
  
  zsd d()
  {
    return this.c;
  }
  
  zsc a(ShapeCollection paramShapeCollection, zse paramzse)
  {
    return d().a(paramShapeCollection, paramzse);
  }
  
  ArrayList e()
  {
    if (this.d == null) {
      this.d = new ArrayList();
    }
    return this.d;
  }
  
  ArrayList f()
  {
    return this.d;
  }
  
  int g()
  {
    int i = 8 + d().a();
    if ((this.d == null) || (this.d.size() == 0))
    {
      i += 50;
    }
    else
    {
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
      {
        byte[] arrayOfByte = (byte[])localIterator.next();
        i += arrayOfByte.length;
      }
    }
    return i;
  }
  
  long h()
  {
    long l = g();
    if ((this.b != null) && (this.b.getCount() != 0)) {
      l += (this.b.a() & 0xFFFFFFFF) + 8L;
    }
    return l;
  }
  
  int a(byte[] paramArrayOfByte)
  {
    return zaux.a(this, paramArrayOfByte);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */