package com.aspose.cells.b.a.g.a;

public class zb
{
  private zc a;
  
  public zb(zc paramzc)
  {
    this.a = paramzc;
  }
  
  public za a(int paramInt)
  {
    String str = null;
    if ((this.a.c()) && (paramInt <= this.a.f().groupCount()) && (paramInt >= 0)) {
      str = this.a.f().group(paramInt);
    }
    if (str == null) {
      return za.a;
    }
    return new za(str, str != null);
  }
  
  public int a()
  {
    return this.a.f().groupCount() + 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/g/a/zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */