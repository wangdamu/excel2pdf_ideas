package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

class zbzv
  extends CollectionBase
  implements zajm
{
  private boolean a = true;
  private WorksheetCollection b;
  
  zbzv(WorksheetCollection paramWorksheetCollection)
  {
    this.b = paramWorksheetCollection;
  }
  
  public int b()
  {
    return getCount();
  }
  
  public boolean a()
  {
    return true;
  }
  
  public Style a(int paramInt)
  {
    if ((paramInt > -1) && (paramInt < this.InnerList.size())) {
      return (Style)this.InnerList.get(paramInt);
    }
    return (Style)this.InnerList.get(15);
  }
  
  public Style b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt == 15) || (paramInt >= this.InnerList.size())) {
      return null;
    }
    return (Style)this.InnerList.get(paramInt);
  }
  
  public Style a(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return null;
    }
    for (int i = this.InnerList.size() - 1; i > -1; i--) {
      if ((this.InnerList.get(i) != null) && (zw.b(((Style)this.InnerList.get(i)).getName(), paramString))) {
        return (Style)this.InnerList.get(i);
      }
    }
    return null;
  }
  
  public void a(int paramInt, Style paramStyle)
  {
    this.InnerList.set(paramInt, paramStyle);
  }
  
  public int a(Style paramStyle)
  {
    int i = -1;
    Style localStyle1;
    if ((paramStyle.h() > 0) && (paramStyle.h() != 4095))
    {
      if (paramStyle.e() != this.b)
      {
        Style localStyle2 = paramStyle.e().C().a(paramStyle.h());
        String str = localStyle2.getName();
        localStyle5 = this.InnerList.size() - 1;
        int i1 = -1;
        while (localStyle5 > -1)
        {
          if (this.InnerList.get(localStyle5) == null)
          {
            i1 = i;
            i = localStyle5;
          }
          else
          {
            if (zw.b(((Style)this.InnerList.get(localStyle5)).getName(), str)) {
              break;
            }
          }
          localStyle5--;
        }
        if (localStyle5 < 0)
        {
          localStyle8 = new Style(this.b);
          localStyle8.copy(localStyle2);
          localStyle8.a(localStyle2.getName());
          localStyle8.a(false);
          i = b(localStyle8, i);
          localStyle9 = new Style(this.b);
          localStyle9.copy(paramStyle);
          localStyle9.a(true);
          localStyle9.a(i);
          return b(localStyle9, i1);
        }
        Style localStyle8 = localStyle5;
        for (localStyle5 = this.InnerList.size() - 1; localStyle5 > localStyle8; localStyle5--) {
          if (this.InnerList.get(localStyle5) == null)
          {
            i = localStyle5;
          }
          else
          {
            localStyle1 = (Style)this.InnerList.get(localStyle5);
            if ((paramStyle == localStyle1) || ((localStyle8 == localStyle1.h()) && (paramStyle.d(localStyle1)))) {
              return localStyle5;
            }
          }
        }
        localStyle9 = new Style(this.b);
        localStyle9.copy(paramStyle);
        localStyle9.a(true);
        localStyle9.a(localStyle8);
        return b(localStyle9, i);
      }
      int j = paramStyle.h();
      int k = Math.max(15, j);
      for (Style localStyle5 = this.InnerList.size() - 1; localStyle5 > k; localStyle5--) {
        if (this.InnerList.get(localStyle5) == null)
        {
          i = localStyle5;
        }
        else
        {
          localStyle1 = (Style)this.InnerList.get(localStyle5);
          if ((paramStyle == localStyle1) || ((j == localStyle1.h()) && (paramStyle.d(localStyle1)))) {
            return localStyle5;
          }
        }
      }
      Style localStyle6 = new Style(this.b);
      localStyle6.copy(paramStyle);
      localStyle6.a(true);
      localStyle6.a(j);
      return b(localStyle6, i);
    }
    if ((paramStyle.getName() == null) || ("".equals(paramStyle.getName())))
    {
      if (paramStyle.d((Style)this.InnerList.get(15))) {
        return 15;
      }
      Object localObject1 = paramStyle;
      Style localStyle4 = null;
      if (this.b != paramStyle.e())
      {
        localStyle4 = new Style(this.b);
        localStyle4.copy(paramStyle);
        localObject1 = localStyle4;
      }
      for (int n = this.InnerList.size() - 1; n > 15; n--) {
        if (this.InnerList.get(n) == null)
        {
          i = n;
        }
        else
        {
          localStyle1 = (Style)this.InnerList.get(n);
          if ((localObject1 == localStyle1) || ((localStyle1.h() == 0) && (((Style)localObject1).d(localStyle1)))) {
            return n;
          }
        }
      }
      localObject2 = null;
      if (localStyle4 == null)
      {
        localObject2 = new Style(this.b);
        ((Style)localObject2).copy(paramStyle);
      }
      else
      {
        localObject2 = localStyle4;
      }
      return b((Style)localObject2, i);
    }
    Style localStyle3 = this.InnerList.size() - 1;
    int m = -1;
    Object localObject2 = paramStyle.getName();
    while (localStyle3 >= 0)
    {
      if (this.InnerList.get(localStyle3) == null)
      {
        m = i;
        i = localStyle3;
      }
      else if (zw.b(((Style)this.InnerList.get(localStyle3)).getName(), (String)localObject2))
      {
        this.InnerList.set(localStyle3, paramStyle);
        break;
      }
      localStyle3--;
    }
    if (localStyle3 < 0)
    {
      paramStyle.a(false);
      i = b(paramStyle, i);
      localStyle7 = new Style(this.b);
      localStyle7.copy(paramStyle);
      localStyle7.a(true);
      localStyle7.a((byte)0);
      localStyle7.a(i);
      return b(localStyle7, m);
    }
    Style localStyle7 = localStyle3;
    paramStyle.a(true);
    byte b1 = paramStyle.i();
    for (localStyle3 = this.InnerList.size() - 1; localStyle3 > localStyle7; localStyle3--) {
      if (this.InnerList.get(localStyle3) == null)
      {
        i = localStyle3;
      }
      else
      {
        localStyle1 = (Style)this.InnerList.get(localStyle3);
        if ((localStyle1.h() == localStyle7) && (localStyle1.a(paramStyle, b1)))
        {
          paramStyle.a(false);
          return localStyle3;
        }
      }
    }
    Style localStyle9 = new Style(this.b);
    localStyle9.a(paramStyle);
    localStyle9.a(true);
    localStyle9.a((byte)0);
    localStyle9.a(localStyle7);
    paramStyle.a(false);
    paramStyle.a(b1);
    return b(localStyle9, i);
  }
  
  public int a(Style paramStyle, CopyOptions paramCopyOptions)
  {
    return a(paramStyle);
  }
  
  public Style c(int paramInt)
  {
    return (Style)this.InnerList.get(paramInt);
  }
  
  int a(Style paramStyle, int paramInt)
  {
    boolean bool = paramStyle.g();
    paramStyle.b(true);
    int i = -1;
    for (int j = this.InnerList.size() - 1; j > Math.max(14, paramInt); j--) {
      if (this.InnerList.get(j) == null)
      {
        i = j;
      }
      else
      {
        Style localStyle1 = (Style)this.InnerList.get(j);
        if ((paramStyle == localStyle1) || ((paramInt == localStyle1.h()) && (paramStyle.d(localStyle1)))) {
          return j;
        }
      }
    }
    Style localStyle2 = new Style(this.b);
    localStyle2.copy(paramStyle);
    localStyle2.a(paramInt);
    paramStyle.b(bool);
    return b(localStyle2, i);
  }
  
  int b(Style paramStyle)
  {
    int i = -1;
    for (int j = this.InnerList.size() - 1; j > 14; j--) {
      if (this.InnerList.get(j) == null)
      {
        i = j;
      }
      else
      {
        Style localStyle1 = (Style)this.InnerList.get(j);
        if ((localStyle1.h() == 0) && (paramStyle.d(localStyle1))) {
          return j;
        }
      }
    }
    Style localStyle2 = new Style(this.b);
    localStyle2.copy(paramStyle);
    return b(localStyle2, i);
  }
  
  int a(int paramInt1, String paramString, int paramInt2)
  {
    Style localStyle1;
    if ((paramInt2 < 0) || (paramInt2 >= getCount())) {
      localStyle1 = (Style)this.InnerList.get(15);
    } else {
      localStyle1 = (Style)this.InnerList.get(paramInt2);
    }
    if (paramInt1 == localStyle1.getNumber()) {
      return paramInt2;
    }
    if ((paramString != null) && (paramString.equals(localStyle1.s()))) {
      return paramInt2;
    }
    Style localStyle2 = new Style(this.b);
    localStyle2.copy(localStyle1);
    if (paramInt1 > -1) {
      localStyle2.setNumber(paramInt1);
    } else {
      localStyle2.b(paramString);
    }
    return a(localStyle2);
  }
  
  int c(Style paramStyle)
  {
    zf.a(this.InnerList, paramStyle);
    return this.InnerList.size() - 1;
  }
  
  int d(Style paramStyle)
  {
    zf.a(this.InnerList, paramStyle);
    return this.InnerList.size() - 1;
  }
  
  int e(Style paramStyle)
  {
    paramStyle.a(false);
    String str = paramStyle.getName();
    int i = -1;
    for (int j = this.InnerList.size() - 1; j > -1; j--) {
      if (this.InnerList.get(j) == null)
      {
        i = j;
      }
      else if (zw.b(((Style)this.InnerList.get(j)).getName(), str))
      {
        this.InnerList.set(j, paramStyle);
        return j;
      }
    }
    if ((i != -1) && (this.InnerList.get(i) == null))
    {
      this.InnerList.set(i, paramStyle);
      return i;
    }
    zf.a(this.InnerList, paramStyle);
    return this.InnerList.size() - 1;
  }
  
  int f(Style paramStyle)
  {
    int i = this.InnerList.size();
    for (int j = 15; j < i; j++) {
      if (this.InnerList.get(j) == null)
      {
        this.InnerList.set(j, paramStyle);
        return j;
      }
    }
    zf.a(this.InnerList, paramStyle);
    return i;
  }
  
  int g(Style paramStyle)
  {
    paramStyle.a(false);
    String str = paramStyle.getName();
    int i = -1;
    for (int j = this.InnerList.size() - 1; j > -1; j--) {
      if (this.InnerList.get(j) == null) {
        i = j;
      } else if (zw.b(((Style)this.InnerList.get(j)).getName(), str)) {
        return j;
      }
    }
    return b(paramStyle, i);
  }
  
  int h(Style paramStyle)
  {
    paramStyle.a(false);
    String str = paramStyle.getName();
    int i = -1;
    for (int j = this.InnerList.size() - 1; j > -1; j--) {
      if (this.InnerList.get(j) == null)
      {
        i = j;
      }
      else if (zw.b(((Style)this.InnerList.get(j)).getName(), str))
      {
        this.InnerList.set(j, paramStyle);
        return j;
      }
    }
    return b(paramStyle, i);
  }
  
  void a(zbzv paramzbzv)
  {
    clear();
    int i = paramzbzv.InnerList.size();
    for (int j = 0; j < i; j++) {
      if (paramzbzv.InnerList.get(j) == null)
      {
        zf.a(this.InnerList, null);
      }
      else
      {
        Style localStyle1 = new Style(this.b);
        Style localStyle2 = (Style)paramzbzv.InnerList.get(j);
        localStyle1.copy(localStyle2);
        localStyle1.a(localStyle2.h());
        localStyle1.a(localStyle2.getName());
        zf.a(this.InnerList, localStyle1);
      }
    }
  }
  
  void c()
  {
    ArrayList localArrayList = this.b.A();
    for (int i = 0; i < 5; i++)
    {
      Font localFont = new Font(this.b, null, false);
      localFont.d(i);
      if (i == 4) {
        i = 5;
      }
      zf.a(localArrayList, localFont);
    }
  }
  
  void d()
  {
    ArrayList localArrayList = this.b.A();
    for (int i = 0; i < 5; i++)
    {
      Font localFont = new Font(this.b, null, false);
      localFont.d(i);
      if (i == 4) {
        i = 5;
      }
      zf.a(localArrayList, localFont);
    }
    Style localStyle = new Style(this.b);
    localStyle.a(false);
    localStyle.a("Normal");
    localStyle.getFont().d(0);
    localStyle.setNumber(0);
    localStyle.a((byte)-4);
    zf.a(this.InnerList, localStyle);
    for (int j = 0; j < 2; j++)
    {
      localStyle = new Style(this.b);
      localStyle.a(false);
      localStyle.getFont().d(1);
      localStyle.setNumber(0);
      localStyle.a((byte)8);
      zf.a(this.InnerList, localStyle);
    }
    for (j = 0; j < 2; j++)
    {
      localStyle = new Style(this.b);
      localStyle.a(false);
      localStyle.getFont().d(2);
      localStyle.setNumber(0);
      localStyle.a((byte)8);
      zf.a(this.InnerList, localStyle);
    }
    for (j = 0; j < 16; j++)
    {
      localStyle = new Style(this.b);
      localStyle.getFont().d(0);
      if (j == 10) {
        localStyle.a(true);
      } else {
        localStyle.a(false);
      }
      switch (j)
      {
      default: 
        localStyle.a((byte)8);
        break;
      case 10: 
        localStyle.a((byte)0);
        break;
      case 11: 
        localStyle.setNumber(9);
        localStyle.a("Percent");
        localStyle.a((byte)4);
        break;
      case 12: 
        localStyle.setNumber(44);
        localStyle.a("Currency");
        localStyle.a((byte)4);
        break;
      case 13: 
        localStyle.setNumber(42);
        localStyle.a("Currency [0]");
        localStyle.a((byte)4);
        break;
      case 14: 
        localStyle.setNumber(43);
        localStyle.a("Comma");
        localStyle.a((byte)4);
        break;
      case 15: 
        localStyle.setNumber(41);
        localStyle.a("Comma [0]");
        localStyle.a((byte)4);
      }
      zf.a(this.InnerList, localStyle);
    }
    for (j = 0; j < this.InnerList.size(); j++)
    {
      localStyle = (Style)this.InnerList.get(j);
      if ((localStyle.c() != null) && (!"".equals(localStyle.c()))) {
        this.b.s().a(localStyle);
      }
    }
  }
  
  protected void onClearComplete()
  {
    super.onClearComplete();
    this.a = true;
  }
  
  private int b(Style paramStyle, int paramInt)
  {
    if (paramInt < 0)
    {
      paramInt = this.InnerList.size();
      if ((this.a) && (paramInt > 32768))
      {
        int i = b(32768, 0);
        this.a = false;
        if (i > 0)
        {
          paramInt = this.InnerList.size();
          if (paramInt - i << 3 < paramInt)
          {
            e();
            paramInt = this.InnerList.size();
          }
          else
          {
            int j = 16;
            while (j < paramInt) {
              if (this.InnerList.get(j) != null)
              {
                j++;
              }
              else
              {
                if (paramStyle.h() > j)
                {
                  int k = paramStyle.h();
                  for (int m = paramInt - 1; m > k; m--) {
                    if ((this.InnerList.get(m) != null) && (((Style)this.InnerList.get(m)).h() == k)) {
                      ((Style)this.InnerList.get(m)).a(j);
                    }
                  }
                  this.InnerList.set(j, this.InnerList.get(k));
                  if (i > 1)
                  {
                    j++;
                    while (j < k)
                    {
                      if (this.InnerList.get(j) == null)
                      {
                        this.InnerList.set(j, paramStyle);
                        return j;
                      }
                      j++;
                    }
                  }
                  this.InnerList.set(k, paramStyle);
                  return k;
                }
                this.InnerList.set(j, paramStyle);
                return j;
              }
            }
          }
        }
      }
      zf.a(this.InnerList, paramStyle);
    }
    else
    {
      this.InnerList.set(paramInt, paramStyle);
    }
    return paramInt;
  }
  
  int a(int paramInt1, int paramInt2)
  {
    int i = this.InnerList.size();
    if (this.InnerList.get(i - 1) == null)
    {
      i -= 2;
      while ((i > 15) && (this.InnerList.get(i) == null)) {
        i--;
      }
      i++;
      zf.a(this.InnerList, i, this.InnerList.size() - i);
    }
    if (i <= paramInt1)
    {
      j = 0;
      i--;
      while (i > 15)
      {
        if (this.InnerList.get(i) == null) {
          j++;
        }
        i--;
      }
      if ((paramInt2 == 1) || ((j == 0) && (paramInt2 == 2))) {
        return j;
      }
    }
    int j = b(paramInt1, paramInt2);
    i = this.InnerList.size();
    paramInt1 = i - paramInt1;
    if (j >= paramInt1) {
      return j;
    }
    int k = 1;
    for (int n = i - 1; n > 15; n--) {
      if (this.InnerList.get(n) != null)
      {
        String str = ((Style)this.InnerList.get(n)).getName();
        if ((str != null) && (!"".equals(str)))
        {
          int m = 1;
          for (int i1 = i - 1; i1 > n; i1--) {
            if ((this.InnerList.get(i1) != null) && (((Style)this.InnerList.get(i1)).h() == n))
            {
              m = 0;
              break;
            }
          }
          if (m != 0)
          {
            if (k != 0)
            {
              this.InnerList.remove(n);
              i--;
              if (paramInt2 == 1)
              {
                paramInt1--;
                if (j >= paramInt1) {
                  return j;
                }
              }
            }
            else
            {
              j++;
              this.InnerList.set(n, null);
              if ((paramInt2 == 1) && (j >= paramInt1)) {
                return j;
              }
            }
          }
          else {
            k = 0;
          }
        }
        else
        {
          k = 0;
        }
      }
    }
    return j;
  }
  
  private int b(int paramInt1, int paramInt2)
  {
    boolean[] arrayOfBoolean = new boolean[this.InnerList.size()];
    int i = 0;
    int j = 1;
    for (int k = arrayOfBoolean.length - 1; k > 15; k--) {
      if (this.InnerList.get(k) == null)
      {
        if (j != 0)
        {
          this.InnerList.remove(k);
        }
        else
        {
          i++;
          arrayOfBoolean[k] = false;
          j = 0;
        }
      }
      else
      {
        String str = ((Style)this.InnerList.get(k)).getName();
        arrayOfBoolean[k] = ((str == null) || (str.equals("")) ? 1 : false);
        j = 0;
      }
    }
    if (paramInt2 == 1)
    {
      paramInt1 = this.InnerList.size() - paramInt1;
      if (i >= paramInt1) {
        return i;
      }
    }
    else if ((paramInt2 == 2) && (i == 0) && (this.InnerList.size() <= paramInt1))
    {
      return 0;
    }
    for (int i2 = this.b.getCount() - 1; i2 > -1; i2--)
    {
      Cells localCells = this.b.get(i2).getCells();
      ColumnCollection localColumnCollection = localCells.getColumns();
      if ((localColumnCollection.a != null) && (localColumnCollection.a.c() > 0)) {
        arrayOfBoolean[localColumnCollection.a.c()] = false;
      }
      int n;
      for (int i3 = localColumnCollection.getCount() - 1; i3 > -1; i3--)
      {
        n = localColumnCollection.getColumnByIndex(i3).c();
        if (n > 0) {
          arrayOfBoolean[n] = false;
        }
      }
      int i1 = 1;
      for (i3 = this.InnerList.size() - 1; i3 > 15; i3--) {
        if (arrayOfBoolean[i3] != 0)
        {
          i1 = 0;
          break;
        }
      }
      if (i1 != 0) {
        return i;
      }
      zaja localzaja = localCells.getRows().a.a(-1, -1, false);
      while (localzaja.hasNext())
      {
        zt localzt = localzaja.e();
        n = localzt.j();
        if (n > 0) {
          arrayOfBoolean[n] = false;
        }
        if (localzt.a() > 0)
        {
          zaiv localzaiv = localzt.b();
          for (;;)
          {
            int m = localzaiv.a();
            if (m < 0) {
              break;
            }
            n = localzt.g(m);
            if (n > 0) {
              arrayOfBoolean[n] = false;
            }
          }
        }
      }
      i1 = 1;
      for (i3 = this.InnerList.size() - 1; i3 > 15; i3--) {
        if (arrayOfBoolean[i3] != 0)
        {
          i1 = 0;
          break;
        }
      }
      if (i1 != 0) {
        return i;
      }
    }
    j = 1;
    for (i2 = this.InnerList.size() - 1; i2 > 15; i2--) {
      if (j != 0)
      {
        if ((arrayOfBoolean[i2] != 0) || (this.InnerList.get(i2) == null))
        {
          this.InnerList.remove(i2);
          if (paramInt2 == 1)
          {
            paramInt1--;
            if (i >= paramInt1) {
              return i;
            }
          }
        }
        else
        {
          j = 0;
        }
      }
      else if (arrayOfBoolean[i2] != 0)
      {
        i++;
        this.InnerList.set(i2, null);
        if ((paramInt2 == 1) && (i >= paramInt1)) {
          return i;
        }
      }
    }
    return i;
  }
  
  int[] e()
  {
    int[] arrayOfInt = null;
    int i = this.InnerList.size();
    if (this.InnerList.get(i - 1) == null)
    {
      i -= 2;
      while ((i > 15) && (this.InnerList.get(i) == null)) {
        i--;
      }
      i++;
      zf.a(this.InnerList, i, this.InnerList.size() - i);
      if (i < 17) {
        return null;
      }
    }
    int j = -1;
    int k = 0;
    for (int m = 16; m < i; m++) {
      if (this.InnerList.get(m) == null)
      {
        if (k == 0)
        {
          k = 1;
          arrayOfInt = new int[i];
          arrayOfInt[0] = m;
          j = m;
        }
      }
      else if (k != 0)
      {
        arrayOfInt[m] = j;
        this.InnerList.set(j, this.InnerList.get(m));
        j++;
      }
    }
    if (k != 0) {
      zf.a(this.InnerList, j, this.InnerList.size() - j);
    }
    return arrayOfInt;
  }
  
  static byte i(Style paramStyle)
  {
    BorderCollection localBorderCollection = paramStyle.d();
    if (localBorderCollection == null) {
      return 0;
    }
    byte b1 = 0;
    int i = localBorderCollection.getByBorderType(4).getLineStyle();
    if (zbdx.a(i)) {
      b1 = (byte)(b1 | 0xC);
    } else if (zbdx.b(i)) {
      b1 = (byte)(b1 | 0x8);
    }
    i = paramStyle.getBorders().getByBorderType(8).getLineStyle();
    if (zbdx.a(i)) {
      b1 = (byte)(b1 | 0x3);
    } else if (zbdx.b(i)) {
      b1 = (byte)(b1 | 0x2);
    }
    return b1;
  }
  
  byte[] f()
  {
    if (this.InnerList.size() < 16) {
      return null;
    }
    int i = 0;
    byte[] arrayOfByte = null;
    byte b1 = i((Style)this.InnerList.get(this.InnerList.size() - 1));
    for (int j = this.InnerList.size() - 2; j > 14; j--) {
      if (i != 0)
      {
        arrayOfByte[j] = i((Style)this.InnerList.get(j));
      }
      else
      {
        byte b2 = i((Style)this.InnerList.get(j));
        if (b2 != b1)
        {
          i = 1;
          arrayOfByte = new byte[this.InnerList.size()];
          zc.a(arrayOfByte, j + 1, arrayOfByte.length, b1);
          arrayOfByte[j] = b2;
        }
      }
    }
    if (i != 0) {
      return arrayOfByte;
    }
    if (b1 == 0) {
      return null;
    }
    return new byte[] { b1 };
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */