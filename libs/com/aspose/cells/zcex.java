package com.aspose.cells;

class zcex
  extends zcfo
{
  private zpt c;
  private Workbook d;
  private zpu e;
  
  zcex(zpt paramzpt, zpu paramzpu)
  {
    this.c = paramzpt;
    this.d = paramzpt.a;
    this.e = paramzpu;
  }
  
  void d()
    throws Exception
  {
    Worksheet localWorksheet = this.e.a;
    zche localzche = new zche(129);
    localzche.a(this.b);
    zcfg localzcfg = new zcfg();
    localzcfg.a(localWorksheet);
    localzcfg.a(this.b);
    e();
    a(localWorksheet);
    if (this.e.a.a() != null)
    {
      localObject = new zcfh(localWorksheet.getProtection());
      ((zcfh)localObject).a(this.b);
    }
    if (this.e.j.a != null)
    {
      localObject = new zcfk(this.e.j.a);
      ((zcfk)localObject).a(this.b);
    }
    if (this.e.v != null)
    {
      localObject = new zcgm(this.e.v);
      ((zcgm)localObject).a(this.b);
    }
    if (this.e.u != null)
    {
      localObject = new zcgl(this.e.u);
      ((zcgl)localObject).a(this.b);
    }
    if (this.e.n != null)
    {
      localObject = new zcaq(this.e.n);
      ((zcaq)localObject).a(this.b);
    }
    Object localObject = new zche(130);
    ((zche)localObject).a(this.b);
  }
  
  private void e()
    throws Exception
  {
    zche localzche1 = new zche(139);
    localzche1.a(this.b);
    zcax localzcax = new zcax();
    localzcax.a(this.e.a);
    localzcax.a(this.b);
    zche localzche2 = new zche(142);
    localzche2.a(this.b);
    zche localzche3 = new zche(140);
    localzche3.a(this.b);
  }
  
  private void a(Worksheet paramWorksheet)
    throws Exception
  {
    PageSetup localPageSetup = paramWorksheet.getPageSetup();
    zcgn localzcgn = new zcgn(paramWorksheet.getPageSetup());
    localzcgn.a(this.b);
    zcff localzcff = new zcff(paramWorksheet.getPageSetup());
    localzcff.a(this.b);
    a(localPageSetup);
  }
  
  private void a(PageSetup paramPageSetup)
    throws Exception
  {
    zcgi localzcgi = new zcgi();
    localzcgi.a(paramPageSetup);
    localzcgi.a(this.b);
    zche localzche = new zche(480);
    localzche.a(this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */