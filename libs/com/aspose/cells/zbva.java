package com.aspose.cells;

class zbva
{
  private PivotTable c;
  private int d;
  int a;
  String b;
  
  zbva(PivotTable paramPivotTable)
  {
    this.c = paramPivotTable;
    this.d = 1;
    this.a = 36;
  }
  
  void a(zbva paramzbva)
  {
    this.d = paramzbva.d;
    this.a = paramzbva.a;
  }
  
  boolean a(int paramInt)
  {
    return (this.a & paramInt) != 0;
  }
  
  void a(boolean paramBoolean, int paramInt)
  {
    this.a &= (paramInt ^ 0xFFFFFFFF);
    this.a |= (paramBoolean ? paramInt : 0);
  }
  
  void b(int paramInt)
  {
    this.c.af = false;
    this.d = paramInt;
  }
  
  int a()
  {
    return this.d;
  }
  
  void c(int paramInt)
  {
    this.c.af = false;
    this.d = paramInt;
    if (c()) {
      this.c.b.a(false, 496);
    } else {
      this.c.b.a(true, 1008);
    }
    if (b()) {
      this.a |= 0x4;
    }
  }
  
  boolean b()
  {
    switch (this.d)
    {
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
      return true;
    }
    return false;
  }
  
  boolean c()
  {
    return this.d == 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbva.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */