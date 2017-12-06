package com.aspose.cells;

class zbbx
  extends zbbu
{
  int b;
  boolean c;
  private String m;
  byte[] d;
  int e;
  int f;
  boolean g;
  boolean h;
  int i;
  boolean j;
  int k;
  int l;
  
  public int a()
  {
    return 5;
  }
  
  String b()
  {
    if (this.m == null) {
      return "Author";
    }
    return this.m;
  }
  
  void a(String paramString)
  {
    this.m = paramString;
  }
  
  String c()
  {
    return CellsHelper.cellIndexToName(this.e, this.f);
  }
  
  void b(String paramString)
  {
    int n = 0;
    int i1 = 0;
    int[] arrayOfInt1 = { n };
    int[] arrayOfInt2 = { i1 };
    CellsHelper.a(paramString, arrayOfInt1, arrayOfInt2);
    n = arrayOfInt1[0];
    i1 = arrayOfInt2[0];
    this.e = n;
    this.f = i1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */