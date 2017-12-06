package com.aspose.cells.a.d;

import com.aspose.cells.DateTime;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zh;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;

public class zec
{
  private zez a;
  private boolean b;
  private zfa c;
  private zdw d;
  private zfi e;
  private zff f;
  private zdz g;
  private zdu h;
  private zge i;
  private zea j;
  private zfw k;
  private byte[] l;
  private byte[] m;
  private zfq n;
  
  public zec(zm paramzm, zff paramzff)
    throws Exception
  {
    a(paramzm, paramzff, false);
  }
  
  public void a()
    throws Exception
  {
    this.h.a(this.a);
    this.c.a(this.a);
    this.d.a(this.a);
    if (p() != null) {
      p().a(this.a);
    }
    int i1 = this.a.c();
    a(i1);
    this.a.a("%%EOF");
    if (this.b) {
      this.a.e();
    }
  }
  
  public void a(float paramFloat1, float paramFloat2)
    throws Exception
  {
    if (this.e != null) {
      throw new IllegalStateException("Cannot start a new page while another page is not finished.");
    }
    this.e = new zfi(this.g, paramFloat1, paramFloat2);
    this.d.a().a(this.e.o());
  }
  
  public void a(com.aspose.cells.b.a.b.zt paramzt)
    throws Exception
  {
    a(paramzt.b(), paramzt.c());
  }
  
  public void b()
    throws Exception
  {
    if (this.e == null) {
      throw new IllegalStateException("No page to end.");
    }
    this.e.b();
    this.e.a(this.a);
    this.e = null;
  }
  
  private void a(zm paramzm, zff paramzff, boolean paramBoolean)
    throws Exception
  {
    this.b = paramBoolean;
    this.f = paramzff;
    this.g = new zdz(this);
    this.a = new zez(paramzm);
    this.h = new zdu();
    this.c = new zfa(this.g);
    this.d = new zdw(this.g);
    this.a.c("%PDF-1.4");
    if (this.g.b().u())
    {
      this.a.a("%");
      this.a.a((byte)-56);
      this.a.a((byte)-55);
      this.a.a((byte)-54);
      this.a.a((byte)-53);
      this.a.a((byte)13);
      this.a.a((byte)10);
    }
    this.c.b(paramzff.m());
    this.c.a(paramzff.l());
    this.c.c(paramzff.k());
    this.c.e(com.aspose.cells.a.c.zt.c());
    if (paramzff.s()) {
      this.c.a(paramzff.r());
    } else {
      this.c.a(DateTime.d());
    }
    this.c.d(paramzff.n());
    if (this.g.b().u())
    {
      this.i = new zge(this.g, this.c);
      this.j = new zea(this.g);
      if (this.g.b().v())
      {
        this.k = new zfw(this.g);
        zfv localzfv = new zfv(this.g, "/Workbook");
        this.k.a(localzfv);
      }
    }
    if ((!paramzff.s()) || (paramzff.p() != null))
    {
      this.l = zh.b().a();
      System.arraycopy(new byte[] { 99, 101, 108, 108, 115 }, 0, this.l, 6, 5);
      this.m = zh.b().a();
    }
  }
  
  private String a(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length);
    for (byte b1 : paramArrayOfByte) {
      localStringBuilder.append(zw.a(ze.a(b1, 16), 2, '0'));
    }
    return zs.a(localStringBuilder).toUpperCase();
  }
  
  private void a(int paramInt)
    throws Exception
  {
    this.a.c("trailer");
    this.a.g();
    this.a.a("/Size", this.a.a());
    this.a.a("/Info", this.c.o());
    this.a.a("/Root", this.d.o());
    if ((n() != null) && (o() != null))
    {
      String str1 = a(n());
      String str2 = a(o());
      this.a.c(" /ID [<" + str1 + "><" + str2 + ">]");
    }
    if (this.g.b().p() != null) {
      this.a.a("/Encrypt", this.g.k().o());
    }
    this.a.h();
    this.a.f();
    this.a.c("startxref");
    this.a.c(zp.a(paramInt));
  }
  
  public zff c()
  {
    return this.f;
  }
  
  public zfi d()
  {
    return this.e;
  }
  
  public zfp e()
  {
    return i().b();
  }
  
  public zdu f()
  {
    return this.h;
  }
  
  public zfg g()
  {
    return this.d.b();
  }
  
  public zfb h()
  {
    return this.d.c();
  }
  
  public zfj i()
  {
    return this.d.a();
  }
  
  public zge j()
  {
    return this.i;
  }
  
  public zea k()
  {
    return this.j;
  }
  
  public zfw l()
  {
    return this.k;
  }
  
  public zdz m()
  {
    return this.g;
  }
  
  public byte[] n()
  {
    return this.l;
  }
  
  public byte[] o()
  {
    return this.m;
  }
  
  public zfq p()
  {
    return this.n;
  }
  
  public void a(zfq paramzfq)
  {
    this.n = paramzfq;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */