package com.aspose.cells;

import com.aspose.cells.b.a.zs;

abstract class zy
  extends zn
{
  private String e;
  private String f;
  
  public zy(zig paramzig, String paramString1, String paramString2)
  {
    super(paramzig);
    this.e = paramString1;
    this.f = paramString2;
  }
  
  protected abstract void a(zzu paramzzu, DateTime paramDateTime, double paramDouble, StringBuilder paramStringBuilder);
  
  public zzz a(zzu paramzzu, DateTime paramDateTime, double paramDouble, boolean paramBoolean)
  {
    zzz localzzz = super.a(paramzzu, paramDateTime, paramDouble, false);
    if (localzzz.f() != 7) {
      return localzzz;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    b(paramzzu, paramDateTime, paramDouble, localStringBuilder);
    localzzz.a(3, zs.a(localStringBuilder));
    return localzzz;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public void b(String paramString)
  {
    this.f = paramString;
  }
  
  public void b(zzu paramzzu, DateTime paramDateTime, double paramDouble, StringBuilder paramStringBuilder)
  {
    if (this.e != null) {
      paramStringBuilder.append(this.e);
    }
    a(paramzzu, paramDateTime, paramDouble, paramStringBuilder);
    if (this.f != null) {
      paramStringBuilder.append(this.f);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */