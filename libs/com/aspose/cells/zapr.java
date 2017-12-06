package com.aspose.cells;

class zapr
  extends zag
{
  int r;
  byte s;
  byte t;
  char u;
  int v;
  int w = 1;
  int x = -1;
  int y = 1;
  int z = 8;
  int A = 0;
  byte B = 2;
  byte C = 0;
  byte D = 0;
  byte E = 0;
  byte F;
  String G;
  String H;
  int I;
  int J = -1;
  
  zapr()
  {
    this.a = 746588187;
    this.f = 2;
    this.c = -2147483643;
  }
  
  static int b(int paramInt)
  {
    int i = 0;
    switch (paramInt)
    {
    case 14: 
      i = 0;
      break;
    case 4: 
      i = 1;
      break;
    case 3: 
      i = 2;
      break;
    case 25: 
      i = 3;
      break;
    case 1: 
      i = 4;
      break;
    case 26: 
      i = 5;
      break;
    case 27: 
      i = 6;
      break;
    case 5: 
      i = 7;
      break;
    case 8: 
      i = 8;
      break;
    case 28: 
      i = 9;
      break;
    case 29: 
      i = 10;
      break;
    case 30: 
      i = 11;
      break;
    case 31: 
      i = 12;
      break;
    case 32: 
      i = 13;
      break;
    case 33: 
      i = 14;
      break;
    case 34: 
      i = 15;
      break;
    case 35: 
      i = 16;
      break;
    case 36: 
      i = 17;
      break;
    case 37: 
      i = 18;
      break;
    case 38: 
      i = 20;
      break;
    case 39: 
      i = 21;
      break;
    case 40: 
      i = 22;
      break;
    case 16: 
      i = 23;
      break;
    case 12: 
      i = 24;
      break;
    case 2: 
      i = 25;
      break;
    case 7: 
      i = 26;
      break;
    case 15: 
      i = 27;
      break;
    case 9: 
      i = 28;
      break;
    case 0: 
      i = 29;
      break;
    case 41: 
      i = 30;
      break;
    case 6: 
    case 10: 
    case 11: 
    case 13: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    default: 
      return 0;
    }
    return 1 << i;
  }
  
  private int e(int paramInt)
  {
    if (paramInt == 42) {
      return 1;
    }
    return 0;
  }
  
  boolean c(int paramInt)
  {
    return (this.I & e(paramInt)) != 0;
  }
  
  void d(int paramInt)
  {
    this.I |= e(paramInt);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zapr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */