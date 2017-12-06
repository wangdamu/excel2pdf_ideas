package com.aspose.cells.a.d;

import com.aspose.cells.b.a.b.zq;

public class zk
  extends zn
{
  private zq a;
  private boolean b;
  private String c;
  
  public zk(zq paramzq, String paramString)
  {
    this.a = paramzq;
    if (zhf.e(paramString))
    {
      this.b = true;
      this.c = paramString.substring(1);
    }
    else
    {
      this.b = false;
      this.c = paramString;
    }
  }
  
  public zq a()
  {
    return this.a;
  }
  
  public boolean b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public void a(zf paramzf)
    throws Exception
  {
    paramzf.a(this);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */