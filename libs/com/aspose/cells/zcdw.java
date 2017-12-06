package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zcdw
  extends zche
{
  private Workbook a;
  private zbcc b;
  
  zcdw(zbcc paramzbcc, Workbook paramWorkbook)
    throws Exception
  {
    this.a = paramWorkbook;
    this.b = paramzbcc;
    a();
    this.d = 415;
  }
  
  private void a()
    throws Exception
  {
    int i = 37;
    i += 4 + this.b.x.length() * 2;
    if (this.b.d == null) {
      i += 8;
    } else {
      i += this.b.d.length;
    }
    i += a(this.b.j);
    i += a(this.b.l);
    i += a(this.b.n);
    i += a(this.b.y);
    i += a(this.b.h);
    if (this.b.c == null) {
      i += 8;
    } else {
      i += this.b.c.length;
    }
    i += a(this.b.k);
    i += a(this.b.m);
    i += a(this.b.o);
    i += a(this.b.z);
    i += a(this.b.i);
    this.c = new byte[i];
    zbcn localzbcn = new zbcn(this.b);
    int j = localzbcn.a(this.c);
    System.arraycopy(zc.a(this.b.w), 0, this.c, j, 2);
    j += 2;
    int k = 0;
    if (this.b.p) {
      k |= 0x1;
    }
    if (this.b.q) {
      k |= 0x2;
    }
    this.c[j] = ((byte)k);
    j++;
    this.c[j] = 9;
    j += 2;
    k = 0;
    if (this.b.s) {
      k |= 0x2;
    }
    k |= (byte)((this.b.d() & 0xFF) << 2);
    k |= (this.b.f() & 0xFF) << 8;
    int m = 0;
    if (this.b.u) {
      m |= 0x1;
    }
    if ((this.b.j != null) && (!"".equals(this.b.j)))
    {
      m |= 0x2;
      k |= 0x1;
    }
    if ((this.b.l != null) && (!"".equals(this.b.l)))
    {
      m |= 0x4;
      k |= 0x1;
    }
    if ((this.b.n != null) && (!"".equals(this.b.n)))
    {
      m |= 0x8;
      k |= 0x1;
    }
    if ((this.b.y != null) && (!"".equals(this.b.y)))
    {
      m |= 0x10;
      k |= 0x1;
    }
    if ((this.b.h != null) && (!"".equals(this.b.h)))
    {
      m |= 0x20;
      k |= 0x1;
    }
    System.arraycopy(zc.a(k), 0, this.c, j, 2);
    j += 2;
    System.arraycopy(zc.a(m), 0, this.c, j, 2);
    j += 2;
    j += 2;
    k = 0;
    if (this.b.t) {
      k |= 0x2;
    }
    k |= (byte)((this.b.e() & 0xFF) << 2);
    k |= (this.b.g() & 0xFF) << 8;
    m = 0;
    if (this.b.v) {
      m |= 0x1;
    }
    if ((this.b.k != null) && (!"".equals(this.b.k)))
    {
      m |= 0x2;
      k |= 0x1;
    }
    if ((this.b.m != null) && (!"".equals(this.b.m)))
    {
      m |= 0x4;
      k |= 0x1;
    }
    if ((this.b.o != null) && (!"".equals(this.b.o)))
    {
      m |= 0x8;
      k |= 0x1;
    }
    if ((this.b.z != null) && (!"".equals(this.b.z)))
    {
      m |= 0x10;
      k |= 0x1;
    }
    if ((this.b.i != null) && (!"".equals(this.b.i)))
    {
      m |= 0x20;
      k |= 0x1;
    }
    System.arraycopy(zc.a(k), 0, this.c, j, 2);
    j += 2;
    System.arraycopy(zc.a(m), 0, this.c, j, 2);
    j += 2;
    this.c[j] = this.b.d();
    j += 4;
    this.c[j] = this.b.e();
    j += 4;
    zcgj.a(this.c, j, this.b.x);
    j += 4 + this.b.x.length() * 2;
    if (this.b.d != null)
    {
      System.arraycopy(this.b.d, 0, this.c, j, this.b.d.length);
      j += this.b.d.length;
    }
    else
    {
      j += 8;
    }
    zcgj.a(this.c, j, this.b.j);
    j += 4 + (this.b.j == null ? 0 : this.b.j.length() * 2);
    zcgj.a(this.c, j, this.b.l);
    j += 4 + (this.b.l == null ? 0 : this.b.l.length() * 2);
    zcgj.a(this.c, j, this.b.n);
    j += 4 + (this.b.n == null ? 0 : this.b.n.length() * 2);
    zcgj.a(this.c, j, this.b.y);
    j += 4 + (this.b.y == null ? 0 : this.b.y.length() * 2);
    zcgj.a(this.c, j, this.b.h);
    j += 4 + (this.b.h == null ? 0 : this.b.h.length() * 2);
    if (this.b.c != null)
    {
      System.arraycopy(this.b.c, 0, this.c, j, this.b.c.length);
      j += this.b.c.length;
    }
    else
    {
      j += 8;
    }
    zcgj.a(this.c, j, this.b.k);
    j += 4 + (this.b.k == null ? 0 : this.b.k.length() * 2);
    zcgj.a(this.c, j, this.b.m);
    j += 4 + (this.b.m == null ? 0 : this.b.m.length() * 2);
    zcgj.a(this.c, j, this.b.o);
    j += 4 + (this.b.o == null ? 0 : this.b.o.length() * 2);
    zcgj.a(this.c, j, this.b.z);
    j += 4 + (this.b.z == null ? 0 : this.b.z.length() * 2);
    zcgj.a(this.c, j, this.b.i);
    j += 4 + (this.b.i == null ? 0 : this.b.i.length() * 2);
  }
  
  private int a(String paramString)
  {
    return 4 + (paramString == null ? 0 : paramString.length() * 2);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcdw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */