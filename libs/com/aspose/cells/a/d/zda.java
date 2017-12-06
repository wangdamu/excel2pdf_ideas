package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;

public class zda
{
  private int a;
  private long b;
  private int c;
  private byte[] d;
  private boolean e = false;
  private za f;
  
  public void a(za paramza)
    throws Exception
  {
    this.b = paramza.r();
    this.c = (paramza.p() & 0xFFFF);
    this.a = ((int)((this.b & 0xFFFFFFFF) - 3L) * 2);
    this.d = paramza.f(this.a);
  }
  
  public void b(za paramza)
    throws Exception
  {
    if (paramza.k().i() + 8L > paramza.k().h())
    {
      this.c = 0;
      return;
    }
    this.c = ((int)(paramza.r() & 0xFFFFFFFF));
    this.b = paramza.r();
    if ((this.b & 0xFFFFFFFF) < 8L)
    {
      this.c = 0;
      return;
    }
    this.a = ((int)((this.b & 0xFFFFFFFF) - 8L));
    if (this.a > 0)
    {
      this.d = paramza.f(this.a);
      if (d() == 70)
      {
        zh localzh = new zh();
        localzh.b(this.d, 0, c());
        localzh.b(localzh.i() - c());
        this.f = new za(localzh);
        this.f.q();
        int i = this.f.q();
        this.e = (i == 726027589);
      }
    }
  }
  
  public boolean a()
  {
    return this.c == 0;
  }
  
  public boolean b()
  {
    return this.e;
  }
  
  public int c()
  {
    return this.a;
  }
  
  public int d()
  {
    return this.c;
  }
  
  public byte[] e()
  {
    return this.d;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zda.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */