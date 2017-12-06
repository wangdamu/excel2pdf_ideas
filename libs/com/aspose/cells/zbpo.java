package com.aspose.cells;

class zbpo
{
  String a = "{A8765BA9-456A-4dab-B4F3-ACF838C121DE}";
  String b;
  String c;
  String d;
  int e;
  int f;
  boolean g;
  boolean h;
  int i;
  double j = 0.1D;
  double k = 0.03D;
  private Object q;
  String l;
  int m;
  zbpr n;
  zbpp o;
  zbpw p;
  
  zbpo(zbpr paramzbpr)
  {
    this.n = paramzbpr;
    this.q = Integer.valueOf(0);
    this.g = true;
    this.h = false;
    this.f = 1;
    this.p = new zbpw(this.n.a().getShapes(), this);
  }
  
  public String a()
  {
    if (this.q == null) {
      return null;
    }
    if ((this.q instanceof String)) {
      return (String)this.q;
    }
    return zbqb.d(((Integer)this.q).intValue());
  }
  
  public void a(String paramString)
  {
    int i1 = zbqb.b(paramString);
    if (i1 != 14) {
      this.q = Integer.valueOf(i1);
    } else {
      this.q = paramString;
    }
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  String b()
  {
    return this.c;
  }
  
  void c(String paramString)
  {
    this.c = paramString;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public void d(String paramString)
  {
    this.d = paramString;
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public boolean d()
  {
    return this.g;
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public boolean e()
  {
    return this.h;
  }
  
  public void b(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public int f()
  {
    return this.f;
  }
  
  int g()
  {
    return this.i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbpo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */