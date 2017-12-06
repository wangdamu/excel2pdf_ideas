package com.aspose.cells;

import java.util.ArrayList;

class zafr
{
  private int b;
  private int c;
  private double d;
  private double e;
  private double f;
  private double g;
  private int h;
  private int i;
  private Shape j;
  private int k;
  ArrayList a;
  private String l;
  
  zafr(Shape paramShape, int paramInt, String paramString)
  {
    this.j = paramShape;
    this.k = paramInt;
    this.l = paramString;
    int m = paramShape.getPlacement();
    if (this.j.getMsoDrawingType() == 0) {
      this.a = new ArrayList();
    }
    if (!this.j.W())
    {
      double[] arrayOfDouble = paramShape.L();
      this.b = ((int)arrayOfDouble[2]);
      this.c = ((int)arrayOfDouble[0]);
      this.d = arrayOfDouble[3];
      this.e = arrayOfDouble[1];
      this.h = ((int)arrayOfDouble[6]);
      this.i = ((int)arrayOfDouble[4]);
      this.f = arrayOfDouble[8];
      this.g = arrayOfDouble[9];
    }
  }
  
  public int a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.h;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.i;
  }
  
  public String e()
  {
    return this.l;
  }
  
  Shape f()
  {
    return this.j;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */