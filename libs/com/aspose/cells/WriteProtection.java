package com.aspose.cells;

public class WriteProtection
{
  String a;
  private boolean c;
  ztm b;
  
  ztm a()
  {
    if (this.b == null) {
      this.b = new ztm();
    }
    return this.b;
  }
  
  public boolean getRecommendReadOnly()
  {
    return this.c;
  }
  
  public void setRecommendReadOnly(boolean value)
  {
    this.c = value;
  }
  
  boolean b()
  {
    return (this.c) || (isWriteProtected());
  }
  
  public boolean isWriteProtected()
  {
    return (this.b != null) && (this.b.a());
  }
  
  public void setPassword(String value)
  {
    if ((value == null) || ("".equals(value))) {
      this.b = null;
    } else {
      a().a(zui.a(value));
    }
  }
  
  public boolean validatePassword(String password)
  {
    if (!isWriteProtected()) {
      return true;
    }
    if (this.b != null) {
      return this.b.a(password);
    }
    return true;
  }
  
  int c()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.b();
  }
  
  void a(int paramInt)
  {
    if (this.b == null) {
      this.b = new ztm();
    }
    this.b.a(paramInt);
  }
  
  void a(WriteProtection paramWriteProtection)
  {
    if (paramWriteProtection.b != null)
    {
      this.b = new ztm();
      this.b.a(paramWriteProtection.b);
    }
    this.c = paramWriteProtection.c;
    this.a = paramWriteProtection.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/WriteProtection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */