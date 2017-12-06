package com.aspose.cells;

import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;

class zbcz
  implements zaiy
{
  zq a = new zq(0.0F, 0.0F, 0.0F, 0.0F);
  int b;
  zt c;
  private com.aspose.cells.b.a.b.zg d;
  private String e = "";
  private Color f;
  private zzo g;
  private boolean h = false;
  
  zbcz(String paramString, com.aspose.cells.b.a.b.zg paramzg, Color paramColor, zaid paramzaid, int paramInt)
  {
    this.e = paramString;
    this.d = paramzg;
    this.f = paramColor;
    this.b = paramInt;
    if ((paramInt == 2) && ((paramString == null) || ("".equals(paramString)))) {
      a(1);
    }
    this.g = new zzo();
    this.g.a(paramzaid.a());
    this.g.b(paramzaid.b());
    this.g.c(paramzaid.c());
    this.g.d(paramzaid.d());
    this.g.a(paramzaid.e());
    this.g.f(paramzaid.g());
    this.g.e(paramzaid.f());
    this.g.g(paramzaid.h());
  }
  
  public int e()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public String a()
  {
    return this.e;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public com.aspose.cells.b.a.b.zg b()
  {
    return this.d;
  }
  
  public Color c()
  {
    return this.f;
  }
  
  public zzo d()
  {
    return this.g;
  }
  
  protected void finalize()
    throws Exception
  {
    a(false);
  }
  
  public void dispose()
  {
    a(true);
    com.aspose.cells.b.a.zg.a(this);
  }
  
  protected void a(boolean paramBoolean)
  {
    if (!this.h)
    {
      if ((paramBoolean) && (this.d != null)) {
        this.d.n();
      }
      this.h = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbcz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */