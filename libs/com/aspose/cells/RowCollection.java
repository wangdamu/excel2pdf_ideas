package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import java.util.HashMap;
import java.util.Iterator;

public class RowCollection
  implements Iterable
{
  zahb a;
  zajb b;
  zv c;
  zu d;
  Cells e;
  
  RowCollection(Cells cells, zv rowsData)
  {
    this.e = cells;
    a(rowsData);
    a();
    b();
  }
  
  void a(zv paramzv)
  {
    this.c = paramzv;
    if (this.e.getMultiThreadReading()) {
      this.d = new zti(this.e, this);
    } else if (paramzv.d()) {
      this.d = new zbxn(10, this.e, this);
    } else {
      this.d = new zbpm(this.e, this);
    }
  }
  
  void a(int paramInt)
  {
    if (this.c.a() > 0) {
      this.a = this.c.a(this.e, this, paramInt);
    }
  }
  
  void b(int paramInt)
  {
    a(paramInt, false);
  }
  
  void a(int paramInt, boolean paramBoolean)
  {
    int i = this.c.a();
    if (i < 1)
    {
      if ((paramBoolean) && ((this.b instanceof zbdn))) {
        ((zbdn)this.b).a(true);
      }
      return;
    }
    Object localObject1 = null;
    Object localObject2 = null;
    int j = this.e.isDefaultRowHidden() ? 0 : this.e.n();
    zaiv localzaiv = this.c.a(-1, -1, true);
    int k = (i >> 1) + 1;
    localObject1 = new int[k];
    localObject2 = new int[localObject1.length];
    k--;
    int m;
    int n;
    while (k > -1)
    {
      m = localzaiv.a();
      if (m < 0) {
        break;
      }
      i--;
      n = Row.b(this.c, m);
      if (n != j)
      {
        localObject1[k] = this.c.a(m);
        localObject2[k] = n;
        k--;
      }
    }
    int[] arrayOfInt2;
    if (i > 0)
    {
      if (localObject1[(localObject1.length - 1)] < (localObject1.length << 1) + localObject1.length)
      {
        switch (paramInt)
        {
        case 0: 
          double d1 = zbxp.a();
          double d5 = d1 / 1440.0D;
          int i3 = (int)(j * d5);
          int[] arrayOfInt4 = new int[localObject1[(localObject1.length - 1)] + 1];
          zc.a(arrayOfInt4, 0, arrayOfInt4.length, i3);
          for (k = 0; k < localObject1.length; k++) {
            arrayOfInt4[localObject1[k]] = ((int)(localObject2[k] * d5));
          }
          for (;;)
          {
            m = localzaiv.a();
            if (m < 0) {
              break;
            }
            arrayOfInt4[this.c.a(m)] = ((int)(Row.b(this.c, m) * d5));
          }
          this.b = new zbdp(new zbdq(d5), new zbdu(i3, arrayOfInt4));
          return;
        case 1: 
          int[] arrayOfInt1 = new int[localObject1[(localObject1.length - 1)] + 1];
          int i1;
          Object localObject3;
          if ((paramBoolean) && (zbds.g(j)))
          {
            i1 = 1;
            localObject3 = new zbds(1.0D);
            j = ((zajd)localObject3).a(j);
          }
          else
          {
            i1 = 0;
            localObject3 = new zbdr(1.0D);
          }
          zc.a(arrayOfInt1, 0, arrayOfInt1.length, j);
          for (k = localObject1.length - 1; k > -1; k--) {
            if (paramBoolean)
            {
              if (i1 != 0)
              {
                arrayOfInt1[localObject1[k]] = ((zajd)localObject3).a(localObject2[k]);
              }
              else
              {
                n = localObject2[k];
                if (zbds.g(n))
                {
                  i1 = 1;
                  localObject3 = new zbds(1.0D);
                  j = ((zajd)localObject3).a(j);
                  i = localObject1[k];
                  zc.a(arrayOfInt1, 0, i, j);
                  arrayOfInt1[i] = ((zajd)localObject3).a(n);
                  i++;
                  while (i < arrayOfInt1.length)
                  {
                    arrayOfInt1[i] = ((zajd)localObject3).a(arrayOfInt1[i]);
                    i++;
                  }
                }
                arrayOfInt1[localObject1[k]] = n;
              }
            }
            else {
              arrayOfInt1[localObject1[k]] = localObject2[k];
            }
          }
          localObject1 = null;
          localObject2 = null;
          for (;;)
          {
            m = localzaiv.a();
            if (m < 0) {
              break;
            }
            if (paramBoolean)
            {
              if (i1 != 0)
              {
                arrayOfInt1[this.c.a(m)] = ((zajd)localObject3).a(Row.b(this.c, m));
              }
              else
              {
                n = Row.b(this.c, m);
                if (zbds.g(n))
                {
                  i1 = 1;
                  localObject3 = new zbds(1.0D);
                  j = ((zajd)localObject3).a(j);
                  i = this.c.a(m);
                  zc.a(arrayOfInt1, 0, i, j);
                  arrayOfInt1[i] = ((zajd)localObject3).a(n);
                  i++;
                  while (i < arrayOfInt1.length)
                  {
                    arrayOfInt1[i] = ((zajd)localObject3).a(arrayOfInt1[i]);
                    i++;
                  }
                }
                arrayOfInt1[this.c.a(m)] = n;
              }
            }
            else {
              arrayOfInt1[this.c.a(m)] = Row.b(this.c, m);
            }
          }
          ((zajd)localObject3).a(zbxp.a() / 1440.0D);
          this.b = new zbdp((zajd)localObject3, new zbdu(j, arrayOfInt1));
          return;
        }
        double d2 = zbxp.a() / 1440.0D;
        i2 = (int)(j * d2);
        localObject4 = new int[localObject1[(localObject1.length - 1)] + 1];
        int[] arrayOfInt3 = new int[localObject4.length];
        zc.a(arrayOfInt3, 0, arrayOfInt3.length, i2);
        int i5;
        Object localObject6;
        if ((paramBoolean) && (zbds.g(j)))
        {
          i5 = 1;
          localObject6 = new zbds(d2);
          j = ((zajd)localObject6).a(j);
        }
        else
        {
          i5 = 0;
          localObject6 = new zbdr(d2);
        }
        zc.a((int[])localObject4, 0, localObject4.length, j);
        for (k = localObject1.length - 1; k > -1; k--)
        {
          n = localObject2[k];
          i = localObject1[k];
          arrayOfInt3[i] = ((int)(n * d2));
          if (paramBoolean)
          {
            if (i5 != 0)
            {
              localObject4[i] = ((zajd)localObject6).a(n);
            }
            else
            {
              if (zbds.g(n))
              {
                i5 = 1;
                localObject6 = new zbds(d2);
                j = ((zajd)localObject6).a(j);
                zc.a((int[])localObject4, 0, i, j);
                localObject4[i] = ((zajd)localObject6).a(n);
                i++;
                while (i < localObject4.length)
                {
                  localObject4[i] = ((zajd)localObject6).a(localObject4[i]);
                  i++;
                }
              }
              localObject4[i] = n;
            }
          }
          else {
            localObject4[i] = n;
          }
        }
        for (;;)
        {
          m = localzaiv.a();
          if (m < 0) {
            break;
          }
          i = this.c.a(m);
          n = Row.b(this.c, m);
          arrayOfInt3[i] = ((int)(n * d2));
          if (paramBoolean)
          {
            if (i5 != 0)
            {
              localObject4[i] = ((zajd)localObject6).a(n);
            }
            else if (zbds.g(n))
            {
              i5 = 1;
              localObject6 = new zbds(d2);
              j = ((zajd)localObject6).a(j);
              zc.a((int[])localObject4, 0, i, j);
              localObject4[i] = ((zajd)localObject6).a(n);
              i++;
              while (i < localObject4.length)
              {
                localObject4[i] = ((zajd)localObject6).a(localObject4[i]);
                i++;
              }
            }
            else
            {
              localObject4[i] = n;
            }
          }
          else {
            localObject4[i] = n;
          }
        }
        this.b = new zbdo((zajd)localObject6, new zbdu(j, (int[])localObject4), new zbdq(d2), new zbdu(i2, arrayOfInt3));
        return;
      }
      for (;;)
      {
        m = localzaiv.a();
        if (m < 0) {
          break;
        }
        n = Row.b(this.c, m);
        if (n != j)
        {
          if (k < 0)
          {
            arrayOfInt2 = new int[localObject1.length + i];
            System.arraycopy(localObject1, 0, arrayOfInt2, i, localObject1.length);
            localObject1 = arrayOfInt2;
            arrayOfInt2 = new int[localObject1.length];
            System.arraycopy(localObject2, 0, arrayOfInt2, i, localObject2.length);
            localObject2 = arrayOfInt2;
            k = i - 1;
          }
          localObject1[k] = this.c.a(m);
          localObject2[k] = n;
          k--;
        }
        i--;
      }
    }
    if (k > -1)
    {
      k++;
      if (localObject1.length == k)
      {
        localObject1 = null;
        localObject2 = null;
      }
      else
      {
        arrayOfInt2 = new int[localObject1.length - k];
        System.arraycopy(localObject1, k, arrayOfInt2, 0, arrayOfInt2.length);
        localObject1 = arrayOfInt2;
        arrayOfInt2 = new int[localObject1.length];
        System.arraycopy(localObject2, k, arrayOfInt2, 0, arrayOfInt2.length);
        localObject2 = arrayOfInt2;
      }
    }
    switch (paramInt)
    {
    case 0: 
      double d3 = zbxp.a() / 1440.0D;
      if (localObject1 == null)
      {
        this.b = new zbdp(new zbdq(d3), new zbdt((int)(j * d3)));
        return;
      }
      for (k = 0; k < localObject2.length; k++) {
        localObject2[k] = ((int)(localObject2[k] * d3));
      }
      this.b = new zbdp(new zbdq(d3), new zbdv((int)(j * d3), (int[])localObject1, (int[])localObject2));
      return;
    case 1: 
      if (paramBoolean)
      {
        boolean bool = zbds.g(j);
        if ((!bool) && (localObject2 != null)) {
          for (i = 0; i < localObject2.length; i++) {
            if (zbds.g(localObject2[i]))
            {
              bool = true;
              break;
            }
          }
        }
        if (bool)
        {
          zbds localzbds = new zbds(zbxp.a() / 1440.0D);
          j = localzbds.a(j);
          if (localObject1 == null)
          {
            this.b = new zbdp(localzbds, new zbdt(j));
            return;
          }
          for (i = 0; i < localObject2.length; i++) {
            localObject2[i] = localzbds.a(localObject2[i]);
          }
          this.b = new zbdp(localzbds, new zbdv(j, (int[])localObject1, (int[])localObject2));
          return;
        }
      }
      if (localObject1 == null)
      {
        this.b = new zbdp(new zbdr(zbxp.a() / 1440.0D), new zbdt(j));
        return;
      }
      this.b = new zbdp(new zbdr(zbxp.a() / 1440.0D), new zbdv(j, (int[])localObject1, (int[])localObject2));
      return;
    }
    double d4 = zbxp.a() / 1440.0D;
    int i2 = (int)(j * d4);
    if (localObject1 == null)
    {
      if ((paramBoolean) && (zbds.g(j)))
      {
        localObject4 = new zbds(d4);
        j = ((zajd)localObject4).a(j);
        this.b = new zbdo((zajd)localObject4, new zbdt(j), new zbdq(d4), new zbdt(i2));
      }
      else
      {
        this.b = new zbdo(new zbdr(d4), new zbdt(j), new zbdq(d4), new zbdt(i2));
      }
      return;
    }
    Object localObject4 = new int[localObject2.length];
    if (paramBoolean)
    {
      int i4;
      Object localObject5;
      if (zbds.g(j))
      {
        i4 = 1;
        localObject5 = new zbds(d4);
        j = ((zajd)localObject5).a(j);
      }
      else
      {
        i4 = 0;
        localObject5 = new zbdr(d4);
      }
      for (i = 0; i < localObject2.length; i++)
      {
        n = localObject2[i];
        if (i4 != 0)
        {
          localObject2[i] = ((zajd)localObject5).a(n);
          localObject4[i] = ((int)(n * d4));
        }
        else
        {
          if (zbds.g(n))
          {
            i4 = 1;
            localObject5 = new zbds(d4);
            j = ((zajd)localObject5).a(j);
            localObject2[i] = ((zajd)localObject5).a(n);
            for (k = 0; k < i; k++) {
              localObject2[k] = ((zajd)localObject5).a(localObject2[k]);
            }
          }
          localObject4[i] = ((int)(n * d4));
        }
      }
      this.b = new zbdo((zajd)localObject5, new zbdv(j, (int[])localObject1, (int[])localObject2), new zbdq(d4), new zbdv(i2, (int[])localObject1, (int[])localObject4));
      return;
    }
    for (i = 0; i < localObject2.length; i++) {
      localObject4[i] = ((int)(localObject2[i] * d4));
    }
    this.b = new zbdo(new zbdr(d4), new zbdv(j, (int[])localObject1, (int[])localObject2), new zbdq(d4), new zbdv(i2, (int[])localObject1, (int[])localObject4));
  }
  
  void a()
  {
    this.a = new zhs(this.e, this);
  }
  
  void b()
  {
    this.b = new zbdn(this.e, this);
  }
  
  void a(double paramDouble, boolean paramBoolean)
  {
    zaiv localzaiv = this.c.b();
    int i = localzaiv.a();
    int j = (int)paramDouble;
    while (i > -1)
    {
      zt localzt = this.c.f(i);
      localzt.m(j);
      Row.b(localzt, paramBoolean);
      i = localzaiv.a();
    }
  }
  
  public int getCount()
  {
    return this.c.a();
  }
  
  public Iterator iterator()
  {
    return this.a.a(-1, -1, false);
  }
  
  public Row getRowByIndex(int index)
  {
    if (index >= getCount()) {
      return null;
    }
    return new Row(this.e, this, this.c.f(this.c.c(index)), true);
  }
  
  public Row get(int rowIndex)
  {
    if (rowIndex < 0) {
      throw new IllegalArgumentException("Row index cannot be negative");
    }
    return a(rowIndex, false, true, true);
  }
  
  Row a(int paramInt1, int paramInt2)
  {
    zbdx localzbdx = new zbdx();
    localzbdx.a(paramInt1, this.e);
    return new Row(this.e, this, this.c.f(this.c.a(-1, localzbdx, paramInt2)), false);
  }
  
  Row a(Row paramRow)
  {
    return new Row(this.e, this, this.c.f(this.c.a(-1, paramRow.c, false)), false);
  }
  
  Row c(int paramInt)
  {
    return getRowByIndex(paramInt);
  }
  
  Row b(int paramInt, boolean paramBoolean)
  {
    return this.d.a(paramInt, paramBoolean);
  }
  
  Row a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    zbdx localzbdx = new zbdx();
    localzbdx.a(paramInt1, this.e);
    paramInt2 = this.c.a(paramInt2, localzbdx, -1);
    zt localzt = this.c.f(paramInt2);
    if (paramBoolean) {
      this.e.m();
    }
    this.d.a();
    return new Row(this.e, this, localzt, true);
  }
  
  Row a(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    return this.d.a(paramInt, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  int d(int paramInt)
  {
    int i = this.c.b(paramInt);
    if (i < 0) {
      return -1;
    }
    return this.c.d(i);
  }
  
  int e(int paramInt)
  {
    return this.d.c(paramInt);
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    zaiv localzaiv = this.c.b(paramInt1, paramInt3, false);
    if (localzaiv == null) {
      return;
    }
    this.e.g().d().b();
    for (;;)
    {
      int i = localzaiv.a();
      if (i < 0) {
        break;
      }
      zt localzt = this.c.f(i);
      zhw.a(this.e, localzt, paramInt2, paramInt4);
      localzaiv.a(localzt.i(), i);
    }
    this.e.m();
  }
  
  public void clear()
  {
    zaiv localzaiv1 = this.c.b(-1, -1, false);
    if (localzaiv1 == null) {
      return;
    }
    this.e.a.b();
    zajl localzajl = this.e.p().g;
    if (localzajl.c() > 0) {
      for (;;)
      {
        int i = localzaiv1.a();
        if (i < 0) {
          break;
        }
        zt localzt = this.c.f(i);
        zaiv localzaiv2 = localzt.a(-1, -1, false);
        if (localzaiv2 != null)
        {
          for (;;)
          {
            i = localzaiv2.a();
            if (i >= 0) {
              if (localzt.h(i) == 4)
              {
                localzajl.b(localzt.j(i));
                if (localzajl.c() < 1) {
                  break;
                }
              }
            }
          }
          if (localzajl.c() < 1) {
            break;
          }
        }
      }
    }
    this.c.e(-1);
    this.d.a();
    this.e.m();
  }
  
  void a(Cell paramCell, Row paramRow)
  {
    if (paramRow.k())
    {
      paramCell.b(paramRow.e());
      return;
    }
    ColumnCollection localColumnCollection = this.e.getColumns();
    int i = paramCell.getColumn();
    int j = localColumnCollection.e(i);
    if (j > -1)
    {
      Column localColumn = localColumnCollection.getColumnByIndex(j);
      if (localColumn.e()) {
        paramCell.b(localColumn.c());
      }
    }
    else
    {
      paramCell.b(localColumnCollection.a(paramCell.getColumn()));
    }
  }
  
  Cell a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    Row localRow = a(paramInt1, paramBoolean1, paramBoolean3, true);
    if (localRow == null) {
      return null;
    }
    return localRow.a(this, paramInt2, paramBoolean1, paramBoolean2, paramBoolean3);
  }
  
  public void removeAt(int index)
  {
    int i = this.c.c(index);
    int j = this.c.f(i).a();
    this.c.c(i, 1);
    this.e.m();
    this.d.a();
  }
  
  int c()
  {
    if (this.c.a() < 1) {
      return 0;
    }
    return this.c.a(this.c.a(-1, true));
  }
  
  int b(int paramInt1, int paramInt2)
  {
    int i = this.c.b(paramInt1);
    if (i < 0)
    {
      int j = this.c.a(paramInt2, i);
      if (i == j) {
        return -1;
      }
      i = -i - 1;
      if (j < 0)
      {
        j = this.c.a(-j - 1, true);
        if (j < i) {
          return -1;
        }
      }
    }
    return this.c.d(i);
  }
  
  boolean a(int paramInt, int[] paramArrayOfInt)
  {
    paramArrayOfInt[0] = this.c.b(paramInt);
    if (paramArrayOfInt[0] < 0)
    {
      paramArrayOfInt[0] = this.c.d(-paramArrayOfInt[0] - 1);
      return false;
    }
    paramArrayOfInt[0] = this.c.d(paramArrayOfInt[0]);
    return true;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, RowCollection paramRowCollection)
  {
    int i;
    if (paramInt1 == -1)
    {
      i = this.c.b(paramRowCollection.getRowByIndex(0).getIndex());
      if (i > -1)
      {
        int j = this.c.b(paramRowCollection.getRowByIndex(paramRowCollection.getCount() - 1).getIndex());
        if (j < 0) {
          j = this.c.a(-j - 1, true);
        }
        this.c.d(i, j);
      }
      else
      {
        i = -i - 1;
      }
      this.c.a(i, paramRowCollection.c, -1, paramRowCollection.getCount(), false);
    }
    else
    {
      if (paramInt1 < this.c.a())
      {
        i = this.c.c(paramInt1);
        this.c.d(i, this.c.c(paramInt2));
      }
      else
      {
        i = -1;
      }
      this.c.a(i, paramRowCollection.c, paramRowCollection.c.c(0), paramRowCollection.getCount(), false);
    }
    this.d.a();
  }
  
  void a(int paramInt1, int paramInt2, zamh paramzamh)
  {
    if (this.c.a() < 1) {
      return;
    }
    this.e.m();
    this.d.a();
    a(1048575 - paramInt2 + 1, -1, -1);
    if (this.c.a() < 1) {
      return;
    }
    this.e.b(-1, -1);
    if (this.e.a.c > 0)
    {
      a(CellArea.createCellArea(paramInt1, 0, 1048575, 16383));
      zaai[] arrayOfzaai = this.e.a.b;
      for (int j = this.e.a.d - 1; j > -1; j--) {
        if (arrayOfzaai[j] != null) {
          arrayOfzaai[j].a(paramInt1, paramInt2, this.e.g(), true);
        }
      }
    }
    this.c.i(paramInt1, paramInt2);
    int i = paramInt1 - 1;
    if ((paramzamh != null) && (paramzamh.d)) {
      i = paramInt1 + paramInt2;
    }
    if ((paramzamh.a) && (getCount() != 0) && (paramInt1 > 0))
    {
      Row localRow1 = a(i, true, false, false);
      if ((localRow1 != null) && (!localRow1.d())) {
        for (int k = 0; k < paramInt2; k++)
        {
          Row localRow2 = a(paramInt1 + k, false, false, false);
          localRow2.a(localRow1);
        }
      }
    }
    if ((paramzamh.b) || (paramzamh.c)) {
      a(i, paramInt1, paramInt2, paramzamh);
    }
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, zamh paramzamh)
  {
    if (paramInt2 < 0) {
      return;
    }
    HashMap localHashMap = new HashMap();
    Row localRow = a(paramInt1, true, false, false);
    Iterator localIterator;
    if (localRow != null)
    {
      i = localRow.e();
      Cell localCell;
      if (paramzamh.b)
      {
        localIterator = localRow.iterator();
        while (localIterator.hasNext())
        {
          localCell = (Cell)localIterator.next();
          if (!Cell.a(this.e, localCell.c, i)) {
            localHashMap.put(Integer.valueOf(localCell.getColumn()), localCell);
          }
        }
      }
      else
      {
        localIterator = localRow.iterator();
        while (localIterator.hasNext())
        {
          localCell = (Cell)localIterator.next();
          if (localCell.s() > -1) {
            localHashMap.put(Integer.valueOf(localCell.getColumn()), Integer.valueOf(localCell.r()));
          }
        }
      }
    }
    if (localHashMap.size() == 0) {
      return;
    }
    for (int i = 0; i < paramInt3; i++)
    {
      localRow = a(paramInt2 + i, false, false, false);
      int j;
      if (paramzamh.b)
      {
        localIterator = localHashMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          j = ((Integer)localIterator.next()).intValue();
          localRow.c(j).copy((Cell)localHashMap.get(Integer.valueOf(j)));
        }
      }
      else
      {
        localIterator = localHashMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          j = ((Integer)localIterator.next()).intValue();
          localRow.c(j).b(((Integer)localHashMap.get(Integer.valueOf(j))).intValue());
        }
      }
    }
  }
  
  void c(int paramInt1, int paramInt2)
  {
    if (this.c.a() < 1) {
      return;
    }
    this.e.m();
    this.d.a();
    int i = paramInt1 + paramInt2 - 1;
    if (this.e.a.c > 0) {
      a(CellArea.createCellArea(0, paramInt1, 1048575, i), CellArea.createCellArea(0, paramInt1 + paramInt2, 1048575, 16383));
    }
    zaiv localzaiv1 = this.c.b();
    for (;;)
    {
      int j = localzaiv1.a();
      if (j < 0) {
        break;
      }
      zt localzt = this.c.f(j);
      if (localzt.a() > 0)
      {
        zhw.a(this.e, localzt, paramInt1, i);
        if (localzt.a() > 0)
        {
          if (this.e.a.c > 0)
          {
            zaiv localzaiv2 = localzt.b();
            for (;;)
            {
              j = localzaiv2.a();
              if (j < 0) {
                break;
              }
              Cell.a(localzt, j, paramInt1, -paramInt2, this.e.g(), true);
            }
          }
          j = localzt.b(i + 1);
          if (j < 0) {
            j = -j - 1;
          }
          localzt.f(j, -paramInt2);
        }
      }
    }
  }
  
  void d(int paramInt1, int paramInt2)
  {
    if (this.c.a() < 1) {
      return;
    }
    this.e.m();
    this.d.a();
    if (this.e.a.c > 0) {
      a(CellArea.createCellArea(paramInt1, 0, paramInt1 + paramInt2 - 1, 16383), CellArea.createCellArea(paramInt1 + paramInt2, 0, 1048575, 16383));
    }
    zhw.a(this.e, this.c, paramInt1, paramInt1 + paramInt2 - 1);
    if (this.e.a.c > 0)
    {
      zaai[] arrayOfzaai = this.e.a.b;
      for (int j = this.e.a.d - 1; j > -1; j--) {
        if (arrayOfzaai[j] != null) {
          arrayOfzaai[j].a(paramInt1, -paramInt2, this.e.g(), true);
        }
      }
    }
    int i = this.c.b(paramInt1);
    if (i < 0) {
      i = -i - 1;
    }
    this.c.f(i, -paramInt2);
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    zaiv localzaiv1 = this.c.b(paramInt1, -1, false);
    if (localzaiv1 == null) {
      return;
    }
    int i = localzaiv1.a();
    if (i < 0) {
      return;
    }
    int j = i;
    int k = paramInt2 > -1 ? 1 : 0;
    for (;;)
    {
      zt localzt = this.c.f(i);
      if (localzt.a() > 0)
      {
        zaiv localzaiv2 = k != 0 ? localzt.b(paramInt2, paramInt3, false) : localzt.b();
        if (localzaiv2 != null)
        {
          do
          {
            i = localzaiv2.a();
            if (i < 0) {
              break;
            }
          } while (localzt.h(i) == 0);
          throw new CellsException(7, "Aspose.Cells cannot shift nonblank cell off the worksheet.");
        }
        zhw.a(this.e, localzt, paramInt2, paramInt3);
      }
      i = localzaiv1.a();
      if (i < 0) {
        break;
      }
    }
    this.c.d(j, -1);
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3)
  {
    zaiv localzaiv1 = this.c.b(paramInt2, paramInt3, false);
    if (localzaiv1 == null) {
      return;
    }
    for (;;)
    {
      int i = localzaiv1.a();
      if (i < 0) {
        break;
      }
      zt localzt = this.c.f(i);
      if (localzt.a() > 0)
      {
        zaiv localzaiv2 = localzt.b(paramInt1, -1, false);
        if (localzaiv2 != null)
        {
          do
          {
            i = localzaiv2.a();
            if (i < 0) {
              break;
            }
          } while (localzt.h(i) == 0);
          throw new CellsException(7, "Aspose.Cells cannot shift nonblank cell off the worksheet.");
          zhw.a(this.e, localzt, paramInt1, -1);
        }
      }
    }
  }
  
  private void a(CellArea paramCellArea)
  {
    zaai[] arrayOfzaai = this.e.a.b;
    for (int i = this.e.a.d - 1; i > -1; i--) {
      if (arrayOfzaai[i] != null)
      {
        zaai localzaai = arrayOfzaai[i];
        CellArea localCellArea;
        Cell localCell;
        if (localzaai.l())
        {
          localCellArea = localzaai.a().a();
          switch (paramCellArea.c(localCellArea))
          {
          case 2: 
          case 3: 
            localCell = a(localzaai.e, localzaai.f, true, true, true);
            if (localCell == null) {
              this.e.a.b(i);
            } else {
              localCell.J();
            }
            break;
          }
        }
        else if (localzaai.k())
        {
          localCellArea = localzaai.a().a();
          switch (paramCellArea.c(localCellArea))
          {
          case 2: 
          case 3: 
            localCell = a(localzaai.e, localzaai.f, true, true, true);
            if (localCell == null) {
              this.e.a.b(i);
            } else {
              throw new CellsException(7, "You can not change part of an array.");
            }
            break;
          }
        }
      }
    }
  }
  
  private void a(CellArea paramCellArea1, CellArea paramCellArea2)
  {
    zaai[] arrayOfzaai = this.e.a.b;
    for (int i = this.e.a.d - 1; i > -1; i--) {
      if (arrayOfzaai[i] != null)
      {
        zaai localzaai = arrayOfzaai[i];
        Object localObject;
        if (localzaai.l())
        {
          localObject = a(localzaai.e, localzaai.f, true, true, true);
          if (localObject == null) {
            this.e.a.b(i);
          } else {
            ((Cell)localObject).J();
          }
        }
        else if (localzaai.k())
        {
          localObject = localzaai.a().a();
          switch (paramCellArea2.c((CellArea)localObject))
          {
          case 2: 
          case 3: 
            throw new CellsException(7, "You can not change part of an array.");
          }
          switch (paramCellArea1.c((CellArea)localObject))
          {
          case 2: 
          case 3: 
            throw new CellsException(7, "You can not change part of an array.");
          }
        }
      }
    }
  }
  
  void a(RowCollection paramRowCollection, CopyOptions paramCopyOptions)
  {
    zv localzv = paramRowCollection.c;
    if (localzv.a() > 0)
    {
      zaiv localzaiv1 = localzv.a(-1, -1, false);
      Cells localCells = paramRowCollection.e;
      int i;
      Row localRow1;
      int j;
      Row localRow2;
      do
      {
        i = localzaiv1.a();
        if (i < 0) {
          break;
        }
        localRow1 = new Row(localCells, this, localzv.f(i), false);
        j = localRow1.a();
        localRow2 = a(localRow1.getIndex(), j);
        localRow2.a(localRow1, paramCopyOptions);
      } while (j <= 0);
      zaiv localzaiv2 = localRow1.c.a(-1, -1, false);
      for (;;)
      {
        i = localzaiv2.a();
        if (i < 0) {
          break;
        }
        Cell localCell1 = new Cell(localRow1, i);
        Cell localCell2 = localRow2.b(localCell1.getColumn());
        localCell2.e(localCell1, paramCopyOptions);
      }
    }
    this.e.m();
    this.d.a();
  }
  
  void a(RowCollection paramRowCollection, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions)
  {
    this.e.m();
    this.d.a();
    this.e.b(paramInt2, paramInt2 + paramInt3 - 1);
    Cells localCells = paramRowCollection.e;
    Object localObject1;
    Object localObject2;
    Cell localCell2;
    if (paramRowCollection != this) {
      for (i = 0; i < localCells.getColumns().getCount(); i++)
      {
        localObject1 = localCells.getColumns().getColumnByIndex(i);
        if (((Column)localObject1).e())
        {
          localObject2 = this.e.getColumns().c(((Column)localObject1).getIndex());
          if (!((Column)localObject1).c((Column)localObject2)) {
            for (int j = 0; j < paramInt3; j++) {
              localCell2 = localCells.a(paramInt1 + j, ((Column)localObject1).getIndex(), false);
            }
          }
        }
      }
    }
    int i = (paramRowCollection == this) && (paramInt1 < paramInt2) && (paramInt1 + paramInt3 > paramInt2) ? 1 : 0;
    int m;
    int k;
    Cell localCell1;
    if (i != 0)
    {
      for (m = paramInt3 - 1; m >= 0; m--)
      {
        localObject1 = paramRowCollection.a(paramInt1 + m, true, true, false);
        if (localObject1 != null)
        {
          k = e(m + paramInt2);
          if (k < 0)
          {
            localObject2 = a(m + paramInt2, -k - 1, true);
            ((Row)localObject1).b();
          }
          else
          {
            localObject2 = b(k, false);
          }
          ((Row)localObject2).a((Row)localObject1);
          ((Row)localObject1).b();
          for (int n = 0; n < ((Row)localObject1).a(); n++)
          {
            localCell1 = ((Row)localObject1).getCellByIndex(n);
            k = ((Row)localObject2).c.b(localCell1.getColumn());
            if (k < 0)
            {
              localCell2 = ((Row)localObject2).a(this, localCell1.getColumn(), -k - 1, false, true);
              localCell1.a();
            }
            else
            {
              localCell2 = ((Row)localObject2).a(k);
            }
            localCell2.a(localCell1, paramInt3, paramCopyOptions);
          }
        }
        else
        {
          localObject2 = a(paramInt2 + m, true, true, false);
          if (localObject2 != null)
          {
            ((Row)localObject2).c(false);
            ((Row)localObject2).c();
          }
        }
      }
    }
    else
    {
      i = paramRowCollection == this ? 1 : 0;
      for (m = 0; m < paramInt3; m++)
      {
        localObject1 = paramRowCollection.a(paramInt1 + m, true, true, false);
        if (localObject1 != null)
        {
          k = e(m + paramInt2);
          if (k < 0)
          {
            localObject2 = a(m + paramInt2, -k - 1, true);
            if (i != 0) {
              ((Row)localObject1).b();
            }
          }
          else
          {
            localObject2 = b(k, false);
          }
          ((Row)localObject2).a(0, ((Row)localObject2).a());
          ((Row)localObject2).a((Row)localObject1);
          if (i != 0) {
            ((Row)localObject1).b();
          }
          zaiv localzaiv = ((Row)localObject1).c.b();
          for (int i1 = localzaiv.a(); i1 > -1; i1 = localzaiv.a())
          {
            localCell1 = new Cell((Row)localObject1, i1);
            k = ((Row)localObject2).c.b(localCell1.getColumn());
            if (k < 0)
            {
              localCell2 = ((Row)localObject2).a(this, localCell1.getColumn(), -k - 1, false, true);
              if (i != 0) {
                localCell1.a();
              }
            }
            else
            {
              localCell2 = ((Row)localObject2).a(k);
            }
            localCell2.a(localCell1, paramInt3, paramCopyOptions);
            if (i != 0)
            {
              ((Row)localObject1).b();
              localzaiv.a(localCell1.getColumn(), i1);
            }
          }
        }
        else
        {
          localObject2 = a(paramInt2 + m, true, true, false);
          if (localObject2 != null)
          {
            ((Row)localObject2).c(false);
            ((Row)localObject2).c();
          }
        }
      }
    }
  }
  
  void b(RowCollection paramRowCollection, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions)
  {
    this.e.m();
    this.d.a();
    zaiv localzaiv1 = this.c.b();
    int i = paramInt2 + paramInt3 - 1;
    int j;
    for (;;)
    {
      j = localzaiv1.a();
      if (j < 0) {
        break;
      }
      zt localzt = this.c.f(j);
      zhw.a(this.e, localzt, paramInt2, i);
    }
    if (paramRowCollection.getCount() < 1) {
      return;
    }
    int m = this == paramRowCollection ? 1 : 0;
    int n = (m != 0) || (this.e.p() == paramRowCollection.e.p()) ? 1 : 0;
    zaiv localzaiv2 = paramRowCollection.c.a(-1, -1, false);
    for (;;)
    {
      j = localzaiv2.a();
      if (j < 0) {
        break;
      }
      Row localRow1 = paramRowCollection.b(j, false);
      Row localRow2;
      if (m != 0) {
        localRow2 = localRow1;
      } else {
        localRow2 = null;
      }
      int i1;
      Cell localCell1;
      Cell localCell2;
      if (localRow1.k())
      {
        for (i1 = 0; i1 < paramInt3; i1++)
        {
          localCell1 = localRow1.getCellOrNull(paramInt1 + i1);
          if (localCell1 != null)
          {
            if (localRow2 == null) {
              localRow2 = a(localRow1.getIndex(), false, true, false);
            }
            j = localRow2.c.b(paramInt2 + i1);
            if (j < 0)
            {
              localCell2 = localRow2.a(this, paramInt2 + i1, -j - 1, false, true);
              if (m != 0) {
                localCell1.a();
              }
            }
            else
            {
              localCell2 = localRow2.a(j);
            }
            localCell2.a(localCell1, paramCopyOptions);
          }
          else if (localRow1.k())
          {
            if (localRow2 == null) {
              localRow2 = a(localRow1.getIndex(), false, true, false);
            }
            localCell2 = localRow2.a(this, paramInt2 + i1, false, false, true);
            if (n != 0)
            {
              localCell2.b(localRow1.e());
              if (m != 0) {
                localRow1.b();
              }
            }
            else
            {
              localCell2.a(localRow1.getStyle());
            }
          }
        }
      }
      else
      {
        int k = localRow1.a();
        for (i1 = 0; i1 < k; i1++)
        {
          localCell1 = localRow1.getCellByIndex(i1);
          if (localCell1.getColumn() >= paramInt1)
          {
            if (localCell1.getColumn() >= paramInt1 + paramInt3) {
              break;
            }
            if (localRow2 == null) {
              localRow2 = a(localRow1.getIndex(), false, true, false);
            }
            localCell2 = localRow2.a(this, paramInt2 + localCell1.getColumn() - paramInt1, false, false, true);
            localCell2.a(localCell1, paramCopyOptions);
            if (m != 0) {
              localRow1.b();
            }
          }
        }
      }
    }
  }
  
  void e(int paramInt1, int paramInt2)
  {
    if (this.c.a() < 1) {
      return;
    }
    this.e.m();
    this.d.a();
    b(16383 - paramInt2 + 1, -1, -1);
    if (this.c.a() < 1) {
      return;
    }
    if (this.e.a.c > 0)
    {
      a(CellArea.createCellArea(0, paramInt1, 1048575, 16383));
      localObject = this.e.a.b;
      for (int i = this.e.a.d - 1; i > -1; i--) {
        if (localObject[i] != null) {
          localObject[i].b(paramInt1, paramInt2, this.e.g(), true);
        }
      }
    }
    Object localObject = this.c.b();
    ((zaiv)localObject).b();
    for (;;)
    {
      int j = ((zaiv)localObject).a();
      if (j < 0) {
        break;
      }
      zt localzt = this.c.f(j);
      if (localzt.a() > 0) {
        localzt.i(paramInt1, paramInt2);
      }
    }
  }
  
  private void a(Row paramRow, CellArea paramCellArea, Column[] paramArrayOfColumn)
  {
    int i;
    Row localRow;
    if (paramRow == null) {
      for (i = paramCellArea.StartRow; i <= paramCellArea.EndRow; i++)
      {
        localRow = a(i, true, false, false);
        if ((localRow != null) && (localRow.k())) {
          for (int j = paramCellArea.StartColumn; j < paramCellArea.EndColumn; j++)
          {
            Cell localCell1 = localRow.a(j, false, true);
            Column localColumn1 = paramArrayOfColumn[(j - paramCellArea.StartColumn)];
            if (localColumn1 != null) {
              localCell1.b(localColumn1.c());
            } else {
              localCell1.b(15);
            }
          }
        }
      }
    } else {
      for (i = paramCellArea.StartRow; i <= paramCellArea.EndRow; i++)
      {
        localRow = a(i, true, false, false);
        if (paramRow.b(localRow))
        {
          zaiv localzaiv = paramRow.c.b();
          if (localzaiv != null) {
            for (;;)
            {
              int m = localzaiv.a();
              if (m < 0) {
                break;
              }
              int n = paramRow.c.a(m);
              if ((n >= paramCellArea.StartColumn) && (n <= paramCellArea.EndColumn))
              {
                int i1 = paramRow.c.g(m);
                if (i1 > -1)
                {
                  if (localRow == null) {
                    localRow = a(i, false, true, false);
                  }
                  Cell localCell4 = localRow.a(n, false, true);
                  localCell4.b(i1);
                }
              }
            }
          }
        }
        else
        {
          if (localRow == null) {
            localRow = a(i, false, true, false);
          }
          for (int k = paramCellArea.StartColumn; k <= paramCellArea.EndColumn; k++)
          {
            Cell localCell2 = localRow.a(k, false, true);
            Cell localCell3 = paramRow.a(k, true, false);
            if ((localCell3 == null) || (localCell3.s() == -1))
            {
              if (paramRow.k())
              {
                localCell2.b(paramRow.e());
              }
              else
              {
                Column localColumn2 = paramArrayOfColumn[(k - paramCellArea.StartColumn)];
                if (localColumn2 != null) {
                  localCell2.b(localColumn2.c());
                } else {
                  localCell2.b(15);
                }
              }
            }
            else {
              localCell2.b(localCell3.s());
            }
          }
        }
      }
    }
  }
  
  void a(CellArea paramCellArea, int paramInt1, int paramInt2, Worksheet paramWorksheet, boolean paramBoolean, CopyOptions paramCopyOptions)
  {
    if (this.c.a() < 1) {
      return;
    }
    int i = -1;
    this.e.m();
    this.d.a();
    ColumnCollection localColumnCollection = this.e.getColumns();
    Object localObject3;
    Object localObject1;
    int i4;
    Object localObject4;
    int i3;
    switch (paramInt2)
    {
    case 3: 
      if (this.e.a.c > 0) {
        if (this.c.a() < 1)
        {
          this.e.a.b();
        }
        else
        {
          this.e.g().d().a();
          a(CellArea.createCellArea(paramCellArea.StartRow, paramCellArea.StartColumn, paramCellArea.EndRow, 16383));
        }
      }
      this.e.b(-1, -1);
      Object localObject2;
      for (int j = 0; j < localColumnCollection.getCount(); j++)
      {
        localObject2 = localColumnCollection.getColumnByIndex(j);
        if (((Column)localObject2).getIndex() >= paramCellArea.StartColumn)
        {
          if ((((Column)localObject2).e()) && (paramCellArea.StartColumn + paramInt1 <= ((Column)localObject2).getIndex()))
          {
            int m = ((Column)localObject2).getIndex() - paramInt1;
            i = localColumnCollection.a(m, j - paramInt1 < 0 ? 0 : j - paramInt1, j - 1);
            if (i < 0) {
              a(paramCellArea, null, m);
            }
          }
          if (((Column)localObject2).getIndex() + paramInt1 <= 16383)
          {
            i = localColumnCollection.a(((Column)localObject2).getIndex() + paramInt1, j + 1, j + paramInt1 >= localColumnCollection.getCount() ? localColumnCollection.getCount() - 1 : j + paramInt1);
            localObject3 = null;
            if (i > -1) {
              localObject3 = localColumnCollection.getColumnByIndex(i);
            }
            if (!((Column)localObject2).c((Column)localObject3)) {
              a(paramCellArea, (Column)localObject2, ((Column)localObject2).getIndex());
            }
          }
        }
      }
      localObject1 = this.c.b();
      if (this.e.a.c > 0)
      {
        zaai[] arrayOfzaai = this.e.a.b;
        for (i4 = this.e.a.d - 1; i4 > -1; i4--) {
          if (arrayOfzaai[i4] != null)
          {
            zaai localzaai = arrayOfzaai[i4];
            if (localzaai.k())
            {
              localObject4 = localzaai.a().a();
              if ((paramCellArea.StartRow <= ((CellArea)localObject4).StartRow) && (paramCellArea.EndRow >= ((CellArea)localObject4).EndRow) && (paramCellArea.StartColumn <= ((CellArea)localObject4).StartColumn))
              {
                localObject4.StartColumn += paramInt1;
                localObject4.EndColumn += paramInt1;
                localzaai.a().a((CellArea)localObject4);
              }
            }
          }
        }
      }
      for (;;)
      {
        int i1 = ((zaiv)localObject1).a();
        if (i1 < 0) {
          break;
        }
        localObject3 = this.c.f(i1);
        if (((zt)localObject3).a() > 0)
        {
          i3 = -1;
          localObject2 = ((zt)localObject3).a(-1, -1, false);
          int n;
          for (;;)
          {
            n = ((zaiv)localObject2).a();
            if (n < 0) {
              break;
            }
            if ((Cell.b((zt)localObject3, n, paramCellArea, paramInt1, paramWorksheet, true)) && (i3 < 0)) {
              i3 = n;
            }
          }
          if (i3 > -1)
          {
            ((zt)localObject3).f(i3, paramInt1);
            ((zaiv)localObject1).a(((zt)localObject3).i(), i1);
          }
          else
          {
            i4 = ((zt)localObject3).i();
            if ((i4 >= paramCellArea.StartRow) && (i4 <= paramCellArea.EndRow))
            {
              n = ((zt)localObject3).b(paramCellArea.StartColumn);
              if (n < 0) {
                n = -n - 1;
              }
              ((zt)localObject3).f(n, paramInt1);
              ((zaiv)localObject1).a(((zt)localObject3).i(), i1);
            }
          }
          i4 = ((zt)localObject3).a(((zt)localObject3).a(-1, true));
          if (i4 > paramWorksheet.getCells().getMaxColumn()) {
            paramWorksheet.getCells().f(i4);
          }
        }
      }
    case 0: 
      if (this.e.a.c > 0) {
        if (this.c.a() < 1)
        {
          this.e.a.b();
        }
        else
        {
          this.e.g().d().a();
          a(CellArea.createCellArea(paramCellArea.StartRow, paramCellArea.StartColumn, 1048575, paramCellArea.EndColumn));
        }
      }
      this.e.b(-1, -1);
      localObject1 = new Column[paramCellArea.EndColumn - paramCellArea.StartColumn + 1];
      for (int k = paramCellArea.StartColumn; k <= paramCellArea.EndColumn; k++)
      {
        i = localColumnCollection.e(k);
        if (i > -1) {
          localObject1[(k - paramCellArea.StartColumn)] = localColumnCollection.getColumnByIndex(i);
        }
      }
      k = c();
      for (localObject3 = k; localObject3 >= 0; localObject3--)
      {
        Row localRow1 = a(localObject3, true, false, false);
        if (localObject3 < paramCellArea.StartRow)
        {
          if ((localRow1 != null) && (localRow1.a() > 0))
          {
            zaiv localzaiv1 = localRow1.c.b();
            for (;;)
            {
              i3 = localzaiv1.a();
              if (i3 < 0) {
                break;
              }
              Cell.a(localRow1.c, i3, paramCellArea, paramInt1, paramWorksheet, true);
            }
          }
          if (localObject3 + 1 == paramCellArea.StartRow) {
            a(localRow1, paramCellArea, (Column[])localObject1);
          }
        }
        else
        {
          int i2 = localObject3 + paramInt1;
          Row localRow2 = a(i2, true, true, false);
          if (localRow1 == null)
          {
            if ((localRow2 != null) && (localRow2.k())) {
              for (i4 = paramCellArea.StartColumn; i4 < paramCellArea.EndColumn; i4++)
              {
                localObject4 = localRow2.a(i4, false, true);
                ((Cell)localObject4).b(15);
                ((Cell)localObject4).f();
              }
            }
          }
          else
          {
            i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i9;
            Cell localCell2;
            if (localRow1.b(localRow2))
            {
              zaiv localzaiv2 = localRow1.c.a(-1, -1, false);
              for (;;)
              {
                i9 = localzaiv2.a();
                if (i9 < 0) {
                  break;
                }
                int i10 = localRow1.c.a(i9);
                if ((i10 >= paramCellArea.StartColumn) && (i10 <= paramCellArea.EndColumn))
                {
                  if (i4 < 0)
                  {
                    i4 = i9;
                    i6 = i10;
                  }
                  if (localRow2 == null) {
                    localRow2 = a(i2, false, true, false);
                  }
                  i5 = i9;
                  i7 = i10;
                  localCell2 = new Cell(localRow1, i9);
                  localCell2.a(paramCellArea, paramInt1, paramWorksheet, true);
                  Cell localCell3 = localRow2.c(localCell2.getColumn());
                  localCell3.c(localCell2, paramCopyOptions);
                  localRow1.b();
                  localzaiv2.a(i10, i9);
                }
                else
                {
                  Cell.a(localRow1.c, i9, paramCellArea, paramInt1, paramWorksheet, true);
                }
              }
              if (i4 > -1)
              {
                i4 = localRow1.c.b(i6, i4);
                if (i4 < 0) {
                  i4 = -i4 - 1;
                }
                i5 = localRow1.c.b(i7, i5);
                if (i5 < 0) {
                  i5 = localRow1.c.a(-i5 - 1, true);
                }
                if (i5 >= i4) {
                  zhw.b(this.e, localRow1.c, i4, i5);
                }
              }
            }
            else
            {
              if (localRow2 == null) {
                localRow2 = a(i2, false, true, false);
              }
              int i8 = -1;
              for (i9 = paramCellArea.StartColumn; i9 <= paramCellArea.EndColumn; i9++)
              {
                i8 = localRow1.c.a(i9, i8);
                Cell localCell1;
                if (i8 < 0)
                {
                  if (localRow1.k())
                  {
                    if ((!localRow2.k()) || (!localRow1.b(localRow2)))
                    {
                      localCell1 = localRow2.c(i9);
                      localCell1.b(localRow1.e());
                    }
                  }
                  else if (localRow2.k())
                  {
                    localCell1 = localObject1[(i9 - paramCellArea.StartColumn)];
                    if ((localCell1 != null) && (localCell1.e()))
                    {
                      localCell2 = localRow2.c(i9);
                      localCell2.b(localCell1.c());
                    }
                  }
                }
                else
                {
                  if (i4 < 0)
                  {
                    i4 = i8;
                    i6 = i9;
                  }
                  i5 = i8;
                  i7 = i9;
                  localCell1 = new Cell(localRow1, i8);
                  localCell2 = localRow2.c(i9);
                  localCell1.a(paramCellArea, paramInt1, paramWorksheet, true);
                  localCell2.c(localCell1, paramCopyOptions);
                  localRow1.b();
                }
              }
              if (i4 > -1)
              {
                i4 = localRow1.c.b(i6, i4);
                if (i4 < 0) {
                  i4 = -i4 - 1;
                }
                i5 = localRow1.c.b(i7, i5);
                if (i5 < 0) {
                  i5 = localRow1.c.a(-i5 - 1, true);
                }
                if (i5 >= i4) {
                  zhw.b(this.e, localRow1.c, i4, i5);
                }
              }
              zaiv localzaiv3 = localRow1.c.b();
              for (;;)
              {
                i8 = localzaiv3.a();
                if (i8 < 0) {
                  break;
                }
                Cell.a(localRow1.c, i8, paramCellArea, paramInt1, paramWorksheet, true);
              }
            }
          }
        }
      }
      break;
    default: 
      throw new CellsException(6, "Invalid shift option.");
    }
  }
  
  int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Worksheet paramWorksheet, boolean paramBoolean)
  {
    this.e.m();
    this.d.a();
    int i = 0;
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = paramInt1;
    localCellArea.StartColumn = paramInt2;
    localCellArea.EndRow = paramInt3;
    localCellArea.EndColumn = paramInt4;
    int i4;
    Object localObject1;
    int i5;
    int i6;
    switch (paramInt5)
    {
    case 2: 
      if (this.e.a.c > 0) {
        if (this.c.a() < 1)
        {
          this.e.a.b();
        }
        else
        {
          this.e.g().d().a();
          a(CellArea.createCellArea(paramInt1, paramInt2, paramInt3, paramInt4), CellArea.createCellArea(paramInt1, paramInt2, paramInt3, paramInt4));
        }
      }
      this.e.clearContents(paramInt1, paramInt2, paramInt3, paramInt4);
      return i;
    case 1: 
      if (this.e.a.c > 0) {
        if (this.c.a() < 1)
        {
          this.e.a.b();
        }
        else
        {
          this.e.g().d().a();
          a(CellArea.createCellArea(paramInt1, paramInt2, paramInt3, paramInt4), CellArea.createCellArea(paramInt1, paramInt2, paramInt3, 16383));
        }
      }
      i = paramInt4 - paramInt2 + 1;
      ColumnCollection localColumnCollection = this.e.getColumns();
      Object localObject2;
      int i2;
      if (localColumnCollection.getCount() > 0) {
        for (int k = localColumnCollection.getCount() - 1; k >= 0; k--)
        {
          localObject2 = localColumnCollection.getColumnByIndex(k);
          if (((Column)localObject2).getIndex() < paramInt2) {
            break;
          }
          if (((Column)localObject2).e())
          {
            if (((Column)localObject2).getIndex() > paramInt4)
            {
              n = ((Column)localObject2).getIndex() - i;
              i2 = localColumnCollection.a(n, 0, k);
              if (i2 > -1)
              {
                Column localColumn1 = localColumnCollection.getColumnByIndex(i2);
                if (!((Column)localObject2).c(localColumn1)) {
                  a(localCellArea, (Column)localObject2, ((Column)localObject2).getIndex());
                }
              }
              else
              {
                a(localCellArea, (Column)localObject2, ((Column)localObject2).getIndex());
              }
            }
            int n = k + i < localColumnCollection.getCount() ? k + i : localColumnCollection.getCount() - 1;
            i2 = ((Column)localObject2).getIndex() + i;
            if (i2 <= 16383)
            {
              i4 = localColumnCollection.a(i2, k, n);
              if (i4 < 0)
              {
                a(localCellArea, null, i2);
              }
              else
              {
                Column localColumn2 = localColumnCollection.getColumnByIndex(i4);
                if (!localColumn2.e()) {
                  a(localCellArea, null, i2);
                }
              }
            }
          }
        }
      }
      if (this.c.a() > 0)
      {
        localObject1 = this.c.b();
        for (;;)
        {
          i4 = ((zaiv)localObject1).a();
          if (i4 < 0) {
            break;
          }
          zt localzt = this.c.f(i4);
          if (localzt.a() > 0)
          {
            i2 = localzt.i();
            i5 = (i2 >= paramInt1) && (i2 <= paramInt3) ? 1 : 0;
            i6 = 1;
            if (i5 != 0) {
              i6 = (zhw.a(this.e, localzt, paramInt2, paramInt4) < 1) || (localzt.a() > 0) ? 1 : 0;
            }
            if (i6 != 0)
            {
              localObject2 = localzt.b();
              for (;;)
              {
                i4 = ((zaiv)localObject2).a();
                if (i4 < 0) {
                  break;
                }
                Cell.c(localzt, i4, localCellArea, i, this.e.g(), true);
              }
            }
            if (i5 != 0) {
              localzt.i(paramInt4 + 1, -i);
            }
          }
        }
      }
      break;
    case 4: 
      if (this.e.a.c > 0) {
        if (this.c.a() < 1)
        {
          this.e.a.b();
        }
        else
        {
          this.e.g().d().a();
          a(CellArea.createCellArea(paramInt1, paramInt2, paramInt3, paramInt4), CellArea.createCellArea(paramInt1, paramInt2, 1048575, paramInt4));
        }
      }
      i = paramInt3 - paramInt1 + 1;
      int m;
      for (int j = getCount() - 1; j >= 0; j--)
      {
        localObject1 = getRowByIndex(j);
        if (((Row)localObject1).getIndex() <= paramInt1) {
          break;
        }
        if (((Row)localObject1).k())
        {
          Row localRow2;
          if (((Row)localObject1).getIndex() > paramInt3)
          {
            m = ((Row)localObject1).getIndex() - i;
            i1 = d(m);
            if (i1 != -1)
            {
              localRow2 = getRowByIndex(i1);
              if (!((Row)localObject1).b(localRow2)) {
                a(localCellArea, (Row)localObject1, ((Row)localObject1).getIndex());
              }
            }
            else
            {
              a(localCellArea, (Row)localObject1, ((Row)localObject1).getIndex());
            }
          }
          m = ((Row)localObject1).getIndex() + i;
          int i1 = d(m);
          if (i1 == -1)
          {
            a(localCellArea, null, m);
          }
          else
          {
            localRow2 = getRowByIndex(i1);
            if (!localRow2.k()) {
              a(localCellArea, null, m);
            }
          }
        }
      }
      for (j = 0; j < getCount(); j++)
      {
        localObject1 = getRowByIndex(j);
        m = getCount();
        Row localRow1 = null;
        int i3 = -1;
        i4 = -1;
        i5 = 0;
        for (i6 = 0; i6 < ((Row)localObject1).a(); i6++)
        {
          Cell localCell1 = ((Row)localObject1).getCellByIndex(i6);
          i5 = localCell1.b(localCellArea, i, this.e.g(), true);
          if (i5 == 1)
          {
            if (i3 == -1) {
              i3 = i6;
            }
            i4 = i6;
            if (localRow1 == null)
            {
              localRow1 = a(((Row)localObject1).getIndex() - i, false, true, false);
              if (m != getCount()) {
                j++;
              }
            }
            Cell localCell2 = localRow1.a(localCell1.getColumn(), false, true);
            localCell2.a(localCell1.c, 6, false);
            ((Row)localObject1).b();
          }
          else if (i5 == 2)
          {
            if (i3 == -1) {
              i3 = i6;
            }
            i4 = i6;
          }
        }
        if (i3 != -1) {
          ((Row)localObject1).a(i3, i4 - i3 + 1);
        }
      }
    }
    return i;
  }
  
  private void a(CellArea paramCellArea, Row paramRow, int paramInt)
  {
    for (int i = paramCellArea.StartColumn; i <= paramCellArea.EndColumn; i++)
    {
      Cell localCell = a(paramInt, i, false, true, true);
      if (localCell.s() == -1) {
        if (paramRow == null) {
          localCell.b(15);
        } else if (paramRow.k()) {
          localCell.b(paramRow.e());
        }
      }
    }
  }
  
  private void a(CellArea paramCellArea, Column paramColumn, int paramInt)
  {
    for (int i = paramCellArea.StartRow; i <= paramCellArea.EndRow; i++)
    {
      Cell localCell = a(i, paramInt, false, true, true);
      if (localCell.s() == -1) {
        if (paramColumn == null) {
          localCell.b(15);
        } else if (paramColumn.e()) {
          localCell.b(paramColumn.c());
        }
      }
    }
  }
  
  void a(HashMap paramHashMap1, HashMap paramHashMap2)
  {
    WorksheetCollection localWorksheetCollection = this.e.p();
    Cell localCell = null;
    for (int i = 0; i < getCount(); i++)
    {
      Row localRow1 = getRowByIndex(i);
      for (int j = 0; j < localRow1.a(); j++)
      {
        localCell = localRow1.getCellByIndex(j);
        if (localCell.g())
        {
          Object localObject;
          if (localCell.F() != null)
          {
            localObject = localCell.F();
            byte[] arrayOfByte = ((zbf)localObject).c();
            if (zaaq.a(arrayOfByte, -1, -1, localWorksheetCollection, paramHashMap1, paramHashMap2))
            {
              CellArea localCellArea = ((zbf)localObject).a();
              int k;
              int m;
              if (((zbf)localObject).b())
              {
                for (k = localCellArea.StartRow; k <= localCellArea.EndRow; k++) {
                  for (m = localCellArea.StartColumn; m <= localCellArea.EndColumn; m++)
                  {
                    localCell = a(k, m, true, false, false);
                    if (localCell != null) {
                      localCell.putValue(localCell.getValue());
                    }
                  }
                }
              }
              else
              {
                k = localCell.getRow();
                m = localCell.getColumn();
                for (int n = localCellArea.StartRow; n <= localCellArea.EndRow; n++)
                {
                  Row localRow2 = a(n, true, false, false);
                  if (localRow2 != null) {
                    for (int i1 = localCellArea.StartColumn; i1 <= localCellArea.EndColumn; i1++)
                    {
                      localCell = localRow2.getCellOrNull(i1);
                      if ((localCell != null) && (localCell.g()))
                      {
                        arrayOfByte = localCell.v();
                        if (localWorksheetCollection.y().a((byte)1, arrayOfByte))
                        {
                          int i2 = 0;
                          int i3 = 0;
                          int[] arrayOfInt1 = { i2 };
                          int[] arrayOfInt2 = { i3 };
                          localWorksheetCollection.y().a(arrayOfByte, arrayOfInt1, arrayOfInt2);
                          i2 = arrayOfInt1[0];
                          i3 = arrayOfInt2[0];
                          if ((i2 == k) && (i3 == m)) {
                            localCell.putValue(localCell.getValue());
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          else
          {
            localObject = localCell.v();
            if (zaaq.a((byte[])localObject, -1, -1, localWorksheetCollection, paramHashMap1, paramHashMap2)) {
              localCell.putValue(localCell.getValue());
            }
          }
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/RowCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */