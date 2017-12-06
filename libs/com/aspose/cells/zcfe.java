package com.aspose.cells;

import java.util.HashMap;

class zcfe
  extends zcfo
{
  private zpu c;
  private HashMap d;
  
  zcfe(zpu paramzpu)
  {
    this.c = paramzpu;
    this.d = new HashMap();
    for (int i = 0; i < paramzpu.a.getComments().getCount(); i++)
    {
      Comment localComment = paramzpu.a.getComments().get(i);
      if (this.d.get(localComment.getAuthor()) == null) {
        this.d.put(localComment.getAuthor(), Integer.valueOf(i));
      }
    }
  }
  
  void d()
    throws Exception
  {
    zche localzche1 = new zche(628);
    localzche1.a(this.b);
    e();
    f();
    zche localzche2 = new zche(629);
    localzche2.a(this.b);
  }
  
  private void e()
    throws Exception
  {
    zche localzche1 = new zche(630);
    localzche1.a(this.b);
    Comment localComment = this.c.a.getComments().get(0);
    String str = localComment.getAuthor();
    zcfb localzcfb = new zcfb(str);
    localzcfb.a(this.b);
    zche localzche2 = new zche(631);
    localzche2.a(this.b);
  }
  
  private void f()
    throws Exception
  {
    zche localzche1 = new zche(633);
    localzche1.a(this.b);
    for (int i = 0; i < this.c.a.getComments().getCount(); i++)
    {
      Comment localComment = this.c.a.getComments().get(i);
      a(localComment);
    }
    zche localzche2 = new zche(634);
    localzche2.a(this.b);
  }
  
  private void a(Comment paramComment)
    throws Exception
  {
    zcau localzcau = new zcau(0, paramComment);
    localzcau.a(this.b);
    if (paramComment.b().getText() != null)
    {
      localObject = new zcfc();
      ((zcfc)localObject).a(paramComment.b(), this.c.b);
      ((zcfc)localObject).a(this.b);
    }
    Object localObject = new zche(636);
    ((zche)localObject).a(this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */