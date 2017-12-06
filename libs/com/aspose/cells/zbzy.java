package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;

class zbzy
{
  int a;
  private HashMap b;
  private StringBuilder c = new StringBuilder();
  private WorksheetCollection d;
  private Cell e = null;
  private int f;
  private int g;
  private static final za h = new za(new String[] { "_xlfn.IFERROR_1" });
  
  void a()
  {
    this.d = null;
    this.b = null;
    this.e = null;
    this.c = null;
    zg.a(this);
  }
  
  void b()
  {
    this.a = 1;
    this.b = new HashMap();
    int i = 0;
    for (int j = 0; j < this.d.w().getCount(); j++)
    {
      zbti localzbti = this.d.w().a(j);
      if (localzbti.e()) {
        i++;
      } else if ((localzbti.a() == 0) && ((localzbti.l() == null) || ("".equals(localzbti.l().trim())))) {
        i++;
      } else {
        this.b.put(Integer.valueOf(j), Integer.valueOf(j + 1 - i));
      }
    }
  }
  
  void c()
  {
    this.a = 0;
    this.b = null;
  }
  
  zbzy(WorksheetCollection paramWorksheetCollection)
  {
    this.d = paramWorksheetCollection;
  }
  
  private void a(StringBuilder paramStringBuilder, byte[] paramArrayOfByte, int paramInt)
  {
    int i = (zc.e(paramArrayOfByte, paramInt) & 0xFFFF) - 1;
    Name localName = this.d.getNames().get(i);
    String str = localName.getText();
    switch (h.a(str))
    {
    case 0: 
      this.c.append("IFERROR");
      return;
    }
    if (localName.getText().startsWith("_xlfn.")) {
      str = str.substring(6);
    }
    paramStringBuilder.append(str);
  }
  
  String a(Cell paramCell)
  {
    this.e = paramCell;
    int i = 2;
    byte[] arrayOfByte = paramCell.v();
    Object localObject;
    int j;
    int k;
    Cell localCell;
    if ((arrayOfByte[i] == 1) && (arrayOfByte[0] == 5))
    {
      localObject = ((zaai)paramCell.c.d).a();
      if (localObject == null)
      {
        j = zc.e(arrayOfByte, i + 1);
        k = arrayOfByte[(i + 3)];
        localCell = paramCell.d.checkCell(j & 0xFFFF, k & 0xFF);
        if (localCell != null) {
          localObject = localCell.F();
        }
      }
      if (localObject != null) {
        return a(-1, -1, ((zbf)localObject).c(), paramCell.getRow(), paramCell.getColumn(), !((zbf)localObject).b(), false);
      }
      return null;
    }
    if ((arrayOfByte[i] == 2) && (arrayOfByte[0] == 5))
    {
      localObject = ((zaai)paramCell.c.d).b();
      if (localObject == null)
      {
        j = zc.e(arrayOfByte, i + 1);
        k = arrayOfByte[(i + 3)];
        localCell = paramCell.d.getRows().a.a(j & 0xFFFF, k & 0xFF);
        if (localCell != null) {
          localObject = localCell.G();
        }
      }
      if (localObject != null)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("{=TABLE(");
        if (((zacb)localObject).e()) {
          localStringBuilder.append(((zacb)localObject).g());
        }
        localStringBuilder.append(",");
        if (((zacb)localObject).f()) {
          localStringBuilder.append(((zacb)localObject).h());
        }
        localStringBuilder.append(")}");
        return zs.a(localStringBuilder);
      }
      return null;
    }
    return a(-1, arrayOfByte, paramCell.getRow(), paramCell.getColumn(), false);
  }
  
  String a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    return a(paramInt1, -1, paramArrayOfByte, paramInt2, paramInt3, paramBoolean, false);
  }
  
  String a(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = paramInt1;
    if (paramInt2 != -1)
    {
      this.f = paramInt2;
      this.g = (i + paramInt2);
    }
    else if (i == -1)
    {
      i = 2;
      this.f = (zc.e(paramArrayOfByte, 0) & 0xFFFF);
      this.g = (i + this.f);
    }
    else
    {
      this.f = 0;
      this.g = 0;
    }
    int j = i;
    int k = this.g;
    this.c = new StringBuilder(256);
    ArrayList localArrayList = new ArrayList();
    while ((i < paramArrayOfByte.length) && ((this.g == 0) || (i < k)))
    {
      int m;
      Object localObject1;
      int i1;
      int i3;
      String str2;
      switch (paramArrayOfByte[i])
      {
      case 1: 
      case 2: 
        return null;
      case 3: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, '+');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 4: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, '-');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 5: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, '*');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 6: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, '/');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 7: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, '^');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 8: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, '&');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 9: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, '<');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 10: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, "<=");
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 11: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, '=');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 12: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, ">=");
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 13: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, '>');
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 14: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, "<>");
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 15: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, " ");
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 16: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, ",");
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 17: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, ":");
        localArrayList.remove(localArrayList.size() - 1);
        i++;
        break;
      case 18: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, "+");
        i++;
        break;
      case 19: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, "-");
        i++;
        break;
      case 20: 
        this.c.append("%");
        i++;
        break;
      case 21: 
        m = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.c.insert(m, "(");
        this.c.append(")");
        i++;
        break;
      case 22: 
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        i++;
        break;
      case 23: 
        try
        {
          i++;
          int n = paramArrayOfByte[i];
          String str1;
          if (paramArrayOfByte[(i + 1)] == 0)
          {
            localObject1 = new byte[2 * (n & 0xFF)];
            for (i1 = 0; i1 < 2 * (n & 0xFF); i1++) {
              if (i1 % 2 == 0)
              {
                int i2 = paramArrayOfByte[(i1 / 2 + i + 2)];
                if (i2 != 0) {
                  localObject1[i1] = i2;
                } else {
                  localObject1[i1] = 44;
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
          zf.a(localArrayList, Integer.valueOf(this.c.length()));
          this.c.append("\"");
          if ((str1 != null) && (!"".equals(str1)))
          {
            str1 = zw.a(str1, "\"", "\"\"");
            this.c.append(str1);
          }
          this.c.append("\"");
        }
        catch (Exception localException)
        {
          throw new CellsException(5, "Invalid formula");
        }
      case 24: 
        int[] arrayOfInt = { i };
        localObject1 = a(paramArrayOfByte, arrayOfInt, paramInt3, paramInt4, paramBoolean2);
        i = arrayOfInt[0];
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        this.c.append((String)localObject1);
        break;
      case 25: 
        i++;
        i = a(paramArrayOfByte, i, localArrayList);
        break;
      case 29: 
        i++;
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        if (paramArrayOfByte[i] == 0) {
          this.c.append("FALSE");
        } else {
          this.c.append("TRUE");
        }
        i++;
        break;
      case 30: 
        i1 = zc.e(paramArrayOfByte, i + 1);
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        this.c.append(zp.a(i1 & 0xFFFF));
        i += 3;
        break;
      case 31: 
        double d1 = zc.f(paramArrayOfByte, i + 1);
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        if ((d1 >= 1.0E21D) || (Math.abs(d1) <= 1.0E-21D)) {
          this.c.append(zp.b(d1));
        } else {
          this.c.append(zarb.a(d1));
        }
        i += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        if (this.g == 0) {
          this.g = (i + 1);
        }
        a(paramArrayOfByte, localArrayList);
        i += 8;
        break;
      case 33: 
      case 65: 
      case 97: 
        i++;
        d(paramArrayOfByte, i, localArrayList);
        i += 2;
        break;
      case 34: 
      case 66: 
      case 98: 
        i++;
        c(paramArrayOfByte, i, localArrayList);
        i += 3;
        break;
      case 35: 
      case 67: 
      case 99: 
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        i++;
        a(this.c, paramArrayOfByte, i);
        i += 4;
        break;
      case 36: 
      case 68: 
      case 100: 
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        i++;
        this.c.append(a(paramArrayOfByte, i));
        i += 4;
        break;
      case 37: 
      case 69: 
      case 101: 
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        i++;
        this.c.append(a(paramArrayOfByte, i, paramInt3, paramInt4, paramBoolean1));
        i += 8;
        break;
      case 38: 
      case 70: 
      case 102: 
        i += 7;
        break;
      case 39: 
      case 71: 
      case 103: 
        i += 7;
        break;
      case 40: 
      case 72: 
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
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        this.c.append("#REF!");
        i += 5;
        break;
      case 43: 
      case 75: 
      case 107: 
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        this.c.append("#REF!");
        i += 9;
        break;
      case 44: 
      case 76: 
      case 108: 
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        i++;
        this.c.append(a(paramArrayOfByte, i, paramInt3, paramInt4));
        i += 4;
        break;
      case 45: 
      case 77: 
      case 109: 
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        i++;
        this.c.append(a(paramArrayOfByte, i, paramInt3, paramInt4, true));
        i += 8;
        break;
      case 57: 
      case 89: 
      case 121: 
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        i++;
        i3 = zc.e(paramArrayOfByte, i) & 0xFFFF;
        int i4 = this.d.r().c(i3);
        zbti localzbti = null;
        if ((this.d.w() != null) && (i4 < this.d.w().getCount()))
        {
          localzbti = this.d.w().a(i4);
          if (localzbti.e()) {
            localzbti = null;
          }
        }
        i += 2;
        int i5 = zc.e(paramArrayOfByte, i) & 0xFFFF;
        Object localObject2;
        if (localzbti == null)
        {
          localObject2 = this.d.getNames().get(i5 - 1);
          if (((Name)localObject2).getSheetIndex() == 0)
          {
            this.c.append(((Name)localObject2).getText());
          }
          else
          {
            String str3 = this.d.get(((Name)localObject2).getSheetIndex() - 1).getName();
            if ((str3.indexOf(" ") != -1) || (str3.indexOf("-") != -1) || (str3.indexOf("&") != -1) || (zarb.c(str3)) || (zcaf.a(str3))) {
              str3 = "'" + str3 + "'";
            }
            this.c.append(str3 + "!" + ((Name)localObject2).getText());
          }
        }
        else if (localzbti.f())
        {
          localObject2 = (zwh)localzbti.b().get(i5 - 1);
          this.c.append(((zwh)localObject2).e().toUpperCase());
        }
        else
        {
          zwh localzwh;
          if (localzbti.a() == 0)
          {
            localObject2 = null;
            int i6;
            if (localzbti.c() != null)
            {
              i6 = this.d.r().d(i3, this.d.v());
              if ((i6 >= 0) && (i6 < localzbti.c().length)) {
                localObject2 = localzbti.c()[i6];
              }
            }
            if (this.a == 1)
            {
              i6 = (localObject2 != null) && (zamm.a((String)localObject2)) ? 1 : 0;
              if (i6 != 0) {
                this.c.append('\'');
              }
              this.c.append('[');
              this.c.append(zs.a(this.b.get(Integer.valueOf(i4))));
              this.c.append(']');
              if (localObject2 != null) {
                this.c.append((String)localObject2);
              }
              if (i6 != 0) {
                this.c.append('\'');
              }
            }
            else
            {
              this.c.append('\'');
              if (localObject2 != null) {
                this.c.append('[');
              }
              this.c.append(localzbti.l());
              if (localObject2 != null)
              {
                this.c.append(']');
                this.c.append((String)localObject2);
              }
              this.c.append('\'');
            }
            this.c.append("!");
            localzwh = (zwh)localzbti.b().get(i5 - 1);
            this.c.append(localzwh.e().toUpperCase());
          }
          else if (localzbti.a() == 3)
          {
            if (this.a == 1)
            {
              this.c.append('[');
              this.c.append(zs.a(this.b.get(Integer.valueOf(i4))));
              this.c.append(']');
            }
            else
            {
              localObject2 = null;
              localzwh = null;
              String[] arrayOfString1 = { localObject2 };
              String[] arrayOfString2 = { localzwh };
              localzbti.a(arrayOfString1, arrayOfString2);
              localObject2 = arrayOfString1[0];
              localzwh = arrayOfString2[0];
              this.c.append((String)localObject2);
              this.c.append("|");
              this.c.append(localzwh);
            }
            this.c.append("!");
            localObject2 = (zwh)localzbti.b().get(i5 - 1);
            this.c.append('\'');
            this.c.append(((zwh)localObject2).e().toUpperCase());
            this.c.append('\'');
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
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        i++;
        i3 = zc.e(paramArrayOfByte, i) & 0xFFFF;
        str2 = zaap.a(i3, this.d, this.a, this.b);
        this.c.append(str2);
        this.c.append('!');
        if ((this.a != 1) || ("".equals(str2)) || (str2.charAt(0) != '#'))
        {
          i += 2;
          if (paramBoolean1) {
            this.c.append(a(paramArrayOfByte, i, paramInt3, paramInt4));
          } else {
            this.c.append(a(paramArrayOfByte, i));
          }
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
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        i++;
        i3 = zc.e(paramArrayOfByte, i) & 0xFFFF;
        str2 = zaap.a(i3, this.d, this.a, this.b);
        this.c.append(str2);
        this.c.append('!');
        if ((this.a != 1) || ("".equals(str2)) || (str2.charAt(0) != '#'))
        {
          i += 2;
          this.c.append(a(paramArrayOfByte, i, paramInt3, paramInt4, paramBoolean1));
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
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        i++;
        i3 = zc.e(paramArrayOfByte, i) & 0xFFFF;
        str2 = zaap.a(i3, this.d, this.a, this.b);
        this.c.append(str2);
        if (str2.charAt(0) != '#') {
          this.c.append("!#REF!");
        } else {
          this.c.append('!');
        }
        i += 6;
        break;
      case 61: 
      case 93: 
      case 125: 
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        i++;
        i3 = zc.e(paramArrayOfByte, i) & 0xFFFF;
        str2 = zaap.a(i3, this.d, this.a, this.b);
        this.c.append(str2);
        if (str2.charAt(0) != '#') {
          this.c.append("!#REF!");
        } else {
          this.c.append('!');
        }
        i += 10;
        break;
      case 28: 
        zf.a(localArrayList, Integer.valueOf(this.c.length()));
        i++;
        this.c.append(ztr.b(paramArrayOfByte[i]));
        i++;
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
    this.c.insert(0, '=');
    localArrayList = null;
    return zs.a(this.c);
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
      i = this.g;
      localObject = new int[] { i };
      str = zbvl.a(this.d, this.e, paramArrayOfByte, paramArrayOfInt[0], paramInt1, paramInt2, this.a, paramBoolean, this.b, (int[])localObject);
      i = localObject[0];
      this.g = i;
      paramArrayOfInt[0] += 14;
      return str;
    case 29: 
      i = zc.a(paramArrayOfByte, paramArrayOfInt[0] + 2);
      paramArrayOfInt[0] += 6;
      if (this.d.c() != null)
      {
        if ((this.d.c() instanceof zaxa))
        {
          localObject = (zaxa)this.d.c();
          str = ((zaxa)localObject).a(i, this.a);
          return str;
        }
        if ((this.d.c() instanceof zawp))
        {
          localObject = (zawp)this.d.c();
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
  
  private void a(byte[] paramArrayOfByte, ArrayList paramArrayList)
  {
    zf.a(paramArrayList, Integer.valueOf(this.c.length()));
    this.c.append('{');
    int i = (paramArrayOfByte[this.g] & 0xFF) + 1;
    this.g += 1;
    int j = (zc.e(paramArrayOfByte, this.g) & 0xFFFF) + 1;
    this.g += 2;
    for (int k = 0; k < j; k++)
    {
      for (int m = 0; m < i; m++) {
        switch (paramArrayOfByte[this.g])
        {
        case 0: 
          this.g += 9;
          if (m != i - 1) {
            this.c.append(',');
          }
          break;
        case 1: 
          this.g += 1;
          double d1 = zc.f(paramArrayOfByte, this.g);
          this.c.append(zp.b(d1));
          this.g += 8;
          if (m != i - 1) {
            this.c.append(',');
          }
          break;
        case 2: 
          this.g += 1;
          int n = zc.e(paramArrayOfByte, this.g) & 0xFFFF;
          this.c.append("\"");
          if (n != 0)
          {
            String str = null;
            if (paramArrayOfByte[(this.g + 2)] == 0)
            {
              str = Encoding.getASCII().a(paramArrayOfByte, this.g + 3, n);
              this.g += 3 + n;
            }
            else
            {
              str = Encoding.getUnicode().a(paramArrayOfByte, this.g + 3, n * 2);
              this.g += 3 + n * 2;
            }
            if ((str != null) && (!"".equals(str))) {
              str = zw.a(str, "\"", "\"\"");
            }
            this.c.append(str);
          }
          else
          {
            this.g += 3;
          }
          this.c.append("\"");
          if (m != i - 1) {
            this.c.append(',');
          }
          break;
        case 4: 
          this.c.append(paramArrayOfByte[(this.g + 1)] == 1 ? "TRUE" : "FALSE");
          if (m != i - 1) {
            this.c.append(',');
          }
          this.g += 9;
          break;
        case 16: 
          this.c.append(ztr.b(paramArrayOfByte[(this.g + 1)]));
          if (m != i - 1) {
            this.c.append(',');
          }
          this.g += 9;
        }
      }
      if (k != j - 1) {
        this.c.append(';');
      }
    }
    this.c.append('}');
  }
  
  private int a(byte[] paramArrayOfByte, int paramInt, ArrayList paramArrayList)
  {
    switch (paramArrayOfByte[paramInt])
    {
    case 16: 
      int i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "SUM(");
      this.c.append(")");
      paramInt += 3;
      break;
    case 4: 
      paramInt += 3;
      int j = zc.e(paramArrayOfByte, paramInt) & 0xFFFF;
      paramInt += j;
      break;
    default: 
      paramInt += 3;
    }
    return paramInt;
  }
  
  private String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int k = zc.e(paramArrayOfByte, paramInt1);
    int m = paramArrayOfByte[(paramInt1 + 4)];
    int n;
    if ((k & 0xFFFF) + paramInt2 > 65535) {
      n = (k & 0xFFFF) + paramInt2 - 65535 - 1;
    } else {
      n = (k & 0xFFFF) + paramInt2;
    }
    int i1;
    if ((m & 0xFF) + paramInt3 > 255) {
      i1 = (m & 0xFF) + paramInt3 - 255 - 1;
    } else {
      i1 = (m & 0xFF) + paramInt3;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i2 = 1;
    int i3 = 1;
    if ((paramArrayOfByte[(paramInt1 + 5)] & 0xFF & 0x80) != 0)
    {
      i2 = 0;
      if (paramBoolean) {
        k = n;
      }
    }
    if ((paramArrayOfByte[(paramInt1 + 5)] & 0xFF & 0x40) != 0)
    {
      i3 = 0;
      if (paramBoolean) {
        m = (byte)i1;
      }
    }
    int i = zc.e(paramArrayOfByte, paramInt1 + 2);
    int j = paramArrayOfByte[(paramInt1 + 6)];
    if ((i & 0xFFFF) + paramInt2 > 65535) {
      n = (i & 0xFFFF) + paramInt2 - 65535 - 1;
    } else {
      n = (i & 0xFFFF) + paramInt2;
    }
    if ((j & 0xFF) + paramInt3 > 255) {
      i1 = (j & 0xFF) + paramInt3 - 255 - 1;
    } else {
      i1 = (j & 0xFF) + paramInt3;
    }
    int i4 = 1;
    int i5 = 1;
    if ((paramArrayOfByte[(paramInt1 + 7)] & 0xFF & 0x80) != 0)
    {
      i4 = 0;
      if (paramBoolean) {
        i = n;
      }
    }
    if ((paramArrayOfByte[(paramInt1 + 7)] & 0xFF & 0x40) != 0)
    {
      i5 = 0;
      if (paramBoolean) {
        j = (byte)i1;
      }
    }
    if (((k & 0xFFFF) == 0) && ((i & 0xFFFF) == 65535))
    {
      if (i3 != 0) {
        localStringBuilder.append("$");
      }
      CellsHelper.a(localStringBuilder, m & 0xFF);
      localStringBuilder.append(':');
      if (i5 != 0) {
        localStringBuilder.append("$");
      }
      CellsHelper.a(localStringBuilder, j & 0xFF);
      return zs.a(localStringBuilder);
    }
    if ((m == 0) && ((j & 0xFF) == 255))
    {
      if (i2 != 0) {
        localStringBuilder.append("$");
      }
      localStringBuilder.append((k & 0xFFFF) + 1);
      localStringBuilder.append(':');
      if (i4 != 0) {
        localStringBuilder.append("$");
      }
      localStringBuilder.append((i & 0xFFFF) + 1);
      return zs.a(localStringBuilder);
    }
    if (i3 != 0) {
      localStringBuilder.append('$');
    }
    CellsHelper.a(localStringBuilder, m & 0xFF);
    if (i2 != 0) {
      localStringBuilder.append('$');
    }
    localStringBuilder.append((k & 0xFFFF) + 1);
    localStringBuilder.append(':');
    if (i5 != 0) {
      localStringBuilder.append('$');
    }
    CellsHelper.a(localStringBuilder, j & 0xFF);
    if (i4 != 0) {
      localStringBuilder.append('$');
    }
    localStringBuilder.append((i & 0xFFFF) + 1);
    return zs.a(localStringBuilder);
  }
  
  private String a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = zc.e(paramArrayOfByte, paramInt1);
    int j = paramArrayOfByte[(paramInt1 + 2)];
    int n = paramArrayOfByte[(paramInt1 + 3)];
    StringBuilder localStringBuilder = new StringBuilder();
    if ((n & 0xFF & 0x40) == 0)
    {
      localStringBuilder.append('$');
      CellsHelper.a(localStringBuilder, j & 0xFF);
    }
    else
    {
      int m;
      if ((j & 0xFF) + paramInt3 > 255) {
        m = (j & 0xFF) + paramInt3 - 255 - 1;
      } else {
        m = (j & 0xFF) + paramInt3;
      }
      CellsHelper.a(localStringBuilder, m);
    }
    if ((n & 0xFF & 0x80) == 0)
    {
      localStringBuilder.append('$');
      localStringBuilder.append((i & 0xFFFF) + 1);
    }
    else
    {
      int k;
      if ((i & 0xFFFF) + paramInt2 > 65535) {
        k = (i & 0xFFFF) + paramInt2 - 65535 - 1;
      } else {
        k = (i & 0xFFFF) + paramInt2;
      }
      localStringBuilder.append(k + 1);
    }
    return zs.a(localStringBuilder);
  }
  
  private String a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = zc.e(paramArrayOfByte, paramInt);
    int j = paramArrayOfByte[(paramInt + 2)];
    boolean bool1 = true;
    boolean bool2 = true;
    int k = paramArrayOfByte[(paramInt + 3)];
    if ((k & 0xFF & 0x40) != 0) {
      bool2 = false;
    }
    if ((k & 0xFF & 0x80) != 0) {
      bool1 = false;
    }
    return CellsHelper.a(i & 0xFFFF, j & 0xFF, bool1, bool2);
  }
  
  private void b(byte[] paramArrayOfByte, int paramInt, ArrayList paramArrayList)
  {
    int j = (paramArrayOfByte[paramInt] & 0xFF) - 1;
    int i;
    for (int k = 1; k < j; k++)
    {
      i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
      this.c.insert(i, ',');
    }
    k = paramArrayList.size() - j;
    if (k < paramArrayList.size()) {
      i = ((Integer)paramArrayList.get(k)).intValue();
    } else {
      i = this.c.length();
    }
    this.c.insert(i, "(");
    if ((paramArrayOfByte[paramInt] & 0xFF) - 1 > 0) {
      zf.a(paramArrayList, paramArrayList.size() - (paramArrayOfByte[paramInt] & 0xFF) + 1, (paramArrayOfByte[paramInt] & 0xFF) - 1);
    }
    this.c.append(")");
  }
  
  private void a(String paramString, int paramInt, ArrayList paramArrayList)
  {
    int i = 0;
    for (int j = 1; j < paramInt; j++)
    {
      i = ((Integer)paramArrayList.get(paramArrayList.size() - j)).intValue();
      this.c.insert(i, ',');
    }
    j = paramArrayList.size() - paramInt;
    if (j < paramArrayList.size())
    {
      i = ((Integer)paramArrayList.get(j)).intValue();
    }
    else
    {
      i = this.c.length();
      zf.a(paramArrayList, Integer.valueOf(i));
    }
    this.c.insert(i, paramString + "(");
    if (paramInt - 1 > 0) {
      zf.a(paramArrayList, paramArrayList.size() - paramInt + 1, paramInt - 1);
    }
  }
  
  private void c(byte[] paramArrayOfByte, int paramInt, ArrayList paramArrayList)
  {
    int j = zc.e(paramArrayOfByte, paramInt + 1);
    if ((j & 0xFFFF) == 255)
    {
      b(paramArrayOfByte, paramInt, paramArrayList);
      return;
    }
    int i;
    for (int k = 1; k < (paramArrayOfByte[paramInt] & 0xFF); k++)
    {
      i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
      this.c.insert(i, ',');
    }
    k = paramArrayList.size() - (paramArrayOfByte[paramInt] & 0xFF);
    if (k < paramArrayList.size())
    {
      i = ((Integer)paramArrayList.get(k)).intValue();
    }
    else
    {
      i = this.c.length();
      zf.a(paramArrayList, Integer.valueOf(i));
    }
    switch (j)
    {
    case 0: 
      this.c.insert(i, "COUNT(");
      break;
    case 1: 
      this.c.insert(i, "IF(");
      break;
    case 4: 
      this.c.insert(i, "SUM(");
      break;
    case 5: 
      this.c.insert(i, "AVERAGE(");
      break;
    case 6: 
      this.c.insert(i, "MIN(");
      break;
    case 7: 
      this.c.insert(i, "MAX(");
      break;
    case 8: 
      this.c.insert(i, "ROW(");
      break;
    case 9: 
      this.c.insert(i, "COLUMN(");
      break;
    case 11: 
      this.c.insert(i, "NPV(");
      break;
    case 12: 
      this.c.insert(i, "STDEV(");
      break;
    case 13: 
      this.c.insert(i, "DOLLAR(");
      break;
    case 14: 
      this.c.insert(i, "FIXED(");
      break;
    case 28: 
      this.c.insert(i, "LOOKUP(");
      break;
    case 29: 
      this.c.insert(i, "INDEX(");
      break;
    case 36: 
      this.c.insert(i, "AND(");
      break;
    case 37: 
      this.c.insert(i, "OR(");
      break;
    case 46: 
      this.c.insert(i, "VAR(");
      break;
    case 49: 
      this.c.insert(i, "LINEST(");
      break;
    case 50: 
      this.c.insert(i, "TREND(");
      break;
    case 51: 
      this.c.insert(i, "LOGEST(");
      break;
    case 52: 
      this.c.insert(i, "GROWTH(");
      break;
    case 56: 
      this.c.insert(i, "PV(");
      break;
    case 57: 
      this.c.insert(i, "FV(");
      break;
    case 58: 
      this.c.insert(i, "NPER(");
      break;
    case 59: 
      this.c.insert(i, "PMT(");
      break;
    case 62: 
      this.c.insert(i, "IRR(");
      break;
    case 64: 
      this.c.insert(i, "MATCH(");
      break;
    case 70: 
      this.c.insert(i, "WEEKDAY(");
      break;
    case 78: 
      this.c.insert(i, "OFFSET(");
      break;
    case 82: 
      this.c.insert(i, "SEARCH(");
      break;
    case 100: 
      this.c.insert(i, "CHOOSE(");
      break;
    case 101: 
      this.c.insert(i, "HLOOKUP(");
      break;
    case 102: 
      this.c.insert(i, "VLOOKUP(");
      break;
    case 109: 
      this.c.insert(i, "LOG(");
      break;
    case 115: 
      this.c.insert(i, "LEFT(");
      break;
    case 116: 
      this.c.insert(i, "RIGHT(");
      break;
    case 120: 
      this.c.insert(i, "SUBSTITUTE(");
      break;
    case 124: 
      this.c.insert(i, "FIND(");
      break;
    case 125: 
      this.c.insert(i, "CELL(");
      break;
    case 144: 
      this.c.insert(i, "DDB(");
      break;
    case 148: 
      this.c.insert(i, "INDIRECT(");
      break;
    case 167: 
      this.c.insert(i, "IPMT(");
      break;
    case 168: 
      this.c.insert(i, "PPMT(");
      break;
    case 169: 
      this.c.insert(i, "COUNTA(");
      break;
    case 183: 
      this.c.insert(i, "PRODUCT(");
      break;
    case 193: 
      this.c.insert(i, "STDEVP(");
      break;
    case 194: 
      this.c.insert(i, "VARP(");
      break;
    case 197: 
      this.c.insert(i, "TRUNC(");
      break;
    case 204: 
      this.c.insert(i, "DOLLAR(");
      break;
    case 216: 
      this.c.insert(i, "RANK(");
      break;
    case 219: 
      this.c.insert(i, "ADDRESS(");
      break;
    case 220: 
      this.c.insert(i, "DAYS360(");
      break;
    case 227: 
      this.c.insert(i, "MEDIAN(");
      break;
    case 228: 
      this.c.insert(i, "SUMPRODUCT(");
      break;
    case 269: 
      this.c.insert(i, "AVEDEV(");
      break;
    case 270: 
      this.c.insert(i, "BETADIST(");
      break;
    case 272: 
      this.c.insert(i, "BETAINV(");
      break;
    case 317: 
      this.c.insert(i, "PROB(");
      break;
    case 318: 
      this.c.insert(i, "DEVSQ(");
      break;
    case 319: 
      this.c.insert(i, "GEOMEAN(");
      break;
    case 320: 
      this.c.insert(i, "HARMEAN(");
      break;
    case 321: 
      this.c.insert(i, "SUMSQ(");
      break;
    case 322: 
      this.c.insert(i, "KURT(");
      break;
    case 323: 
      this.c.insert(i, "SKEW(");
      break;
    case 324: 
      this.c.insert(i, "ZTEST(");
      break;
    case 329: 
      this.c.insert(i, "PERCENTRANK(");
      break;
    case 330: 
      this.c.insert(i, "MODE(");
      break;
    case 336: 
      this.c.insert(i, "CONCATENATE(");
      break;
    case 344: 
      this.c.insert(i, "SUBTOTAL(");
      break;
    case 345: 
      this.c.insert(i, "SUMIF(");
      break;
    case 354: 
      this.c.insert(i, "ROMAN(");
      break;
    case 358: 
      this.c.insert(i, "GETPIVOTDATA(");
      break;
    case 359: 
      this.c.insert(i, "HYPERLINK(");
      break;
    case 361: 
      this.c.insert(i, "AVERAGEA(");
      break;
    case 363: 
      this.c.insert(i, "MINA(");
      break;
    case 364: 
      this.c.insert(i, "STDEVPA(");
      break;
    case 366: 
      this.c.insert(i, "STDEVA(");
      break;
    case 367: 
      this.c.insert(i, "VARA(");
      break;
    case 2: 
    case 3: 
    case 10: 
    case 15: 
    case 16: 
    case 17: 
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
    case 30: 
    case 31: 
    case 32: 
    case 33: 
    case 34: 
    case 35: 
    case 38: 
    case 39: 
    case 40: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
    case 47: 
    case 48: 
    case 53: 
    case 54: 
    case 55: 
    case 60: 
    case 61: 
    case 63: 
    case 65: 
    case 66: 
    case 67: 
    case 68: 
    case 69: 
    case 71: 
    case 72: 
    case 73: 
    case 74: 
    case 75: 
    case 76: 
    case 77: 
    case 79: 
    case 80: 
    case 81: 
    case 83: 
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
    case 97: 
    case 98: 
    case 99: 
    case 103: 
    case 104: 
    case 105: 
    case 106: 
    case 107: 
    case 108: 
    case 110: 
    case 111: 
    case 112: 
    case 113: 
    case 114: 
    case 117: 
    case 118: 
    case 119: 
    case 121: 
    case 122: 
    case 123: 
    case 126: 
    case 127: 
    case 128: 
    case 129: 
    case 130: 
    case 131: 
    case 132: 
    case 133: 
    case 134: 
    case 135: 
    case 136: 
    case 137: 
    case 138: 
    case 139: 
    case 140: 
    case 141: 
    case 142: 
    case 143: 
    case 145: 
    case 146: 
    case 147: 
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
    case 163: 
    case 164: 
    case 165: 
    case 166: 
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
    case 184: 
    case 185: 
    case 186: 
    case 187: 
    case 188: 
    case 189: 
    case 190: 
    case 191: 
    case 192: 
    case 195: 
    case 196: 
    case 198: 
    case 199: 
    case 200: 
    case 201: 
    case 202: 
    case 203: 
    case 205: 
    case 206: 
    case 207: 
    case 208: 
    case 209: 
    case 210: 
    case 211: 
    case 212: 
    case 213: 
    case 214: 
    case 215: 
    case 217: 
    case 218: 
    case 221: 
    case 222: 
    case 223: 
    case 224: 
    case 225: 
    case 226: 
    case 229: 
    case 230: 
    case 231: 
    case 232: 
    case 233: 
    case 234: 
    case 235: 
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
    case 252: 
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
    case 271: 
    case 273: 
    case 274: 
    case 275: 
    case 276: 
    case 277: 
    case 278: 
    case 279: 
    case 280: 
    case 281: 
    case 282: 
    case 283: 
    case 284: 
    case 285: 
    case 286: 
    case 287: 
    case 288: 
    case 289: 
    case 290: 
    case 291: 
    case 292: 
    case 293: 
    case 294: 
    case 295: 
    case 296: 
    case 297: 
    case 298: 
    case 299: 
    case 300: 
    case 301: 
    case 302: 
    case 303: 
    case 304: 
    case 305: 
    case 306: 
    case 307: 
    case 308: 
    case 309: 
    case 310: 
    case 311: 
    case 312: 
    case 313: 
    case 314: 
    case 315: 
    case 316: 
    case 325: 
    case 326: 
    case 327: 
    case 328: 
    case 331: 
    case 332: 
    case 333: 
    case 334: 
    case 335: 
    case 337: 
    case 338: 
    case 339: 
    case 340: 
    case 341: 
    case 342: 
    case 343: 
    case 346: 
    case 347: 
    case 348: 
    case 349: 
    case 350: 
    case 351: 
    case 352: 
    case 353: 
    case 355: 
    case 356: 
    case 357: 
    case 360: 
    case 362: 
    case 365: 
    default: 
      zacn localzacn = zacn.a(j & 0xFFFF);
      if (localzacn != null) {
        this.c.insert(i, localzacn.b + "(");
      } else {
        return;
      }
      break;
    }
    if ((paramArrayOfByte[paramInt] & 0xFF) - 1 > 0) {
      zf.a(paramArrayList, paramArrayList.size() - (paramArrayOfByte[paramInt] & 0xFF) + 1, (paramArrayOfByte[paramInt] & 0xFF) - 1);
    }
    this.c.append(")");
  }
  
  private void d(byte[] paramArrayOfByte, int paramInt, ArrayList paramArrayList)
  {
    int j = zc.e(paramArrayOfByte, paramInt);
    int i;
    int k;
    switch (j)
    {
    case 2: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ISNA(");
      break;
    case 3: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ISERROR(");
      break;
    case 10: 
      zf.a(paramArrayList, Integer.valueOf(this.c.length()));
      this.c.append("NA(");
      break;
    case 15: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "SIN(");
      break;
    case 16: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "COS(");
      break;
    case 17: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "TAN(");
      break;
    case 18: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ATAN(");
      break;
    case 19: 
      zf.a(paramArrayList, Integer.valueOf(this.c.length()));
      this.c.append("PI(");
      break;
    case 20: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "SQRT(");
      break;
    case 21: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "EXP(");
      break;
    case 22: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "LN(");
      break;
    case 23: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "LOG10(");
      break;
    case 24: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ABS(");
      break;
    case 25: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "INT(");
      break;
    case 26: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "SIGN(");
      break;
    case 27: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "ROUND(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "REPT(");
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "MID(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 32: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "LEN(");
      break;
    case 33: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "VALUE(");
      break;
    case 34: 
      zf.a(paramArrayList, Integer.valueOf(this.c.length()));
      this.c.append("TRUE(");
      break;
    case 35: 
      zf.a(paramArrayList, Integer.valueOf(this.c.length()));
      this.c.append("FALSE(");
      break;
    case 38: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "NOT(");
      break;
    case 39: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "MOD(");
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "DCOUNT(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "DSUM(");
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "DAVERAGE(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "DMIN(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 44: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "DMAX(");
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "DSTDEV(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "DVAR(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 48: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "TEXT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 63: 
      zf.a(paramArrayList, Integer.valueOf(this.c.length()));
      this.c.append("RAND(");
      break;
    case 65: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "DATE(");
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "TIME(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 67: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "DAY(");
      break;
    case 68: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "MONTH(");
      break;
    case 69: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "YEAR(");
      break;
    case 71: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "HOUR(");
      break;
    case 72: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "MINUTE(");
      break;
    case 73: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "SECOND(");
      break;
    case 74: 
      zf.a(paramArrayList, Integer.valueOf(this.c.length()));
      this.c.append("NOW(");
      break;
    case 75: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "AREAS(");
      break;
    case 76: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ROWS(");
      break;
    case 77: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "COLUMNS(");
      break;
    case 83: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "TRANSPOSE(");
      break;
    case 97: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "ATAN2(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 98: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ASIN(");
      break;
    case 99: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ACOS(");
      break;
    case 105: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ISREF(");
      break;
    case 111: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "CHAR(");
      break;
    case 112: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "LOWER(");
      break;
    case 113: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "UPPER(");
      break;
    case 114: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "PROPER(");
      break;
    case 117: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "EXACT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 118: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "TRIM(");
      break;
    case 119: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (k = 1; k < 4; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.c.insert(i, "REPLACE(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 121: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "CODE(");
      break;
    case 126: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ISERR(");
      break;
    case 127: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ISTEXT(");
      break;
    case 128: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ISNUMBER(");
      break;
    case 129: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ISBLANK(");
      break;
    case 130: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "T(");
      break;
    case 131: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "N(");
      break;
    case 140: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "DATEVALUE(");
      break;
    case 141: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "TIMEVALUE(");
      break;
    case 142: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "SLN(");
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.c.insert(i, "SYD(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 163: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "MDETERM(");
      break;
    case 164: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "MINVERSE(");
      break;
    case 165: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "MMULT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 184: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "FACT(");
      break;
    case 189: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "DPRODUCT(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 190: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ISNONTEXT(");
      break;
    case 195: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "DSTDEVP(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "DVARP(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 198: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ISLOGICAL(");
      break;
    case 199: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "DCOUNTA(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 212: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "ROUNDUP(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "ROUNDDOWN(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 214: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ASC(");
      break;
    case 215: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "WIDECHAR(");
      break;
    case 221: 
      i = this.c.length();
      this.c.append("TODAY(");
      zf.a(paramArrayList, Integer.valueOf(i));
      break;
    case 229: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "SINH(");
      break;
    case 230: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "COSH(");
      break;
    case 231: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "TANH(");
      break;
    case 232: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ASINH(");
      break;
    case 233: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ACOSH(");
      break;
    case 234: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ATANH(");
      break;
    case 235: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "DGET(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 252: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "FREQUENCY(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 273: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (k = 1; k < 4; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.c.insert(i, "BINOMDIST(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "CHIDIST(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "CHIINV(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "COMBIN(");
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "CONFIDENCE(");
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "CRITBINOM(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 279: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "EVEN(");
      break;
    case 280: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "EXPONDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 281: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "FDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 282: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "FINV(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 283: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "FISHER(");
      break;
    case 284: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "FISHERINV(");
      break;
    case 286: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (k = 1; k < 4; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.c.insert(i, "GAMMADIST(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      break;
    case 287: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "GAMMAINV(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 285: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "FLOOR(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 288: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "CEILING(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 289: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (k = 1; k < 4; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.c.insert(i, "HYPGEOMDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      break;
    case 290: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "LOGNORMDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 291: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "LOGINV(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 292: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "NEGBINOMDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 293: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (k = 1; k < 4; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.c.insert(i, "NORMDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      break;
    case 294: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "NORMSDIST(");
      break;
    case 295: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "NORMINV(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 296: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "NORMSINV(");
      break;
    case 297: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (k = 1; k < 3; k++)
      {
        i = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "STANDARDIZE(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 298: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "ODD(");
      break;
    case 299: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "PERMUT(");
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "POISSON(");
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "TDIST(");
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.c.insert(i, "WEIBULL(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "SUMXMY2(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "SUMX2MY2(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "SUMX2PY2(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "CHITEST(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "CORREL(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "COVAR(");
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.c.insert(i, "FORECAST(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "FTEST(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 311: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "INTERCEPT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 312: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "PEARSON(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "RSQ(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "STEYX(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "SLOPE(");
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
        this.c.insert(i, ',');
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.c.insert(i, "TTEST(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "LARGE(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 326: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "SMALL(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "QUARTILE(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "PERCENTILE(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "TRIMMEAN(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "TINV(");
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
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "POWER(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 342: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "RADIANS(");
      break;
    case 343: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "DEGREES(");
      break;
    case 346: 
      if (paramArrayList.size() < 2) {
        return;
      }
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, ',');
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.c.insert(i, "COUNTIF(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
      }
      break;
    case 347: 
      i = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.c.insert(i, "COUNTBLANK(");
      break;
    case 351: 
      a("DATEDIF", 3, paramArrayList);
      break;
    case 352: 
      a("DATESTRING", 1, paramArrayList);
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
    case 348: 
    case 349: 
    case 350: 
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
          this.c.insert(i, ',');
        }
        if (paramArrayList.size() > 0) {
          i = ((Integer)paramArrayList.get(paramArrayList.size() - (localzacn.d & 0xFF))).intValue();
        } else {
          i = 0;
        }
        this.c.insert(i, localzacn.b + "(");
        if ((localzacn.d & 0xFF) > 1) {
          zf.a(paramArrayList, paramArrayList.size() - (localzacn.d & 0xFF) + 1, (localzacn.d & 0xFF) - 1);
        }
        if (paramArrayList.size() > 0) {
          paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(i));
        } else {
          zf.a(paramArrayList, Integer.valueOf(i));
        }
      }
      else
      {
        return;
      }
      break;
    }
    this.c.append(")");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */