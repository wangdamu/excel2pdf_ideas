package com.aspose.cells;

class zsu
  extends ztp
{
  private zpi b;
  private Shape c;
  
  zsu(zpi paramzpi)
  {
    this.b = paramzpi;
    this.c = this.b.a;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("a:downRevStg");
    paramzcjz.a("xmlns:a", "http://schemas.openxmlformats.org/drawingml/2006/main");
    paramzcjz.a("shapeCheckSum", "");
    paramzcjz.a("textCheckSum", "");
    paramzcjz.a("shapeId", zauj.z(this.c.O()));
    paramzcjz.a("ver", "1");
    b(paramzcjz);
    paramzcjz.b();
  }
  
  private void b(zcjz paramzcjz)
    throws Exception
  {
    int[] arrayOfInt = this.c.M();
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    int k = arrayOfInt[2];
    int m = arrayOfInt[3];
    int n = arrayOfInt[4];
    int i1 = arrayOfInt[5];
    int i2 = arrayOfInt[6];
    int i3 = arrayOfInt[7];
    paramzcjz.b("a:xlAnchor");
    if (this.c.getPlacement() == 0)
    {
      paramzcjz.a("fMove", "1");
      paramzcjz.a("fResize", "1");
    }
    else if (this.c.getPlacement() == 1)
    {
      paramzcjz.a("fResize", "1");
    }
    a(paramzcjz, "a:from", k, i, m, j);
    a(paramzcjz, "a:to", i2, n, i3, i1);
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws Exception
  {
    paramzcjz.b(paramString);
    paramzcjz.a("row", zauj.z(paramInt1));
    paramzcjz.a("col", zauj.z(paramInt2));
    paramzcjz.a("rowOffset", zauj.z(paramInt3));
    paramzcjz.a("colOffset", zauj.z(paramInt4));
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zsu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */