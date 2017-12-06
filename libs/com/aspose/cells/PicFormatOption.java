package com.aspose.cells;

public class PicFormatOption
{
  private int b = 3584;
  private int c = 0;
  private double d = 1.0D;
  private int e;
  private int f;
  private int g;
  private int h;
  int a = 19;
  
  int a()
  {
    return this.b;
  }
  
  void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public int getType()
  {
    return this.c;
  }
  
  public void setType(int value)
  {
    this.c = value;
  }
  
  public double getScale()
  {
    return this.d;
  }
  
  public void setScale(double value)
  {
    this.d = value;
  }
  
  public double getLeft()
  {
    return this.e / 1000.0D;
  }
  
  public void setLeft(double value)
  {
    this.e = ((int)(value * 1000.0D + 0.5D));
  }
  
  public double getTop()
  {
    return this.f / 1000.0D;
  }
  
  public void setTop(double value)
  {
    this.f = ((int)(value * 1000.0D + 0.5D));
  }
  
  public double getBottom()
  {
    return this.h / 1000.0D;
  }
  
  public void setBottom(double value)
  {
    this.h = ((int)(value * 1000.0D + 0.5D));
  }
  
  public double getRight()
  {
    return this.g / 1000.0D;
  }
  
  public void setRight(double value)
  {
    this.g = ((int)(value * 1000.0D + 0.5D));
  }
  
  boolean b()
  {
    return (a() & 0xFFFF & 0x800) != 0;
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      a(a() | 0x800);
    } else {
      a(a() & 0xF7FF);
    }
  }
  
  boolean c()
  {
    return (a() & 0xFFFF & 0x400) != 0;
  }
  
  void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      a(a() | 0x800);
    } else {
      a(a() & 0xFBFF);
    }
  }
  
  boolean d()
  {
    return (a() & 0xFFFF & 0x200) != 0;
  }
  
  void c(boolean paramBoolean)
  {
    if (paramBoolean) {
      a(a() | 0x800);
    } else {
      a(a() & 0xFDFF);
    }
  }
  
  void a(PicFormatOption paramPicFormatOption)
  {
    this.b = paramPicFormatOption.b;
    this.c = paramPicFormatOption.c;
    this.d = paramPicFormatOption.d;
    this.a = paramPicFormatOption.a;
    this.e = paramPicFormatOption.e;
    this.f = paramPicFormatOption.f;
    this.h = paramPicFormatOption.h;
    this.g = paramPicFormatOption.g;
  }
  
  boolean b(PicFormatOption paramPicFormatOption)
  {
    if (this.b != paramPicFormatOption.b) {
      return false;
    }
    if (this.c != paramPicFormatOption.c) {
      return false;
    }
    if (this.d != paramPicFormatOption.d) {
      return false;
    }
    if (this.a != paramPicFormatOption.a) {
      return false;
    }
    if (this.e != paramPicFormatOption.e) {
      return false;
    }
    if (this.f != paramPicFormatOption.f) {
      return false;
    }
    if (this.h != paramPicFormatOption.h) {
      return false;
    }
    return this.g == paramPicFormatOption.g;
  }
  
  int e()
  {
    return this.e;
  }
  
  void b(int paramInt)
  {
    this.e = paramInt;
  }
  
  int f()
  {
    return this.f;
  }
  
  void c(int paramInt)
  {
    this.f = paramInt;
  }
  
  int g()
  {
    return this.g;
  }
  
  void d(int paramInt)
  {
    this.g = paramInt;
  }
  
  int h()
  {
    return this.h;
  }
  
  void e(int paramInt)
  {
    this.h = paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PicFormatOption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */