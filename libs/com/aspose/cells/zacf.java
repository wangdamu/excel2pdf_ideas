package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zacf
{
  private String c;
  String a;
  private zacf d;
  private ArrayList e;
  private byte[] f;
  private int g = 1;
  int b;
  
  void a(zacf paramzacf)
  {
    if (this.e == null) {
      this.e = new ArrayList();
    }
    zf.a(this.e, paramzacf);
    paramzacf.d = this;
  }
  
  void a(zacf[][] paramArrayOfzacf)
  {
    if (this.e == null) {
      this.e = new ArrayList();
    }
    zf.a(this.e, paramArrayOfzacf);
  }
  
  String a()
  {
    return this.c;
  }
  
  void a(String paramString)
  {
    this.c = paramString;
  }
  
  zacf b()
  {
    return this.d;
  }
  
  void b(zacf paramzacf)
  {
    this.d = paramzacf;
  }
  
  ArrayList c()
  {
    return this.e;
  }
  
  void a(ArrayList paramArrayList)
  {
    this.e = paramArrayList;
  }
  
  byte[] d()
  {
    return this.f;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    this.f = paramArrayOfByte;
  }
  
  boolean e()
  {
    if (this.f != null) {
      switch (this.f[0])
      {
      case 15: 
      case 16: 
      case 17: 
        return true;
      }
    }
    return false;
  }
  
  int f()
  {
    for (int i = 0; i < this.e.size(); i++)
    {
      zacf localzacf = (zacf)this.e.get(i);
      if (localzacf.f != null) {
        switch (localzacf.f[0])
        {
        case 33: 
        case 34: 
        case 35: 
        case 57: 
        case 58: 
        case 59: 
        case 65: 
        case 66: 
        case 67: 
        case 89: 
        case 90: 
        case 91: 
        case 97: 
        case 98: 
        case 99: 
        case 121: 
        case 122: 
        case 123: 
          return 9;
        case 28: 
        case 42: 
        case 43: 
        case 60: 
        case 61: 
        case 74: 
        case 75: 
        case 92: 
        case 93: 
        case 106: 
        case 107: 
        case 124: 
        case 125: 
          return 7;
        case 15: 
        case 16: 
        case 17: 
          int j = localzacf.f();
          if (j != 6) {
            return j;
          }
          break;
        case 18: 
        case 19: 
        case 20: 
        case 21: 
        case 22: 
        case 23: 
        case 24: 
        case 25: 
        case 26: 
        case 27: 
        case 29: 
        case 30: 
        case 31: 
        case 32: 
        case 36: 
        case 37: 
        case 38: 
        case 39: 
        case 40: 
        case 41: 
        case 44: 
        case 45: 
        case 46: 
        case 47: 
        case 48: 
        case 49: 
        case 50: 
        case 51: 
        case 52: 
        case 53: 
        case 54: 
        case 55: 
        case 56: 
        case 62: 
        case 63: 
        case 64: 
        case 68: 
        case 69: 
        case 70: 
        case 71: 
        case 72: 
        case 73: 
        case 76: 
        case 77: 
        case 78: 
        case 79: 
        case 80: 
        case 81: 
        case 82: 
        case 83: 
        case 84: 
        case 85: 
        case 86: 
        case 87: 
        case 88: 
        case 94: 
        case 95: 
        case 96: 
        case 100: 
        case 101: 
        case 102: 
        case 103: 
        case 104: 
        case 105: 
        case 108: 
        case 109: 
        case 110: 
        case 111: 
        case 112: 
        case 113: 
        case 114: 
        case 115: 
        case 116: 
        case 117: 
        case 118: 
        case 119: 
        case 120: 
        default: 
          return 6;
        }
      }
    }
    return 6;
  }
  
  int g()
  {
    return this.g;
  }
  
  void a(int paramInt)
  {
    this.g = paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zacf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */