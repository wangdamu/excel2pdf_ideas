package com.aspose.cells;

class zavq
  extends zavp
{
  private String a;
  private String b;
  private String c;
  private boolean d = false;
  
  public int a()
  {
    return 4;
  }
  
  public int b()
  {
    if ((this.d) || (this.b != null) || (this.a != null)) {
      return -1;
    }
    String str = e();
    if (str == null) {
      return 0;
    }
    for (int i = str.length() - 1; i > -1; i--) {
      switch (str.charAt(i))
      {
      case '#': 
      case '.': 
      case '0': 
        break;
      default: 
        return -1;
      }
    }
    return 0;
  }
  
  public void c()
  {
    super.c();
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = false;
  }
  
  public void b(String paramString)
  {
    this.a = paramString;
  }
  
  public String f()
  {
    return this.a;
  }
  
  public void c(String paramString)
  {
    this.b = paramString;
  }
  
  public String g()
  {
    return this.b;
  }
  
  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public boolean h()
  {
    return this.d;
  }
  
  public void d(String paramString)
  {
    this.c = paramString;
  }
  
  public String i()
  {
    return this.c;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zavq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */