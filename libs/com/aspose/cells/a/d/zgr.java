package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.Encoding;
import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.b.zu;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.zcjz;
import java.util.HashMap;
import java.util.Iterator;

public class zgr
  extends zf
{
  private long f = 0L;
  private zca g;
  private zcjz h;
  private boolean i = true;
  private boolean j = false;
  private HashMap k = new HashMap();
  
  public zgr(zhb paramzhb, boolean paramBoolean)
  {
    super(paramzhb);
    this.j = paramBoolean;
  }
  
  public void a(zn paramzn, com.aspose.cells.b.a.d.zm paramzm, String paramString)
    throws Exception
  {
    this.g = new zca(paramString);
    this.h = new zcjz(paramzm, Encoding.getUTF8());
    paramzn.a(this);
    this.h.e();
  }
  
  public void a(zo paramzo)
    throws Exception
  {
    this.h.a(1);
    this.h.b(true);
    this.h.b("svg");
    this.h.a("xmlns", "http://www.w3.org/2000/svg");
    this.h.a("xmlns:xlink", "http://www.w3.org/1999/xlink");
    if (this.j)
    {
      this.h.a("width", "100%");
      this.h.a("height", "100%");
      this.h.a("viewBox", "0 0 " + a(paramzo.c() * 96.0F / 72.0F) + " " + a(paramzo.d() * 96.0F / 72.0F));
    }
    else
    {
      this.h.a("width", a(paramzo.c()) + "pt");
      this.h.a("height", a(paramzo.d()) + "pt");
    }
    this.h.b("g");
    this.h.a("id", "SFixTitle");
    this.h.b();
    this.h.b("g");
    this.h.a("id", "SContent");
    this.h.b("g");
    this.h.a("transform", "scale(1.33333)");
  }
  
  public void b(zo paramzo)
    throws Exception
  {
    this.h.b();
    this.h.b();
    d();
    this.h.b();
    this.h.d();
  }
  
  private void d()
    throws Exception
  {
    this.h.b("defs");
    Iterator localIterator = this.k.keySet().iterator();
    while (localIterator.hasNext())
    {
      long l = ((Long)localIterator.next()).longValue();
      Object localObject1 = this.k.get(Long.valueOf(l));
      Object localObject2;
      if ((localObject1 instanceof zgq))
      {
        this.h.b("pattern");
        a("id", "PATTERN" + l);
        a("patternUnits", "userSpaceOnUse");
        localObject2 = (zgq)localObject1;
        zl localzl = ((zgq)localObject2).b;
        float f2 = localzl.f().b();
        float f3 = localzl.f().c();
        if (((zgq)localObject2).a != null)
        {
          f2 *= localObject2.a.d()[0];
          f3 *= localObject2.a.d()[3];
        }
        a("width", f2);
        a("height", f3);
        localzl.a(new zt(f2, f3));
        b(localzl);
        this.h.b();
      }
      else if ((localObject1 instanceof zi))
      {
        localObject2 = (zi)localObject1;
        this.h.b("linearGradient");
        a("id", "PATTERN" + l);
        a("x1", ((zi)localObject2).d().d());
        a("x2", ((zi)localObject2).c().d());
        a("y1", ((zi)localObject2).d().e());
        a("y2", ((zi)localObject2).c().e());
        a("gradientUnits", "userSpaceOnUse");
        this.h.b("stop");
        a("offset", "0");
        a("stop-color", a(((zi)localObject2).b()));
        float f1 = (((zi)localObject2).b().getA() & 0xFF) / 255.0F;
        a("stop-opacity", f1);
        this.h.b();
        this.h.b("stop");
        a("offset", "1");
        a("stop-color", a(((zi)localObject2).a()));
        f1 = (((zi)localObject2).a().getA() & 0xFF) / 255.0F;
        a("stop-opacity", f1);
        this.h.b();
        this.h.b();
      }
      if ((localObject1 instanceof com.aspose.cells.b.a.b.a.zh))
      {
        localObject2 = (com.aspose.cells.b.a.b.a.zh)localObject1;
        zq localzq1 = ((com.aspose.cells.b.a.b.a.zh)localObject2).o();
        com.aspose.cells.b.a.b.zo[] arrayOfzo = new com.aspose.cells.b.a.b.zo[2];
        com.aspose.cells.b.a.b.a.zi localzi = null;
        localzi = new com.aspose.cells.b.a.b.a.zi();
        float f4 = ((com.aspose.cells.b.a.b.a.zh)localObject2).b().floatValue();
        com.aspose.cells.b.a.b.zo localzo = new com.aspose.cells.b.a.b.zo(localzq1.j() + localzq1.h() / 2.0F, localzq1.k() + localzq1.i() / 2.0F);
        localzi.a(f4, localzo);
        float f5 = (float)(localzq1.h() * Math.abs(Math.cos(f4 * 3.141592653589793D / 180.0D)) + localzq1.i() * Math.abs(Math.sin(f4 * 3.141592653589793D / 180.0D)));
        float f6 = (float)(localzq1.i() * Math.abs(Math.cos(f4 * 3.141592653589793D / 180.0D)) + localzq1.h() * Math.abs(Math.sin(f4 * 3.141592653589793D / 180.0D)));
        zq localzq2 = new zq(localzo.d() - f5 / 2.0F, localzo.e() - f6 / 2.0F, f5, f6);
        arrayOfzo[0] = new com.aspose.cells.b.a.b.zo(localzq2.j(), localzq2.k() + localzq2.i() / 2.0F);
        arrayOfzo[1] = new com.aspose.cells.b.a.b.zo(localzq2.l(), localzq2.k() + localzq2.i() / 2.0F);
        localzi.a(arrayOfzo);
        this.h.b("linearGradient");
        a("id", "PATTERN" + l);
        a("x1", arrayOfzo[0].d());
        a("y1", arrayOfzo[0].e());
        a("x2", arrayOfzo[1].d());
        a("y2", arrayOfzo[1].e());
        a("gradientUnits", "userSpaceOnUse");
        com.aspose.cells.b.a.b.a.zc localzc = ((com.aspose.cells.b.a.b.a.zh)localObject2).m();
        Color[] arrayOfColor = localzc.b();
        float[] arrayOfFloat = localzc.a();
        for (int m = 0; m < arrayOfColor.length; m++)
        {
          this.h.b("stop");
          String str1 = com.aspose.cells.b.a.ze.e(Float.valueOf(arrayOfFloat[m] * 100.0F)) + "%";
          a("offset", str1);
          String str2 = a(arrayOfColor[m]);
          a("stop-color", str2);
          float f7 = (arrayOfColor[m].getA() & 0xFF) / 255.0F;
          a("stop-opacity", f7);
          this.h.b();
        }
        this.h.b();
      }
    }
    this.h.b();
  }
  
  private String c(zp paramzp)
    throws Exception
  {
    this.h.b("defs");
    this.h.b("clipPath");
    String str1 = "CLIP" + e();
    a("id", str1);
    this.h.b("path");
    zhp localzhp = new zhp(null, true);
    String str2 = localzhp.a(paramzp, true);
    a("d", str2);
    this.h.b();
    this.h.b();
    this.h.b();
    return str1;
  }
  
  public void a(zb paramzb)
    throws Exception
  {
    boolean bool = zbn.d(paramzb);
    String str1 = "";
    if (bool) {
      str1 = c(paramzb.b());
    }
    this.h.b("g");
    Object localObject1;
    Object localObject2;
    if ((paramzb.a() != null) || (bool))
    {
      if (paramzb.a() != null)
      {
        localObject1 = paramzb.a().d();
        localObject2 = new StringBuilder(64);
        ((StringBuilder)localObject2).append("matrix(");
        ((StringBuilder)localObject2).append(a(localObject1[0]));
        ((StringBuilder)localObject2).append(',');
        ((StringBuilder)localObject2).append(a(localObject1[1]));
        ((StringBuilder)localObject2).append(',');
        ((StringBuilder)localObject2).append(a(localObject1[2]));
        ((StringBuilder)localObject2).append(',');
        ((StringBuilder)localObject2).append(a(localObject1[3]));
        ((StringBuilder)localObject2).append(',');
        ((StringBuilder)localObject2).append(a(localObject1[4]));
        ((StringBuilder)localObject2).append(',');
        ((StringBuilder)localObject2).append(a(localObject1[5]));
        ((StringBuilder)localObject2).append(')');
        a("transform", zs.a(localObject2));
      }
      if (bool) {
        a("clip-path", "url(#" + str1 + ")");
      }
    }
    if ((paramzb instanceof zc))
    {
      localObject1 = (zc)paramzb;
      a("id", "C_" + ((zc)localObject1).a + "_" + ((zc)localObject1).b + "_" + ((zc)localObject1).c + "_" + ((zc)localObject1).d + "_" + ((zc)localObject1).e);
      localObject2 = zp.b(((zc)localObject1).f);
      this.h.b("path");
      zhp localzhp = new zhp(null);
      String str2 = localzhp.a((zp)localObject2, true);
      a("d", str2);
      a("stroke", "none");
      a("fill", "white");
      a("fill-opacity", "1");
      this.h.b();
      localObject2 = null;
    }
  }
  
  public void b(zb paramzb)
    throws Exception
  {
    this.h.b();
  }
  
  public void a(zh paramzh)
    throws Exception
  {
    this.h.b("text");
    a("x", paramzh.g().d());
    a("y", paramzh.g().e());
    zbj localzbj = paramzh.d();
    a("font-family", localzbj.a());
    a("font-size", localzbj.b());
    a("fill", paramzh.e());
    if (localzbj.d()) {
      a("font-weight", "bold");
    }
    if (localzbj.e()) {
      a("font-style", "italic");
    }
    if (paramzh.a() != null)
    {
      float[] arrayOfFloat = paramzh.a().d();
      StringBuilder localStringBuilder = new StringBuilder(64);
      localStringBuilder.append("matrix(");
      localStringBuilder.append(a(arrayOfFloat[0]));
      localStringBuilder.append(',');
      localStringBuilder.append(a(arrayOfFloat[1]));
      localStringBuilder.append(',');
      localStringBuilder.append(a(arrayOfFloat[2]));
      localStringBuilder.append(',');
      localStringBuilder.append(a(arrayOfFloat[3]));
      localStringBuilder.append(',');
      localStringBuilder.append(a(arrayOfFloat[4]));
      localStringBuilder.append(',');
      localStringBuilder.append(a(arrayOfFloat[5]));
      localStringBuilder.append(')');
      a("transform", zs.a(localStringBuilder));
    }
    paramzh.a(zgk.a(paramzh.h()));
    this.h.a(paramzh.h());
    this.h.b();
  }
  
  private String b(zl paramzl)
    throws Exception
  {
    String str = "Image" + e();
    Object localObject1;
    switch (paramzl.e())
    {
    case 4: 
    case 5: 
    case 6: 
    case 7: 
      this.h.b("image");
      a("Id", str);
      a("x", paramzl.b().d());
      a("y", paramzl.b().e());
      a("width", paramzl.c().b());
      a("height", paramzl.c().c());
      a("preserveAspectRatio", "none");
      if (!this.i)
      {
        localObject1 = this.g.a(paramzl.e());
        com.aspose.cells.b.a.d.ze localze = com.aspose.cells.b.a.d.zd.a((String)localObject1);
        try
        {
          localze.b(paramzl.d(), 0, paramzl.d().length);
        }
        finally
        {
          if (localze != null) {
            localze.a();
          }
        }
        a("xlink:href", this.g.a((String)localObject1));
      }
      else
      {
        localObject1 = "";
        switch (paramzl.e())
        {
        case 6: 
          localObject1 = "data:image/bmp;base64,";
          break;
        case 4: 
          localObject1 = "data:image/jpeg;base64,";
          break;
        case 5: 
          localObject1 = "data:image/png;base64,";
          break;
        case 7: 
          localObject1 = "data:image/gif;base64,";
          break;
        }
        a("xlink:href", (String)localObject1 + com.aspose.cells.b.a.ze.a(paramzl.d()));
      }
      this.h.b();
      break;
    case 1: 
    case 2: 
      localObject1 = zcy.a(paramzl, b());
      ((zb)localObject1).a(paramzl.g());
      ((zb)localObject1).a(this);
      break;
    }
    return str;
  }
  
  public void a(zl paramzl)
    throws Exception
  {
    b(paramzl);
  }
  
  public void a(zp paramzp)
    throws Exception
  {
    this.h.b("path");
    zhp localzhp = new zhp(null);
    String str = localzhp.a(paramzp, false);
    a("d", str);
    if ((paramzp.d() != null) && ((paramzp.d().a != null) || (paramzp.d().a() != null)))
    {
      if ((paramzp.d().a() != null) && ((paramzp.d().a() instanceof com.aspose.cells.b.a.b.a.zh)))
      {
        long l1 = e();
        this.k.put(Long.valueOf(l1), paramzp.d().a());
        a("stroke", "url(#PATTERN" + l1 + ")");
      }
      else
      {
        a("stroke", paramzp.d().a);
        a("stroke-opacity", (paramzp.d().a.getA() & 0xFF) / 255.0F);
      }
      a("stroke-width", paramzp.d().b);
      if (paramzp.d().g == 0)
      {
        a("stroke-linecap", zgp.b(paramzp.d().c).toLowerCase());
        a("stroke-linejoin", zhj.a(paramzp.d().f).toLowerCase());
      }
      else
      {
        a("stroke-linecap", zgp.a(paramzp.d().e).toLowerCase());
        a("stroke-dasharray", zhj.a(zhj.a(paramzp.d())));
      }
    }
    else
    {
      a("stroke", "none");
      a("stroke-width", 0.0F);
    }
    if (paramzp.e() != null)
    {
      Object localObject;
      if ((paramzp.e() instanceof zu))
      {
        localObject = (zu)paramzp.e();
        a("fill", ((zu)localObject).a());
        a("fill-opacity", (((zu)localObject).a().getA() & 0xFF) / 255.0F);
      }
      else if ((paramzp.e() instanceof com.aspose.cells.b.a.b.zx))
      {
        localObject = (com.aspose.cells.b.a.b.zx)com.aspose.cells.b.a.zm.a(paramzp.e(), com.aspose.cells.b.a.b.zx.class);
        a((com.aspose.cells.b.a.b.zx)localObject);
      }
      else if ((paramzp.e() instanceof zg))
      {
        a((zg)paramzp.e());
      }
      else if ((paramzp.e() instanceof zi))
      {
        localObject = (zi)paramzp.e();
        long l2 = e();
        this.k.put(Long.valueOf(l2), localObject);
        a("fill", "url(#PATTERN" + l2 + ")");
      }
    }
    else
    {
      a("fill", "none");
    }
    if (paramzp.a() != null) {
      a("transform", "matrix(" + zhj.a(paramzp.a()) + ")");
    }
  }
  
  public void a(zm paramzm)
    throws Exception
  {
    if ((paramzm != null) && (paramzm.c != null) && (paramzm.c.a != null))
    {
      this.h.b("path");
      String str = "M " + zhj.a(paramzm.a) + " L " + zhj.a(paramzm.b);
      a("d", str);
      a("stroke", paramzm.c.a);
      a("stroke-width", paramzm.c.b);
      if (paramzm.c.g != 0)
      {
        a("stroke-linecap", zgp.a(paramzm.c.e).toLowerCase());
        a("stroke-dasharray", zhj.a(zhj.a(paramzm.c)));
      }
      a("fill", "none");
      this.h.b();
    }
  }
  
  private void a(com.aspose.cells.b.a.b.zc paramzc)
    throws Exception
  {
    byte[] arrayOfByte = zbp.a((zg)paramzc);
    zcb localzcb = zcc.b(arrayOfByte);
    zq localzq = new zq(0.0F, 0.0F, localzcb.b(), localzcb.c());
    a(arrayOfByte, localzq, 0, null);
  }
  
  private void a(com.aspose.cells.b.a.b.zx paramzx)
    throws Exception
  {
    com.aspose.cells.a.c.zd localzd = new com.aspose.cells.a.c.zd(paramzx);
    try
    {
      byte[] arrayOfByte = zho.a(localzd);
      try
      {
        zcb localzcb = zcc.b(arrayOfByte);
        zq localzq = new zq(0.0F, 0.0F, localzcb.b(), localzcb.c());
        a(arrayOfByte, localzq, paramzx.c(), paramzx.b().b());
      }
      catch (Exception localException) {}
    }
    finally
    {
      if (localzd != null) {
        localzd.a();
      }
    }
  }
  
  public String a(byte[] paramArrayOfByte, zq paramzq, int paramInt, com.aspose.cells.b.a.b.a.zi paramzi)
    throws Exception
  {
    zl localzl = new zl(paramzq.d(), paramzq.e(), paramArrayOfByte);
    zgq localzgq = new zgq();
    localzgq.b = localzl;
    localzgq.a = paramzi;
    long l = e();
    this.k.put(Long.valueOf(l), localzgq);
    a("fill", "url(#PATTERN" + l + ")");
    return "";
  }
  
  public void b(zp paramzp)
    throws Exception
  {
    this.h.b();
  }
  
  private void a(String paramString, float paramFloat)
    throws Exception
  {
    this.h.a(paramString, a(paramFloat));
  }
  
  private void a(String paramString, Color paramColor)
    throws Exception
  {
    if (paramColor != null) {
      this.h.a(paramString, a(paramColor));
    }
  }
  
  private void a(String paramString1, String paramString2)
    throws Exception
  {
    this.h.a(paramString1, paramString2);
  }
  
  private static String a(float paramFloat)
  {
    return com.aspose.cells.a.c.zp.a(paramFloat);
  }
  
  private static String a(Color paramColor)
  {
    return "#" + com.aspose.cells.a.c.zp.b(paramColor.getR() & 0xFF) + com.aspose.cells.a.c.zp.b(paramColor.getG() & 0xFF) + com.aspose.cells.a.c.zp.b(paramColor.getB() & 0xFF);
  }
  
  private long e()
  {
    return this.f++;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */