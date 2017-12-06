package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zm;

public class zbq
{
  public int a;
  public short b;
  public int c;
  public zaq[] d;
  
  public zbq() {}
  
  public zbq(zz paramzz, zha paramzha, int paramInt)
    throws Exception
  {
    if (paramzha == null) {
      return;
    }
    paramzz.a().b(paramzha.c);
    this.a = paramzz.e();
    this.b = paramzz.d();
    this.c = paramzz.b();
    this.d = new zaq[this.b];
    for (int i = 0; i < this.b; i++)
    {
      paramzz.a().b(paramzha.c + 8 + i * this.c);
      zaq localzaq = new zaq();
      localzaq.a = paramzz.f();
      localzaq.b = paramzz.f();
      localzaq.c = paramzz.a(paramInt);
      this.d[i] = localzaq;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zbq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */