package com.aspose.cells.a.d;

import java.util.HashMap;

public class zgy
  extends HashMap
{
  private zgx a;
  private boolean b;
  
  public zgy(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public zgx a(int paramInt)
  {
    zgx localzgx = (zgx)super.get(Integer.valueOf(paramInt));
    if (localzgx != null) {
      return localzgx;
    }
    if (this.b)
    {
      if (zbd.b(paramInt)) {
        return (zgx)super.get(Integer.valueOf(zbd.a(paramInt)));
      }
      return (zgx)super.get(Integer.valueOf(zbd.c(paramInt)));
    }
    return null;
  }
  
  public void a(zgx paramzgx)
  {
    this.a = paramzgx;
  }
  
  public void b(zgx paramzgx)
  {
    super.put(Integer.valueOf(paramzgx.a()), paramzgx);
  }
  
  public zgx b(int paramInt)
  {
    zgx localzgx = a(paramInt);
    if (localzgx == null) {
      localzgx = a();
    }
    return localzgx;
  }
  
  private zgx a()
  {
    zgx localzgx = this.a;
    if (localzgx != null) {
      return localzgx;
    }
    localzgx = a(32);
    if (localzgx != null) {
      return localzgx;
    }
    throw new IllegalStateException("Cannot find a glyph for this character code.");
  }
  
  public boolean c(int paramInt)
  {
    zgx localzgx = a(paramInt);
    return null != localzgx;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zgy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */