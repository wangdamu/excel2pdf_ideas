package com.aspose.cells;

class zbsz
  implements zajm
{
  private zang a;
  private zbzv b;
  private int c;
  private int d;
  
  zbsz(zang paramzang)
  {
    this.a = paramzang;
    this.b = ((zbzv)paramzang.a.f.getWorksheets().C());
    this.c = this.b.getCount();
    this.d = (this.c - 1);
  }
  
  int c()
  {
    return this.d > this.c ? this.c : -1;
  }
  
  public boolean a()
  {
    return false;
  }
  
  public Style a(int paramInt)
  {
    return this.b.a(paramInt);
  }
  
  public Style b(int paramInt)
  {
    return this.b.b(paramInt);
  }
  
  public void a(int paramInt, Style paramStyle)
  {
    this.b.a(paramInt, paramStyle);
  }
  
  public Style a(String paramString)
  {
    return this.b.a(paramString);
  }
  
  public int b()
  {
    return this.b.getCount();
  }
  
  public int a(Style paramStyle)
  {
    int i = this.b.a(paramStyle);
    if (i > this.d)
    {
      if (i >= this.a.a.c) {
        throw new CellsException(10, "You have used too many different styles.");
      }
      this.d = i;
      paramStyle = this.b.a(i);
      Font localFont = paramStyle.q();
      if (localFont != null) {
        this.a.b.a(localFont);
      }
      if (paramStyle.getNumber() == 0)
      {
        String str = paramStyle.t();
        if ((str != null) && (!"".equals(str))) {
          paramStyle.f(this.a.b.d(str));
        }
      }
      this.a.a(paramStyle, i);
    }
    return i;
  }
  
  public int a(Style paramStyle, CopyOptions paramCopyOptions)
  {
    return a(paramStyle);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbsz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */