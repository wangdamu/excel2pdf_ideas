package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbtu
  extends zcd
{
  private zbtt a = null;
  
  zbtu(zbtt paramzbtt)
  {
    c(241);
    this.a = paramzbtt;
    a();
  }
  
  void a()
  {
    int i = 24;
    i += zct.a(this.a.b);
    i += zct.a(this.a.c);
    i += zct.a(this.a.d);
    i += zct.a(this.a.h);
    i += zct.a(this.a.i);
    i += zct.a(this.a.j);
    a((short)i);
    this.b = new byte[d()];
    b();
  }
  
  private void b()
  {
    int i = 0;
    short s = 0;
    System.arraycopy(zc.a(this.a.a), 0, this.b, i, 2);
    i += 2;
    s = (short)(this.a.b == null ? -1 : this.a.b.length());
    System.arraycopy(zc.a(s), 0, this.b, i, 2);
    s = (short)(this.a.c == null ? -1 : this.a.c.length());
    System.arraycopy(zc.a(s), 0, this.b, i + 2, 2);
    s = (short)(this.a.d == null ? -1 : this.a.d.length());
    System.arraycopy(zc.a(s), 0, this.b, i + 4, 2);
    i += 6;
    System.arraycopy(zc.a(this.a.e), 0, this.b, i, 2);
    PivotFieldCollection localPivotFieldCollection = this.a.k.getPageFields();
    System.arraycopy(zc.a((short)localPivotFieldCollection.getCount()), 0, this.b, i + 2, 2);
    System.arraycopy(zc.a((short)(localPivotFieldCollection.getCount() == 0 ? 0 : 1)), 0, this.b, i + 4, 2);
    i += 6;
    System.arraycopy(zc.a(this.a.f), 0, this.b, i, 2);
    System.arraycopy(zc.a(this.a.g), 0, this.b, i + 2, 2);
    i += 4;
    s = (short)(this.a.h == null ? -1 : this.a.h.length());
    System.arraycopy(zc.a(s), 0, this.b, i, 2);
    s = (short)(this.a.i == null ? -1 : this.a.i.length());
    System.arraycopy(zc.a(s), 0, this.b, i + 2, 2);
    s = (short)(this.a.j == null ? -1 : this.a.j.length());
    System.arraycopy(zc.a(s), 0, this.b, i + 4, 2);
    i += 6;
    if (this.a.b != null) {
      i += zct.b(this.b, i, this.a.b);
    }
    if (this.a.c != null) {
      i += zct.b(this.b, i, this.a.c);
    }
    if (this.a.d != null) {
      i += zct.b(this.b, i, this.a.d);
    }
    if (this.a.h != null) {
      i += zct.b(this.b, i, this.a.h);
    }
    if (this.a.i != null) {
      i += zct.b(this.b, i, this.a.i);
    }
    if (this.a.j != null) {
      i += zct.b(this.b, i, this.a.j);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbtu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */