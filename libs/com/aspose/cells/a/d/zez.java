package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zs;

public class zez
  extends zgd
{
  private zgl a = new zgl();
  
  public zez(zm paramzm)
  {
    super(paramzm);
    this.a.a(0, Integer.valueOf(0));
  }
  
  public int a()
  {
    return this.a.a();
  }
  
  public void a(zey paramzey)
    throws Exception
  {
    this.a.a(paramzey.n(), Integer.valueOf((int)d().i()));
    a(com.aspose.cells.b.a.zp.a(paramzey.n()));
    c(" 0 obj");
  }
  
  public void b()
    throws Exception
  {
    a("\r\nendobj\r\n");
  }
  
  public int c()
    throws Exception
  {
    int i = (int)d().i();
    c("xref");
    a("0 ");
    c(com.aspose.cells.b.a.zp.a(this.a.a()));
    c("0000000000 65535 f");
    StringBuilder localStringBuilder = new StringBuilder(20);
    for (int j = 1; j < this.a.a(); j++)
    {
      localStringBuilder.setLength(0);
      com.aspose.cells.a.c.zp.a(((Integer)this.a.c(j)).intValue(), 10, localStringBuilder);
      localStringBuilder.append(" 00000 n");
      c(zs.a(localStringBuilder));
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */