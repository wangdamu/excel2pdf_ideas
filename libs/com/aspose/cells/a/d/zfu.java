package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;

public class zfu
  extends zey
{
  private zh a;
  private zgd b;
  private boolean d;
  private zef f;
  
  public zfu(zdz paramzdz)
    throws Exception
  {
    this(paramzdz, false);
  }
  
  public zfu(zdz paramzdz, boolean paramBoolean)
    throws Exception
  {
    super(paramzdz);
    this.d = paramBoolean;
    this.a = new zh();
    this.b = new zgd(this.a);
  }
  
  public zm e()
  {
    return this.a;
  }
  
  public void a(String paramString)
    throws Exception
  {
    this.b.a(paramString);
  }
  
  public void b(String paramString)
    throws Exception
  {
    this.b.c(paramString);
  }
  
  public void c(String paramString)
    throws Exception
  {
    this.b.b(paramString);
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    this.b.a(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void a(byte paramByte)
    throws Exception
  {
    this.b.a(paramByte);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, String paramString)
    throws Exception
  {
    if ((!c) && ((paramString == null) || (zw.b(paramString, "")))) {
      throw new AssertionError();
    }
    StringBuilder localStringBuilder = new StringBuilder(128);
    zgd.a(paramFloat1, localStringBuilder);
    localStringBuilder.append(' ');
    zgd.a(paramFloat2, localStringBuilder);
    localStringBuilder.append(' ');
    zgd.a(paramFloat3, localStringBuilder);
    localStringBuilder.append(' ');
    zgd.a(paramFloat4, localStringBuilder);
    localStringBuilder.append(' ');
    zgd.a(paramFloat5, localStringBuilder);
    localStringBuilder.append(' ');
    zgd.a(paramFloat6, localStringBuilder);
    localStringBuilder.append(' ');
    localStringBuilder.append(paramString);
    c(zs.a(localStringBuilder));
  }
  
  public void a(float[] paramArrayOfFloat, String paramString)
    throws Exception
  {
    if ((!c) && ((paramArrayOfFloat == null) || (paramArrayOfFloat.length != 6))) {
      throw new AssertionError();
    }
    a(paramArrayOfFloat[0], paramArrayOfFloat[1], paramArrayOfFloat[2], paramArrayOfFloat[3], paramArrayOfFloat[4], paramArrayOfFloat[5], paramString);
  }
  
  public void a(zi paramzi, String paramString)
    throws Exception
  {
    if ((!c) && (paramzi == null)) {
      throw new AssertionError();
    }
    a(paramzi.d(), paramString);
  }
  
  public void d(String paramString)
    throws Exception
  {
    this.b.d(paramString);
  }
  
  public void a(byte[] paramArrayOfByte)
    throws Exception
  {
    this.b.b(paramArrayOfByte);
  }
  
  public void b(zez paramzez)
    throws Exception
  {}
  
  public void d(zez paramzez)
    throws Exception
  {
    zh localzh = this.a;
    if (f() != null) {
      localzh = f().a(this.a);
    }
    paramzez.a(this);
    paramzez.g();
    b(paramzez);
    paramzez.a("/Length", (float)localzh.h());
    if (this.d) {
      paramzez.a("/Length1", (float)this.a.h());
    }
    if (f() != null) {
      f().a(paramzez);
    }
    paramzez.h();
    paramzez.a("\r\nstream\r\n");
    localzh.a(paramzez.d());
    this.a.g_();
    localzh.g_();
    this.a = null;
    localzh = null;
    paramzez.a("\r\nendstream\r\n");
    paramzez.b();
  }
  
  public void e(zez paramzez)
    throws Exception
  {
    zh localzh = this.a;
    if (f() != null) {
      localzh = f().a(this.a);
    }
    paramzez.a(this);
    paramzez.g();
    b(paramzez);
    paramzez.a("/Length", (float)localzh.h());
    if (this.d) {
      paramzez.a("/Length1", (float)localzh.h());
    }
    if (f() != null) {
      f().a(paramzez);
    }
    paramzez.h();
    paramzez.a("\r\nstream\r\n");
    zfq localzfq = this.e.k();
    localzfq.a(this);
    localzfq.a(localzh);
    localzh.a(paramzez.d());
    this.a.g_();
    localzh.g_();
    this.a = null;
    localzh = null;
    paramzez.a("\r\nendstream\r\n");
    paramzez.b();
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    if (this.e.b().p() != null) {
      e(paramzez);
    } else {
      d(paramzez);
    }
  }
  
  protected boolean b()
  {
    return false;
  }
  
  protected zef f()
    throws Exception
  {
    if (this.f == null) {
      this.f = zef.a(c(), this.e.b().c());
    }
    return this.f;
  }
  
  private int c()
  {
    return !b() ? this.e.b().g() : this.e.b().h();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */