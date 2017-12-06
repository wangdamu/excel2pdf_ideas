package com.aspose.cells;

class zbta
  implements zajm
{
  private zbzv a;
  private int b;
  private Style c;
  
  zbta(zadm paramzadm)
  {
    this.a = ((zbzv)paramzadm.f.getWorksheets().C());
    this.b = this.a.getCount();
  }
  
  public boolean a()
  {
    return false;
  }
  
  public Style a(int paramInt)
  {
    if (paramInt == this.b) {
      return this.c;
    }
    if ((paramInt > -1) && (paramInt < this.b)) {
      return this.a.c(paramInt);
    }
    return this.a.c(15);
  }
  
  public Style b(int paramInt)
  {
    if (paramInt == this.b) {
      return this.c;
    }
    if ((paramInt < 0) || (paramInt == 15) || (paramInt > this.b)) {
      return null;
    }
    return this.a.c(paramInt);
  }
  
  public void a(int paramInt, Style paramStyle)
  {
    if (paramInt == this.b) {
      this.c = paramStyle;
    }
    if (paramInt < this.b) {
      this.a.a(paramInt, paramStyle);
    }
  }
  
  public Style a(String paramString)
  {
    return this.a.a(paramString);
  }
  
  public int b()
  {
    return this.b + 1;
  }
  
  public int a(Style paramStyle)
  {
    this.c = paramStyle;
    return this.b;
  }
  
  public int a(Style paramStyle, CopyOptions paramCopyOptions)
  {
    return a(paramStyle);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbta.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */