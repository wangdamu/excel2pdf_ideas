package com.aspose.cells.a.d;

import java.util.HashMap;

public class zgt
{
  private String a;
  private HashMap b;
  
  public zgt(String paramString)
  {
    this.a = paramString;
    this.b = new HashMap();
  }
  
  public void a(zgs paramzgs)
  {
    if (paramzgs == null) {
      throw new NullPointerException("font");
    }
    this.b.put(Integer.valueOf(paramzgs.f()), paramzgs);
  }
  
  public zgs a(int paramInt, boolean paramBoolean)
  {
    zgs localzgs = (zgs)this.b.get(Integer.valueOf(paramInt));
    if (localzgs != null) {
      return localzgs;
    }
    if (paramBoolean) {
      return null;
    }
    int i = paramInt & 0xFFFFFFFB;
    localzgs = (zgs)this.b.get(Integer.valueOf(i));
    if (localzgs != null) {
      return localzgs;
    }
    i = paramInt & 0xFFFFFFF7;
    localzgs = (zgs)this.b.get(Integer.valueOf(i));
    if (localzgs != null) {
      return localzgs;
    }
    i = paramInt & 0xFFFFFFFD;
    localzgs = (zgs)this.b.get(Integer.valueOf(i));
    if (localzgs != null) {
      return localzgs;
    }
    i = paramInt & 0xFFFFFFFE;
    localzgs = (zgs)this.b.get(Integer.valueOf(i));
    if (localzgs != null) {
      return localzgs;
    }
    i = 1;
    localzgs = (zgs)this.b.get(Integer.valueOf(i));
    if (localzgs != null) {
      return localzgs;
    }
    i = 2;
    localzgs = (zgs)this.b.get(Integer.valueOf(i));
    if (localzgs != null) {
      return localzgs;
    }
    return (zgs)this.b.get(Integer.valueOf(0));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */