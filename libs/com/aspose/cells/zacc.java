package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

abstract class zacc
{
  protected int a;
  protected int b;
  protected int c;
  protected byte[] d;
  
  public abstract void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract zbap a(zaae paramzaae);
  
  public abstract zaie[][] a();
  
  public abstract String b();
  
  public abstract zabc c();
  
  public abstract int d();
  
  protected abstract int a(int paramInt);
  
  public int e()
  {
    return this.a;
  }
  
  public void b(int paramInt)
  {
    this.a = paramInt;
  }
  
  public int f()
  {
    return this.c;
  }
  
  public void c(int paramInt)
  {
    this.c = paramInt;
  }
  
  public int g()
  {
    return this.b;
  }
  
  public void d(int paramInt)
  {
    this.b = paramInt;
  }
  
  public boolean h()
  {
    return this.a < this.b;
  }
  
  public byte[] i()
  {
    return this.d;
  }
  
  public byte j()
  {
    return this.d[this.a];
  }
  
  public boolean k()
  {
    switch (this.d[this.a])
    {
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
      this.a += 1;
      break;
    case 24: 
      switch (this.d[(this.a + 1)])
      {
      case 25: 
        this.a += 14;
        break;
      default: 
        this.a += 6;
      }
      break;
    case 25: 
      switch (this.d[(this.a + 1)])
      {
      case 4: 
        int i = zc.e(this.d, this.a + 2) & 0xFFFF;
        this.a += i * 2 + 6;
        break;
      default: 
        this.a += 4;
      }
      break;
    case 28: 
    case 29: 
      this.a += 2;
      break;
    case 30: 
      this.a += 3;
      break;
    case 31: 
      this.a += 9;
      break;
    case 33: 
    case 65: 
    case 97: 
      this.a += 3;
      break;
    case 34: 
    case 66: 
    case 98: 
      this.a += 4;
      break;
    case 35: 
    case 67: 
    case 99: 
      this.a += 5;
      break;
    case 38: 
    case 39: 
    case 40: 
    case 70: 
    case 71: 
    case 72: 
    case 102: 
    case 103: 
    case 104: 
      this.a += 7;
      break;
    case 41: 
    case 73: 
    case 105: 
      this.a += 3;
      break;
    case 46: 
    case 47: 
    case 78: 
    case 79: 
    case 110: 
    case 111: 
      this.a += 3;
      break;
    case 57: 
    case 89: 
    case 121: 
      this.a += 7;
      break;
    case 23: 
    case 26: 
    case 27: 
    case 32: 
    case 36: 
    case 37: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
    case 48: 
    case 49: 
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
    case 58: 
    case 59: 
    case 60: 
    case 61: 
    case 62: 
    case 63: 
    case 64: 
    case 68: 
    case 69: 
    case 74: 
    case 75: 
    case 76: 
    case 77: 
    case 80: 
    case 81: 
    case 82: 
    case 83: 
    case 84: 
    case 85: 
    case 86: 
    case 87: 
    case 88: 
    case 90: 
    case 91: 
    case 92: 
    case 93: 
    case 94: 
    case 95: 
    case 96: 
    case 100: 
    case 101: 
    case 106: 
    case 107: 
    case 108: 
    case 109: 
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
      zl.a("Unknown token type encounted: " + (this.d[this.a] & 0xFF));
      this.a = this.b;
      return false;
    }
    return true;
  }
  
  public zabf a(Workbook paramWorkbook)
  {
    switch (this.d[this.a])
    {
    case 35: 
    case 67: 
    case 99: 
      zabf localzabf1 = new zabf(zabt.a(this.d[this.a]), paramWorkbook.getWorksheets().getNames().get(a(this.a + 1)), -1);
      this.a += 5;
      return localzabf1;
    case 57: 
    case 89: 
    case 121: 
      int i = zc.e(this.d, this.a + 1) & 0xFFFF;
      WorksheetCollection localWorksheetCollection = paramWorkbook.getWorksheets();
      int j = localWorksheetCollection.r().c(i);
      zbti localzbti = null;
      if ((localWorksheetCollection.w() != null) && (j < localWorksheetCollection.w().getCount()))
      {
        localzbti = localWorksheetCollection.w().a(j);
        if (localzbti.e()) {
          localzbti = null;
        }
      }
      Object localObject;
      zabf localzabf2;
      if (localzbti == null)
      {
        localObject = localWorksheetCollection.getNames().get(a(this.a + 3));
        localzabf2 = new zabf(zabt.a(this.d[this.a]), (Name)localObject, i);
      }
      else
      {
        localObject = (zwh)localzbti.b().get(a(this.a + 3));
        localzabf2 = new zabf(zabt.a(this.d[this.a]), (zwh)localObject, i);
      }
      this.a += 7;
      return localzabf2;
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zacc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */