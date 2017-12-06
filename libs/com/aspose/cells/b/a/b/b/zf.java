package com.aspose.cells.b.a.b.b;

import com.aspose.cells.a.d.zcb;
import com.aspose.cells.a.d.zcc;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import java.io.IOException;

public class zf
  extends zj
{
  public int h()
  {
    return this.c.c();
  }
  
  public int i()
  {
    return this.c.b();
  }
  
  public zf(zm paramzm)
  {
    int i = 0;
    try
    {
      i = (int)paramzm.h();
    }
    catch (Exception localException1) {}
    this.f = new byte[i];
    try
    {
      paramzm.a(this.f, 0, i);
      zcb localzcb = zcc.u(this.f);
      this.c = new zs(localzcb.b(), localzcb.c());
    }
    catch (Exception localException2) {}
  }
  
  public zj a()
  {
    zh localzh = new zh();
    try
    {
      localzh.b(this.f, 0, this.f.length);
      localzh.b(0L);
      return new zf(localzh);
    }
    catch (IOException localIOException) {}
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/b/zf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */