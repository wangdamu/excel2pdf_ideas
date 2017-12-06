package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zcfz
{
  zcga[] a;
  zcgb[] b;
  byte[][] c;
  String d;
  
  zcfz() {}
  
  zcfz(SparklineGroup paramSparklineGroup)
  {
    if (paramSparklineGroup.b != null)
    {
      this.c = new byte[1][];
      this.c[0] = a(paramSparklineGroup.b);
    }
  }
  
  zcfz(Sparkline paramSparkline)
  {
    this.b = new zcgb[1];
    zcgb localzcgb = new zcgb();
    this.b[0] = localzcgb;
    localzcgb.a = 2;
    localzcgb.b = new CellArea[1];
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = (localCellArea.EndRow = paramSparkline.getRow());
    localCellArea.StartColumn = (localCellArea.EndColumn = paramSparkline.getColumn());
    localzcgb.b[0] = localCellArea;
    if (paramSparkline.a != null)
    {
      this.c = new byte[1][];
      this.c[0] = a(paramSparkline.a);
    }
  }
  
  zcfz(FormatConditionCollection paramFormatConditionCollection)
  {
    this.b = new zcgb[1];
    zcgb localzcgb = new zcgb();
    this.b[0] = localzcgb;
    localzcgb.a = 2;
    localzcgb.b = new CellArea[paramFormatConditionCollection.b.size()];
    for (int i = 0; i < paramFormatConditionCollection.b.size(); i++) {
      localzcgb.b[i] = ((CellArea)paramFormatConditionCollection.b.get(i));
    }
  }
  
  static byte[] a(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    int i = zc.a(paramArrayOfByte, 0);
    int j = zc.a(paramArrayOfByte, 4 + i);
    int k = 0;
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, k, 4);
    k += 4;
    System.arraycopy(paramArrayOfByte, 4 + i, arrayOfByte, k, 4);
    k += 4;
    System.arraycopy(paramArrayOfByte, 4, arrayOfByte, k, i);
    k += i;
    if (j != 0)
    {
      System.arraycopy(paramArrayOfByte, 8 + i, arrayOfByte, k, j);
      k += j;
    }
    return arrayOfByte;
  }
  
  zcfz(FormatCondition paramFormatCondition)
  {
    int i = 0;
    if (paramFormatCondition.a() != null) {
      i++;
    }
    if (paramFormatCondition.c() != null) {
      i++;
    }
    if (i != 0)
    {
      this.c = new byte[i][];
      i = 0;
      if (paramFormatCondition.a() != null) {
        this.c[(i++)] = paramFormatCondition.a();
      }
      if (paramFormatCondition.c() != null) {
        this.c[(i++)] = paramFormatCondition.c();
      }
      for (int j = 0; j < this.c.length; j++)
      {
        byte[] arrayOfByte1 = this.c[j];
        byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
        int k = zc.a(arrayOfByte1, 0);
        int m = zc.a(arrayOfByte1, k + 4);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 4);
        System.arraycopy(arrayOfByte1, k + 4, arrayOfByte2, 4, 4);
        System.arraycopy(arrayOfByte1, 4, arrayOfByte2, 8, k);
        System.arraycopy(arrayOfByte1, k + 8, arrayOfByte2, k + 8, m);
        this.c[j] = arrayOfByte2;
      }
    }
  }
  
  zcfz(ConditionalFormattingValue paramConditionalFormattingValue)
  {
    if ((paramConditionalFormattingValue.e()) && (paramConditionalFormattingValue.f() != null))
    {
      this.c = new byte[1][];
      byte[] arrayOfByte1 = paramConditionalFormattingValue.f();
      byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
      int i = zc.a(arrayOfByte1, 0);
      int j = zc.a(arrayOfByte1, i + 4);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 4);
      System.arraycopy(arrayOfByte1, i + 4, arrayOfByte2, 4, 4);
      System.arraycopy(arrayOfByte1, 4, arrayOfByte2, 8, i);
      System.arraycopy(arrayOfByte1, i + 8, arrayOfByte2, i + 8, j);
      this.c[0] = arrayOfByte2;
    }
  }
  
  ArrayList a()
  {
    if (this.b == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < this.b.length; i++)
    {
      zcgb localzcgb = this.b[i];
      if (localzcgb.b != null) {
        for (int j = 0; j < localzcgb.b.length; j++) {
          zf.a(localArrayList, localzcgb.b[j]);
        }
      }
    }
    return localArrayList;
  }
  
  byte b()
  {
    byte b1 = 0;
    if (this.a != null) {
      b1 = (byte)(b1 | 0x1);
    }
    if (this.b != null) {
      b1 = (byte)(b1 | 0x2);
    }
    if (this.c != null) {
      b1 = (byte)(b1 | 0x4);
    }
    if (this.d != null) {
      b1 = (byte)(b1 | 0x8);
    }
    return b1;
  }
  
  int a(byte[] paramArrayOfByte, int paramInt)
    throws Exception
  {
    int i = paramInt;
    int j = paramArrayOfByte[i];
    i += 4;
    int k;
    int m;
    Object localObject;
    if ((j & 0xFF & 0x1) != 0)
    {
      k = zc.a(paramArrayOfByte, i);
      i += 4;
      this.a = new zcga[k];
      for (m = 0; m < k; m++)
      {
        localObject = new zcga();
        ((zcga)localObject).a = zc.a(paramArrayOfByte, i);
        i += 4;
        ((zcga)localObject).b = zcgj.a(paramArrayOfByte, i);
        i += 16;
        this.a[m] = localObject;
        k--;
      }
    }
    int i1;
    if ((j & 0xFF & 0x2) != 0)
    {
      k = zc.a(paramArrayOfByte, i);
      this.b = new zcgb[k];
      i += 4;
      for (m = 0; m < k; m++)
      {
        localObject = new zcgb();
        this.b[m] = localObject;
        ((zcgb)localObject).a = zc.a(paramArrayOfByte, i);
        i += 4;
        i1 = zc.a(paramArrayOfByte, i);
        i += 4;
        if (i1 > 0)
        {
          ((zcgb)localObject).b = new CellArea[i1];
          for (int i2 = 0; i2 < i1; i2++)
          {
            CellArea localCellArea = new CellArea();
            localCellArea.StartRow = zc.a(paramArrayOfByte, i);
            localCellArea.EndRow = zc.a(paramArrayOfByte, i + 4);
            localCellArea.StartColumn = zc.a(paramArrayOfByte, i + 8);
            localCellArea.EndColumn = zc.a(paramArrayOfByte, i + 12);
            ((zcgb)localObject).b[i2] = localCellArea;
            i += 16;
          }
        }
      }
    }
    if ((j & 0xFF & 0x4) != 0)
    {
      k = zc.a(paramArrayOfByte, i);
      this.c = new byte[k][];
      i += 4;
      for (m = 0; m < k; m++)
      {
        i += 4;
        int n = zc.a(paramArrayOfByte, i);
        i1 = zc.a(paramArrayOfByte, i + 4);
        i += 8;
        byte[] arrayOfByte = new byte[n + i1 + 8];
        this.c[m] = arrayOfByte;
        int i3 = 0;
        System.arraycopy(zc.a(n), 0, arrayOfByte, i3, 4);
        i3 += 4;
        System.arraycopy(paramArrayOfByte, i, arrayOfByte, i3, n);
        i += n;
        i3 += n;
        if (i1 != 0)
        {
          System.arraycopy(zc.a(i1), 0, arrayOfByte, i3, 4);
          i3 += 4;
          System.arraycopy(paramArrayOfByte, i, arrayOfByte, i3, i1);
          i += i1;
          i3 += i1;
        }
      }
    }
    if ((j & 0xFF & 0x8) != 0)
    {
      this.d = zcgj.d(paramArrayOfByte, i);
      i += this.d.length() * 2 + 2;
    }
    return i;
  }
  
  int c()
  {
    int i = 4;
    if (this.a != null) {
      i += 4 + this.a.length * 20;
    }
    int j;
    if (this.b != null)
    {
      i += 4;
      for (j = 0; j < this.b.length; j++) {
        i += 8 + this.b[j].b.length * 16;
      }
    }
    if (this.c != null)
    {
      i += 4;
      for (j = 0; j < this.c.length; j++) {
        i += this.c[j].length + 4;
      }
    }
    if (this.d != null) {
      i += this.d.length() * 2 + 2;
    }
    return i;
  }
  
  int b(byte[] paramArrayOfByte, int paramInt)
    throws Exception
  {
    int i = paramInt;
    paramArrayOfByte[i] = b();
    i += 4;
    int j;
    Object localObject;
    if (this.a != null)
    {
      System.arraycopy(zc.a(this.a.length), 0, paramArrayOfByte, i, 4);
      i += 4;
      for (j = 0; j < this.a.length; j++)
      {
        localObject = this.a[j];
        System.arraycopy(zc.a(((zcga)localObject).a), 0, paramArrayOfByte, i, 4);
        i += 4;
        zcgj.a(((zcga)localObject).b, paramArrayOfByte, i);
        i += 16;
      }
    }
    if (this.b != null)
    {
      System.arraycopy(zc.a(this.b.length), 0, paramArrayOfByte, i, 4);
      i += 4;
      for (j = 0; j < this.b.length; j++)
      {
        localObject = this.b[j];
        System.arraycopy(zc.a(((zcgb)localObject).a), 0, paramArrayOfByte, i, 4);
        i += 4;
        System.arraycopy(zc.a(((zcgb)localObject).b.length), 0, paramArrayOfByte, i, 4);
        i += 4;
        for (int k = 0; k < ((zcgb)localObject).b.length; k++)
        {
          zcgj.a(localObject.b[k], paramArrayOfByte, i);
          i += 16;
        }
      }
    }
    if (this.c != null)
    {
      System.arraycopy(zc.a(this.c.length), 0, paramArrayOfByte, i, 4);
      i += 4;
      for (j = 0; j < this.c.length; j++)
      {
        paramArrayOfByte[i] = 2;
        i += 4;
        localObject = this.c[j];
        System.arraycopy(localObject, 0, paramArrayOfByte, i, localObject.length);
        i += localObject.length;
      }
    }
    if (this.d != null) {
      i = zcgj.a(paramArrayOfByte, i, this.d);
    }
    return i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */