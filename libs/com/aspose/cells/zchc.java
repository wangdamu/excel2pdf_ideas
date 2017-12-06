package com.aspose.cells;

class zchc
  extends zcfo
{
  private QueryTable c;
  
  zchc(QueryTable paramQueryTable)
  {
    this.c = paramQueryTable;
  }
  
  void d()
    throws Exception
  {
    zed localzed = new zed(this.c);
    localzed.a(this.b);
    if (((this.c.g != null) && (this.c.g.getCount() > 0)) || ((this.c.g != null) && (this.c.g.getCount() > 0)))
    {
      zec localzec = new zec(this.c);
      localzec.a(this.b);
      int i;
      zaye localzaye;
      Object localObject;
      if ((this.c.g != null) && (this.c.g.getCount() > 0))
      {
        zche.a(455, this.c.g.getCount(), 4, this.b);
        for (i = 0; i < this.c.g.getCount(); i++)
        {
          localzaye = this.c.g.a(i);
          localObject = new zeb(localzaye);
          ((zeb)localObject).a(this.b);
          zche.a(458, this.b);
        }
        zche.a(456, this.b);
      }
      if ((this.c.h != null) && (this.c.h.getCount() > 0))
      {
        zche.a(451, this.c.h.getCount(), 4, this.b);
        for (i = 0; i < this.c.h.getCount(); i++)
        {
          localzaye = this.c.h.a(i);
          localObject = new zdq(localzaye);
          ((zdq)localObject).a(this.b);
          zche.a(454, this.b);
        }
        zche.a(452, this.b);
      }
      zche.a(450, this.b);
    }
    zche.a(448, this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */