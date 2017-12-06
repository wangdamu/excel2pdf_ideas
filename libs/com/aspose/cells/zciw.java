package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.a.c.zu;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zg;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;

class zciw
{
  int a;
  private HashMap e;
  private StringBuilder f = new StringBuilder();
  WorksheetCollection b;
  private Cell g;
  private int h;
  protected int c;
  protected byte[] d;
  private static final za i = new za(new String[] { "PERCENTILE.INC" });
  
  void a()
  {
    this.b = null;
    this.e = null;
    this.g = null;
    this.f = null;
    zg.a(this);
  }
  
  void b()
  {
    this.a = 1;
    this.e = new HashMap();
    int j;
    if (this.b.p().getFileFormat() == 16)
    {
      for (j = 0; j < this.b.w().getCount(); j++) {
        this.e.put(Integer.valueOf(j), Integer.valueOf(j + 1));
      }
    }
    else
    {
      j = 0;
      for (int k = 0; k < this.b.w().getCount(); k++)
      {
        zbti localzbti = this.b.w().a(k);
        if (localzbti.e()) {
          j++;
        } else if ((localzbti.l() == null) || ("".equals(localzbti.l().trim()))) {
          j++;
        } else {
          this.e.put(Integer.valueOf(k), Integer.valueOf(k + 1 - j));
        }
      }
    }
  }
  
  void c()
  {
    this.a = 0;
    this.e = null;
  }
  
  zciw(WorksheetCollection paramWorksheetCollection)
  {
    this.b = paramWorksheetCollection;
  }
  
  void a(StringBuilder paramStringBuilder, byte[] paramArrayOfByte, int paramInt)
  {
    int j = zc.e(paramArrayOfByte, paramInt) & 0xFFFF;
    zwp localzwp = this.b.r().b(j);
    if (localzwp == null)
    {
      this.f.append("#REF!");
      return;
    }
    int k = localzwp.a & 0xFFFF;
    zbti localzbti = null;
    if ((this.b.w() != null) && (k < this.b.w().getCount()))
    {
      localzbti = this.b.w().a(k);
      if (localzbti.e()) {
        localzbti = null;
      }
    }
    paramInt += 2;
    int m = zc.a(paramArrayOfByte, paramInt);
    Object localObject1;
    if (localzbti == null)
    {
      localObject1 = this.b.getNames().get(m - 1);
      String str1;
      if (((Name)localObject1).getSheetIndex() == 0)
      {
        if (this.a == 1)
        {
          this.f.append("[0]!");
        }
        else if (!zbsn.a(this.b.p().getFileName()))
        {
          str1 = zu.b(this.b.p().getFileName());
          if (zamm.b(str1))
          {
            this.f.append('\'');
            this.f.append(str1);
            this.f.append('\'');
          }
          else
          {
            this.f.append(str1);
          }
          this.f.append('!');
        }
        this.f.append(((Name)localObject1).getText());
      }
      else
      {
        str1 = zaap.a(j, this.b, this.a, this.e);
        if ((this.a == 1) && ("#REF".equals(str1))) {
          this.f.append("#REF!");
        } else {
          this.f.append(str1 + "!" + ((Name)localObject1).getText());
        }
      }
    }
    else if (localzbti.f())
    {
      localObject1 = (zwh)localzbti.b().get(m - 1);
      if ((this.a == 1) && (zacn.a(((zwh)localObject1).e()))) {
        this.f.append("_XLL.");
      }
      this.f.append(((zwh)localObject1).e().toUpperCase());
    }
    else
    {
      Object localObject2;
      if ((localzbti.a() == 0) || (localzbti.a() == 4))
      {
        localObject1 = null;
        if (localzbti.c() != null)
        {
          n = localzwp.b & 0xFFFF;
          if ((n >= 0) && (n < localzbti.c().length)) {
            localObject1 = localzbti.c()[n];
          }
        }
        int n = 1;
        if (this.a == 1)
        {
          if ((this.e.get(Integer.valueOf(k)) != null) || (localObject1 != null))
          {
            int i1 = (localObject1 != null) && (zamm.a((String)localObject1)) ? 1 : 0;
            if (i1 != 0) {
              this.f.append('\'');
            }
            this.f.append('[');
            this.f.append(zs.a(this.e.get(Integer.valueOf(k))));
            this.f.append(']');
            if (localObject1 != null) {
              this.f.append((String)localObject1);
            }
            if (i1 != 0) {
              this.f.append('\'');
            }
          }
          else
          {
            n = 0;
          }
        }
        else if ((localObject1 == null) && (zbsn.a(localzbti.l())))
        {
          n = 0;
        }
        else
        {
          this.f.append('\'');
          if (localObject1 != null) {
            this.f.append('[');
          }
          localObject2 = zw.a(localzbti.l(), "'", "''");
          this.f.append((String)localObject2);
          if (localObject1 != null)
          {
            this.f.append(']');
            this.f.append((String)localObject1);
          }
          this.f.append('\'');
        }
        if (n != 0) {
          this.f.append("!");
        }
        localObject2 = (zwh)localzbti.b().get(m - 1);
        int i2 = (((zwh)localObject2).e() != null) && (zamm.b(((zwh)localObject2).e())) ? 1 : 0;
        if (i2 != 0) {
          this.f.append('\'');
        }
        this.f.append(((zwh)localObject2).e());
        if (i2 != 0) {
          this.f.append('\'');
        }
      }
      else if (localzbti.a() == 3)
      {
        if (this.a == 1)
        {
          this.f.append('[');
          this.f.append(zs.a(this.e.get(Integer.valueOf(k))));
          this.f.append(']');
        }
        else
        {
          localObject1 = null;
          String str2 = null;
          localObject2 = new String[] { localObject1 };
          String[] arrayOfString = { str2 };
          localzbti.a((String[])localObject2, arrayOfString);
          localObject1 = localObject2[0];
          str2 = arrayOfString[0];
          this.f.append((String)localObject1);
          this.f.append("|");
          this.f.append(str2);
        }
        this.f.append("!");
        localObject1 = (zwh)localzbti.b().get(m - 1);
        this.f.append('\'');
        this.f.append(((zwh)localObject1).e().toUpperCase());
        this.f.append('\'');
      }
    }
  }
  
  void b(StringBuilder paramStringBuilder, byte[] paramArrayOfByte, int paramInt)
  {
    int j = zc.a(paramArrayOfByte, paramInt) - 1;
    if (j >= this.b.getNames().getCount())
    {
      paramStringBuilder.append("#NAME?");
      return;
    }
    String str = this.b.getNames().get(j).getText();
    switch (i.a(str))
    {
    case 0: 
      paramStringBuilder.append("_xlfn.");
      break;
    }
    paramStringBuilder.append(str);
  }
  
  String a(Cell paramCell)
  {
    this.g = paramCell;
    int j = 4;
    byte[] arrayOfByte = paramCell.v();
    Object localObject;
    int k;
    int m;
    Cell localCell;
    if ((arrayOfByte[j] == 1) && (arrayOfByte[0] == 7))
    {
      localObject = ((zaai)paramCell.c.d).a();
      if (localObject == null)
      {
        k = zc.a(arrayOfByte, j + 1);
        m = zcjb.a(arrayOfByte, j + 5);
        localCell = paramCell.d.checkCell(k, m);
        if (localCell != null) {
          localObject = localCell.F();
        }
      }
      if (localObject != null) {
        return a(-1, -1, ((zbf)localObject).c(), paramCell.getRow(), paramCell.getColumn(), !((zbf)localObject).b(), false);
      }
      return null;
    }
    if ((arrayOfByte[j] == 2) && (arrayOfByte[0] == 7))
    {
      localObject = ((zaai)paramCell.c.d).b();
      if (localObject == null)
      {
        k = zc.a(arrayOfByte, j + 1);
        m = zcjb.a(arrayOfByte, j + 5);
        localCell = paramCell.d.getRows().a.a(k, m);
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
    return a(-1, -1, arrayOfByte, paramCell.getRow(), paramCell.getColumn(), false, false);
  }
  
  String a(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
  {
    int j = paramInt1;
    this.d = paramArrayOfByte;
    int k = this.d.length;
    if (paramInt2 != -1)
    {
      this.h = paramInt2;
      this.c = (j + paramInt2 + 4);
      k = j + paramInt2;
    }
    else if (j == -1)
    {
      j = 4;
      this.h = zc.a(this.d, 0);
      this.c = (j + this.h + 4);
      k = j + this.h;
    }
    else
    {
      this.h = 0;
      this.c = 0;
      k = this.d.length;
    }
    int m = this.c;
    this.f = new StringBuilder(256);
    ArrayList localArrayList = new ArrayList();
    while (j < k)
    {
      int n;
      String str2;
      switch (this.d[j])
      {
      case 1: 
      case 2: 
        return null;
      case 3: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, '+');
        localArrayList.remove(localArrayList.size() - 1);
        j++;
        break;
      case 4: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, '-');
        localArrayList.remove(localArrayList.size() - 1);
        j++;
        break;
      case 5: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, '*');
        localArrayList.remove(localArrayList.size() - 1);
        j++;
        break;
      case 6: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, '/');
        localArrayList.remove(localArrayList.size() - 1);
        j++;
        break;
      case 7: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, '^');
        localArrayList.remove(localArrayList.size() - 1);
        j++;
        break;
      case 8: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, '&');
        localArrayList.remove(localArrayList.size() - 1);
        j++;
        break;
      case 9: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, '<');
        localArrayList.remove(localArrayList.size() - 1);
        j++;
        break;
      case 10: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, "<=");
        localArrayList.remove(localArrayList.size() - 1);
        j++;
        break;
      case 11: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, '=');
        localArrayList.remove(localArrayList.size() - 1);
        j++;
        break;
      case 12: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, ">=");
        localArrayList.remove(localArrayList.size() - 1);
        j++;
        break;
      case 13: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, '>');
        localArrayList.remove(localArrayList.size() - 1);
        j++;
        break;
      case 14: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, "<>");
        localArrayList.remove(localArrayList.size() - 1);
        j++;
        break;
      case 15: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, " ");
        localArrayList.remove(localArrayList.size() - 1);
        j++;
        break;
      case 16: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, ",");
        localArrayList.remove(localArrayList.size() - 1);
        j++;
        break;
      case 17: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, ":");
        localArrayList.remove(localArrayList.size() - 1);
        j++;
        break;
      case 18: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, "+");
        j++;
        break;
      case 19: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, "-");
        j++;
        break;
      case 20: 
        this.f.append("%");
        j++;
        break;
      case 21: 
        n = ((Integer)localArrayList.get(localArrayList.size() - 1)).intValue();
        this.f.insert(n, "(");
        this.f.append(")");
        j++;
        break;
      case 22: 
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        j++;
        break;
      case 23: 
        try
        {
          j++;
          int i1 = zc.e(this.d, j) & 0xFFFF;
          zf.a(localArrayList, Integer.valueOf(this.f.length()));
          this.f.append("\"");
          if (i1 > 0)
          {
            String str1 = Encoding.getUnicode().a(this.d, j + 2, 2 * i1);
            str1 = zw.a(str1, "\"", "\"\"");
            if (this.a == 1) {
              this.f.append(zauj.a(str1));
            } else {
              this.f.append(str1);
            }
          }
          this.f.append("\"");
          j += 2 * i1 + 2;
        }
        catch (Exception localException)
        {
          throw new CellsException(5, "Invalid formula.");
        }
      case 24: 
        int[] arrayOfInt = { j };
        String str3 = a(this.d, arrayOfInt, paramInt3, paramInt4, paramBoolean2);
        j = arrayOfInt[0];
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        this.f.append(str3);
        break;
      case 25: 
        j++;
        j = a(this.d, j, localArrayList);
        break;
      case 29: 
        j++;
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        if (this.d[j] == 0) {
          this.f.append("FALSE");
        } else {
          this.f.append("TRUE");
        }
        j++;
        break;
      case 30: 
        int i2 = zc.e(this.d, j + 1);
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        this.f.append(zp.a(i2 & 0xFFFF));
        j += 3;
        break;
      case 31: 
        double d1 = zc.f(this.d, j + 1);
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        if ((d1 >= 1.0E21D) || (Math.abs(d1) <= 1.0E-21D)) {
          this.f.append(zp.b(d1));
        } else {
          this.f.append(zarb.a(d1));
        }
        j += 9;
        break;
      case 32: 
      case 64: 
      case 96: 
        a(this.d, localArrayList);
        j += 15;
        break;
      case 33: 
      case 65: 
      case 97: 
        j++;
        d(this.d, j, localArrayList);
        j += 2;
        break;
      case 34: 
      case 66: 
      case 98: 
        j++;
        c(this.d, j, localArrayList);
        j += 3;
        break;
      case 35: 
      case 67: 
      case 99: 
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        j++;
        b(this.f, this.d, j);
        j += 4;
        break;
      case 36: 
      case 68: 
      case 100: 
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        j++;
        d(this.f, this.d, j);
        j += 6;
        break;
      case 37: 
      case 69: 
      case 101: 
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        j++;
        c(this.f, this.d, j);
        j += 12;
        break;
      case 38: 
      case 70: 
      case 102: 
        j += 7;
        break;
      case 39: 
      case 71: 
      case 103: 
        j += 7;
        break;
      case 40: 
      case 72: 
      case 104: 
        j += 7;
        break;
      case 41: 
      case 73: 
      case 105: 
        j += 3;
        break;
      case 42: 
      case 74: 
      case 106: 
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        this.f.append("#REF!");
        j += 7;
        break;
      case 43: 
      case 75: 
      case 107: 
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        this.f.append("#REF!");
        j += 13;
        break;
      case 44: 
      case 76: 
      case 108: 
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        j++;
        b(this.f, this.d, j, paramInt3, paramInt4);
        j += 6;
        break;
      case 45: 
      case 77: 
      case 109: 
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        j++;
        a(this.f, this.d, j, paramInt3, paramInt4);
        j += 12;
        break;
      case 57: 
      case 89: 
      case 121: 
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        j++;
        a(this.f, this.d, j);
        j += 6;
        break;
      case 58: 
      case 90: 
      case 122: 
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        j++;
        str2 = a(j);
        this.f.append(str2);
        this.f.append('!');
        if ((str2.length() == 0) || (str2.charAt(0) != '#'))
        {
          j += 2;
          if (paramBoolean1) {
            b(this.f, this.d, j, paramInt3, paramInt4);
          } else {
            d(this.f, this.d, j);
          }
          j += 6;
        }
        else
        {
          j += 8;
        }
        break;
      case 59: 
      case 91: 
      case 123: 
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        j++;
        str2 = a(j);
        this.f.append(str2);
        this.f.append('!');
        if ((str2.length() == 0) || (str2.charAt(0) != '#'))
        {
          j += 2;
          c(this.f, this.d, j);
          j += 12;
        }
        else
        {
          j += 14;
        }
        break;
      case 60: 
      case 92: 
      case 124: 
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        j++;
        str2 = a(j);
        this.f.append(str2);
        if (str2.charAt(0) != '#') {
          this.f.append("!#REF!");
        } else {
          this.f.append('!');
        }
        j += 8;
        break;
      case 61: 
      case 93: 
      case 125: 
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        j++;
        str2 = a(j);
        if (zw.b(str2))
        {
          this.f.append("#REF!");
        }
        else
        {
          this.f.append(str2);
          if (str2.charAt(0) != '#') {
            this.f.append("!#REF!");
          } else {
            this.f.append('!');
          }
        }
        j += 14;
        break;
      case 28: 
        zf.a(localArrayList, Integer.valueOf(this.f.length()));
        j++;
        this.f.append(ztr.b(this.d[j]));
        j++;
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
    this.f.insert(0, '=');
    localArrayList = null;
    return zs.a(this.f);
  }
  
  String a(int paramInt)
  {
    int j = zc.e(this.d, paramInt) & 0xFFFF;
    return zaap.a(j, this.b, this.a, this.e);
  }
  
  private String a(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int j;
    Object localObject;
    String str;
    switch (paramArrayOfByte[(paramArrayOfInt[0] + 1)])
    {
    case 25: 
      j = this.c;
      localObject = new int[] { j };
      str = zbvl.a(this.b, this.g, paramArrayOfByte, paramArrayOfInt[0], paramInt1, paramInt2, this.a, paramBoolean, this.e, (int[])localObject);
      j = localObject[0];
      this.c = j;
      paramArrayOfInt[0] += 14;
      return str;
    case 29: 
      j = zc.a(paramArrayOfByte, paramArrayOfInt[0] + 2);
      paramArrayOfInt[0] += 6;
      if (this.b.c() != null)
      {
        if ((this.b.c() instanceof zaxa))
        {
          localObject = (zaxa)this.b.c();
          str = ((zaxa)localObject).a(j, this.a);
          return str;
        }
        if ((this.b.c() instanceof zawp))
        {
          localObject = (zawp)this.b.c();
          str = ((zawp)localObject).b(j);
          return str;
        }
      }
      return "#REF!";
    }
    paramArrayOfInt[0] += 1;
    return "#REF!";
  }
  
  private void a(byte[] paramArrayOfByte, ArrayList paramArrayList)
  {
    zf.a(paramArrayList, Integer.valueOf(this.f.length()));
    this.f.append('{');
    int j = zc.a(paramArrayOfByte, this.c);
    this.c += 4;
    int k = zc.a(paramArrayOfByte, this.c);
    this.c += 4;
    for (int m = 0; m < k; m++)
    {
      for (int n = 0; n < j; n++) {
        switch (paramArrayOfByte[this.c])
        {
        case 0: 
          this.c += 1;
          double d1 = zc.f(paramArrayOfByte, this.c);
          this.f.append(zp.b(d1));
          this.c += 8;
          if (n != j - 1) {
            this.f.append(',');
          }
          break;
        case 1: 
          this.c += 1;
          int i1 = zc.e(paramArrayOfByte, this.c) & 0xFFFF;
          this.f.append("\"");
          if (i1 != 0)
          {
            String str = Encoding.getUnicode().a(paramArrayOfByte, this.c + 2, i1 * 2);
            this.c += 2 + i1 * 2;
            if ((str != null) && (!"".equals(str))) {
              str = zw.a(str, "\"", "\"\"");
            }
            this.f.append(str);
          }
          else
          {
            this.c += 2;
          }
          this.f.append("\"");
          if (n != j - 1) {
            this.f.append(',');
          }
          break;
        case 2: 
          this.f.append(paramArrayOfByte[(this.c + 1)] == 1 ? "TRUE" : "FALSE");
          if (n != j - 1) {
            this.f.append(',');
          }
          this.c += 2;
          break;
        case 4: 
          this.f.append(ztr.b(paramArrayOfByte[(this.c + 1)]));
          if (n != j - 1) {
            this.f.append(',');
          }
          this.c += 5;
        }
      }
      if (m != k - 1) {
        this.f.append(';');
      }
    }
    this.f.append('}');
  }
  
  private int a(byte[] paramArrayOfByte, int paramInt, ArrayList paramArrayList)
  {
    switch (paramArrayOfByte[paramInt])
    {
    case 16: 
      int j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "SUM(");
      this.f.append(")");
      paramInt += 3;
      break;
    case 4: 
      paramInt += 3;
      int k = zc.e(paramArrayOfByte, paramInt) & 0xFFFF;
      paramInt += k;
      break;
    default: 
      paramInt += 3;
    }
    return paramInt;
  }
  
  private void c(StringBuilder paramStringBuilder, byte[] paramArrayOfByte, int paramInt)
  {
    int j = zc.a(paramArrayOfByte, paramInt);
    int k = zc.a(paramArrayOfByte, paramInt + 4);
    int m = zcjb.a(paramArrayOfByte, paramInt + 8);
    int n = zcjb.a(paramArrayOfByte, paramInt + 10);
    int i1 = 0;
    if ((j == 0) && (k == 1048575))
    {
      i1 = paramArrayOfByte[(paramInt + 9)];
      if ((i1 & 0xFF & 0x40) == 0) {
        paramStringBuilder.append("$");
      }
      CellsHelper.a(paramStringBuilder, m);
      paramStringBuilder.append(":");
      i1 = paramArrayOfByte[(paramInt + 11)];
      if ((i1 & 0xFF & 0x40) == 0) {
        paramStringBuilder.append("$");
      }
      CellsHelper.a(paramStringBuilder, n);
      return;
    }
    if ((m == 0) && (n == 16383))
    {
      i1 = paramArrayOfByte[(paramInt + 9)];
      if ((i1 & 0xFF & 0x80) == 0) {
        paramStringBuilder.append("$");
      }
      paramStringBuilder.append(j + 1);
      paramStringBuilder.append(":");
      i1 = paramArrayOfByte[(paramInt + 11)];
      if ((i1 & 0xFF & 0x80) == 0) {
        paramStringBuilder.append("$");
      }
      paramStringBuilder.append(k + 1);
      return;
    }
    i1 = paramArrayOfByte[(paramInt + 9)];
    if ((i1 & 0xFF & 0x40) == 0) {
      paramStringBuilder.append("$");
    }
    CellsHelper.a(paramStringBuilder, m);
    if ((i1 & 0xFF & 0x80) == 0) {
      paramStringBuilder.append("$");
    }
    paramStringBuilder.append(j + 1);
    paramStringBuilder.append(":");
    i1 = paramArrayOfByte[(paramInt + 11)];
    if ((i1 & 0xFF & 0x40) == 0) {
      paramStringBuilder.append("$");
    }
    CellsHelper.a(paramStringBuilder, n);
    if ((i1 & 0xFF & 0x80) == 0) {
      paramStringBuilder.append("$");
    }
    paramStringBuilder.append(k + 1);
  }
  
  private void a(StringBuilder paramStringBuilder, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    byte b1 = paramArrayOfByte[(paramInt1 + 9)];
    byte b2 = paramArrayOfByte[(paramInt1 + 11)];
    int j = zcjb.a(paramArrayOfByte, paramInt1, paramInt2, b1);
    int k = zcjb.a(paramArrayOfByte, paramInt1 + 4, paramInt2, b2);
    int m = zcjb.b(paramArrayOfByte, paramInt1 + 8, paramInt3, b1);
    int n = zcjb.b(paramArrayOfByte, paramInt1 + 10, paramInt3, b2);
    int i1 = 0;
    if ((j == 0) && (k == 1048575))
    {
      i1 = paramArrayOfByte[(paramInt1 + 9)];
      if ((i1 & 0xFF & 0x40) == 0) {
        paramStringBuilder.append("$");
      }
      CellsHelper.a(paramStringBuilder, m);
      paramStringBuilder.append(":");
      i1 = paramArrayOfByte[(paramInt1 + 11)];
      if ((i1 & 0xFF & 0x40) == 0) {
        paramStringBuilder.append("$");
      }
      CellsHelper.a(paramStringBuilder, n);
      return;
    }
    if ((m == 0) && (n == 16383))
    {
      i1 = paramArrayOfByte[(paramInt1 + 9)];
      if ((i1 & 0xFF & 0x80) == 0) {
        paramStringBuilder.append("$");
      }
      paramStringBuilder.append(j + 1);
      paramStringBuilder.append(":");
      i1 = paramArrayOfByte[(paramInt1 + 11)];
      if ((i1 & 0xFF & 0x80) == 0) {
        paramStringBuilder.append("$");
      }
      paramStringBuilder.append(k + 1);
      return;
    }
    i1 = paramArrayOfByte[(paramInt1 + 9)];
    if ((i1 & 0xFF & 0x40) == 0) {
      paramStringBuilder.append("$");
    }
    CellsHelper.a(paramStringBuilder, m);
    if ((i1 & 0xFF & 0x80) == 0) {
      paramStringBuilder.append("$");
    }
    paramStringBuilder.append(j + 1);
    paramStringBuilder.append(":");
    i1 = paramArrayOfByte[(paramInt1 + 11)];
    if ((i1 & 0xFF & 0x40) == 0) {
      paramStringBuilder.append("$");
    }
    CellsHelper.a(paramStringBuilder, n);
    if ((i1 & 0xFF & 0x80) == 0) {
      paramStringBuilder.append("$");
    }
    paramStringBuilder.append(k + 1);
  }
  
  private void b(StringBuilder paramStringBuilder, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    int j = paramArrayOfByte[(paramInt1 + 5)];
    int k = zcjb.a(paramArrayOfByte, paramInt1, paramInt2, j);
    int m = zcjb.b(paramArrayOfByte, paramInt1 + 4, paramInt3, j);
    if ((j & 0xFF & 0x40) == 0) {
      paramStringBuilder.append('$');
    }
    CellsHelper.a(paramStringBuilder, m);
    if ((j & 0xFF & 0x80) == 0) {
      paramStringBuilder.append('$');
    }
    paramStringBuilder.append(k + 1);
  }
  
  private void d(StringBuilder paramStringBuilder, byte[] paramArrayOfByte, int paramInt)
  {
    int j = zc.a(paramArrayOfByte, paramInt);
    int k = zcjb.a(paramArrayOfByte, paramInt + 4);
    int m = 1;
    int n = 1;
    int i1 = paramArrayOfByte[(paramInt + 5)];
    if ((i1 & 0xFF & 0x40) != 0) {
      n = 0;
    }
    if ((i1 & 0xFF & 0x80) != 0) {
      m = 0;
    }
    if (n != 0) {
      paramStringBuilder.append("$");
    }
    CellsHelper.a(paramStringBuilder, k);
    if (m != 0) {
      paramStringBuilder.append("$");
    }
    paramStringBuilder.append(j + 1);
  }
  
  private void b(byte[] paramArrayOfByte, int paramInt, ArrayList paramArrayList)
  {
    int k = (paramArrayOfByte[paramInt] & 0xFF) - 1;
    int j;
    for (int m = 1; m < k; m++)
    {
      j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
      this.f.insert(j, ',');
    }
    if (k > 0)
    {
      m = paramArrayList.size() - k;
      j = ((Integer)paramArrayList.get(m)).intValue();
      this.f.insert(j, "(");
      zf.a(paramArrayList, m, k);
      if ((m > 0) && (this.a != 1))
      {
        int n = ((Integer)paramArrayList.get(m - 1)).intValue();
        if ((n + 6 < j) && (this.f.charAt(n) == '_') && (this.f.charAt(n + 5) == '.') && ((this.f.charAt(n + 1) | 0x20) == 'x') && ((this.f.charAt(n + 2) | 0x20) == 'l') && ((this.f.charAt(n + 3) | 0x20) == 'f') && ((this.f.charAt(n + 4) | 0x20) == 'n')) {
          this.f.delete(n, n + 6);
        }
      }
    }
    else
    {
      this.f.append('(');
    }
    this.f.append(")");
  }
  
  private void a(String paramString, int paramInt, ArrayList paramArrayList)
  {
    int j = 0;
    for (int k = 1; k < paramInt; k++)
    {
      j = ((Integer)paramArrayList.get(paramArrayList.size() - k)).intValue();
      this.f.insert(j, ',');
    }
    k = paramArrayList.size() - paramInt;
    if (k < paramArrayList.size())
    {
      j = ((Integer)paramArrayList.get(k)).intValue();
    }
    else
    {
      j = this.f.length();
      zf.a(paramArrayList, Integer.valueOf(j));
    }
    this.f.insert(j, paramString + "(");
    if (paramInt - 1 > 0) {
      zf.a(paramArrayList, paramArrayList.size() - paramInt + 1, paramInt - 1);
    }
  }
  
  private void c(byte[] paramArrayOfByte, int paramInt, ArrayList paramArrayList)
  {
    int k = zc.e(paramArrayOfByte, paramInt + 1);
    if ((k & 0xFFFF) == 255)
    {
      b(paramArrayOfByte, paramInt, paramArrayList);
      return;
    }
    int j;
    for (int m = 1; m < (paramArrayOfByte[paramInt] & 0xFF); m++)
    {
      j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
      this.f.insert(j, ',');
    }
    m = paramArrayList.size() - (paramArrayOfByte[paramInt] & 0xFF);
    if (m < paramArrayList.size())
    {
      j = ((Integer)paramArrayList.get(m)).intValue();
    }
    else
    {
      j = this.f.length();
      zf.a(paramArrayList, Integer.valueOf(j));
    }
    switch (k)
    {
    case 0: 
      this.f.insert(j, "COUNT(");
      break;
    case 1: 
      this.f.insert(j, "IF(");
      break;
    case 4: 
      this.f.insert(j, "SUM(");
      break;
    case 5: 
      this.f.insert(j, "AVERAGE(");
      break;
    case 6: 
      this.f.insert(j, "MIN(");
      break;
    case 7: 
      this.f.insert(j, "MAX(");
      break;
    case 8: 
      this.f.insert(j, "ROW(");
      break;
    case 9: 
      this.f.insert(j, "COLUMN(");
      break;
    case 11: 
      this.f.insert(j, "NPV(");
      break;
    case 12: 
      this.f.insert(j, "STDEV(");
      break;
    case 13: 
      this.f.insert(j, "DOLLAR(");
      break;
    case 14: 
      this.f.insert(j, "FIXED(");
      break;
    case 28: 
      this.f.insert(j, "LOOKUP(");
      break;
    case 29: 
      this.f.insert(j, "INDEX(");
      break;
    case 36: 
      this.f.insert(j, "AND(");
      break;
    case 37: 
      this.f.insert(j, "OR(");
      break;
    case 46: 
      this.f.insert(j, "VAR(");
      break;
    case 49: 
      this.f.insert(j, "LINEST(");
      break;
    case 50: 
      this.f.insert(j, "TREND(");
      break;
    case 51: 
      this.f.insert(j, "LOGEST(");
      break;
    case 52: 
      this.f.insert(j, "GROWTH(");
      break;
    case 56: 
      this.f.insert(j, "PV(");
      break;
    case 57: 
      this.f.insert(j, "FV(");
      break;
    case 58: 
      this.f.insert(j, "NPER(");
      break;
    case 59: 
      this.f.insert(j, "PMT(");
      break;
    case 62: 
      this.f.insert(j, "IRR(");
      break;
    case 64: 
      this.f.insert(j, "MATCH(");
      break;
    case 70: 
      this.f.insert(j, "WEEKDAY(");
      break;
    case 78: 
      this.f.insert(j, "OFFSET(");
      break;
    case 82: 
      this.f.insert(j, "SEARCH(");
      break;
    case 100: 
      this.f.insert(j, "CHOOSE(");
      break;
    case 101: 
      this.f.insert(j, "HLOOKUP(");
      break;
    case 102: 
      this.f.insert(j, "VLOOKUP(");
      break;
    case 109: 
      this.f.insert(j, "LOG(");
      break;
    case 115: 
      this.f.insert(j, "LEFT(");
      break;
    case 116: 
      this.f.insert(j, "RIGHT(");
      break;
    case 120: 
      this.f.insert(j, "SUBSTITUTE(");
      break;
    case 124: 
      this.f.insert(j, "FIND(");
      break;
    case 125: 
      this.f.insert(j, "CELL(");
      break;
    case 144: 
      this.f.insert(j, "DDB(");
      break;
    case 148: 
      this.f.insert(j, "INDIRECT(");
      break;
    case 167: 
      this.f.insert(j, "IPMT(");
      break;
    case 168: 
      this.f.insert(j, "PPMT(");
      break;
    case 169: 
      this.f.insert(j, "COUNTA(");
      break;
    case 183: 
      this.f.insert(j, "PRODUCT(");
      break;
    case 193: 
      this.f.insert(j, "STDEVP(");
      break;
    case 194: 
      this.f.insert(j, "VARP(");
      break;
    case 197: 
      this.f.insert(j, "TRUNC(");
      break;
    case 204: 
      this.f.insert(j, "DOLLAR(");
      break;
    case 216: 
      this.f.insert(j, "RANK(");
      break;
    case 219: 
      this.f.insert(j, "ADDRESS(");
      break;
    case 220: 
      this.f.insert(j, "DAYS360(");
      break;
    case 227: 
      this.f.insert(j, "MEDIAN(");
      break;
    case 228: 
      this.f.insert(j, "SUMPRODUCT(");
      break;
    case 269: 
      this.f.insert(j, "AVEDEV(");
      break;
    case 270: 
      this.f.insert(j, "BETADIST(");
      break;
    case 272: 
      this.f.insert(j, "BETAINV(");
      break;
    case 317: 
      this.f.insert(j, "PROB(");
      break;
    case 318: 
      this.f.insert(j, "DEVSQ(");
      break;
    case 319: 
      this.f.insert(j, "GEOMEAN(");
      break;
    case 320: 
      this.f.insert(j, "HARMEAN(");
      break;
    case 321: 
      this.f.insert(j, "SUMSQ(");
      break;
    case 322: 
      this.f.insert(j, "KURT(");
      break;
    case 323: 
      this.f.insert(j, "SKEW(");
      break;
    case 324: 
      this.f.insert(j, "ZTEST(");
      break;
    case 329: 
      this.f.insert(j, "PERCENTRANK(");
      break;
    case 330: 
      this.f.insert(j, "MODE(");
      break;
    case 336: 
      this.f.insert(j, "CONCATENATE(");
      break;
    case 344: 
      this.f.insert(j, "SUBTOTAL(");
      break;
    case 345: 
      this.f.insert(j, "SUMIF(");
      break;
    case 354: 
      this.f.insert(j, "ROMAN(");
      break;
    case 358: 
      this.f.insert(j, "GETPIVOTDATA(");
      break;
    case 359: 
      this.f.insert(j, "HYPERLINK(");
      break;
    case 361: 
      this.f.insert(j, "AVERAGEA(");
      break;
    case 363: 
      this.f.insert(j, "MINA(");
      break;
    case 364: 
      this.f.insert(j, "STDEVPA(");
      break;
    case 366: 
      this.f.insert(j, "STDEVA(");
      break;
    case 367: 
      this.f.insert(j, "VARA(");
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
      zacn localzacn = zacn.a(k & 0xFFFF);
      if (localzacn != null) {
        this.f.insert(j, localzacn.b + "(");
      } else {
        return;
      }
      break;
    }
    if ((paramArrayOfByte[paramInt] & 0xFF) - 1 > 0) {
      zf.a(paramArrayList, paramArrayList.size() - (paramArrayOfByte[paramInt] & 0xFF) + 1, (paramArrayOfByte[paramInt] & 0xFF) - 1);
    }
    this.f.append(")");
  }
  
  private void d(byte[] paramArrayOfByte, int paramInt, ArrayList paramArrayList)
  {
    int k = zc.e(paramArrayOfByte, paramInt);
    int j;
    int m;
    switch (k)
    {
    case 2: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ISNA(");
      break;
    case 3: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ISERROR(");
      break;
    case 10: 
      zf.a(paramArrayList, Integer.valueOf(this.f.length()));
      this.f.append("NA(");
      break;
    case 15: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "SIN(");
      break;
    case 16: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "COS(");
      break;
    case 17: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "TAN(");
      break;
    case 18: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ATAN(");
      break;
    case 19: 
      zf.a(paramArrayList, Integer.valueOf(this.f.length()));
      this.f.append("PI(");
      break;
    case 20: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "SQRT(");
      break;
    case 21: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "EXP(");
      break;
    case 22: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "LN(");
      break;
    case 23: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "LOG10(");
      break;
    case 24: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ABS(");
      break;
    case 25: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "INT(");
      break;
    case 26: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "SIGN(");
      break;
    case 27: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "ROUND(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 30: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "REPT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 31: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "MID(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 32: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "LEN(");
      break;
    case 33: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "VALUE(");
      break;
    case 34: 
      zf.a(paramArrayList, Integer.valueOf(this.f.length()));
      this.f.append("TRUE(");
      break;
    case 35: 
      zf.a(paramArrayList, Integer.valueOf(this.f.length()));
      this.f.append("FALSE(");
      break;
    case 38: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "NOT(");
      break;
    case 39: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "MOD(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 40: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "DCOUNT(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 41: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "DSUM(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 42: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "DAVERAGE(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 43: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "DMIN(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 44: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "DMAX(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      } else {
        zf.a(paramArrayList, Integer.valueOf(j));
      }
      break;
    case 45: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "DSTDEV(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 47: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "DVAR(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 48: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "TEXT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 63: 
      zf.a(paramArrayList, Integer.valueOf(this.f.length()));
      this.f.append("RAND(");
      break;
    case 65: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "DATE(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      } else {
        zf.a(paramArrayList, Integer.valueOf(j));
      }
      break;
    case 66: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "TIME(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 67: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "DAY(");
      break;
    case 68: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "MONTH(");
      break;
    case 69: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "YEAR(");
      break;
    case 71: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "HOUR(");
      break;
    case 72: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "MINUTE(");
      break;
    case 73: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "SECOND(");
      break;
    case 74: 
      zf.a(paramArrayList, Integer.valueOf(this.f.length()));
      this.f.append("NOW(");
      break;
    case 75: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "AREAS(");
      break;
    case 76: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ROWS(");
      break;
    case 77: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "COLUMNS(");
      break;
    case 83: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "TRANSPOSE(");
      break;
    case 97: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "ATAN2(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 98: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ASIN(");
      break;
    case 99: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ACOS(");
      break;
    case 105: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ISREF(");
      break;
    case 111: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "CHAR(");
      break;
    case 112: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "LOWER(");
      break;
    case 113: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "UPPER(");
      break;
    case 114: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "PROPER(");
      break;
    case 117: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "EXACT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 118: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "TRIM(");
      break;
    case 119: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (m = 1; m < 4; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.f.insert(j, "REPLACE(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 121: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "CODE(");
      break;
    case 126: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ISERR(");
      break;
    case 127: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ISTEXT(");
      break;
    case 128: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ISNUMBER(");
      break;
    case 129: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ISBLANK(");
      break;
    case 130: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "T(");
      break;
    case 131: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "N(");
      break;
    case 140: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "DATEVALUE(");
      break;
    case 141: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "TIMEVALUE(");
      break;
    case 142: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "SLN(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 143: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (m = 1; m < 4; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.f.insert(j, "SYD(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 163: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "MDETERM(");
      break;
    case 164: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "MINVERSE(");
      break;
    case 165: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "MMULT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 184: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "FACT(");
      break;
    case 189: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "DPRODUCT(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 190: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ISNONTEXT(");
      break;
    case 195: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "DSTDEVP(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 196: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "DVARP(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 198: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ISLOGICAL(");
      break;
    case 199: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "DCOUNTA(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 212: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "ROUNDUP(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 213: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "ROUNDDOWN(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 214: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ASC(");
      break;
    case 215: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "WIDECHAR(");
      break;
    case 221: 
      j = this.f.length();
      this.f.append("TODAY(");
      zf.a(paramArrayList, Integer.valueOf(j));
      break;
    case 229: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "SINH(");
      break;
    case 230: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "COSH(");
      break;
    case 231: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "TANH(");
      break;
    case 232: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ASINH(");
      break;
    case 233: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ACOSH(");
      break;
    case 234: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ATANH(");
      break;
    case 235: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "DGET(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 252: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "FREQUENCY(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 273: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (m = 1; m < 4; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.f.insert(j, "BINOMDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 274: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "CHIDIST(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 275: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "CHIINV(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 276: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "COMBIN(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 277: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "CONFIDENCE(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 278: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "CRITBINOM(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 279: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "EVEN(");
      break;
    case 280: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "EXPONDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 281: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "FDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 282: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "FINV(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 283: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "FISHER(");
      break;
    case 284: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "FISHERINV(");
      break;
    case 286: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (m = 1; m < 4; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.f.insert(j, "GAMMADIST(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      break;
    case 287: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "GAMMAINV(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 285: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "FLOOR(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 288: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "CEILING(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 289: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (m = 1; m < 4; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.f.insert(j, "HYPGEOMDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      break;
    case 290: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "LOGNORMDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 291: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "LOGINV(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 292: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "NEGBINOMDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      break;
    case 293: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (m = 1; m < 4; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.f.insert(j, "NORMDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      break;
    case 294: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "NORMSDIST(");
      break;
    case 295: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "NORMINV(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 296: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "NORMSINV(");
      break;
    case 297: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "STANDARDIZE(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 298: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "ODD(");
      break;
    case 299: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "PERMUT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 300: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "POISSON(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 301: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "TDIST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 302: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (m = 1; m < 4; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.f.insert(j, "WEIBULL(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 303: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "SUMXMY2(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 304: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "SUMX2MY2(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 305: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "SUMX2PY2(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 306: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "CHITEST(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 307: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "CORREL(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 308: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "COVAR(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 309: 
      if (paramArrayList.size() < 3) {
        return;
      }
      for (m = 1; m < 3; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 3)).intValue();
      this.f.insert(j, "FORECAST(");
      zf.a(paramArrayList, paramArrayList.size() - 2, 2);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 310: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "FTEST(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 311: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "INTERCEPT(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 312: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "PEARSON(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 313: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "RSQ(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 314: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "STEYX(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 315: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "SLOPE(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 316: 
      if (paramArrayList.size() < 4) {
        return;
      }
      for (m = 1; m < 4; m++)
      {
        j = ((Integer)paramArrayList.get(paramArrayList.size() - m)).intValue();
        this.f.insert(j, ',');
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 4)).intValue();
      this.f.insert(j, "TTEST(");
      zf.a(paramArrayList, paramArrayList.size() - 3, 3);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 325: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "LARGE(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 326: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "SMALL(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 327: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "QUARTILE(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 328: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "PERCENTILE(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 331: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "TRIMMEAN(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 332: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "TINV(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 337: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "POWER(");
      paramArrayList.remove(paramArrayList.size() - 1);
      break;
    case 342: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "RADIANS(");
      break;
    case 343: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "DEGREES(");
      break;
    case 346: 
      if (paramArrayList.size() < 2) {
        return;
      }
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, ',');
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 2)).intValue();
      this.f.insert(j, "COUNTIF(");
      paramArrayList.remove(paramArrayList.size() - 1);
      if (paramArrayList.size() > 0) {
        paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
      }
      break;
    case 347: 
      j = ((Integer)paramArrayList.get(paramArrayList.size() - 1)).intValue();
      this.f.insert(j, "COUNTBLANK(");
      break;
    case 351: 
      a("DATEDIF", 3, paramArrayList);
      break;
    case 352: 
      a("DATESTRING", 1, paramArrayList);
      break;
    case 480: 
      a("IFERROR", 2, paramArrayList);
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
    case 353: 
    case 354: 
    case 355: 
    case 356: 
    case 357: 
    case 358: 
    case 359: 
    case 360: 
    case 361: 
    case 362: 
    case 363: 
    case 364: 
    case 365: 
    case 366: 
    case 367: 
    case 368: 
    case 369: 
    case 370: 
    case 371: 
    case 372: 
    case 373: 
    case 374: 
    case 375: 
    case 376: 
    case 377: 
    case 378: 
    case 379: 
    case 380: 
    case 381: 
    case 382: 
    case 383: 
    case 384: 
    case 385: 
    case 386: 
    case 387: 
    case 388: 
    case 389: 
    case 390: 
    case 391: 
    case 392: 
    case 393: 
    case 394: 
    case 395: 
    case 396: 
    case 397: 
    case 398: 
    case 399: 
    case 400: 
    case 401: 
    case 402: 
    case 403: 
    case 404: 
    case 405: 
    case 406: 
    case 407: 
    case 408: 
    case 409: 
    case 410: 
    case 411: 
    case 412: 
    case 413: 
    case 414: 
    case 415: 
    case 416: 
    case 417: 
    case 418: 
    case 419: 
    case 420: 
    case 421: 
    case 422: 
    case 423: 
    case 424: 
    case 425: 
    case 426: 
    case 427: 
    case 428: 
    case 429: 
    case 430: 
    case 431: 
    case 432: 
    case 433: 
    case 434: 
    case 435: 
    case 436: 
    case 437: 
    case 438: 
    case 439: 
    case 440: 
    case 441: 
    case 442: 
    case 443: 
    case 444: 
    case 445: 
    case 446: 
    case 447: 
    case 448: 
    case 449: 
    case 450: 
    case 451: 
    case 452: 
    case 453: 
    case 454: 
    case 455: 
    case 456: 
    case 457: 
    case 458: 
    case 459: 
    case 460: 
    case 461: 
    case 462: 
    case 463: 
    case 464: 
    case 465: 
    case 466: 
    case 467: 
    case 468: 
    case 469: 
    case 470: 
    case 471: 
    case 472: 
    case 473: 
    case 474: 
    case 475: 
    case 476: 
    case 477: 
    case 478: 
    case 479: 
    default: 
      zacn localzacn = zacn.a(k & 0xFFFF);
      if (localzacn != null)
      {
        if (paramArrayList.size() < (localzacn.d & 0xFF)) {
          return;
        }
        for (int n = 1; n < (localzacn.d & 0xFF); n++)
        {
          j = ((Integer)paramArrayList.get(paramArrayList.size() - n)).intValue();
          this.f.insert(j, ',');
        }
        if (paramArrayList.size() > 0) {
          j = ((Integer)paramArrayList.get(paramArrayList.size() - (localzacn.d & 0xFF))).intValue();
        } else {
          j = 0;
        }
        this.f.insert(j, localzacn.b + "(");
        if ((localzacn.d & 0xFF) > 1) {
          zf.a(paramArrayList, paramArrayList.size() - (localzacn.d & 0xFF) + 1, (localzacn.d & 0xFF) - 1);
        }
        if (paramArrayList.size() > 0) {
          paramArrayList.set(paramArrayList.size() - 1, Integer.valueOf(j));
        } else {
          zf.a(paramArrayList, Integer.valueOf(j));
        }
      }
      else
      {
        return;
      }
      break;
    }
    this.f.append(")");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zciw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */