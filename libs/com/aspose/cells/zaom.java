package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class zaom
  extends zcd
{
  private short c;
  private ArrayList d;
  private WorksheetCollection e;
  private zse f;
  private int g;
  private byte[] h;
  private int i;
  ArrayList a;
  
  zaom(WorksheetCollection paramWorksheetCollection, int paramInt)
  {
    c(235);
    this.e = paramWorksheetCollection;
    this.c = ((short)(8224 - paramInt));
  }
  
  ArrayList a()
  {
    return this.d;
  }
  
  void a(zse paramzse)
  {
    this.f = paramzse;
    int j = (int)(paramzse.h() & 0xFFFFFFFF);
    this.g = (j + 8);
    this.i = 0;
    if (j + 8 > this.c)
    {
      a(this.c);
      this.d = new ArrayList();
      this.g -= d();
    }
    else
    {
      a((short)(j + 8));
      this.g = 0;
    }
    this.b = new byte[d()];
    this.h = this.b;
    this.h[this.i] = 15;
    this.h[(this.i + 2)] = 0;
    this.h[(this.i + 3)] = -16;
    System.arraycopy(zc.a(j), 0, this.h, this.i + 4, 4);
    this.i += 8;
    a(paramzse.d());
    b();
    ArrayList localArrayList = this.f.f();
    Object localObject;
    if ((localArrayList == null) || (localArrayList.size() == 0))
    {
      localObject = new byte[] { 51, 0, 11, -16, 18, 0, 0, 0, -65, 0, 8, 0, 8, 0, -127, 1, 9, 0, 0, 8, -64, 1, 64, 0, 0, 8, 64, 0, 30, -15, 16, 0, 0, 0, 13, 0, 0, 8, 12, 0, 0, 8, 23, 0, 0, 8, -9, 0, 0, 16 };
      b((byte[])localObject);
    }
    else
    {
      localObject = localArrayList.iterator();
      while (((Iterator)localObject).hasNext())
      {
        byte[] arrayOfByte = (byte[])((Iterator)localObject).next();
        b(arrayOfByte);
      }
    }
    this.h = null;
  }
  
  void b()
  {
    zeu localzeu = this.f.c();
    if ((localzeu == null) || (localzeu.getCount() == 0)) {
      return;
    }
    byte[] arrayOfByte = new byte[8];
    int j = 15;
    j |= localzeu.getCount() << 4;
    System.arraycopy(zc.a(j), 0, arrayOfByte, 0, 2);
    arrayOfByte[2] = 1;
    arrayOfByte[3] = -16;
    System.arraycopy(zc.a(localzeu.a()), 0, arrayOfByte, 4, 4);
    b(arrayOfByte);
    Iterator localIterator = localzeu.iterator();
    while (localIterator.hasNext())
    {
      zcf localzcf = (zcf)localIterator.next();
      arrayOfByte = new byte[localzcf.d() + 8];
      localzcf.c(arrayOfByte);
      b(arrayOfByte);
      if (localzcf.f().e() != null) {
        b(localzcf.f().e());
      }
    }
  }
  
  void b(byte[] paramArrayOfByte)
  {
    int j = 0;
    int k = 0;
    int m = 0;
    for (;;)
    {
      k = paramArrayOfByte.length - j;
      if (k > this.h.length - this.i)
      {
        k = this.h.length - this.i;
        m = 1;
      }
      else
      {
        m = 0;
      }
      System.arraycopy(paramArrayOfByte, j, this.h, this.i, k);
      j += k;
      if (m == 0) {
        break;
      }
      this.i = this.h.length;
      c();
    }
    this.i += k;
    if (this.i == this.h.length) {
      c();
    }
  }
  
  void a(zsd paramzsd)
  {
    this.h[(this.i + 2)] = 6;
    this.h[(this.i + 3)] = -16;
    System.arraycopy(zc.a(paramzsd.a()), 0, this.h, this.i + 4, 4);
    this.i += 8;
    System.arraycopy(zc.a(paramzsd.b().a), 0, this.h, this.i, 4);
    this.i += 4;
    System.arraycopy(zc.a(paramzsd.c().size() + 1), 0, this.h, this.i, 4);
    this.i += 4;
    System.arraycopy(zc.a(paramzsd.b().b), 0, this.h, this.i, 4);
    this.i += 4;
    System.arraycopy(zc.a(paramzsd.b().c), 0, this.h, this.i, 4);
    this.i += 4;
    Iterator localIterator = paramzsd.c().iterator();
    while (localIterator.hasNext())
    {
      zwy localzwy = (zwy)localIterator.next();
      System.arraycopy(zc.a(localzwy.a), 0, this.h, this.i, 4);
      System.arraycopy(zc.a(localzwy.b), 0, this.h, this.i + 4, 4);
      this.i += 8;
      if ((this.i == this.h.length) || (this.i + 8 > this.h.length)) {
        c();
      }
    }
  }
  
  void c()
  {
    if (this.i < this.h.length) {
      this.g += this.h.length - this.i;
    }
    if (this.a == null) {
      this.a = new ArrayList();
    }
    zf.a(this.a, Integer.valueOf(this.i));
    if (this.g == 0) {
      return;
    }
    if (this.g <= this.c)
    {
      this.h = new byte[this.g];
      this.g = 0;
    }
    else
    {
      this.h = new byte[this.c];
      this.g -= this.c;
    }
    zf.a(this.d, this.h);
    this.i = 0;
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    int j = this.a == null ? d() : ((Integer)this.a.get(0)).intValue();
    paramzrg.a(f());
    paramzrg.a((short)j);
    paramzrg.a(this.b);
    if (this.d != null) {
      for (int k = 0; k < this.d.size(); k++)
      {
        byte[] arrayOfByte = (byte[])this.d.get(k);
        if (k + 1 < this.a.size()) {
          j = ((Integer)this.a.get(k + 1)).intValue();
        } else {
          j = arrayOfByte.length;
        }
        paramzrg.c(60);
        paramzrg.a((short)arrayOfByte.length);
        paramzrg.a(arrayOfByte);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaom.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */