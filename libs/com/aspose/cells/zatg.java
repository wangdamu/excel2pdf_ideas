package com.aspose.cells;

class zatg
{
  Shape a;
  double b;
  double c;
  double d;
  double e;
  int f;
  int g;
  zaue h;
  zasd i;
  
  zatg(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    this.f = paramInt1;
    this.g = paramInt3;
    this.c = paramInt2;
    this.b = paramInt4;
    this.e = paramInt6;
    this.d = paramInt5;
  }
  
  zatg(Shape paramShape)
  {
    this.a = paramShape;
    int j = paramShape.getPlacement();
    paramShape.setPlacement(1);
    this.f = paramShape.getUpperLeftRow();
    this.g = paramShape.getUpperLeftColumn();
    this.b = paramShape.getLeft();
    this.c = paramShape.getTop();
    this.e = paramShape.getWidth();
    this.d = paramShape.getHeight();
    paramShape.setPlacement(j);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zatg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */