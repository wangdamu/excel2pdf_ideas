package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

class zbzx
{
  private StringBuilder b = new StringBuilder();
  private WorksheetCollection c;
  int a;
  private int d;
  private int e;
  
  zbzx(WorksheetCollection paramWorksheetCollection)
  {
    this.c = paramWorksheetCollection;
  }
  
  private void a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = (zc.e(paramArrayOfByte, paramInt) & 0xFFFF) - 1;
    this.b.append(this.c.getNames().get(i).getText());
  }
  
  private String a(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i;
    Object localObject;
    String str;
    int j;
    switch (paramArrayOfByte[(paramArrayOfInt[0] + 1)])
    {
    case 25: 
      i = this.e;
      localObject = new int[] { i };
      str = zbvl.a(this.c, null, paramArrayOfByte, paramArrayOfInt[0], paramInt1, paramInt2, this.a, paramBoolean, null, (int[])localObject);
      i = localObject[0];
      this.e = i;
      paramArrayOfInt[0] += 14;
      return str;
    case 29: 
      i = zc.a(paramArrayOfByte, paramArrayOfInt[0] + 2);
      paramArrayOfInt[0] += 6;
      if (this.c.c() != null)
      {
        if ((this.c.c() instanceof zaxa))
        {
          localObject = (zaxa)this.c.c();
          str = ((zaxa)localObject).a(i, this.a);
          return str;
        }
        if ((this.c.c() instanceof zawp))
        {
          localObject = (zawp)this.c.c();
          str = ((zawp)localObject).b(i);
          return str;
        }
      }
      return "#REF!";
    case 7: 
      paramArrayOfInt[0] += 6;
      j = paramArrayOfByte[(paramArrayOfInt[0] - 2)] & 0xFF;
      str = CellsHelper.columnIndexToName(j);
      return str + ":" + str;
    case 6: 
      paramArrayOfInt[0] += 6;
      j = zc.e(paramArrayOfByte, paramArrayOfInt[0] - 4) & 0xFFFF;
      str = CellsHelper.rowIndexToName(j);
      return str + ":" + str;
    }
    paramArrayOfInt[0] += 1;
    return "#REF!";
  }
  
  String a(Cell paramCell)
  {
    int i = 2;
    byte[] arrayOfByte = paramCell.v();
    if (arrayOfByte[i] == 1)
    {
      zbf localzbf = ((zaai)paramCell.c.d).a();
      if (localzbf == null)
      {
        int j = zc.e(arrayOfByte, i + 1);
        int k = arrayOfByte[(i + 3)];
        Cell localCell = paramCell.d.getRows().a.a(j & 0xFFFF, k & 0xFF);
        if (localCell != null) {
          localzbf = localCell.F();
        }
      }
      if (localzbf != null) {
        return a(-1, -1, localzbf.c(), paramCell.getRow(), paramCell.getColumn(), !localzbf.b());
      }
      return null;
    }
    return a(-1, arrayOfByte, paramCell.getRow(), paramCell.getColumn(), false);
  }
  
  String a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    return a(paramInt1, -1, paramArrayOfByte, paramInt2, paramInt3, paramBoolean);
  }
  
  String a(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    int i = paramInt1;
    if (paramInt2 != -1)
    {
      this.d = paramInt2;
      this.e = (i + paramInt2);
    }
    else if (i == -1)
    {
      i = 2;
      this.d = (zc.e(paramArrayOfByte, 0) & 0xFFFF);
      this.e = (i + this.d);
    }
    else
    {
      this.d = 0;
      this.e = 0;
    }
    int j = i;
    int k = this.e;
    this.b = new StringBuilder(256);
    ArrayList localArrayList = new ArrayList();
    while ((i < paramArrayOfByte.length) && ((this.e == 0) || (i < k)))
    {
      int m;
      Object localObject1;
      int i4;
      String str2;
      switch (paramArrayOfByte[i])
      {
      case 1: 
      case 2: 
        return null;
      case 3: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, '+');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 4: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, '-');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 5: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, '*');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 6: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, '/');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 7: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, '^');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 8: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, '&');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 9: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, '<');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 10: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, "<=");
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 11: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, '=');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 12: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, ">=");
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 13: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, '>');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 14: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, "<>");
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 15: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, " ");
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 16: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, ",");
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 17: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, ":");
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 18: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, "+");
        i++;
        break;
      case 19: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, "-");
        i++;
        break;
      case 20: 
        this.b.append("%");
        i++;
        break;
      case 21: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.b.insert(m, "(");
        this.b.append(")");
        i++;
        break;
      case 22: 
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        i++;
        break;
      case 23: 
        i++;
        int n = paramArrayOfByte[i];
        String str1;
        if (paramArrayOfByte[(i + 1)] == 0)
        {
          localObject1 = new byte[2 * (n & 0xFF)];
          for (int i2 = 0; i2 < 2 * (n & 0xFF); i2++) {
            if (i2 % 2 == 0)
            {
              int i3 = paramArrayOfByte[(i2 / 2 + i + 2)];
              if (i3 != 0) {
                localObject1[i2] = i3;
              } else {
                localObject1[i2] = 44;
              }
            }
          }
          str1 = Encoding.getUnicode().a((byte[])localObject1, 0, localObject1.length);
          i += (n & 0xFF) + 2;
        }
        else
        {
          str1 = Encoding.getUnicode().a(paramArrayOfByte, i + 2, 2 * (n & 0xFF));
          i += 2 * (n & 0xFF) + 2;
        }
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        this.b.append("\"");
        if ((str1 != null) && (!"".equals(str1)))
        {
          str1 = zw.a(str1, "\"", "\"\"");
          this.b.append(str1);
        }
        this.b.append("\"");
        break;
      case 24: 
        localObject1 = new int[] { i };
        String str3 = a(paramArrayOfByte, (int[])localObject1, paramInt3, paramInt4, false);
        i = localObject1[0];
        this.b.append(str3);
        break;
      case 25: 
        i++;
        localObject1 = new int[] { i };
        a(paramArrayOfByte, (int[])localObject1, localArrayList);
        i = localObject1[0];
        break;
      case 28: 
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        i++;
        this.b.append(ztr.b(paramArrayOfByte[i]));
        i++;
        break;
      case 29: 
        i++;
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        if (paramArrayOfByte[i] == 0) {
          this.b.append("FALSE");
        } else {
          this.b.append("TRUE");
        }
        i++;
        break;
      case 30: 
        int i1 = zc.e(paramArrayOfByte, i + 1);
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        this.b.append(zp.a(i1 & 0xFFFF));
        i += 3;
        break;
      case 31: 
        double d1 = zc.f(paramArrayOfByte, i + 1);
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        if ((d1 >= 1.0E21D) || (Math.abs(d1) <= 1.0E-21D)) {
          this.b.append(zp.b(d1));
        } else {
          this.b.append(zarb.a(d1));
        }
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        if (this.e == 0) {
          this.e = (i + 1);
        }
        a(paramArrayOfByte, localArrayList);
        i += 8;
        break;
      case 33: 
      case 65: 
      case 97: 
        i++;
        c(paramArrayOfByte, i, localArrayList);
        i += 2;
        break;
      case 34: 
      case 66: 
      case 98: 
        i++;
        b(paramArrayOfByte, i, localArrayList);
        i += 3;
        break;
      case 35: 
      case 67: 
      case 99: 
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        i++;
        a(paramArrayOfByte, i);
        i += 4;
        break;
      case 36: 
      case 68: 
      case 100: 
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        i++;
        this.b.append(b(paramArrayOfByte, i, paramInt3, paramInt4));
        i += 4;
        break;
      case 37: 
      case 69: 
      case 101: 
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        i++;
        this.b.append(a(paramArrayOfByte, i, paramInt3, paramInt4, paramBoolean));
        i += 8;
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
        i += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        i += 3;
        break;
      case 42: 
      case 74: 
      case 106: 
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        this.b.append("#REF!");
        i += 5;
        break;
      case 43: 
      case 75: 
      case 107: 
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        this.b.append("#REF!");
        i += 9;
        break;
      case 45: 
      case 77: 
      case 109: 
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        i++;
        this.b.append(a(paramArrayOfByte, i, paramInt3, paramInt4));
        i += 8;
        break;
      case 44: 
      case 76: 
      case 108: 
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        i++;
        this.b.append(a(paramArrayOfByte, i, i + 2, paramInt3, paramInt4));
        i += 4;
        break;
      case 57: 
      case 89: 
      case 121: 
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        i++;
        i4 = zc.e(paramArrayOfByte, i) & 0xFFFF;
        int i5 = this.c.r().c(i4);
        zbti localzbti = null;
        if ((this.c.w() != null) && (i5 < this.c.w().getCount()))
        {
          localzbti = this.c.w().a(i5);
          if (localzbti.e()) {
            localzbti = null;
          }
        }
        i += 2;
        int i6 = zc.e(paramArrayOfByte, i) & 0xFFFF;
        Object localObject2;
        if (localzbti == null)
        {
          localObject2 = this.c.getNames().get(i6 - 1);
          if (((Name)localObject2).getSheetIndex() == 0)
          {
            this.b.append(((Name)localObject2).getText());
          }
          else
          {
            String str4 = this.c.get(((Name)localObject2).getSheetIndex() - 1).getName();
            if ((str4.indexOf(" ") != -1) || (str4.indexOf("-") != -1) || (str4.indexOf("&") != -1) || (zarb.c(str4)) || (zcaf.a(str4))) {
              str4 = "'" + str4 + "'";
            }
            this.b.append(str4 + "!" + ((Name)localObject2).getText());
          }
        }
        else if (localzbti.f())
        {
          localObject2 = (zwh)localzbti.b().get(i6 - 1);
          this.b.append(((zwh)localObject2).e().toUpperCase());
        }
        else
        {
          zwh localzwh1;
          if (localzbti.a() == 0)
          {
            localObject2 = null;
            if (localzbti.c() != null)
            {
              int i7 = this.c.r().d(i4);
              if ((i7 >= 0) && (i7 < localzbti.c().length)) {
                localObject2 = localzbti.c()[i7];
              }
            }
            this.b.append('\'');
            if (localObject2 != null) {
              this.b.append('[');
            }
            this.b.append(localzbti.l());
            if (localObject2 != null)
            {
              this.b.append(']');
              this.b.append((String)localObject2);
            }
            this.b.append('\'');
            this.b.append("!");
            localzwh1 = (zwh)localzbti.b().get(i6 - 1);
            this.b.append(localzwh1.e().toUpperCase());
          }
          else if (localzbti.a() == 3)
          {
            localObject2 = null;
            localzwh1 = null;
            String[] arrayOfString1 = { localObject2 };
            String[] arrayOfString2 = { localzwh1 };
            localzbti.a(arrayOfString1, arrayOfString2);
            localObject2 = arrayOfString1[0];
            localzwh1 = arrayOfString2[0];
            this.b.append((String)localObject2);
            this.b.append("|");
            this.b.append(localzwh1);
            this.b.append("!");
            zwh localzwh2 = (zwh)localzbti.b().get(i6 - 1);
            this.b.append('\'');
            this.b.append(localzwh2.e().toUpperCase());
            this.b.append('\'');
          }
          else
          {
            return null;
          }
        }
        i += 4;
        break;
      case 58: 
      case 90: 
      case 122: 
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        i++;
        i4 = zc.e(paramArrayOfByte, i) & 0xFFFF;
        str2 = zaap.a(i4, this.c, 0, null);
        this.b.append(str2);
        this.b.append('!');
        if (("".equals(str2)) || (str2.charAt(0) != '#'))
        {
          i += 2;
          this.b.append(b(paramArrayOfByte, i, paramInt3, paramInt4));
          i += 4;
        }
        else
        {
          i += 6;
        }
        break;
      case 59: 
      case 91: 
      case 123: 
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        i++;
        i4 = zc.e(paramArrayOfByte, i) & 0xFFFF;
        str2 = zaap.a(i4, this.c, 0, null);
        this.b.append(str2);
        this.b.append('!');
        if (("".equals(str2)) || (str2.charAt(0) != '#'))
        {
          i += 2;
          this.b.append(a(paramArrayOfByte, i, paramInt3, paramInt4, paramBoolean));
          i += 8;
        }
        else
        {
          i += 10;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        i++;
        i4 = zc.e(paramArrayOfByte, i) & 0xFFFF;
        str2 = zaap.a(i4, this.c, 0, null);
        this.b.append(str2);
        if (str2.charAt(0) != '#') {
          this.b.append("!#REF!");
        } else {
          this.b.append('!');
        }
        i += 6;
        break;
      case 61: 
      case 93: 
      case 125: 
        zf.a(localArrayList, Integer.valueOf(this.b.length()));
        i++;
        i4 = zc.e(paramArrayOfByte, i) & 0xFFFF;
        str2 = zaap.a(i4, this.c, 0, null);
        this.b.append(str2);
        if (str2.charAt(0) != '#') {
          this.b.append("!#REF!");
        } else {
          this.b.append('!');
        }
        i += 10;
        break;
      case 26: 
      case 27: 
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
        return null;
      }
    }
    this.b.insert(0, '=');
    localArrayList = null;
    return zs.a(this.b);
  }
  
  private void a(byte[] paramArrayOfByte, ArrayList paramArrayList)
  {
    zf.a(paramArrayList, Integer.valueOf(this.b.length()));
    this.b.append('{');
    int i = (paramArrayOfByte[this.e] & 0xFF) + 1;
    this.e += 1;
    int j = (zc.e(paramArrayOfByte, this.e) & 0xFFFF) + 1;
    this.e += 2;
    for (int k = 0; k < j; k++)
    {
      for (int m = 0; m < i; m++) {
        switch (paramArrayOfByte[this.e])
        {
        case 0: 
          this.e += 9;
          if (m != i - 1) {
            this.b.append(',');
          }
          break;
        case 1: 
          this.e += 1;
          this.b.append(zc.f(paramArrayOfByte, this.e));
          this.e += 8;
          if (m != i - 1) {
            this.b.append(',');
          }
          break;
        case 2: 
          this.e += 1;
          int n = zc.e(paramArrayOfByte, this.e) & 0xFFFF;
          this.b.append("\"");
          if (n != 0)
          {
            String str = null;
            if (paramArrayOfByte[(this.e + 2)] == 0)
            {
              str = Encoding.getASCII().a(paramArrayOfByte, this.e + 3, n);
              this.e += 3 + n;
            }
            else
            {
              str = Encoding.getUnicode().a(paramArrayOfByte, this.e + 3, n * 2);
              this.e += 3 + n * 2;
            }
            if ((str != null) && (!"".equals(str))) {
              str = zw.a(str, "\"", "\"\"");
            }
            this.b.append(str);
          }
          else
          {
            this.e += 3;
          }
          this.b.append("\"");
          if (m != i - 1) {
            this.b.append(',');
          }
          break;
        case 4: 
          this.b.append(paramArrayOfByte[(this.e + 1)] == 1 ? "TRUE" : "FALSE");
          if (m != i - 1) {
            this.b.append(',');
          }
          this.e += 9;
          break;
        case 16: 
          this.b.append(ztr.b(paramArrayOfByte[(this.e + 1)]));
          if (m != i - 1) {
            this.b.append(',');
          }
          this.e += 9;
        }
      }
      if (k != j - 1) {
        this.b.append(';');
      }
    }
    this.b.append('}');
  }
  
  private void a(byte[] paramArrayOfByte, int[] paramArrayOfInt, ArrayList paramArrayList)
  {
    switch (paramArrayOfByte[paramArrayOfInt[0]])
    {
    case 16: 
      int i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "SUM(");
      this.b.append(")");
      paramArrayOfInt[0] += 3;
      break;
    case 4: 
      paramArrayOfInt[0] += 3;
      int j = zc.e(paramArrayOfByte, paramArrayOfInt[0]) & 0xFFFF;
      paramArrayOfInt[0] += j;
      break;
    default: 
      paramArrayOfInt[0] += 3;
    }
  }
  
  private String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = zc.e(paramArrayOfByte, paramInt1) & 0xFFFF;
    int j = zc.e(paramArrayOfByte, paramInt1 + 2) & 0xFFFF;
    int k = paramArrayOfByte[(paramInt1 + 4)] & 0xFF;
    int m = paramArrayOfByte[(paramInt1 + 6)] & 0xFF;
    StringBuilder localStringBuilder = new StringBuilder();
    int n = 1;
    int i1 = 1;
    int i2 = 1;
    int i3 = 1;
    if ((paramArrayOfByte[(paramInt1 + 5)] & 0xFF & 0x80) != 0) {
      n = 0;
    }
    if ((paramArrayOfByte[(paramInt1 + 5)] & 0xFF & 0x40) != 0) {
      i1 = 0;
    }
    if ((paramArrayOfByte[(paramInt1 + 7)] & 0xFF & 0x80) != 0) {
      i2 = 0;
    }
    if ((paramArrayOfByte[(paramInt1 + 7)] & 0xFF & 0x40) != 0) {
      i3 = 0;
    }
    if ((i == 0) && (j == 65535))
    {
      localStringBuilder.append('C');
      if (i1 != 0)
      {
        localStringBuilder.append(k + 1);
      }
      else if (paramBoolean)
      {
        if (k != 0)
        {
          localStringBuilder.append('[');
          localStringBuilder.append(k);
          localStringBuilder.append(']');
        }
      }
      else if (k - paramInt3 != 0)
      {
        localStringBuilder.append('[');
        localStringBuilder.append(k - paramInt3);
        localStringBuilder.append(']');
      }
      localStringBuilder.append(':');
      localStringBuilder.append('C');
      if (i3 != 0)
      {
        localStringBuilder.append(m + 1);
      }
      else if (paramBoolean)
      {
        if (k != 0)
        {
          localStringBuilder.append('[');
          localStringBuilder.append(m);
          localStringBuilder.append(']');
        }
      }
      else if (m - paramInt3 != 0)
      {
        localStringBuilder.append('[');
        localStringBuilder.append(m - paramInt3);
        localStringBuilder.append(']');
      }
    }
    else if ((k == 0) && (m == 255))
    {
      localStringBuilder.append('R');
      if (n != 0)
      {
        localStringBuilder.append(i + 1);
      }
      else if (paramBoolean)
      {
        if (i != 0)
        {
          localStringBuilder.append('[');
          localStringBuilder.append(i);
          localStringBuilder.append(']');
        }
      }
      else if (i - paramInt2 != 0)
      {
        localStringBuilder.append('[');
        localStringBuilder.append(i - paramInt2);
        localStringBuilder.append(']');
      }
      localStringBuilder.append(':');
      localStringBuilder.append('R');
      if (i2 != 0)
      {
        localStringBuilder.append(j + 1);
      }
      else if (paramBoolean)
      {
        if (i != 0)
        {
          localStringBuilder.append('[');
          localStringBuilder.append(j);
          localStringBuilder.append(']');
        }
      }
      else if (j - paramInt2 != 0)
      {
        localStringBuilder.append('[');
        localStringBuilder.append(j - paramInt2);
        localStringBuilder.append(']');
      }
    }
    else
    {
      localStringBuilder.append('R');
      if (n != 0)
      {
        localStringBuilder.append(i + 1);
      }
      else
      {
        if (!paramBoolean) {
          i -= paramInt2;
        }
        if (i != 0)
        {
          localStringBuilder.append('[');
          localStringBuilder.append(i);
          localStringBuilder.append(']');
        }
      }
      localStringBuilder.append('C');
      if (i1 != 0)
      {
        localStringBuilder.append(k + 1);
      }
      else
      {
        if (!paramBoolean) {
          k -= paramInt3;
        }
        if (k != 0)
        {
          localStringBuilder.append('[');
          localStringBuilder.append(k);
          localStringBuilder.append(']');
        }
      }
      localStringBuilder.append(':');
      localStringBuilder.append('R');
      if (i2 != 0)
      {
        localStringBuilder.append(j + 1);
      }
      else
      {
        if (!paramBoolean) {
          j -= paramInt2;
        }
        if (j != 0)
        {
          localStringBuilder.append('[');
          localStringBuilder.append(j);
          localStringBuilder.append(']');
        }
      }
      localStringBuilder.append('C');
      if (i3 != 0)
      {
        localStringBuilder.append(m + 1);
      }
      else
      {
        if (!paramBoolean) {
          m -= paramInt3;
        }
        if (m != 0)
        {
          localStringBuilder.append('[');
          localStringBuilder.append(m);
          localStringBuilder.append(']');
        }
      }
    }
    return zs.a(localStringBuilder);
  }
  
  private String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('R');
    int i;
    if ((paramArrayOfByte[(paramInt2 + 1)] & 0xFF & 0x80) == 0)
    {
      localStringBuilder.append((zc.e(paramArrayOfByte, paramInt1) & 0xFFFF) + 1);
    }
    else
    {
      i = zc.e(paramArrayOfByte, paramInt1) & 0xFFFF;
      if (i + paramInt3 > 65535) {
        i = i - 65535 - 1;
      }
      if (i != 0)
      {
        localStringBuilder.append('[');
        localStringBuilder.append(i);
        localStringBuilder.append(']');
      }
    }
    localStringBuilder.append('C');
    if ((paramArrayOfByte[(paramInt2 + 1)] & 0xFF & 0x40) == 0)
    {
      localStringBuilder.append((paramArrayOfByte[paramInt2] & 0xFF) + 1);
    }
    else
    {
      i = paramArrayOfByte[paramInt2] & 0xFF;
      if (i + paramInt4 > 255) {
        i = i - 255 - 1;
      }
      if (i != 0)
      {
        localStringBuilder.append('[');
        localStringBuilder.append(i);
        localStringBuilder.append(']');
      }
    }
    return zs.a(localStringBuilder);
  }
  
  private String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = zc.e(paramArrayOfByte, paramInt1) & 0xFFFF;
    int j = zc.e(paramArrayOfByte, paramInt1 + 2) & 0xFFFF;
    int k = paramArrayOfByte[(paramInt1 + 4)] & 0xFF;
    int m = paramArrayOfByte[(paramInt1 + 6)] & 0xFF;
    StringBuilder localStringBuilder = new StringBuilder();
    int n = 1;
    int i1 = 1;
    int i2 = 1;
    int i3 = 1;
    if ((paramArrayOfByte[(paramInt1 + 5)] & 0xFF & 0x80) != 0) {
      n = 0;
    }
    if ((paramArrayOfByte[(paramInt1 + 5)] & 0xFF & 0x40) != 0) {
      i1 = 0;
    }
    if ((paramArrayOfByte[(paramInt1 + 7)] & 0xFF & 0x80) != 0) {
      i2 = 0;
    }
    if ((paramArrayOfByte[(paramInt1 + 7)] & 0xFF & 0x40) != 0) {
      i3 = 0;
    }
    if ((i1 != 0) && (i3 != 0))
    {
      if ((k == 0) && (m == 255))
      {
        localStringBuilder.append('R');
        if (n != 0)
        {
          localStringBuilder.append(i);
        }
        else
        {
          localStringBuilder.append('[');
          localStringBuilder.append(zc.b(paramArrayOfByte, paramInt1));
          localStringBuilder.append(']');
        }
        localStringBuilder.append(':');
        localStringBuilder.append('R');
        if (i2 != 0)
        {
          localStringBuilder.append(j);
        }
        else
        {
          localStringBuilder.append('[');
          localStringBuilder.append(zc.b(paramArrayOfByte, paramInt1 + 2));
          localStringBuilder.append(']');
        }
        return zs.a(localStringBuilder);
      }
    }
    else if ((n != 0) && (i2 != 0) && (i == 0) && (j == 65535))
    {
      localStringBuilder.append('C');
      int i4;
      if (i1 != 0)
      {
        localStringBuilder.append(k);
      }
      else
      {
        i4 = paramArrayOfByte[(paramInt1 + 4)] & 0xFF;
        if (i4 >= 127) {
          i4 = i4 - 255 - 1;
        }
        localStringBuilder.append('[');
        localStringBuilder.append(i4);
        localStringBuilder.append(']');
      }
      localStringBuilder.append(':');
      localStringBuilder.append('C');
      if (i3 != 0)
      {
        localStringBuilder.append(m);
      }
      else
      {
        i4 = paramArrayOfByte[(paramInt1 + 6)] & 0xFF;
        if (i4 >= 127) {
          i4 = i4 - 255 - 1;
        }
        localStringBuilder.append('[');
        localStringBuilder.append(i4);
        localStringBuilder.append(']');
      }
      return zs.a(localStringBuilder);
    }
    localStringBuilder.append(a(paramArrayOfByte, paramInt1, paramInt1 + 4, paramInt2, paramInt3));
    localStringBuilder.append(':');
    localStringBuilder.append(a(paramArrayOfByte, paramInt1 + 2, paramInt1 + 6, paramInt2, paramInt3));
    return zs.a(localStringBuilder);
  }
  
  private String b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = zc.e(paramArrayOfByte, paramInt1);
    int j = paramArrayOfByte[(paramInt1 + 2)];
    int k = 1;
    int m = 1;
    int n = paramArrayOfByte[(paramInt1 + 3)];
    if ((n & 0xFF & 0x40) != 0) {
      m = 0;
    }
    if ((n & 0xFF & 0x80) != 0) {
      k = 0;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('R');
    if (k != 0)
    {
      localStringBuilder.append((i & 0xFFFF) + 1);
    }
    else if ((i & 0xFFFF) - paramInt2 != 0)
    {
      localStringBuilder.append('[');
      localStringBuilder.append((i & 0xFFFF) - paramInt2);
      localStringBuilder.append(']');
    }
    localStringBuilder.append('C');
    if (m != 0)
    {
      localStringBuilder.append((j & 0xFF) + 1);
    }
    else if ((j & 0xFF) - paramInt3 != 0)
    {
      localStringBuilder.append('[');
      localStringBuilder.append((j & 0xFF) - paramInt3);
      localStringBuilder.append(']');
    }
    return zs.a(localStringBuilder);
  }
  
  private void a(byte[] paramArrayOfByte, int paramInt, ArrayList paramArrayList)
  {
    int j = (paramArrayOfByte[paramInt] & 0xFF) - 1;
    int i;
    for (int k = 1; k < j; k++)
    {
      i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
      this.b.insert(i, ',');
    }
    k = paramArrayList.size() - j;
    if (k < paramArrayList.size())
    {
      i = ((Integer)paramArrayList.get(k)).intValue();
    }
    else
    {
      i = this.b.length();
      zf.a(paramArrayList, Integer.valueOf(i));
    }
    this.b.insert(i, "(");
    if ((paramArrayOfByte[paramInt] & 0xFF) - 1 > 0) {
      zf.a(paramArrayList, paramArrayList.size() - (paramArrayOfByte[paramInt] & 0xFF) + 1, (paramArrayOfByte[paramInt] & 0xFF) - 1);
    }
    this.b.append(")");
  }
  
  private void b(byte[] paramArrayOfByte, int paramInt, ArrayList paramArrayList)
  {
    int j = zc.e(paramArrayOfByte, paramInt + 1);
    if ((j & 0xFFFF) == 255)
    {
      a(paramArrayOfByte, paramInt, paramArrayList);
      return;
    }
    int i;
    for (int k = 1; k < (paramArrayOfByte[paramInt] & 0xFF); k++)
    {
      i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
      this.b.insert(i, ',');
    }
    k = paramArrayList.size() - (paramArrayOfByte[paramInt] & 0xFF);
    if (k < paramArrayList.size())
    {
      i = ((Integer)paramArrayList.get(k)).intValue();
    }
    else
    {
      i = this.b.length();
      zf.a(paramArrayList, Integer.valueOf(i));
    }
    switch (j)
    {
    case 0: 
      this.b.insert(i, "COUNT(");
      break;
    case 1: 
      this.b.insert(i, "IF(");
      break;
    case 4: 
      this.b.insert(i, "SUM(");
      break;
    case 5: 
      this.b.insert(i, "AVERAGE(");
      break;
    case 6: 
      this.b.insert(i, "MIN(");
      break;
    case 7: 
      this.b.insert(i, "MAX(");
      break;
    case 8: 
      this.b.insert(i, "ROW(");
      break;
    case 9: 
      this.b.insert(i, "COLUMN(");
      break;
    case 11: 
      this.b.insert(i, "NPV(");
      break;
    case 12: 
      this.b.insert(i, "STDEV(");
      break;
    case 13: 
      this.b.insert(i, "DOLLAR(");
      break;
    case 14: 
      this.b.insert(i, "FIXED(");
      break;
    case 28: 
      this.b.insert(i, "LOOKUP(");
      break;
    case 29: 
      this.b.insert(i, "INDEX(");
      break;
    case 36: 
      this.b.insert(i, "AND(");
      break;
    case 37: 
      this.b.insert(i, "OR(");
      break;
    case 46: 
      this.b.insert(i, "VAR(");
      break;
    case 49: 
      this.b.insert(i, "LINEST(");
      break;
    case 50: 
      this.b.insert(i, "TREND(");
      break;
    case 51: 
      this.b.insert(i, "LOGEST(");
      break;
    case 52: 
      this.b.insert(i, "GROWTH(");
      break;
    case 56: 
      this.b.insert(i, "PV(");
      break;
    case 57: 
      this.b.insert(i, "FV(");
      break;
    case 59: 
      this.b.insert(i, "PMT(");
      break;
    case 62: 
      this.b.insert(i, "IRR(");
      break;
    case 64: 
      this.b.insert(i, "MATCH(");
      break;
    case 70: 
      this.b.insert(i, "WEEKDAY(");
      break;
    case 78: 
      this.b.insert(i, "OFFSET(");
      break;
    case 82: 
      this.b.insert(i, "SEARCH(");
      break;
    case 100: 
      this.b.insert(i, "CHOOSE(");
      break;
    case 101: 
      this.b.insert(i, "HLOOKUP(");
      break;
    case 102: 
      this.b.insert(i, "VLOOKUP(");
      break;
    case 109: 
      this.b.insert(i, "LOG(");
      break;
    case 115: 
      this.b.insert(i, "LEFT(");
      break;
    case 116: 
      this.b.insert(i, "RIGHT(");
      break;
    case 120: 
      this.b.insert(i, "SUBSTITUTE(");
      break;
    case 124: 
      this.b.insert(i, "FIND(");
      break;
    case 125: 
      this.b.insert(i, "CELL(");
      break;
    case 144: 
      this.b.insert(i, "DDB(");
      break;
    case 148: 
      this.b.insert(i, "INDIRECT(");
      break;
    case 169: 
      this.b.insert(i, "COUNTA(");
      break;
    case 183: 
      this.b.insert(i, "PRODUCT(");
      break;
    case 193: 
      this.b.insert(i, "STDEVP(");
      break;
    case 194: 
      this.b.insert(i, "VARP(");
      break;
    case 197: 
      this.b.insert(i, "TRUNC(");
      break;
    case 204: 
      this.b.insert(i, "DOLLAR(");
      break;
    case 216: 
      this.b.insert(i, "RANK(");
      break;
    case 219: 
      this.b.insert(i, "ADDRESS(");
      break;
    case 220: 
      this.b.insert(i, "DAYS360(");
      break;
    case 227: 
      this.b.insert(i, "MEDIAN(");
      break;
    case 228: 
      this.b.insert(i, "SUMPRODUCT(");
      break;
    case 269: 
      this.b.insert(i, "AVEDEV(");
      break;
    case 270: 
      this.b.insert(i, "BETADIST(");
      break;
    case 272: 
      this.b.insert(i, "BETAINV(");
      break;
    case 317: 
      this.b.insert(i, "PROB(");
      break;
    case 318: 
      this.b.insert(i, "DEVSQ(");
      break;
    case 319: 
      this.b.insert(i, "GEOMEAN(");
      break;
    case 320: 
      this.b.insert(i, "HARMEAN(");
      break;
    case 321: 
      this.b.insert(i, "SUMSQ(");
      break;
    case 322: 
      this.b.insert(i, "KURT(");
      break;
    case 323: 
      this.b.insert(i, "SKEW(");
      break;
    case 324: 
      this.b.insert(i, "ZTEST(");
      break;
    case 329: 
      this.b.insert(i, "PERCENTRANK(");
      break;
    case 330: 
      this.b.insert(i, "MODE(");
      break;
    case 336: 
      this.b.insert(i, "CONCATENATE(");
      break;
    case 344: 
      this.b.insert(i, "SUBTOTAL(");
      break;
    case 345: 
      this.b.insert(i, "SUMIF(");
      break;
    case 354: 
      this.b.insert(i, "ROMAN(");
      break;
    case 358: 
      this.b.insert(i, "GETPIVOTDATA(");
      break;
    case 359: 
      this.b.insert(i, "HYPERLINK(");
      break;
    case 361: 
      this.b.insert(i, "AVERAGEA(");
      break;
    case 363: 
      this.b.insert(i, "MINA(");
      break;
    case 364: 
      this.b.insert(i, "STDEVPA(");
      break;
    case 366: 
      this.b.insert(i, "STDEVA(");
      break;
    case 367: 
      this.b.insert(i, "VARA(");
      break;
    default: 
      zacn localzacn = zacn.a(j & 0xFFFF);
      if (localzacn != null) {
        this.b.insert(i, localzacn.b + "(");
      } else {
        return;
      }
      break;
    }
    if ((paramArrayOfByte[paramInt] & 0xFF) - 1 > 0) {
      zf.a(paramArrayList, paramArrayList.size() - (paramArrayOfByte[paramInt] & 0xFF) + 1, (paramArrayOfByte[paramInt] & 0xFF) - 1);
    }
    this.b.append(")");
  }
  
  private void c(byte[] paramArrayOfByte, int paramInt, ArrayList paramArrayList)
  {
    int j = zc.e(paramArrayOfByte, paramInt);
    int i;
    int k;
    switch (j)
    {
    case 2: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ISNA(");
      break;
    case 3: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ISERROR(");
      break;
    case 10: 
      zf.a(paramArrayList, Integer.valueOf(this.b.length()));
      this.b.append("NA(");
      break;
    case 15: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "SIN(");
      break;
    case 16: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "COS(");
      break;
    case 17: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "TAN(");
      break;
    case 18: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ATAN(");
      break;
    case 19: 
      zf.a(paramArrayList, Integer.valueOf(this.b.length()));
      this.b.append("PI(");
      break;
    case 20: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "SQRT(");
      break;
    case 21: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "EXP(");
      break;
    case 22: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "LN(");
      break;
    case 23: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "LOG10(");
      break;
    case 24: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ABS(");
      break;
    case 25: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "INT(");
      break;
    case 26: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "SIGN(");
      break;
    case 27: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "ROUND(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 30: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "REPT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 31: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "MID(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 32: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "LEN(");
      break;
    case 33: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "VALUE(");
      break;
    case 34: 
      zf.a(paramArrayList, Integer.valueOf(this.b.length()));
      this.b.append("TRUE(");
      break;
    case 35: 
      zf.a(paramArrayList, Integer.valueOf(this.b.length()));
      this.b.append("FALSE(");
      break;
    case 38: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "NOT(");
      break;
    case 39: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "MOD(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 40: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "DCOUNT(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 41: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "DSUM(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 42: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "DAVERAGE(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 43: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "DMIN(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 44: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "DMAX(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      } else {
        zf.a(paramArrayList, Integer.valueOf(i));
      }
      break;
    case 45: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "DSTDEV(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 47: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "DVAR(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 48: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "TEXT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 63: 
      zf.a(paramArrayList, Integer.valueOf(this.b.length()));
      this.b.append("RAND(");
      break;
    case 65: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "DATE(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      } else {
        zf.a(paramArrayList, Integer.valueOf(i));
      }
      break;
    case 66: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "TIME(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 67: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "DAY(");
      break;
    case 68: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "MONTH(");
      break;
    case 69: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "YEAR(");
      break;
    case 71: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "HOUR(");
      break;
    case 72: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "MINUTE(");
      break;
    case 73: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "SECOND(");
      break;
    case 74: 
      zf.a(paramArrayList, Integer.valueOf(this.b.length()));
      this.b.append("NOW(");
      break;
    case 75: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "AREAS(");
      break;
    case 76: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ROWS(");
      break;
    case 77: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "COLUMNS(");
      break;
    case 83: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "TRANSPOSE(");
      break;
    case 97: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "ATAN2(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 98: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ASIN(");
      break;
    case 99: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ACOS(");
      break;
    case 105: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ISREF(");
      break;
    case 111: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "CHAR(");
      break;
    case 112: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "LOWER(");
      break;
    case 113: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "UPPER(");
      break;
    case 114: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "PROPER(");
      break;
    case 117: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "EXACT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 118: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "TRIM(");
      break;
    case 119: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (k = 1; k < 4; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.b.insert(i, "REPLACE(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 121: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "CODE(");
      break;
    case 127: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ISTEXT(");
      break;
    case 128: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ISNUMBER(");
      break;
    case 129: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ISBLANK(");
      break;
    case 130: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "T(");
      break;
    case 131: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "N(");
      break;
    case 140: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "DATEVALUE(");
      break;
    case 141: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "TIMEVALUE(");
      break;
    case 142: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "SLN(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 143: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (k = 1; k < 4; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.b.insert(i, "SYD(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 163: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "MDETERM(");
      break;
    case 164: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "MINVERSE(");
      break;
    case 165: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "MMULT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 184: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "FACT(");
      break;
    case 189: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "DPRODUCT(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 190: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ISNONTEXT(");
      break;
    case 195: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "DSTDEVP(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 196: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "DVARP(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 198: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ISLOGICAL(");
      break;
    case 199: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "DCOUNTA(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 212: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "ROUNDUP(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 213: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "ROUNDDOWN(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 214: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ASC(");
      break;
    case 215: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "WIDECHAR(");
      break;
    case 221: 
      i = this.b.length();
      this.b.append("TODAY(");
      zf.a(paramArrayList, Integer.valueOf(i));
      break;
    case 229: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "SINH(");
      break;
    case 230: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "COSH(");
      break;
    case 231: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "TANH(");
      break;
    case 232: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ASINH(");
      break;
    case 233: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ACOSH(");
      break;
    case 234: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ATANH(");
      break;
    case 235: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "DGET(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 252: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "FREQUENCY(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 273: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (k = 1; k < 4; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.b.insert(i, "BINOMDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 274: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "CHIDIST(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 275: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "CHIINV(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 276: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "COMBIN(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 277: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "CONFIDENCE(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 278: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "CRITBINOM(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 279: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "EVEN(");
      break;
    case 280: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "EXPONDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 281: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "FDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 282: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "FINV(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 283: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "FISHER(");
      break;
    case 284: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "FISHERINV(");
      break;
    case 286: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (k = 1; k < 4; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.b.insert(i, "GAMMADIST(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      break;
    case 287: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "GAMMAINV(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 285: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "FLOOR(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 288: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "CEILING(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 289: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (k = 1; k < 4; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.b.insert(i, "HYPGEOMDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      break;
    case 290: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "LOGNORMDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 291: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "LOGINV(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 292: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "NEGBINOMDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 293: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (k = 1; k < 4; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.b.insert(i, "NORMDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      break;
    case 294: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "NORMSDIST(");
      break;
    case 295: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "NORMINV(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 296: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "NORMSINV(");
      break;
    case 297: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "STANDARDIZE(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 298: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "ODD(");
      break;
    case 299: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "PERMUT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 300: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "POISSON(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 301: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "TDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 302: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (k = 1; k < 4; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.b.insert(i, "WEIBULL(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 303: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "SUMXMY2(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 304: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "SUMX2MY2(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 305: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "SUMX2PY2(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 306: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "CHITEST(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 307: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "CORREL(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 308: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "COVAR(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 309: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.b.insert(i, "FORECAST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 310: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "FTEST(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 311: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "INTERCEPT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 312: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "PEARSON(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 313: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "RSQ(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 314: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "STEYX(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 315: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "SLOPE(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 316: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (k = 1; k < 4; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.b.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.b.insert(i, "TTEST(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 325: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "LARGE(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 326: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "SMALL(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 327: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "QUARTILE(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 328: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "PERCENTILE(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 331: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "TRIMMEAN(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 332: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "TINV(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 337: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "POWER(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 342: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "RADIANS(");
      break;
    case 343: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "DEGREES(");
      break;
    case 346: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.b.insert(i, "COUNTIF(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 347: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.b.insert(i, "COUNTBLANK(");
      break;
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 28: 
    case 29: 
    case 36: 
    case 37: 
    case 46: 
    case 49: 
    case 50: 
    case 51: 
    case 52: 
    case 53: 
    case 54: 
    case 55: 
    case 56: 
    case 57: 
    case 58: 
    case 59: 
    case 60: 
    case 61: 
    case 62: 
    case 64: 
    case 70: 
    case 78: 
    case 79: 
    case 80: 
    case 81: 
    case 82: 
    case 84: 
    case 85: 
    case 86: 
    case 87: 
    case 88: 
    case 89: 
    case 90: 
    case 91: 
    case 92: 
    case 93: 
    case 94: 
    case 95: 
    case 96: 
    case 100: 
    case 101: 
    case 102: 
    case 103: 
    case 104: 
    case 106: 
    case 107: 
    case 108: 
    case 109: 
    case 110: 
    case 115: 
    case 116: 
    case 120: 
    case 122: 
    case 123: 
    case 124: 
    case 125: 
    case 126: 
    case 132: 
    case 133: 
    case 134: 
    case 135: 
    case 136: 
    case 137: 
    case 138: 
    case 139: 
    case 144: 
    case 145: 
    case 146: 
    case 147: 
    case 148: 
    case 149: 
    case 150: 
    case 151: 
    case 152: 
    case 153: 
    case 154: 
    case 155: 
    case 156: 
    case 157: 
    case 158: 
    case 159: 
    case 160: 
    case 161: 
    case 162: 
    case 166: 
    case 167: 
    case 168: 
    case 169: 
    case 170: 
    case 171: 
    case 172: 
    case 173: 
    case 174: 
    case 175: 
    case 176: 
    case 177: 
    case 178: 
    case 179: 
    case 180: 
    case 181: 
    case 182: 
    case 183: 
    case 185: 
    case 186: 
    case 187: 
    case 188: 
    case 191: 
    case 192: 
    case 193: 
    case 194: 
    case 197: 
    case 200: 
    case 201: 
    case 202: 
    case 203: 
    case 204: 
    case 205: 
    case 206: 
    case 207: 
    case 208: 
    case 209: 
    case 210: 
    case 211: 
    case 216: 
    case 217: 
    case 218: 
    case 219: 
    case 220: 
    case 222: 
    case 223: 
    case 224: 
    case 225: 
    case 226: 
    case 227: 
    case 228: 
    case 236: 
    case 237: 
    case 238: 
    case 239: 
    case 240: 
    case 241: 
    case 242: 
    case 243: 
    case 244: 
    case 245: 
    case 246: 
    case 247: 
    case 248: 
    case 249: 
    case 250: 
    case 251: 
    case 253: 
    case 254: 
    case 255: 
    case 256: 
    case 257: 
    case 258: 
    case 259: 
    case 260: 
    case 261: 
    case 262: 
    case 263: 
    case 264: 
    case 265: 
    case 266: 
    case 267: 
    case 268: 
    case 269: 
    case 270: 
    case 271: 
    case 272: 
    case 317: 
    case 318: 
    case 319: 
    case 320: 
    case 321: 
    case 322: 
    case 323: 
    case 324: 
    case 329: 
    case 330: 
    case 333: 
    case 334: 
    case 335: 
    case 336: 
    case 338: 
    case 339: 
    case 340: 
    case 341: 
    case 344: 
    case 345: 
    default: 
      zacn localzacn = zacn.a(j & 0xFFFF);
      if (localzacn != null)
      {
        if (paramArrayList.size() < (localzacn.d & 0xFF)) {
          return;
        }
        for (int m = 1; m < (localzacn.d & 0xFF); m++)
        {
          i = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
          this.b.insert(i, ',');
        }
        i = ((Integer)paramArrayList.get(paramArrayList.size() - (localzacn.d & 0xFF))).intValue();
        this.b.insert(i, localzacn.b + "(");
        if ((localzacn.d & 0xFF) > 1) {
          zf.a(paramArrayList, paramArrayList.size() - (localzacn.d & 0xFF) + 1, (localzacn.d & 0xFF) - 1);
        }
        if (paramArrayList.size() > 0) {
          paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
        }
      }
      else
      {
        return;
      }
      break;
    }
    this.b.append(")");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */