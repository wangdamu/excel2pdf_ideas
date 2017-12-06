package com.aspose.cells;

abstract class zaae
{
  public int a = 0;
  public Object b;
  public Worksheet c;
  public int d = 0;
  public short e = 0;
  public boolean f = false;
  
  public abstract boolean a();
  
  public abstract WorksheetCollection b();
  
  public void a(zaai paramzaai)
  {
    this.a = 0;
    this.b = paramzaai;
    this.d = paramzaai.e;
    this.e = paramzaai.f;
    this.f = false;
  }
  
  public void a(zaqg paramzaqg)
  {
    this.a = 1;
    this.b = paramzaqg;
    this.f = true;
  }
  
  public void a(FormatCondition paramFormatCondition)
  {
    this.a = 5;
    this.b = paramFormatCondition;
    this.f = true;
  }
  
  public void a(Validation paramValidation)
  {
    this.a = 6;
    this.b = paramValidation;
    this.f = true;
  }
  
  public void a(zjk paramzjk)
  {
    this.a = 2;
    this.b = paramzjk;
    this.f = false;
  }
  
  public void a(zawp paramzawp)
  {
    this.a = 7;
    this.b = paramzawp;
    this.f = false;
  }
  
  public void a(zaxa paramzaxa)
  {
    this.a = 8;
    this.b = paramzaxa;
    this.f = false;
  }
  
  public void a(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    case 0: 
      a((zaai)paramObject);
      return;
    case 1: 
      a((zaqg)paramObject);
      return;
    case 5: 
      a((FormatCondition)paramObject);
      return;
    case 6: 
      a((Validation)paramObject);
      return;
    case 2: 
      a((zjk)paramObject);
      return;
    case 7: 
      a((zawp)paramObject);
      return;
    case 8: 
      a((zaxa)paramObject);
      return;
    }
    this.b = paramObject;
    this.a = 7;
    this.f = false;
  }
  
  public void a(zaae paramzaae)
  {
    this.c = paramzaae.c;
    this.a = paramzaae.a;
    this.b = paramzaae.b;
    this.d = paramzaae.d;
    this.e = paramzaae.e;
    this.f = paramzaae.f;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */