package com.aspose.cells;

class zzt
{
  FormatCondition a;
  int b = -1;
  zbzi c;
  zsz d = null;
  int e;
  byte[] f;
  
  zzt(int paramInt1, FormatCondition paramFormatCondition, int paramInt2)
  {
    this.e = paramInt1;
    this.a = paramFormatCondition;
    switch (paramFormatCondition.c)
    {
    case 2: 
    case 3: 
    case 4: 
      break;
    case 0: 
    case 1: 
      d();
      if ((this.d == null) || (this.d.a == null) || (this.d.a.length == paramFormatCondition.f.s().length())) {
        this.b = paramInt2;
      }
      break;
    default: 
      d();
      this.f = paramFormatCondition.a();
      if (this.f != null) {
        this.b = paramInt2;
      }
      break;
    }
  }
  
  boolean a()
  {
    return (this.b > -1) && (this.b < 3);
  }
  
  boolean b()
  {
    if (this.c != null) {
      return true;
    }
    switch (this.a.c)
    {
    case 0: 
    case 1: 
      return false;
    }
    return true;
  }
  
  int c()
  {
    int i = 4;
    if (this.d != null) {
      i += this.d.d();
    }
    if (this.c != null) {
      i += 8 + zbzh.a(this.c);
    }
    return i > 4 ? i : 6;
  }
  
  private void d()
  {
    if (this.a.f != null)
    {
      this.d = new zsz(this.a.f);
      this.c = new zbzi();
      this.c.a(this.a.f);
      if (this.c.getCount() < 1) {
        this.c = null;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */