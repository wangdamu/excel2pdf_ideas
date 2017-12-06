package com.aspose.cells;

import com.aspose.cells.b.a.zg;

class zxp
  implements zaic
{
  private zay a;
  private zanq b;
  private boolean c = false;
  
  zxp(zje paramzje)
  {
    this.b = new zanq(paramzje);
    this.a = new zay(paramzje);
    this.a.b(paramzje.g(false).a(55));
    this.b.a(paramzje.g(false).a(40));
  }
  
  zanq a()
  {
    return this.b;
  }
  
  public zaip b()
  {
    return this.b;
  }
  
  zay c()
  {
    return this.a;
  }
  
  public zagu d()
  {
    return this.a;
  }
  
  protected void finalize()
    throws Exception
  {
    a(false);
  }
  
  public void dispose()
  {
    a(true);
    zg.a(this);
  }
  
  protected void a(boolean paramBoolean)
  {
    if (!this.c)
    {
      if ((paramBoolean) && (this.a != null)) {
        this.a.dispose();
      }
      this.c = true;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */