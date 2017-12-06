package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zbbd
{
  public static boolean a = true;
  
  static void a(zrg paramzrg, byte[] paramArrayOfByte)
    throws Exception
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte.length + 8];
    arrayOfByte[0] = (arrayOfByte[4] = 100);
    arrayOfByte[1] = (arrayOfByte[5] = 8);
    System.arraycopy(zc.a(paramArrayOfByte.length + 4), 0, arrayOfByte, 2, 2);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 8, paramArrayOfByte.length);
    paramzrg.a(arrayOfByte);
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt, byte paramByte1, byte paramByte2, Object paramObject, double paramDouble)
  {
    int i = paramInt;
    int j = i;
    paramArrayOfByte[(i++)] = 100;
    paramArrayOfByte[(i++)] = 8;
    i += 2;
    paramArrayOfByte[(i++)] = 100;
    paramArrayOfByte[(i++)] = 8;
    paramArrayOfByte[(i++)] = 0;
    paramArrayOfByte[(i++)] = 0;
    paramArrayOfByte[(i++)] = paramByte1;
    paramArrayOfByte[(i++)] = paramByte2;
    Object localObject;
    int k;
    switch (paramByte1)
    {
    case 0: 
      switch (paramByte2)
      {
      case 0: 
        if ((paramObject instanceof String))
        {
          localObject = (String)paramObject;
          System.arraycopy(zc.a((short)((String)localObject).length()), 0, paramArrayOfByte, i, 2);
          System.arraycopy(zc.a(0), 0, paramArrayOfByte, i + 2, 4);
          i += 6;
          System.arraycopy(zc.a((short)((String)localObject).length()), 0, paramArrayOfByte, i, 2);
          i += 2;
          i += zct.b(paramArrayOfByte, i, (String)localObject);
        }
        break;
      case 30: 
        i += 6;
        paramArrayOfByte[(i++)] = 50;
        i++;
        if (paramObject != null)
        {
          localObject = (String)paramObject;
          System.arraycopy(zc.a((short)((String)localObject).length()), 0, paramArrayOfByte, i, 2);
          i += 2;
          byte[] arrayOfByte = Encoding.getUnicode().a((String)localObject);
          System.arraycopy(arrayOfByte, 0, paramArrayOfByte, i, arrayOfByte.length);
          i += arrayOfByte.length;
        }
        else
        {
          i += 2;
        }
        break;
      case 2: 
        if ((paramObject instanceof PivotTable))
        {
          localObject = (PivotTable)paramObject;
          k = 0;
          if (!((PivotTable)localObject).getEnableFieldList()) {
            k = 1;
          }
          paramArrayOfByte[(i++)] = 2;
          paramArrayOfByte[(i++)] = ((byte)(65 + (k << 2)));
          paramArrayOfByte[(i++)] = 64;
          i += 3;
        }
        break;
      case 25: 
        paramArrayOfByte[(i++)] = -97;
        paramArrayOfByte[(i++)] = 0;
        paramArrayOfByte[(i++)] = 64;
        i += 3;
        break;
      default: 
        i += 6;
      }
      break;
    case 3: 
      switch (paramByte2)
      {
      case 0: 
        System.arraycopy(zc.a(((Integer)paramObject).intValue()), 0, paramArrayOfByte, i, 4);
        i += 6;
        break;
      case 52: 
        paramArrayOfByte[i] = 1;
        i += 6;
        break;
      case -1: 
        paramArrayOfByte[i] = 0;
        i += 6;
      }
      break;
    case 23: 
      switch (paramByte2)
      {
      case 25: 
        if ((paramObject instanceof PivotField))
        {
          localObject = (PivotField)paramObject;
          k = 0;
          if (!((PivotField)localObject).isIncludeNewItemsInFilter()) {
            k = 1;
          }
          int m = 0;
          if (((PivotField)localObject).getShowCompact()) {
            m = 1;
          }
          paramArrayOfByte[(i++)] = ((byte)((m << 3) + (k << 5)));
          i += 5;
        }
        else
        {
          i += 6;
        }
        break;
      }
      break;
    }
    System.arraycopy(zc.a((short)(i - j - 4)), 0, paramArrayOfByte, j + 2, 2);
    return i - j;
  }
  
  static int a(byte paramByte1, byte paramByte2, Object paramObject)
  {
    int i = 10;
    switch (paramByte1)
    {
    case 0: 
      switch (paramByte2)
      {
      case 0: 
        i += 8 + zct.a((String)paramObject);
        break;
      case 30: 
        if (paramObject == null) {
          i += 10;
        } else {
          i += 10 + 2 * ((String)paramObject).length();
        }
        break;
      case -1: 
      case 2: 
      case 25: 
        i += 6;
      }
      break;
    case 3: 
      i += 6;
      if (paramByte2 == 2) {
        i += 16;
      }
      break;
    case 23: 
      switch (paramByte2)
      {
      case 25: 
        i += 6;
      }
      break;
    }
    return i;
  }
  
  static void a(zrg paramzrg, PivotTable paramPivotTable)
    throws Exception
  {
    a(paramzrg, 0, 0, paramPivotTable, null, null);
    a(paramzrg, 0, 2, paramPivotTable, null, null);
    a(paramzrg, 0, 25, paramPivotTable, null, null);
    a(paramzrg, 0, 30, paramPivotTable, null, null);
    a(paramzrg, 0, 255, paramPivotTable, null, null);
  }
  
  static void a(zrg paramzrg, zawp paramzawp)
    throws Exception
  {
    a(paramzrg, 3, 0, null, paramzawp, null);
    a(paramzrg, 3, 52, null, paramzawp, null);
    a(paramzrg, 3, 255, null, paramzawp, null);
  }
  
  static void a(zrg paramzrg, int paramInt1, int paramInt2, PivotTable paramPivotTable, zawp paramzawp, PivotField paramPivotField)
    throws Exception
  {
    switch (paramInt1)
    {
    case 0: 
      switch (paramInt2)
      {
      case 0: 
        a(paramzrg, paramPivotTable.getName());
        break;
      case 2: 
        b(paramzrg, paramPivotTable);
        break;
      case 25: 
        b(paramzrg);
        break;
      case 30: 
        b(paramzrg, paramPivotTable.getPivotTableStyleName());
        break;
      case -1: 
        c(paramzrg);
      }
      break;
    case 3: 
      switch (paramInt2)
      {
      case 0: 
        a(paramzrg, paramzawp.b);
        break;
      case 52: 
        a(paramzrg);
        break;
      case -1: 
        d(paramzrg);
      }
      break;
    case 23: 
      switch (paramInt2)
      {
      case 25: 
        a(paramzrg, paramPivotField);
      }
      break;
    }
  }
  
  static void a(zrg paramzrg, PivotField paramPivotField)
    throws Exception
  {
    byte[] arrayOfByte = new byte[a(, (byte)25, null)];
    int i = 0;
    i += a(arrayOfByte, i, (byte)23, (byte)25, paramPivotField, 0.0D);
    paramzrg.a(arrayOfByte);
  }
  
  static void a(zrg paramzrg, String paramString)
    throws Exception
  {
    byte[] arrayOfByte = new byte[a(, (byte)0, paramString)];
    int i = 0;
    i += a(arrayOfByte, i, (byte)0, (byte)0, paramString, 0.0D);
    paramzrg.a(arrayOfByte);
  }
  
  static void a(zrg paramzrg, int paramInt)
    throws Exception
  {
    byte[] arrayOfByte = new byte[a(, (byte)0, Integer.valueOf(paramInt))];
    int i = 0;
    i += a(arrayOfByte, i, (byte)3, (byte)0, Integer.valueOf(paramInt), 0.0D);
    paramzrg.a(arrayOfByte);
  }
  
  static void a(zrg paramzrg)
    throws Exception
  {
    byte[] arrayOfByte = new byte[a(, (byte)52, null)];
    int i = 0;
    i += a(arrayOfByte, i, (byte)3, (byte)52, null, 0.0D);
    paramzrg.a(arrayOfByte);
  }
  
  static void b(zrg paramzrg, String paramString)
    throws Exception
  {
    byte[] arrayOfByte = new byte[a(, (byte)30, paramString)];
    int i = 0;
    i += a(arrayOfByte, i, (byte)0, (byte)30, paramString, 0.0D);
    paramzrg.a(arrayOfByte);
  }
  
  static void b(zrg paramzrg, PivotTable paramPivotTable)
    throws Exception
  {
    byte[] arrayOfByte = new byte[a(, (byte)2, null)];
    int i = 0;
    i += a(arrayOfByte, i, (byte)0, (byte)2, paramPivotTable, 0.0D);
    paramzrg.a(arrayOfByte);
  }
  
  static void b(zrg paramzrg)
    throws Exception
  {
    byte[] arrayOfByte = new byte[a(, (byte)25, null)];
    int i = 0;
    i += a(arrayOfByte, i, (byte)0, (byte)25, null, 0.0D);
    paramzrg.a(arrayOfByte);
  }
  
  static void c(zrg paramzrg)
    throws Exception
  {
    byte[] arrayOfByte = new byte[a(, (byte)-1, null)];
    int i = 0;
    i += a(arrayOfByte, i, (byte)0, (byte)-1, null, 0.0D);
    paramzrg.a(arrayOfByte);
  }
  
  static void d(zrg paramzrg)
    throws Exception
  {
    byte[] arrayOfByte = new byte[a(, (byte)-1, null)];
    int i = 0;
    i += a(arrayOfByte, i, (byte)3, (byte)-1, null, 0.0D);
    paramzrg.a(arrayOfByte);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */