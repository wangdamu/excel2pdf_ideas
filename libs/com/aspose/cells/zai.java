package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class zai
{
  private zh a;
  private int b;
  private ActiveXControl c;
  private ArrayList d;
  private ArrayList e;
  private byte[][] f;
  
  zai(ActiveXControl paramActiveXControl)
  {
    this.c = paramActiveXControl;
  }
  
  byte[] a()
    throws Exception
  {
    if (this.c.getType() == 11)
    {
      localObject = (UnknownControl)this.c;
      return ((UnknownControl)localObject).f;
    }
    this.a = new zh();
    this.d = new ArrayList();
    this.e = new ArrayList();
    this.f = new byte[4][];
    this.f[1] = new byte[1];
    this.f[2] = new byte[2];
    this.f[3] = new byte[3];
    this.a.b(this.c.c, 0, 16);
    switch (this.c.getType())
    {
    case 0: 
    case 7: 
      b();
      break;
    case 8: 
      e();
      break;
    case 5: 
    case 10: 
      f();
      break;
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 6: 
    case 9: 
      c();
      break;
    }
    this.a.b();
    Object localObject = this.a.o();
    return (byte[])localObject;
  }
  
  private void b()
    throws Exception
  {
    zag localzag = this.c.e;
    h();
    a(this.c.d);
    if (this.c.c(3)) {
      a(localzag.b);
    }
    if (this.c.c(4)) {
      a(localzag.c);
    }
    if (this.c.c(14)) {
      a(localzag.a);
    }
    if (this.c.c(16)) {
      a(localzag.n);
    }
    if (this.c.c(12)) {
      a(localzag.l);
    }
    if (this.c.c(8)) {
      j();
    }
    if (this.c.c(5)) {
      a(localzag.g);
    }
    if (this.c.getType() == 7)
    {
      if (this.c.c(2)) {
        a(localzag.e);
      }
      if (this.c.c(1)) {
        a((short)(localzag.d & 0xFF));
      }
      if (this.c.c(7)) {
        a((short)(localzag.f & 0xFF));
      }
    }
    if (this.c.c(9)) {
      a(localzag.j);
    }
    if (this.c.c(0)) {
      a((short)localzag.m);
    }
    if (this.c.c(15)) {
      a(localzag.k);
    }
    m();
    l();
    i();
    k();
    g();
  }
  
  private void c()
    throws Exception
  {
    zapr localzapr = (zapr)this.c.e;
    h();
    int i = this.c.d;
    int j = zapr.b(41);
    int k = 0;
    if ((i & j) != 0)
    {
      i &= (j ^ 0xFFFFFFFF);
      k = 1;
    }
    a(i);
    a(k != 0 ? 1 : 0);
    if (this.c.c(14)) {
      a(localzapr.a);
    }
    if (this.c.c(4)) {
      a(localzapr.c);
    }
    if (this.c.c(3)) {
      a(localzapr.b);
    }
    if (this.c.c(25)) {
      a(localzapr.r);
    }
    if (this.c.c(1)) {
      a(localzapr.d);
    }
    if (this.c.c(26)) {
      a(localzapr.s);
    }
    if (this.c.c(27)) {
      a(localzapr.t);
    }
    if (this.c.c(5)) {
      a(localzapr.g);
    }
    if (this.c.c(8)) {
      j();
    }
    if (this.c.c(28)) {
      a((short)localzapr.u);
    }
    if (this.c.c(29)) {
      a(localzapr.v);
    }
    if (this.c.c(30)) {
      a((short)localzapr.w);
    }
    if (this.c.c(31)) {
      a((short)localzapr.x);
    }
    if (this.c.c(32)) {
      a((short)localzapr.y);
    }
    if (this.c.c(33)) {
      a((short)localzapr.z);
    }
    if (this.c.c(34)) {
      a((short)localzapr.A);
    }
    if (this.c.c(35)) {
      a(localzapr.B);
    }
    if (this.c.c(36)) {
      a(localzapr.C);
    }
    if (this.c.c(37)) {
      a(localzapr.D);
    }
    if (this.c.c(38)) {
      a(localzapr.E);
    }
    if (this.c.c(39)) {
      a(localzapr.F);
    }
    if (this.c.c(40)) {
      a(localzapr.G);
    }
    if (this.c.c(16)) {
      a(localzapr.n);
    }
    if (this.c.c(12)) {
      a(localzapr.l);
    }
    if (this.c.c(2)) {
      a(localzapr.e);
    }
    if (this.c.c(7)) {
      a(localzapr.f & 0xFF);
    }
    if (this.c.c(15)) {
      a(localzapr.k);
    }
    if (this.c.c(9)) {
      a(localzapr.j);
    }
    if (this.c.c(0)) {
      a((short)localzapr.m);
    }
    if (this.c.c(41)) {
      a(localzapr.H);
    }
    m();
    l();
    i();
    k();
    g();
    d();
  }
  
  private void d()
    throws Exception
  {
    zapr localzapr = (zapr)this.c.e;
    if ((localzapr.J != -1) && (localzapr.c(42)))
    {
      h();
      a(localzapr.I);
      a(localzapr.J);
      i();
    }
  }
  
  private void e()
    throws Exception
  {
    zag localzag = this.c.e;
    h();
    a(this.c.d);
    if (this.c.c(2)) {
      a(localzag.e);
    }
    if (this.c.c(4)) {
      a(localzag.c);
    }
    if (this.c.c(1)) {
      a(localzag.d);
    }
    if (this.c.c(5)) {
      a(localzag.g);
    }
    if (this.c.c(6)) {
      a(localzag.o);
    }
    if (this.c.c(7)) {
      a(localzag.f);
    }
    if (this.c.c(8)) {
      j();
    }
    if (this.c.c(9)) {
      a(localzag.j);
    }
    if (this.c.c(10)) {
      a(localzag.p);
    }
    if (this.c.c(14)) {
      a(localzag.a);
    }
    if (this.c.c(15)) {
      a(localzag.k);
    }
    m();
    l();
    i();
    k();
  }
  
  private void f()
    throws Exception
  {
    zber localzber = (zber)this.c.e;
    h();
    a(this.c.d);
    if (this.c.c(3)) {
      a(localzber.b);
    }
    if (this.c.c(4)) {
      a(localzber.c);
    }
    if (this.c.c(14)) {
      a(localzber.a);
    }
    if (this.c.c(8)) {
      j();
    }
    if ((this.c.getType() == 10) && (this.c.c(5))) {
      a(localzber.g);
    }
    if (this.c.c(43)) {
      a(localzber.s);
    }
    if (this.c.c(44)) {
      a(localzber.r);
    }
    if (this.c.c(45)) {
      a(localzber.t);
    }
    if (this.c.c(46)) {
      a(localzber.u);
    }
    if (this.c.c(47)) {
      a(localzber.v);
    }
    if (this.c.c(48)) {
      a(localzber.w);
    }
    if ((this.c.getType() == 10) && (this.c.c(49))) {
      a(localzber.x);
    }
    if (this.c.c(50))
    {
      int i = localzber.y == 3 ? -1 : localzber.y & 0xFF;
      a(i);
    }
    if ((this.c.getType() == 10) && (this.c.c(51))) {
      a((short)localzber.z);
    }
    if (this.c.c(52)) {
      a(localzber.A);
    }
    if (this.c.c(15)) {
      a(localzber.k);
    }
    if ((this.c.getType() == 5) && (this.c.c(5))) {
      a(localzber.g);
    }
    m();
    l();
    i();
    k();
    g();
  }
  
  private void g()
    throws Exception
  {
    Font localFont = this.c.getFont();
    h();
    int i = 0;
    a(0);
    if (localFont.f(13))
    {
      a(localFont.getName());
      i |= zaj.b(17);
    }
    int j = 0;
    if (localFont.isBold()) {
      j |= 0x1;
    }
    if (localFont.isItalic()) {
      j |= 0x2;
    }
    if (localFont.getUnderline() != 0) {
      j |= 0x4;
    }
    if (localFont.isStrikeout()) {
      j |= 0x8;
    }
    if (j != 0)
    {
      a(j);
      i |= zaj.b(18);
    }
    if (localFont.f(12))
    {
      a(localFont.j());
      i |= zaj.b(19);
    }
    if (localFont.f(15))
    {
      a((byte)localFont.getCharset());
      i |= zaj.b(20);
    }
    if (localFont.f(14))
    {
      a(localFont.e);
      i |= zaj.b(21);
    }
    if (this.c.e.q != 0)
    {
      a(this.c.e.q);
      i |= zaj.b(22);
    }
    if (localFont.f(17))
    {
      a((short)localFont.g());
      i |= zaj.b(23);
    }
    m();
    l();
    this.a.a(-(this.b - 2), 1);
    this.a.b(zc.a((short)(this.b - 4)), 0, 2);
    this.a.b(zc.a(i), 0, 4);
    this.a.a(this.b - 8, 1);
  }
  
  private void h()
    throws Exception
  {
    this.a.a((byte)0);
    this.a.a((byte)2);
    this.a.a(2L, 1);
    this.b = 4;
  }
  
  private void i()
    throws Exception
  {
    this.a.a(-(this.b - 2), 1);
    this.a.b(zc.a((short)(this.b - 4)), 0, 2);
    this.a.a(this.b - 4, 1);
  }
  
  private void j()
  {
    zf.a(this.d, zc.a(this.c.e.h));
    zf.a(this.d, zc.a(this.c.e.i));
  }
  
  private void a(byte[] paramArrayOfByte)
    throws Exception
  {
    a((short)-1);
    zf.a(this.e, paramArrayOfByte);
  }
  
  private void k()
    throws Exception
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
    {
      byte[] arrayOfByte = (byte[])localIterator.next();
      this.a.b(zaj.l, 0, 16);
      this.a.b(zc.a(29804), 0, 4);
      this.a.b(zc.a(arrayOfByte.length), 0, 4);
      this.a.b(arrayOfByte, 0, arrayOfByte.length);
    }
  }
  
  private void l()
    throws Exception
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      byte[] arrayOfByte = (byte[])localIterator.next();
      if (arrayOfByte != null)
      {
        this.a.b(arrayOfByte, 0, arrayOfByte.length);
        this.b += arrayOfByte.length;
      }
    }
    this.d.clear();
  }
  
  private void a(int paramInt)
    throws Exception
  {
    int i = zaj.a(this.b, 4);
    if (i != 0)
    {
      this.a.a(i, 1);
      this.b += i;
    }
    this.a.b(zc.a(paramInt), 0, 4);
    this.b += 4;
  }
  
  private void m()
    throws Exception
  {
    int i = zaj.a(this.b, 4);
    if (i != 0)
    {
      this.a.a(i, 1);
      this.b += i;
    }
  }
  
  private void a(short paramShort)
    throws Exception
  {
    int i = zaj.a(this.b, 2);
    if (i != 0)
    {
      this.a.a(i, 1);
      this.b += i;
    }
    this.a.b(zc.a(paramShort), 0, 2);
    this.b += 2;
  }
  
  private void a(byte paramByte)
    throws Exception
  {
    this.a.a(paramByte);
    this.b += 1;
  }
  
  private void a(String paramString)
    throws Exception
  {
    byte[] arrayOfByte = zct.c(paramString);
    int i = arrayOfByte.length == paramString.length() ? 1 : 0;
    int j = paramString.length();
    j |= 0x80000000;
    a(j);
    zf.a(this.d, arrayOfByte);
    int k = zaj.a(arrayOfByte.length, 4);
    if (k != 0) {
      zf.a(this.d, this.f[k]);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */