package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

class zbtt
{
  short a;
  String b;
  String c;
  String d;
  short e;
  int f;
  int g;
  String h;
  String i;
  String j;
  PivotTable k;
  ArrayList l;
  
  zbtt(PivotTable paramPivotTable)
  {
    this.k = paramPivotTable;
    this.f = 512;
    this.g = 79;
    this.a = 0;
    this.e = 0;
  }
  
  void a(zbtt paramzbtt)
  {
    this.a = paramzbtt.a;
    this.b = paramzbtt.b;
    this.c = paramzbtt.c;
    this.d = paramzbtt.d;
    this.e = paramzbtt.e;
    this.f = paramzbtt.f;
    this.g = paramzbtt.g;
    this.h = paramzbtt.h;
    this.i = paramzbtt.i;
    this.j = paramzbtt.j;
    if ((paramzbtt.l != null) && (paramzbtt.l.size() > 0))
    {
      this.l = new ArrayList();
      Iterator localIterator = paramzbtt.l.iterator();
      while (localIterator.hasNext())
      {
        byte[] arrayOfByte1 = (byte[])localIterator.next();
        byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte2.length);
        zf.a(this.l, arrayOfByte2);
      }
    }
  }
  
  void a(boolean paramBoolean, int paramInt)
  {
    this.g &= (paramInt ^ 0xFFFFFFFF);
    this.g |= (paramBoolean ? paramInt : 0);
  }
  
  boolean a(int paramInt)
  {
    return (this.g & 0xFFFF & paramInt) != 0;
  }
  
  void b(boolean paramBoolean, int paramInt)
  {
    this.f &= (paramInt ^ 0xFFFFFFFF);
    this.f |= (paramBoolean ? paramInt : 0);
  }
  
  boolean b(int paramInt)
  {
    return (this.f & 0xFFFF | paramInt) != 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbtt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */