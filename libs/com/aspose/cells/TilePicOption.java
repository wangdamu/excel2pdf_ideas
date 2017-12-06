package com.aspose.cells;

public class TilePicOption
{
  private int a = 0;
  private int b = 0;
  private int c = 100000;
  private int d = 100000;
  private int e = 0;
  private int f = 7;
  
  public double getOffsetX()
  {
    return this.a / znq.j;
  }
  
  public void setOffsetX(double value)
  {
    this.a = ((int)(value * znq.j + 0.5D));
  }
  
  public double getOffsetY()
  {
    return this.b / znq.j;
  }
  
  public void setOffsetY(double value)
  {
    this.b = ((int)(value * znq.j + 0.5D));
  }
  
  public double getScaleX()
  {
    return this.c / 1000.0D;
  }
  
  public void setScaleX(double value)
  {
    this.c = ((int)(value * 1000.0D + 0.5D));
  }
  
  public double getScaleY()
  {
    return this.d / 1000.0D;
  }
  
  public void setScaleY(double value)
  {
    this.d = ((int)(value * 1000.0D + 0.5D));
  }
  
  public int getMirrorType()
  {
    return this.e;
  }
  
  public void setMirrorType(int value)
  {
    this.e = value;
  }
  
  public int getAlignmentType()
  {
    return this.f;
  }
  
  public void setAlignmentType(int value)
  {
    this.f = value;
  }
  
  void a(TilePicOption paramTilePicOption)
  {
    this.a = paramTilePicOption.a;
    this.c = paramTilePicOption.c;
    this.b = paramTilePicOption.b;
    this.d = paramTilePicOption.d;
    this.e = paramTilePicOption.e;
    this.f = paramTilePicOption.f;
  }
  
  boolean b(TilePicOption paramTilePicOption)
  {
    if (this.a != paramTilePicOption.a) {
      return false;
    }
    if (this.c != paramTilePicOption.c) {
      return false;
    }
    if (this.b != paramTilePicOption.b) {
      return false;
    }
    if (this.d != paramTilePicOption.d) {
      return false;
    }
    if (this.e != paramTilePicOption.e) {
      return false;
    }
    return this.f == paramTilePicOption.f;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TilePicOption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */