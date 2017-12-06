package com.aspose.cells;

import com.aspose.cells.b.a.zg;

class zxq
  implements zaic
{
  private zaz a;
  private zanr b;
  private boolean c = false;
  
  zxq(zjf paramzjf)
  {
    this.b = new zanr(paramzjf, 5);
    this.a = new zaz(paramzjf, this, 3);
    this.a.a(1);
    this.a.b(Color.getEmpty());
    this.b.a(1);
    this.b.a(Color.getEmpty());
  }
  
  zanr a()
  {
    return this.b;
  }
  
  public zaip b()
  {
    return this.b;
  }
  
  zaz c()
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zxq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */