package com.aspose.cells.a.d;

public class zcj
  implements zbw
{
  private zds[] a;
  private long b = 0L;
  
  public void a(zcw paramzcw)
    throws Exception
  {
    this.b = paramzcw.r();
    paramzcw.n();
    int i = paramzcw.n();
    this.a = new zds[i];
    for (int j = 0; j < i; j++)
    {
      this.a[j] = new zds();
      this.a[j].a(paramzcw.m());
      this.a[j].b(paramzcw.m());
      this.a[j].c(paramzcw.m());
      this.a[j].a(paramzcw.m() & 0xFF);
    }
  }
  
  public long b()
  {
    return this.b;
  }
  
  public void a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public int a()
  {
    return 10;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zcj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */