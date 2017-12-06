package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class ColumnCollection
  extends CollectionBase
{
  Column a;
  boolean b = false;
  double c = -1.0D;
  double d;
  private Worksheet e;
  
  ColumnCollection(Worksheet sheet, double defColWidth)
  {
    this.e = sheet;
    this.d = defColWidth;
  }
  
  Column a()
  {
    if (this.a == null) {
      this.a = new Column(0, this.e, this.d);
    }
    return this.a;
  }
  
  double b()
  {
    return this.d;
  }
  
  void a(double paramDouble)
  {
    this.b = true;
    this.d = paramDouble;
  }
  
  int a(int paramInt)
  {
    if ((this.a != null) && (this.a.getIndex() <= paramInt) && (this.a.e())) {
      return this.a.c();
    }
    return -1;
  }
  
  boolean b(int paramInt)
  {
    if ((this.a != null) && (this.a.getIndex() <= paramInt)) {
      return this.a.isHidden();
    }
    return false;
  }
  
  double a(int paramInt, boolean paramBoolean)
  {
    if ((this.a != null) && (this.a.getIndex() <= paramInt))
    {
      if (paramBoolean) {
        return this.a.a;
      }
      return this.a.isHidden() ? 0.0D : this.a.a;
    }
    return this.d;
  }
  
  /**
   * @deprecated
   */
  public Column getByIndex(int index)
  {
    return (Column)this.InnerList.get(index);
  }
  
  public Column getColumnByIndex(int index)
  {
    return (Column)this.InnerList.get(index);
  }
  
  Column c(int paramInt)
  {
    int i = e(paramInt);
    if (i < 0) {
      return null;
    }
    return (Column)this.InnerList.get(i);
  }
  
  public Column get(int columnIndex)
  {
    zamm.b(columnIndex);
    int i = e(columnIndex);
    if (i < 0) {
      return a(columnIndex, -i - 1);
    }
    return (Column)this.InnerList.get(i);
  }
  
  Column d(int paramInt)
  {
    Column localColumn = new Column((short)paramInt, this.e, this.d);
    zf.a(this.InnerList, localColumn);
    return localColumn;
  }
  
  Column a(int paramInt1, int paramInt2)
  {
    Column localColumn = new Column((short)paramInt1, this.e, this.d, this.a);
    this.InnerList.add(paramInt2, localColumn);
    return localColumn;
  }
  
  int e(int paramInt)
  {
    if (getCount() == 0) {
      return -1;
    }
    return a(paramInt, 0, getCount() - 1);
  }
  
  int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 > paramInt3) || (getCount() < 1)) {
      return -paramInt2 - 1;
    }
    for (;;)
    {
      int i = (paramInt2 + paramInt3) / 2;
      Column localColumn = (Column)this.InnerList.get(i);
      if (localColumn.getIndex() == paramInt1) {
        return i;
      }
      if (localColumn.getIndex() < paramInt1)
      {
        if (i == paramInt3) {
          return -i - 2;
        }
        paramInt2 = i + 1;
      }
      else
      {
        if (i == paramInt2) {
          return -i - 1;
        }
        paramInt3 = i - 1;
      }
    }
  }
  
  void b(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return;
    }
    if ((this.a != null) && (this.a.getIndex() > paramInt1)) {
      this.a.a(Math.max(paramInt1, this.a.getIndex() - paramInt2));
    }
    if (getCount() == 0) {
      return;
    }
    for (int i = 0; i < paramInt2; i++)
    {
      int j = e(paramInt1 + i);
      if (j > -1) {
        this.InnerList.remove(j);
      }
    }
    for (i = 0; i < getCount(); i++)
    {
      Column localColumn = (Column)this.InnerList.get(i);
      if (localColumn.getIndex() > paramInt1) {
        localColumn.a(localColumn.getIndex() - paramInt2);
      }
    }
  }
  
  void c(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return;
    }
    if ((this.a != null) && (this.a.getIndex() > paramInt1)) {
      if (this.a.getIndex() + paramInt2 < 16383) {
        this.a.a(this.a.getIndex() + paramInt2);
      } else {
        this.a = null;
      }
    }
    if (getCount() != 0)
    {
      Column localColumn1;
      for (int i = 0; i < getCount(); i++)
      {
        localColumn1 = getColumnByIndex(i);
        if (localColumn1.getIndex() >= paramInt1)
        {
          if (localColumn1.getIndex() + paramInt2 > 16383) {
            while (i < getCount()) {
              removeAt(i);
            }
          }
          localColumn1.a(localColumn1.getIndex() + paramInt2);
        }
      }
      if (paramInt1 > 0)
      {
        i = e(paramInt1 - 1);
        if (i > -1)
        {
          localColumn1 = getColumnByIndex(i);
          for (int j = 0; j < paramInt2; j++)
          {
            Column localColumn2 = new Column((short)(paramInt1 + j), this.e, this.d);
            localColumn2.c(localColumn1.c());
            localColumn2.a(localColumn1.b());
            localColumn2.setWidth(localColumn1.getWidth());
            this.InnerList.add(i + j + 1, localColumn2);
          }
        }
      }
    }
  }
  
  ArrayList c()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = this.a;
    int i = 16383;
    if (localObject1 != null) {
      if (((Column)localObject1).j())
      {
        Column localColumn1 = new Column(((Column)localObject1).getIndex(), this.e, this.d, (Column)localObject1);
        localObject1 = localColumn1;
        i = localColumn1.getIndex();
        if (i > 256) {
          i = 256;
        }
      }
      else
      {
        localObject1 = null;
      }
    }
    int j = 0;
    int k = 0;
    for (int m = 0; m < getCount(); m++)
    {
      Column localColumn2 = getColumnByIndex(m);
      if ((localColumn2.getIndex() - k != 0) && (localObject1 != null) && (localColumn2.getIndex() > i))
      {
        if (k < i) {
          k = i;
        }
        zlc localzlc2 = new zlc();
        localzlc2.a((Column)localObject1, this.e.c().U(), zlp.a(this.e.c()), k, localColumn2.getIndex() - 1);
        zf.a(localArrayList, localzlc2);
      }
      j = localColumn2.getIndex();
      int n = 0;
      m += 1;
      while (m < getCount())
      {
        localObject2 = getColumnByIndex(m);
        if ((((Column)localObject2).getIndex() != localColumn2.getIndex() + n + 1) || (!localColumn2.b((Column)localObject2)))
        {
          m--;
          break;
        }
        n++;
        m++;
      }
      Object localObject2 = new zlc();
      ((zlc)localObject2).a(localColumn2, this.e.c().U(), zlp.a(this.e.c()), j, j + n);
      zf.a(localArrayList, localObject2);
      k = j + n + 1;
    }
    if (localObject1 != null)
    {
      if (k < i) {
        k = i;
      }
      zlc localzlc1 = new zlc();
      localzlc1.a((Column)localObject1, this.e.c().U(), zlp.a(this.e.c()), k, 256);
      zf.a(localArrayList, localzlc1);
    }
    return localArrayList;
  }
  
  void a(ColumnCollection paramColumnCollection, CopyOptions paramCopyOptions)
  {
    this.c = paramColumnCollection.c;
    this.b = paramColumnCollection.b;
    this.d = paramColumnCollection.d;
    this.InnerList.clear();
    int i = -1;
    Column localColumn3;
    for (int j = 0; j < paramColumnCollection.getCount(); j++)
    {
      Column localColumn2 = paramColumnCollection.getColumnByIndex(j);
      if ((localColumn2.getIndex() - i != 1) && (paramCopyOptions != null) && (!paramCopyOptions.f)) {
        for (int m = i + 1; m < localColumn2.getIndex(); m++)
        {
          Column localColumn4 = d(m);
          localColumn4.a(paramColumnCollection.e.c().Q());
          localColumn4.a(paramColumnCollection.e, paramColumnCollection.e.getCells().getStandardWidthPixels());
        }
      }
      localColumn3 = d(localColumn2.getIndex());
      localColumn3.a(localColumn2, paramCopyOptions);
      i = localColumn2.getIndex();
    }
    if (paramColumnCollection.a != null)
    {
      Column localColumn1 = paramColumnCollection.a;
      if ((localColumn1.getIndex() - i != 1) && (paramCopyOptions != null) && (!paramCopyOptions.f)) {
        for (int k = i + 1; k < localColumn1.getIndex(); k++)
        {
          localColumn3 = d(k);
          localColumn3.a(paramColumnCollection.e.c().Q());
          localColumn3.a(paramColumnCollection.e, paramColumnCollection.e.getCells().getStandardWidthPixels());
        }
      }
      this.a = new Column(paramColumnCollection.a.getIndex(), this.e, this.d);
      this.a.a(paramColumnCollection.a, paramCopyOptions);
    }
    else if ((paramCopyOptions != null) && (!paramCopyOptions.f))
    {
      this.a = new Column(i + 1, this.e, this.d);
      this.a.a(paramColumnCollection.e.c().Q());
      this.a.a(paramColumnCollection.e, paramColumnCollection.e.getCells().getStandardWidthPixels());
    }
  }
  
  double f(int paramInt)
  {
    int i = e(paramInt);
    if (i > -1)
    {
      Column localColumn = (Column)this.InnerList.get(i);
      if (localColumn.isHidden()) {
        return 0.0D;
      }
      return localColumn.getWidth();
    }
    return a(paramInt, false);
  }
  
  int a(int paramInt1, int paramInt2, zahr paramzahr)
  {
    int i = getCount();
    if (i < 1)
    {
      if ((this.a == null) || (paramInt2 < this.a.getIndex())) {
        return paramzahr.a(this.d) * (paramInt2 - paramInt1 + 1);
      }
      if (paramInt1 >= this.a.getIndex())
      {
        if (this.a.isHidden()) {
          return 0;
        }
        return paramzahr.a(this.a.a) * (paramInt2 - paramInt1 + 1);
      }
      if (this.a.isHidden()) {
        return paramzahr.a(this.d) * (this.a.getIndex() - paramInt1);
      }
      return paramzahr.a(this.d) * (this.a.getIndex() - paramInt1) + paramzahr.a(this.a.a) * (paramInt2 - this.a.getIndex() + 1);
    }
    int j = 0;
    int k;
    if (paramInt1 == 0)
    {
      k = 0;
    }
    else
    {
      k = e(paramInt1);
      if (k < 0) {
        k = -k - 1;
      }
    }
    int m;
    if ((this.a == null) || (paramInt2 < this.a.getIndex()))
    {
      m = paramzahr.a(this.d);
      while (k < i)
      {
        Column localColumn1 = (Column)this.InnerList.get(k);
        n = localColumn1.getIndex();
        if (n > paramInt2) {
          break;
        }
        if (n > paramInt1) {
          j += (n - paramInt1) * m;
        }
        if (!localColumn1.isHidden()) {
          j += paramzahr.a(localColumn1.a);
        }
        if (n == paramInt2) {
          return j;
        }
        paramInt1 = n + 1;
        k++;
      }
      return j + (paramInt2 - paramInt1 + 1) * m;
    }
    int n = this.a.getIndex();
    if (paramInt1 < n)
    {
      m = paramzahr.a(this.d);
      int i1 = a(n, k, i - 1);
      if (i1 < 0) {
        i1 = -i1 - 1;
      }
      while (k < i1)
      {
        Column localColumn3 = (Column)this.InnerList.get(k);
        n = localColumn3.getIndex();
        if (n > paramInt1) {
          j += (n - paramInt1) * m;
        }
        if (!localColumn3.isHidden()) {
          j += paramzahr.a(localColumn3.a);
        }
        paramInt1 = n + 1;
        k++;
      }
      n = this.a.getIndex();
      if (paramInt1 < n)
      {
        j += (n - paramInt1) * m;
        paramInt1 = n;
      }
    }
    if (this.a.isHidden()) {
      m = 0;
    } else {
      m = paramzahr.a(this.a.a);
    }
    while (k < i)
    {
      Column localColumn2 = (Column)this.InnerList.get(k);
      n = localColumn2.getIndex();
      if (n > paramInt2) {
        break;
      }
      if (n > paramInt1) {
        j += (n - paramInt1) * m;
      }
      if (!localColumn2.isHidden()) {
        j += paramzahr.a(localColumn2.a);
      }
      if (n == paramInt2) {
        return j;
      }
      paramInt1 = n + 1;
      k++;
    }
    return j + (paramInt2 - paramInt1 + 1) * m;
  }
  
  void a(int[] paramArrayOfInt, zahr paramzahr)
  {
    int i = paramArrayOfInt[0];
    int i3;
    int i2;
    if (paramArrayOfInt[2] < 0)
    {
      j = -paramArrayOfInt[2] - paramArrayOfInt[1];
      if (j <= 0)
      {
        paramArrayOfInt[2] = (-j);
        paramArrayOfInt[1] = 0;
        a(paramArrayOfInt, paramzahr);
        return;
      }
      i--;
      if (i < 0)
      {
        paramArrayOfInt[1] = 0;
        paramArrayOfInt[2] = paramzahr.a(f(0));
        return;
      }
      k = -1;
      if (getCount() > 0)
      {
        if (this.a != null)
        {
          n = this.a.getIndex();
          if (i < n) {
            k = paramzahr.a(this.d);
          } else if (!this.a.isHidden()) {
            k = paramzahr.a(this.a.a);
          }
        }
        else
        {
          n = Integer.MAX_VALUE;
          k = paramzahr.a(this.d);
        }
        i1 = e(i);
        if (i1 < 0) {
          i1 = -i1 - 2;
        }
        if (i1 > -1) {
          while (i1 > -1)
          {
            Column localColumn1 = (Column)this.InnerList.get(i1);
            i3 = localColumn1.getIndex();
            if ((i >= n) && (i3 < n))
            {
              if (k > 0)
              {
                m = (j - 1) / k;
                if (i - m >= n)
                {
                  j -= m * k;
                  paramArrayOfInt[0] = (i - m);
                  paramArrayOfInt[1] = (k - j);
                  paramArrayOfInt[2] = j;
                  return;
                }
                j -= (i - n + 1) * k;
              }
              i = n - 1;
              k = paramzahr.a(this.d);
            }
            if ((i3 < i) && (k > 0))
            {
              m = (j - 1) / k;
              if (i - m > i3)
              {
                j -= m * k;
                paramArrayOfInt[0] = (i - m);
                paramArrayOfInt[1] = (k - j);
                paramArrayOfInt[2] = j;
                return;
              }
              j -= (i - i3) * k;
            }
            if (!localColumn1.isHidden())
            {
              i2 = paramzahr.a(localColumn1.a);
              if (j <= i2)
              {
                paramArrayOfInt[0] = i3;
                paramArrayOfInt[1] = (i2 - j);
                paramArrayOfInt[2] = j;
                return;
              }
              j -= i2;
            }
            if (i3 == n) {
              k = paramzahr.a(this.d);
            }
            i = i3 - 1;
            i1--;
          }
        }
      }
      if ((this.a != null) && (i >= this.a.getIndex()))
      {
        if (!this.a.isHidden())
        {
          n = this.a.getIndex();
          if (k < 0) {
            k = paramzahr.a(this.a.a);
          }
          if (k > 0)
          {
            m = (j - 1) / k;
            if (i - m >= n)
            {
              j -= m * k;
              paramArrayOfInt[0] = (i - m);
              paramArrayOfInt[1] = (k - j);
              paramArrayOfInt[2] = j;
              return;
            }
            j -= (i - n + 1) * k;
          }
          i = n - 1;
        }
        else
        {
          i = this.a.getIndex() - 1;
        }
        k = paramzahr.a(this.d);
      }
      else if (k < 0)
      {
        k = paramzahr.a(this.d);
      }
      if (k < 1)
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = j;
        paramArrayOfInt[2] = (-j);
        return;
      }
      m = (j - 1) / k;
      if (i < m)
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = 0;
        paramArrayOfInt[2] = k;
        return;
      }
      j -= m * k;
      paramArrayOfInt[0] = (i - m);
      paramArrayOfInt[1] = (k - j);
      paramArrayOfInt[2] = j;
      return;
    }
    int j = paramArrayOfInt[1] + paramArrayOfInt[2];
    int k = -1;
    int m = getCount();
    if (m > 0)
    {
      if (i == 0)
      {
        i1 = 0;
      }
      else
      {
        i1 = a(i, 0, m - 1);
        if (i1 < 0) {
          i1 = -i1 - 1;
        }
      }
      if (this.a != null)
      {
        i2 = this.a.getIndex();
        if (i < i2) {
          k = paramzahr.a(this.d);
        } else if (!this.a.isHidden()) {
          k = paramzahr.a(this.a.a);
        }
      }
      else
      {
        i2 = Integer.MAX_VALUE;
        k = paramzahr.a(this.d);
      }
      if (i1 < m) {
        while (i1 < m)
        {
          Column localColumn2 = (Column)this.InnerList.get(i1);
          int i4 = localColumn2.getIndex();
          if ((i < i2) && (i4 >= i2))
          {
            if (k > 0)
            {
              n = (j - 1) / k;
              if (i + n < i2)
              {
                j -= n * k;
                paramArrayOfInt[0] = (i + n);
                paramArrayOfInt[1] = j;
                paramArrayOfInt[2] = (k - j);
                return;
              }
              j -= (i2 - i) * k;
            }
            i = i2;
            if (this.a.isHidden()) {
              k = 0;
            } else {
              k = paramzahr.a(this.a.a);
            }
          }
          if ((i4 > i) && (k > 0))
          {
            n = (j - 1) / k;
            if (i + n < i4)
            {
              j -= n * k;
              paramArrayOfInt[0] = (i + n);
              paramArrayOfInt[1] = j;
              paramArrayOfInt[2] = (k - j);
              return;
            }
            j -= (i4 - i) * k;
          }
          if (!localColumn2.isHidden())
          {
            i3 = paramzahr.a(localColumn2.a);
            if (j <= i3)
            {
              paramArrayOfInt[0] = i4;
              paramArrayOfInt[1] = j;
              paramArrayOfInt[2] = (i3 - j);
              return;
            }
            j -= i3;
          }
          i = i4 + 1;
          if (i == i2) {
            if (this.a.isHidden()) {
              k = 0;
            } else {
              k = paramzahr.a(this.a.a);
            }
          }
          i1++;
        }
      }
    }
    if (this.a == null)
    {
      if (k < 0) {
        k = paramzahr.a(this.d);
      }
      if (k < 1)
      {
        paramArrayOfInt[0] = i;
        paramArrayOfInt[1] = j;
        paramArrayOfInt[2] = (-j);
        return;
      }
      n = (j - 1) / k;
      j -= n * k;
      paramArrayOfInt[0] = (i + n);
      paramArrayOfInt[1] = j;
      paramArrayOfInt[2] = (k - j);
      return;
    }
    int i1 = this.a.getIndex();
    if (i < i1)
    {
      if (k < 0) {
        k = paramzahr.a(this.d);
      }
      if (k > 0)
      {
        n = (j - 1) / k;
        if (i + n < i1)
        {
          j -= n * k;
          paramArrayOfInt[0] = (i + n);
          paramArrayOfInt[1] = j;
          paramArrayOfInt[2] = (k - j);
          return;
        }
        j -= (i1 - i) * k;
      }
      if (this.a.isHidden())
      {
        paramArrayOfInt[0] = i1;
        paramArrayOfInt[1] = j;
        paramArrayOfInt[2] = (-j);
        return;
      }
      if (this.a.isHidden()) {
        k = 0;
      } else {
        k = paramzahr.a(this.a.a);
      }
      i = i1;
    }
    else
    {
      if (this.a.isHidden())
      {
        paramArrayOfInt[0] = i1;
        paramArrayOfInt[1] = j;
        paramArrayOfInt[2] = (-j);
        return;
      }
      if (k < 0) {
        k = paramzahr.a(this.a.a);
      }
    }
    if (k < 1)
    {
      paramArrayOfInt[0] = i;
      paramArrayOfInt[1] = j;
      paramArrayOfInt[2] = (-j);
      return;
    }
    int n = (j - 1) / k;
    j -= n * k;
    paramArrayOfInt[0] = (i + n);
    paramArrayOfInt[1] = j;
    paramArrayOfInt[2] = (k - j);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ColumnCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */