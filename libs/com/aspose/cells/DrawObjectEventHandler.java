package com.aspose.cells;

import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.d.zh;

public abstract class DrawObjectEventHandler
{
  private float a;
  private float b;
  private int c;
  private int d;
  private int e;
  
  public void draw(DrawObject drawObject, float x, float y, float width, float height) {}
  
  void a(float paramFloat1, float paramFloat2)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
  }
  
  void a(zavs paramzavs)
  {
    DrawObject localDrawObject = new DrawObject(paramzavs.F.h(), this.c, this.d, this.e);
    draw(localDrawObject, this.a + paramzavs.k, this.b + paramzavs.l, paramzavs.j, paramzavs.i);
  }
  
  void a(zh paramzh, zq paramzq)
    throws Exception
  {
    DrawObject localDrawObject = new DrawObject(paramzh.o(), this.c, this.d, this.e);
    draw(localDrawObject, this.a + paramzq.j(), this.b + paramzq.k(), paramzq.h(), paramzq.i());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DrawObjectEventHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */