package com.aspose.cells;

import com.aspose.cells.a.c.zl;
import com.aspose.cells.b.a.zc;

class zace
  extends zacc
{
  protected int a(int paramInt)
  {
    return zc.a(this.d, paramInt) - 1;
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.d = paramArrayOfByte;
    if (paramInt2 < 0)
    {
      this.a = (paramInt1 + 4);
      this.b = (this.a + zc.a(this.d, paramInt1));
      this.c = (this.b + 4);
    }
    else
    {
      this.a = paramInt1;
      this.b = paramInt2;
      this.c = this.b;
    }
  }
  
  public boolean k()
  {
    switch (this.d[this.a])
    {
    case 1: 
    case 2: 
      this.a += 7;
      break;
    case 23: 
      this.a += 3 + 2 * (zc.e(this.d, this.a + 1) & 0xFFFF);
      break;
    case 32: 
    case 64: 
    case 96: 
      l();
      this.a += 15;
      break;
    case 36: 
    case 42: 
    case 44: 
    case 68: 
    case 74: 
    case 76: 
    case 100: 
    case 106: 
    case 108: 
      this.a += 7;
      break;
    case 37: 
    case 43: 
    case 45: 
    case 69: 
    case 75: 
    case 77: 
    case 101: 
    case 107: 
    case 109: 
      this.a += 13;
      break;
    case 58: 
    case 60: 
    case 90: 
    case 92: 
    case 122: 
    case 124: 
      this.a += 9;
      break;
    case 59: 
    case 61: 
    case 91: 
    case 93: 
    case 123: 
    case 125: 
      this.a += 15;
      break;
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
    case 24: 
    case 25: 
    case 26: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 33: 
    case 34: 
    case 35: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
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
    case 57: 
    case 62: 
    case 63: 
    case 65: 
    case 66: 
    case 67: 
    case 70: 
    case 71: 
    case 72: 
    case 73: 
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
    case 89: 
    case 94: 
    case 95: 
    case 97: 
    case 98: 
    case 99: 
    case 102: 
    case 103: 
    case 104: 
    case 105: 
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
    case 121: 
    default: 
      if (!super.k()) {
        return false;
      }
      break;
    }
    return true;
  }
  
  public zbap a(zaae paramzaae)
  {
    zbap localzbap;
    int i;
    int j;
    switch (this.d[this.a])
    {
    case 37: 
    case 69: 
    case 101: 
      localzbap = new zbap();
      localzbap.a(zc.a(this.d, this.a + 1));
      localzbap.c(zc.a(this.d, this.a + 5));
      localzbap.b(zc.e(this.d, this.a + 9) & 0xFFFF & 0x3FFF);
      localzbap.d(zc.e(this.d, this.a + 11) & 0xFFFF & 0x3FFF);
      if (paramzaae.a())
      {
        i = this.d[(this.a + 10)];
        if ((i & 0xFF & 0x80) != 0) {
          localzbap.a(false);
        }
        if ((i & 0xFF & 0x40) != 0) {
          localzbap.b(false);
        }
        i = this.d[(this.a + 12)];
        if ((i & 0xFF & 0x80) != 0) {
          localzbap.c(false);
        }
        if ((i & 0xFF & 0x40) != 0) {
          localzbap.d(false);
        }
      }
      localzbap.s();
      localzbap.e(true);
      this.a += 13;
      return localzbap;
    case 45: 
    case 77: 
    case 109: 
      localzbap = new zbap();
      i = this.d[(this.a + 10)];
      if ((i & 0xFF & 0x80) != 0)
      {
        j = zc.a(this.d, this.a + 1) + paramzaae.d;
        if (j > 1048575)
        {
          j--;
          j -= 1048575;
        }
        localzbap.a(j);
        localzbap.a(false);
      }
      else
      {
        localzbap.a(zc.a(this.d, this.a + 1));
      }
      if ((i & 0xFF & 0x40) != 0)
      {
        j = (zc.e(this.d, this.a + 9) & 0xFFFF & 0x3FFF) + paramzaae.e;
        if (j > 16383)
        {
          j--;
          j -= 16383;
        }
        localzbap.b(j);
        localzbap.b(false);
      }
      else
      {
        localzbap.b(zc.e(this.d, this.a + 9) & 0xFFFF & 0x3FFF);
      }
      i = this.d[(this.a + 12)];
      if ((i & 0xFF & 0x80) != 0)
      {
        j = zc.a(this.d, this.a + 5) + paramzaae.d;
        if (j > 1048575)
        {
          j--;
          j -= 1048575;
        }
        localzbap.c(j);
        localzbap.c(false);
      }
      else
      {
        localzbap.c(zc.a(this.d, this.a + 5));
      }
      if ((i & 0xFF & 0x40) != 0)
      {
        j = (zc.e(this.d, this.a + 11) & 0xFFFF & 0x3FFF) + paramzaae.e;
        if (j > 16383)
        {
          j--;
          j -= 16383;
        }
        localzbap.d(j);
        localzbap.d(false);
      }
      else
      {
        localzbap.d(zc.e(this.d, this.a + 11) & 0xFFFF & 0x3FFF);
      }
      localzbap.s();
      localzbap.e(true);
      this.a += 13;
      return localzbap;
    case 59: 
    case 91: 
    case 123: 
      localzbap = new zbap();
      localzbap.a(paramzaae.b().r().b(zc.e(this.d, this.a + 1) & 0xFFFF));
      if (paramzaae.a == 1)
      {
        i = this.d[(this.a + 12)];
        if ((i & 0xFF & 0x80) != 0)
        {
          j = zc.a(this.d, this.a + 3) + paramzaae.d;
          if (j > 1048575)
          {
            j--;
            j -= 1048575;
          }
          localzbap.a(j);
          localzbap.a(false);
        }
        else
        {
          localzbap.a(zc.a(this.d, this.a + 3));
        }
        if ((i & 0xFF & 0x40) != 0)
        {
          j = (zc.e(this.d, this.a + 11) & 0xFFFF & 0x3FFF) + paramzaae.e;
          if (j > 16383)
          {
            j--;
            j -= 16383;
          }
          localzbap.b(j);
          localzbap.b(false);
        }
        else
        {
          localzbap.b(zc.e(this.d, this.a + 11) & 0xFFFF & 0x3FFF);
        }
        i = this.d[(this.a + 14)];
        if ((i & 0xFF & 0x80) != 0)
        {
          j = zc.a(this.d, this.a + 7) + paramzaae.d;
          if (j > 1048575)
          {
            j--;
            j -= 1048575;
          }
          localzbap.c(j);
          localzbap.c(false);
        }
        else
        {
          localzbap.c(zc.a(this.d, this.a + 7));
        }
        if ((i & 0xFF & 0x40) != 0)
        {
          j = (zc.e(this.d, this.a + 13) & 0xFFFF & 0x3FFF) + paramzaae.e;
          if (j > 16383)
          {
            j--;
            j -= 16383;
          }
          localzbap.d(j);
          localzbap.d(false);
        }
        else
        {
          localzbap.d(zc.e(this.d, this.a + 13) & 0xFFFF & 0x3FFF);
        }
      }
      else
      {
        localzbap.a(zc.a(this.d, this.a + 3));
        localzbap.c(zc.a(this.d, this.a + 7));
        localzbap.b(zc.e(this.d, this.a + 11) & 0xFFFF & 0x3FFF);
        localzbap.d(zc.e(this.d, this.a + 13) & 0xFFFF & 0x3FFF);
        if (paramzaae.a())
        {
          i = this.d[(this.a + 12)];
          if ((i & 0xFF & 0x80) != 0) {
            localzbap.a(false);
          }
          if ((i & 0xFF & 0x40) != 0) {
            localzbap.b(false);
          }
          i = this.d[(this.a + 14)];
          if ((i & 0xFF & 0x80) != 0) {
            localzbap.c(false);
          }
          if ((i & 0xFF & 0x40) != 0) {
            localzbap.d(false);
          }
        }
      }
      localzbap.s();
      localzbap.e(true);
      this.a += 15;
      return localzbap;
    case 1: 
    case 2: 
    case 36: 
    case 68: 
    case 100: 
      localzbap = new zbap();
      localzbap.a(zc.a(this.d, this.a + 1));
      localzbap.b(zc.e(this.d, this.a + 5) & 0xFFFF & 0x3FFF);
      if (paramzaae.a())
      {
        i = this.d[(this.a + 6)];
        if ((i & 0xFF & 0x80) != 0) {
          localzbap.a(false);
        }
        if ((i & 0xFF & 0x40) != 0) {
          localzbap.b(false);
        }
      }
      localzbap.t();
      this.a += 7;
      return localzbap;
    case 44: 
    case 76: 
    case 108: 
      localzbap = new zbap();
      i = this.d[(this.a + 6)];
      if ((i & 0xFF & 0x80) != 0)
      {
        j = zc.a(this.d, this.a + 1) + paramzaae.d;
        if (j > 1048575)
        {
          j--;
          j -= 1048575;
        }
        localzbap.a(j);
        localzbap.a(false);
      }
      else
      {
        localzbap.a(zc.a(this.d, this.a + 1));
        localzbap.a(true);
      }
      if ((i & 0xFF & 0x40) != 0)
      {
        j = (zc.e(this.d, this.a + 5) & 0xFFFF & 0x3FFF) + paramzaae.e;
        if (j > 16383)
        {
          j--;
          j -= 16383;
        }
        localzbap.b(j);
        localzbap.b(false);
      }
      else
      {
        localzbap.b(zc.e(this.d, this.a + 5) & 0xFFFF & 0x3FFF);
        localzbap.b(true);
      }
      localzbap.t();
      this.a += 7;
      return localzbap;
    case 58: 
    case 90: 
    case 122: 
      localzbap = new zbap();
      localzbap.a(paramzaae.b().r().b(zc.e(this.d, this.a + 1) & 0xFFFF));
      i = this.d[(this.a + 8)];
      if ((i & 0xFF & 0x80) != 0)
      {
        if (paramzaae.f)
        {
          j = zc.a(this.d, this.a + 3) + paramzaae.d;
          if (j > 1048575)
          {
            j--;
            j -= 1048575;
          }
          localzbap.a(j);
          localzbap.a(false);
        }
        else
        {
          localzbap.a(zc.a(this.d, this.a + 3));
          if (paramzaae.a()) {
            localzbap.a(false);
          }
        }
      }
      else {
        localzbap.a(zc.a(this.d, this.a + 3));
      }
      if ((i & 0xFF & 0x40) != 0)
      {
        if (paramzaae.f)
        {
          j = (zc.e(this.d, this.a + 7) & 0xFFFF & 0x3FFF) + paramzaae.e;
          if (j > 16383)
          {
            j--;
            j -= 16383;
          }
          localzbap.b(j);
          localzbap.b(false);
        }
        else
        {
          localzbap.b(zc.e(this.d, this.a + 7) & 0xFFFF & 0x3FFF);
          if (paramzaae.a()) {
            localzbap.b(false);
          }
        }
      }
      else {
        localzbap.b(zc.e(this.d, this.a + 7) & 0xFFFF & 0x3FFF);
      }
      localzbap.t();
      this.a += 9;
      return localzbap;
    }
    return null;
  }
  
  public String b()
  {
    String str;
    switch (this.d[this.a])
    {
    case 23: 
      try
      {
        int i = (zc.e(this.d, this.a + 1) & 0xFFFF) * 2;
        str = Encoding.getUnicode().a(this.d, this.a + 3, i);
        this.a += i + 3;
        return str;
      }
      catch (Exception localException1)
      {
        throw new CellsException(5, "Invalid formula[string node]");
      }
    case 32: 
    case 64: 
    case 96: 
      if (this.d[this.c] == 1) {
        try
        {
          int j = (zc.e(this.d, this.c + 1) & 0xFFFF) * 2;
          str = Encoding.getUnicode().a(this.d, this.c + 3, j);
          this.c += j + 3;
          return str;
        }
        catch (Exception localException2)
        {
          throw new CellsException(5, "Invalid formula[string node]");
        }
      }
      break;
    }
    return null;
  }
  
  public zabc c()
  {
    zabc localzabc;
    switch (this.d[this.a])
    {
    case 42: 
    case 74: 
    case 106: 
      localzabc = zabc.c;
      this.a += 7;
      return localzabc;
    case 43: 
    case 75: 
    case 107: 
      localzabc = zabc.c;
      this.a += 13;
      return localzabc;
    case 60: 
    case 92: 
    case 124: 
      localzabc = zabc.c;
      this.a += 9;
      return localzabc;
    case 61: 
    case 93: 
    case 125: 
      localzabc = zabc.c;
      this.a += 15;
      return localzabc;
    }
    return null;
  }
  
  public int d()
  {
    return this.d[(this.a + 1)];
  }
  
  public zaie[][] a()
  {
    int i = zc.a(this.d, this.c);
    this.c += 4;
    int j = zc.a(this.d, this.c);
    this.c += 4;
    zaie[][] arrayOfzaie = new zaie[j][];
    for (int k = 0; k < j; k++)
    {
      arrayOfzaie[k] = new zaie[i];
      for (int m = 0; m < i; m++) {
        switch (this.d[this.c])
        {
        case 0: 
          arrayOfzaie[k][m] = new zabb(zc.f(this.d, this.c + 1));
          this.c += 9;
          break;
        case 1: 
          try
          {
            int n = (zc.e(this.d, this.c + 1) & 0xFFFF) * 2;
            arrayOfzaie[k][m] = new zabp(Encoding.getUnicode().a(this.d, this.c + 3, n));
            this.c += n + 3;
          }
          catch (Exception localException)
          {
            throw new CellsException(5, "Invalid formula[string node]");
          }
        case 2: 
          arrayOfzaie[k][m] = (this.d[(this.c + 1)] != 0 ? zaba.a : zaba.b);
          this.c += 2;
          break;
        case 4: 
          arrayOfzaie[k][m] = zabc.a(this.d[(this.c + 1)]);
          this.c += 5;
          break;
        case 3: 
        default: 
          zl.a("Unrecognized token in additional data: " + (this.d[this.c] & 0xFF));
        }
      }
    }
    this.a += 15;
    return arrayOfzaie;
  }
  
  private void l()
  {
    int i = zc.a(this.d, this.c);
    this.c += 4;
    int j = zc.a(this.d, this.c);
    this.c += 4;
    for (int k = 0; k < j; k++) {
      for (int m = 0; m < i; m++) {
        switch (this.d[this.c])
        {
        case 0: 
          this.c += 9;
          break;
        case 1: 
          this.c += (zc.e(this.d, this.c + 1) & 0xFFFF) * 2 + 3;
          break;
        case 2: 
          this.c += 2;
          break;
        case 4: 
          this.c += 5;
          break;
        case 3: 
        default: 
          zl.a("Unrecognized token in additional data: " + (this.d[this.c] & 0xFF));
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */