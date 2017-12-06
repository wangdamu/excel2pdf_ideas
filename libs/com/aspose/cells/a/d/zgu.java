package com.aspose.cells.a.d;

import com.aspose.cells.Encoding;
import com.aspose.cells.a.c.zg;
import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class zgu
{
  public zz a;
  public zd b;
  private zbb c;
  private zbr d;
  private zco e;
  private zgv f;
  private zbc g;
  private zbt h;
  private zaf i;
  private zgj j;
  private zaa k;
  private zh l;
  private zh m;
  private zh n;
  private static String[] o = { "head", "hhea", "maxp", "hmtx", "fpgm", "prep", "cvt ", "loca", "glyf" };
  private static String[] p = { "OS/2", "name", "cmap", "post" };
  private static int[] q = { 0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4 };
  private zgl r = new zgl();
  private HashMap s = zg.a();
  private HashMap t = zg.a();
  private long[] u;
  private int v;
  
  public void a(zgs paramzgs, zgl paramzgl1, zgl paramzgl2, zm paramzm, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    if (paramzgs == null) {
      throw new IllegalArgumentException("font");
    }
    if (paramzgl2 == null) {
      throw new IllegalArgumentException("oldToNewGlyphIndexes");
    }
    if (paramzm == null) {
      throw new IllegalArgumentException("dstStream");
    }
    zm localzm1 = paramzgs.d().b();
    try
    {
      this.a = new zz(localzm1);
      d(paramzgs.b());
      if ((paramBoolean2) || (paramzgs.w()))
      {
        zm localzm2 = paramzgs.d().b();
        try
        {
          zdh.a(localzm2, paramzm);
        }
        finally {}
      }
      else
      {
        a();
        b();
        c();
        f();
        if (paramBoolean1)
        {
          g();
          m();
        }
        boolean bool = this.c.n == 0;
        zbi localzbi = new zbi(this.a, bool, true, this.h);
        int i1 = localzbi.a(b("loca"), b("glyf"), paramzgl2);
        this.l = localzbi.a();
        this.m = localzbi.b();
        this.n = localzbi.c();
        this.e.b = i1;
        this.d.q = localzbi.d();
        if (paramBoolean1)
        {
          this.i.a(paramzgl1);
          this.j.a(paramzgl2);
        }
        a(paramBoolean1, paramzm);
      }
    }
    finally
    {
      if (localzm1 != null) {
        localzm1.a();
      }
    }
  }
  
  public void a(zgs paramzgs, zgl paramzgl, zm paramzm, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    if (paramzgs == null) {
      throw new IllegalArgumentException("font");
    }
    if (paramzgl == null) {
      throw new IllegalArgumentException("usedGlyphs");
    }
    if (paramzm == null) {
      throw new IllegalArgumentException("dstStream");
    }
    zm localzm = paramzgs.d().b();
    try
    {
      this.a = new zz(localzm);
      d(paramzgs.b());
      a();
      b();
      c();
      f();
      boolean bool = this.c.n == 0;
      zbi localzbi = new zbi(this.a, bool, false, this.h);
      int i1 = localzbi.a(b("loca"), b("glyf"), paramzgl);
      this.l = localzbi.a();
      this.m = localzbi.b();
      this.n = localzbi.c();
      this.e.b = i1;
      this.d.q = i1;
      this.k = new zaa(paramzm);
      int i2 = i();
      this.k.a().b(i2);
      j();
      this.k.a().b(0L);
      i();
    }
    finally
    {
      if (localzm != null) {
        localzm.a();
      }
    }
  }
  
  private void a(boolean paramBoolean, zm paramzm)
    throws Exception
  {
    this.k = new zaa(paramzm);
    int i1 = a(paramBoolean);
    this.k.a().b(i1);
    b(paramBoolean);
    this.k.a().b(0L);
    a(paramBoolean);
  }
  
  private int a(boolean paramBoolean)
    throws Exception
  {
    this.k.a(65536);
    ArrayList localArrayList = new ArrayList();
    a(o, localArrayList);
    if (paramBoolean) {
      a(p, localArrayList);
    }
    Collections.sort(localArrayList);
    this.k.b(localArrayList.size());
    int i1 = q[localArrayList.size()];
    int i2 = (1 << i1) * 16;
    this.k.b(i2);
    this.k.b(i1);
    int i3 = localArrayList.size() * 16 - i2;
    this.k.b(i3);
    int i4 = (int)this.k.a().i() + localArrayList.size() * 16;
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      zha localzha = (zha)localIterator.next();
      localzha.a(this.k);
    }
    return i4;
  }
  
  private void a(String[] paramArrayOfString, ArrayList paramArrayList)
  {
    for (String str : paramArrayOfString)
    {
      zha localzha = b(str);
      if (localzha != null) {
        zf.a(paramArrayList, localzha);
      }
    }
  }
  
  private void b(boolean paramBoolean)
    throws Exception
  {
    c("head");
    a("hhea", this.d.a());
    a("maxp", this.e.a());
    a("hmtx", this.n);
    c("fpgm");
    c("prep");
    c("cvt ");
    a("loca", this.l);
    a("glyf", this.m);
    if (paramBoolean)
    {
      c("OS/2");
      c("name");
      a("cmap", this.i.b());
      a("post", this.j.b());
    }
  }
  
  private void m()
    throws Exception
  {
    a("post");
    this.j = new zgj(this.a);
  }
  
  public void a()
    throws Exception
  {
    a("head");
    this.c = new zbb(this.a);
  }
  
  public void b()
    throws Exception
  {
    a("hhea");
    this.d = new zbr(this.a);
  }
  
  public void c()
    throws Exception
  {
    a("maxp");
    this.e = new zco(this.a);
  }
  
  public void d()
    throws Exception
  {
    a("name");
    int i1 = (int)this.a.a().i();
    c(i1);
  }
  
  public void e()
    throws Exception
  {
    a("OS/2");
    this.g = new zbc(this.a);
  }
  
  public void f()
    throws Exception
  {
    if (this.d == null) {
      throw new IllegalStateException("Need to read horizontal header first.");
    }
    if (this.e == null) {
      throw new IllegalStateException("Need to read maximum profile first.");
    }
    a("hmtx");
    this.h = new zbt(this.a, this.d.q & 0xFFFF, this.e.b & 0xFFFF);
  }
  
  public void g()
    throws Exception
  {
    a("cmap");
    this.i = new zaf(this.a);
  }
  
  public zgs h()
    throws Exception
  {
    zgs localzgs = new zgs();
    localzgs.b(this.c.f);
    localzgs.l(this.c.g);
    localzgs.m(this.c.h);
    localzgs.n(this.c.i);
    localzgs.o(this.c.j);
    localzgs.a(b(1));
    localzgs.b(b(2));
    localzgs.c(b(4));
    localzgs.d(a(6));
    localzgs.c(this.d.b);
    localzgs.d(Math.abs(this.d.c));
    localzgs.e(localzgs.h() + localzgs.i() + Math.abs(this.d.d));
    if (localzgs.k() == 0)
    {
      localzgs.e(Math.abs(localzgs.p() - localzgs.n()));
      localzgs.c((int)(localzgs.k() * 0.8D));
      localzgs.d((int)(localzgs.k() * 0.2D));
    }
    localzgs.c((float)(-Math.atan2(this.d.j, this.d.i) * 180.0D / 3.141592653589793D));
    localzgs.r(this.d.e);
    localzgs.s(this.c.e);
    localzgs.f(this.g.n);
    localzgs.k(this.g.o);
    localzgs.i(this.g.g);
    localzgs.j(this.g.i);
    localzgs.g(this.g.k);
    localzgs.h(this.g.m);
    localzgs.a(this.g.a());
    localzgs.p(this.g.H);
    localzgs.a(b("loca"));
    localzgs.b(b("glyf"));
    zha localzha1 = b("VDMX");
    localzgs.a(this.c.n == 0);
    localzgs.a(this.i.a(this.h, localzgs.a()));
    localzgs.a(this.i);
    localzgs.a(new zbq(this.a, b("hdmx"), localzgs.e().size() + 1));
    localzgs.a(this.h);
    zha localzha2 = b("CFF ");
    if (localzha2 != null)
    {
      localzgs.c(true);
      this.a.a().b(localzha2.c);
      zah localzah = new zah(this.a);
      localzgs.d(localzah.a());
    }
    int i1 = 4;
    int i2 = 8;
    localzgs.b(((this.g.e & 0xFFFF & i1) != 0) && ((this.g.e & 0xFFFF & i2) == 0));
    localzgs.a(this.g);
    return localzgs;
  }
  
  public void a(String paramString)
    throws Exception
  {
    zha localzha = b(paramString);
    this.a.a().b(localzha.c);
  }
  
  public zha b(String paramString)
  {
    zha localzha = (zha)this.b.d(paramString);
    return localzha;
  }
  
  public String a(int paramInt)
  {
    return this.f.a(paramInt);
  }
  
  public String b(int paramInt)
  {
    String str = a(paramInt);
    if (str == null) {
      throw new IllegalStateException("Requested a name string that is not present in the font.");
    }
    return str;
  }
  
  public int i()
    throws Exception
  {
    this.k.a(65536);
    int i1 = o.length;
    this.k.c(i1);
    int i2 = q[i1];
    int i3 = (1 << i2) * 16;
    this.k.c(i3);
    this.k.c(i2);
    int i4 = i1 * 16 - i3;
    this.k.c(i4);
    int i5 = (int)this.k.a().i() + i1 * 16;
    for (int i6 = 0; i6 < i1; i6++)
    {
      zha localzha = b(o[i6]);
      if (localzha != null) {
        localzha.a(this.k);
      }
    }
    return i5;
  }
  
  public void j()
    throws Exception
  {
    c("head");
    a("hhea", this.d.a());
    a("maxp", this.e.a());
    a("hmtx", this.n);
    c("fpgm");
    c("prep");
    c("cvt ");
    a("loca", this.l);
    a("glyf", this.m);
  }
  
  public void a(String paramString, zh paramzh)
    throws Exception
  {
    zha localzha = b(paramString);
    localzha.c = ((int)this.k.a().i());
    this.k.a(paramzh.m(), 0, (int)paramzh.h());
    localzha.b = zha.a(paramzh.m(), 0, (int)paramzh.h());
    localzha.d = ((int)paramzh.h());
    k();
  }
  
  public void c(String paramString)
    throws Exception
  {
    try
    {
      zha localzha = b(paramString);
      this.a.a().b(localzha.c);
      byte[] arrayOfByte = this.a.a(localzha.d);
      localzha.c = ((int)this.k.a().i());
      this.k.a(arrayOfByte, 0, arrayOfByte.length);
      k();
    }
    catch (Exception localException) {}
  }
  
  public void k()
    throws Exception
  {
    zdh.a(this.k.a(), 4);
  }
  
  public zba[] a(zaz paramzaz)
    throws Exception
  {
    if (!paramzaz.c()) {
      return new zba[0];
    }
    zm localzm = paramzaz.b();
    try
    {
      this.a = new zz(localzm);
      Object localObject4;
      if (n())
      {
        localObject1 = o();
        for (localObject4 : localObject1)
        {
          ((zba)localObject4).a(paramzaz);
          ((zba)localObject4).a(true);
        }
        ??? = localObject1;
        return (zba[])???;
      }
      if (d(0))
      {
        d();
        localObject1 = this.f.a(1);
        ??? = this.f.b(1);
        String str = this.f.a(2);
        try
        {
          if (zdh.a(str))
          {
            if ((zcn.c < localzm.h()) && ("regular".equals(str.toLowerCase())))
            {
              zcn.a = (String)localObject1;
              zcn.c = localzm.h();
              zcn.b = str;
            }
            if ((zcn.f < localzm.h()) && ("bold".equals(str.toLowerCase())))
            {
              zcn.d = (String)localObject1;
              zcn.f = localzm.h();
              zcn.e = str;
            }
          }
        }
        catch (Exception localException) {}
        Object localObject5;
        if ((zdh.a((String)localObject1)) && (??? != null) && (???.length > 0))
        {
          localObject3 = new HashMap();
          this.t.put(localObject1, localObject3);
          for (localObject5 : ???) {
            ((HashMap)localObject3).put(localObject5, Integer.valueOf(0));
          }
        }
        Object localObject3 = this.f.a();
        if (localObject3 != null)
        {
          for (localObject5 : localObject3)
          {
            ((zba)localObject5).a(paramzaz);
            ((zba)localObject5).a(false);
          }
          localObject4 = localObject3;
          return (zba[])localObject4;
        }
        localObject4 = null;
        return (zba[])localObject4;
      }
      Object localObject1 = null;
      return (zba[])localObject1;
    }
    finally
    {
      if (localzm != null) {
        localzm.a();
      }
    }
  }
  
  private boolean n()
    throws Exception
  {
    this.a.a().b(0L);
    String str = new String(this.a.b(4));
    if (!"ttcf".equals(str)) {
      return false;
    }
    int i1 = this.a.b();
    if ((i1 != 65536) && (i1 != 131072)) {
      return false;
    }
    this.v = this.a.b();
    this.u = new long[this.v];
    for (int i2 = 0; i2 < this.v; i2++) {
      this.u[i2] = this.a.c();
    }
    if (131072 == i1)
    {
      this.a.c();
      this.a.c();
      this.a.c();
    }
    return true;
  }
  
  private zba[] o()
    throws Exception
  {
    if (this.v <= 0) {
      throw new IllegalStateException("Can't read TTC entry.");
    }
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < this.v; i1++) {
      if (d((int)(this.u[i1] & 0xFFFFFFFF)))
      {
        d();
        String str = this.f.a(1);
        String[] arrayOfString = this.f.b(1);
        Object localObject3;
        if ((zdh.a(str)) && (arrayOfString != null) && (arrayOfString.length > 0))
        {
          if (!this.t.containsKey(str)) {
            this.t.put(str, new HashMap());
          }
          localObject1 = (HashMap)this.t.get(str);
          for (localObject3 : arrayOfString) {
            ((HashMap)localObject1).put(localObject3, Integer.valueOf(0));
          }
        }
        Object localObject1 = this.f.b(4);
        for (localObject3 : localObject1) {
          this.s.put(localObject3, Long.valueOf(this.u[i1]));
        }
        ??? = this.f.a();
        if (null != ???) {
          a(localArrayList, (zba[])???);
        }
      }
    }
    return a(localArrayList);
  }
  
  private void c(int paramInt)
    throws Exception
  {
    int i1 = this.a.e();
    if ((i1 & 0xFFFF) != 0) {
      throw new IllegalStateException("Unsupported Name table format.");
    }
    int i2 = this.a.e();
    int i3 = this.a.e();
    this.f = new zgv();
    for (int i4 = 0; i4 < (i2 & 0xFFFF); i4++)
    {
      int i5 = this.a.e() & 0xFFFF;
      int i6 = this.a.e() & 0xFFFF;
      int i7 = this.a.e() & 0xFFFF;
      int i8 = this.a.e() & 0xFFFF;
      int i9 = this.a.e() & 0xFFFF;
      int i10 = this.a.e() & 0xFFFF;
      Encoding localEncoding = null;
      switch (i5)
      {
      case 0: 
        localEncoding = Encoding.getBigEndianUnicode();
        break;
      case 1: 
        if ((i6 == 0) || (i6 == 1) || (i6 == 2) || (i6 == 3) || (i6 == 25)) {
          localEncoding = Encoding.getEncoding(1252);
        }
        break;
      case 3: 
        if ((i6 == 1) || (i6 == 10) || (i6 == 0)) {
          localEncoding = Encoding.getBigEndianUnicode();
        }
        break;
      }
      if ((localEncoding != null) && (i7 != 0))
      {
        int i11 = (int)this.a.a().i();
        this.a.a().b(paramInt + (i3 & 0xFFFF) + i10);
        byte[] arrayOfByte = this.a.a(i9);
        String str = localEncoding.a(arrayOfByte);
        this.f.a(i8, i7, str);
        this.a.a().b(i11);
      }
    }
  }
  
  private boolean d(int paramInt)
    throws Exception
  {
    this.a.a().b(paramInt);
    int i1 = p();
    if (i1 <= 0) {
      return false;
    }
    this.b = new zgm();
    for (int i2 = 0; i2 < i1; i2++)
    {
      zha localzha = new zha(this.a);
      this.b.a(localzha.a, localzha);
    }
    return (b("loca") != null) && (b("glyf") != null);
  }
  
  private int p()
    throws Exception
  {
    int i1 = this.a.b();
    if ((i1 != 65536) && (i1 != 1330926671)) {
      return -1;
    }
    int i2 = this.a.e() & 0xFFFF;
    this.a.e();
    this.a.e();
    this.a.e();
    return i2;
  }
  
  public HashMap l()
  {
    return this.t;
  }
  
  public zgs a(zaz paramzaz, String paramString)
    throws Exception
  {
    zm localzm = paramzaz.b();
    try
    {
      zgs localzgs1 = a(localzm, paramString);
      localzgs1.a(paramzaz);
      zgs localzgs2 = localzgs1;
      return localzgs2;
    }
    finally
    {
      if (localzm != null) {
        localzm.a();
      }
    }
  }
  
  public zgs a(byte[] paramArrayOfByte, String paramString)
    throws Exception
  {
    return a(new zcp(paramArrayOfByte), paramString);
  }
  
  public zgs a(zm paramzm, String paramString)
    throws Exception
  {
    this.a = new zz(paramzm);
    d(paramString);
    a();
    d();
    e();
    b();
    c();
    f();
    g();
    return h();
  }
  
  private void d(String paramString)
    throws Exception
  {
    if (n())
    {
      o();
      long l1 = ((Long)this.s.get(paramString)).longValue();
      if (!d((int)(l1 & 0xFFFFFFFF))) {
        throw new IllegalStateException("The TTC font is invalid.");
      }
    }
    else if (!d(0))
    {
      throw new IllegalStateException("The file is not recognized as a TTF or TTC font.");
    }
  }
  
  static void a(ArrayList paramArrayList, zba[] paramArrayOfzba)
  {
    for (int i1 = 0; i1 < paramArrayOfzba.length; i1++) {
      zf.a(paramArrayList, paramArrayOfzba[i1]);
    }
  }
  
  static zba[] a(ArrayList paramArrayList)
  {
    zba[] arrayOfzba = new zba[paramArrayList.size()];
    for (int i1 = 0; i1 < paramArrayList.size(); i1++) {
      arrayOfzba[i1] = ((zba)paramArrayList.get(i1));
    }
    return arrayOfzba;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */