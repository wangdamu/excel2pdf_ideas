package com.aspose.cells;

class zcih
  extends zcfo
{
  private ListObject c;
  
  zcih(ListObject paramListObject)
  {
    this.c = paramListObject;
  }
  
  void d()
    throws Exception
  {
    zcbs localzcbs = new zcbs(this.c);
    localzcbs.a(this.b);
    if (this.c.m()) {
      zcip.a(this.c.n(), this.b);
    }
    e();
    f();
    zche localzche = new zche(344);
    localzche.a(this.b);
  }
  
  private void e()
    throws Exception
  {
    int i = this.c.getListColumns().getCount();
    zche localzche1 = new zche(345, i);
    localzche1.a(this.b);
    for (int j = 0; j < i; j++)
    {
      ListColumn localListColumn = this.c.getListColumns().get(j);
      a(localListColumn);
    }
    zche localzche2 = new zche(346);
    localzche2.a(this.b);
  }
  
  private void a(ListColumn paramListColumn)
    throws Exception
  {
    zcbr localzcbr = new zcbr(paramListColumn);
    localzcbr.a(this.b);
    if (paramListColumn.e != null)
    {
      localObject = new zcib(paramListColumn);
      ((zcib)localObject).a(this.b);
    }
    if (paramListColumn.f != null)
    {
      localObject = new zcig(paramListColumn);
      ((zcig)localObject).a(this.b);
    }
    if (paramListColumn.a() != null)
    {
      localObject = new zea(paramListColumn.a());
      ((zea)localObject).a(this.b);
      zche.a(350, this.b);
    }
    Object localObject = new zche(348);
    ((zche)localObject).a(this.b);
  }
  
  private void f()
    throws Exception
  {
    zcie localzcie = new zcie(this.c);
    localzcie.a(this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */