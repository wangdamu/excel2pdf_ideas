package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class zbyi
{
  private static final com.aspose.cells.b.c.a.za a = new com.aspose.cells.b.c.a.za(new String[] { "TRUE", "FALSE" });
  
  static Object a(Validation paramValidation, WorksheetCollection paramWorksheetCollection, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte.length == 0) {
      return null;
    }
    if (paramInt2 == 3)
    {
      localObject1 = zla.a(paramValidation.e.a());
      ((zaca)localObject1).a(paramValidation);
      if (paramValidation.b.size() > 0)
      {
        localObject2 = (CellArea)paramValidation.b.get(0);
        ((zaca)localObject1).d = ((CellArea)localObject2).StartRow;
        ((zaca)localObject1).e = ((short)((CellArea)localObject2).StartColumn);
      }
      Object localObject2 = b(paramValidation, (zaca)localObject1);
      ((zaca)localObject1).c();
      return localObject2;
    }
    Object localObject1 = zaaq.a(paramWorksheetCollection, paramArrayOfByte, paramInt1);
    if (localObject1 != null) {
      switch (paramInt2)
      {
      case 1: 
      case 2: 
      case 4: 
      case 5: 
      case 6: 
        double d = 0.0D;
        if ((localObject1 instanceof Integer)) {
          d = ((Integer)localObject1).intValue();
        } else if ((localObject1 instanceof Double)) {
          d = ((Double)localObject1).doubleValue();
        } else {
          return localObject1;
        }
        switch (paramInt2)
        {
        case 4: 
        case 5: 
          return CellsHelper.getDateTimeFromDouble(d, paramWorksheetCollection.p().getSettings().getDate1904());
        case 1: 
        case 6: 
          return Integer.valueOf((int)d);
        case 2: 
          return Double.valueOf(d);
        }
        return localObject1;
      }
    }
    return localObject1;
  }
  
  static boolean a(Validation paramValidation, zaca paramzaca)
  {
    zaag localzaag = new zaag(paramzaca, paramValidation.c, 0, paramValidation.c.length);
    zaie localzaie = localzaag.a();
    localzaie = localzaie.e(paramzaca);
    if (localzaie.e()) {
      return ((zaba)localzaie).o();
    }
    return true;
  }
  
  static boolean a(Validation paramValidation, zaca paramzaca, Cell paramCell)
  {
    if (paramValidation.getType() == 0) {
      return true;
    }
    if (paramValidation.c == null) {
      return true;
    }
    if (paramCell == null) {
      paramCell = paramzaca.g.checkCell(paramzaca.d, paramzaca.e);
    }
    Object localObject1 = null;
    if (paramCell == null) {
      localObject1 = null;
    } else {
      localObject1 = paramCell.getValue();
    }
    if ((localObject1 == null) && (paramValidation.getIgnoreBlank())) {
      return true;
    }
    Object localObject2 = null;
    switch (paramValidation.getType())
    {
    case 7: 
      return a(paramValidation, paramzaca);
    case 3: 
      return a(paramValidation, paramzaca, paramCell, localObject1);
    }
    double d1 = 0.0D;
    if (paramValidation.getType() == 6)
    {
      d1 = paramCell.getStringValue().length();
    }
    else
    {
      switch (paramCell.getType())
      {
      case 1: 
      case 4: 
        d1 = paramCell.getDoubleValue();
        break;
      default: 
        return false;
      }
      switch (paramValidation.getType())
      {
      case 4: 
        if (d1 < 0.0D) {
          return false;
        }
        break;
      case 5: 
        if ((d1 < 0.0D) || (d1 >= 1.0D)) {
          return false;
        }
        break;
      case 1: 
        if (!zbh.a(d1, (int)d1)) {
          return false;
        }
        break;
      }
    }
    zaag localzaag1 = new zaag(paramzaca, paramValidation.c, 0, paramValidation.c.length);
    localObject2 = localzaag1.a().b(paramzaca);
    if ((localObject2 instanceof ReferredArea))
    {
      localObject3 = (ReferredArea)localObject2;
      localObject2 = ((ReferredArea)localObject3).getValue(0, 0);
    }
    Object localObject3 = null;
    if ((paramValidation.getOperator() == 0) || (paramValidation.getOperator() == 7))
    {
      zaag localzaag2 = new zaag(paramzaca, paramValidation.d, 0, paramValidation.d.length);
      localObject3 = localzaag2.a().b(paramzaca);
      if ((localObject3 instanceof ReferredArea))
      {
        ReferredArea localReferredArea = (ReferredArea)localObject3;
        localObject3 = localReferredArea.getValue(0, 0);
      }
    }
    double d2 = 0.0D;
    double d3 = 0.0D;
    switch (paramValidation.getType())
    {
    case 1: 
    case 2: 
    case 4: 
    case 5: 
    case 6: 
      Object localObject4 = zaap.a(localObject2, paramzaca.p.d.getSettings());
      if ((localObject4 instanceof Double)) {
        d2 = ((Double)localObject4).doubleValue();
      } else {
        return true;
      }
      if (localObject3 != null)
      {
        localObject4 = zaap.a(localObject3, paramzaca.p.d.getSettings());
        if ((localObject4 instanceof Double)) {
          d3 = ((Double)localObject4).doubleValue();
        } else {
          return true;
        }
      }
      break;
    }
    boolean bool = zbh.a(d1, d2);
    switch (paramValidation.getOperator())
    {
    case 1: 
      return bool;
    case 3: 
      return (bool) || (d1 > d2);
    case 2: 
      return (!bool) && (d1 > d2);
    case 5: 
      return (bool) || (d1 < d2);
    case 4: 
      return (!bool) && (d1 < d2);
    case 8: 
      return !bool;
    case 0: 
      return (d1 >= d2) && (d1 <= d3);
    case 7: 
      return (d1 < d2) && (d1 > d3);
    }
    return true;
  }
  
  static Object[] b(Validation paramValidation, zaca paramzaca)
  {
    String str = paramValidation.e();
    if (!str.startsWith("="))
    {
      localObject1 = str;
      localObject2 = null;
      if (((String)localObject1).indexOf(0) != -1) {
        localObject2 = zw.d((String)localObject1, '\000');
      } else if (((String)localObject1).indexOf(',') != -1) {
        localObject2 = zw.d((String)localObject1, ',');
      } else {
        localObject2 = new String[] { localObject1 };
      }
      Object[] arrayOfObject1 = new Object[localObject2.length];
      for (j = 0; j < arrayOfObject1.length; j++) {
        arrayOfObject1[j] = localObject2[j];
      }
      return arrayOfObject1;
    }
    Object localObject1 = new zaag(paramzaca, paramValidation.c, 0, paramValidation.c.length);
    Object localObject2 = zbam.b(((zaag)localObject1).a().a(paramzaca, false), paramzaca);
    int i = localObject2.length;
    int j = localObject2[0].length;
    HashMap localHashMap = new HashMap();
    int k = 0;
    for (int m = 0; m < i; m++) {
      if (localObject2[m] != null) {
        for (int n = 0; n < j; n++) {
          if ((localObject2[m][n] != null) && (localHashMap.get(localObject2[m][n]) == null))
          {
            localHashMap.put(localObject2[m][n], Integer.valueOf(k));
            k++;
          }
        }
      }
    }
    Object[] arrayOfObject2 = new Object[localHashMap.size()];
    Iterator localIterator = localHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject3 = localIterator.next();
      k = ((Integer)localHashMap.get(localObject3)).intValue();
      arrayOfObject2[k] = localObject3;
    }
    return arrayOfObject2;
  }
  
  private static boolean a(Validation paramValidation, zaca paramzaca, Cell paramCell, Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    String str = paramCell.getStringValue();
    double d = 0.0D;
    int i = 0;
    switch (paramCell.n())
    {
    case 1: 
    case 4: 
      d = paramCell.getDoubleValue();
      i = 1;
      break;
    }
    if (!paramValidation.getFormula1().startsWith("=")) {
      return a(str, paramValidation.getFormula1());
    }
    zaag localzaag = new zaag(paramzaca, paramValidation.c, 0, paramValidation.c.length);
    Object[][] arrayOfObject = zbam.b(localzaag.a().a(paramzaca, false), paramzaca);
    int j = arrayOfObject.length;
    int k = arrayOfObject[0].length;
    for (int m = 0; m < j; m++) {
      if (arrayOfObject[m] != null) {
        for (int n = 0; n < k; n++)
        {
          Object localObject = null;
          if (i != 0) {
            localObject = znc.a(Double.valueOf(d), arrayOfObject[m][n], "=", paramzaca.p.i);
          } else {
            localObject = znc.a(str, arrayOfObject[m][n], "=", paramzaca.p.i);
          }
          if (((localObject instanceof Boolean)) && (((Boolean)localObject).booleanValue())) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  static boolean a(String paramString1, String paramString2)
  {
    String[] arrayOfString = null;
    if (paramString2.indexOf(',') != -1) {
      arrayOfString = zw.d(paramString2, ',');
    } else {
      arrayOfString = new String[] { paramString2 };
    }
    for (int i = 0; i < arrayOfString.length; i++) {
      if (zw.a(arrayOfString[i], paramString1, true) == 0) {
        return true;
      }
    }
    return false;
  }
  
  static String a(Validation paramValidation, byte[] paramArrayOfByte)
  {
    int[] arrayOfInt = paramValidation.b();
    int i = 0;
    int j = 0;
    if (arrayOfInt != null)
    {
      i = arrayOfInt[0];
      j = arrayOfInt[1];
    }
    return a(paramValidation.e.a().c(), paramArrayOfByte, 0, paramValidation.getType(), i, j);
  }
  
  static String a(WorksheetCollection paramWorksheetCollection, byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return null;
    }
    try
    {
      zaaf localzaaf = paramWorksheetCollection.d();
      byte[] arrayOfByte = paramArrayOfByte;
      Object localObject = localzaaf.a(0, arrayOfByte, paramInt3, paramInt4, true);
      String str1;
      double d;
      switch (paramInt2)
      {
      case 4: 
        str1 = ((String)localObject).substring(1);
        if (zarb.b(str1))
        {
          d = zo.a(str1, com.aspose.cells.b.a.c.za.b());
          DateTime localDateTime = CellsHelper.getDateTimeFromDouble(d, paramWorksheetCollection.p().getSettings().getDate1904());
          String str2 = localDateTime.getYear() + "-" + localDateTime.getMonth() + "-" + localDateTime.getDay();
          if ((localDateTime.getHour() == 0) && (localDateTime.getMinute() == 0) && (localDateTime.getSecond() == 0)) {
            localObject = str2;
          } else {
            localObject = str2 + " " + localDateTime.getHour() + ":" + localDateTime.getMinute() + ":" + localDateTime.getSecond();
          }
        }
        break;
      case 5: 
        str1 = ((String)localObject).substring(1);
        if (zarb.b(str1))
        {
          d = 86400.0D * zo.a(str1, com.aspose.cells.b.a.c.za.b());
          int i = (int)d / 3600;
          int j = (int)(d - i * 3600) / 60;
          int k = (int)(d - i * 3600 - j * 60);
          localObject = i + ":" + j + ":" + k;
        }
        break;
      case 3: 
        if (zaar.a(paramWorksheetCollection, paramArrayOfByte, paramInt1))
        {
          if (((String)localObject).indexOf("\"\"") == -1) {
            localObject = ((String)localObject).substring(2, 2 + (((String)localObject).length() - 3));
          } else {
            localObject = ((String)localObject).substring(1);
          }
          localObject = ((String)localObject).replace('\000', ',');
        }
        break;
      }
      return (String)localObject;
    }
    catch (Exception localException) {}
    return null;
  }
  
  static boolean b(Validation paramValidation, byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    switch (paramArrayOfByte[0])
    {
    case 30: 
      return i == 3;
    case 31: 
      return i == 9;
    case 28: 
      return i != 2;
    case 29: 
      return i != 2;
    case 23: 
      if (paramValidation.e.a().c().p().h())
      {
        j = zc.e(paramArrayOfByte, 1) & 0xFFFF;
        return j * 2 + 3 != i;
      }
      int j = paramArrayOfByte[1] & 0xFF;
      int k = paramArrayOfByte[2] == 0 ? 1 : 0;
      if (k != 0) {
        return j + 3 != i;
      }
      return j * 2 + 3 != i;
    }
    return true;
  }
  
  static byte[] a(Validation paramValidation, String paramString)
  {
    Worksheet localWorksheet = paramValidation.e.a();
    int i = ztr.b(paramString);
    if (i != -1) {
      return new byte[] { 28, 23 };
    }
    zavp localzavp = zaac.a(paramString, localWorksheet.getWorkbook().getSettings().f());
    if (localzavp != null)
    {
      localObject = null;
      double d = 0.0D;
      if (localzavp.a() == 1)
      {
        d = CellsHelper.getDoubleFromDateTime((DateTime)localzavp.d(), localWorksheet.c().p().getSettings().getDate1904());
        if (paramValidation.getType() == 5) {
          d -= (int)d;
        }
      }
      else if (localzavp.a() == 4)
      {
        d = ((Double)localzavp.d()).doubleValue();
      }
      if (Math.abs(d - (int)d) < Double.MIN_VALUE)
      {
        int j = (int)d;
        if ((j <= 65535) && (j >= 0))
        {
          localObject = new byte[3];
          localObject[0] = 30;
          System.arraycopy(zc.a(j), 0, localObject, 1, 2);
        }
        else
        {
          localObject = new byte[9];
          localObject[0] = 31;
          System.arraycopy(zc.a(d), 0, localObject, 1, 8);
        }
      }
      else
      {
        localObject = new byte[9];
        localObject[0] = 31;
        System.arraycopy(zc.a(d), 0, localObject, 1, 8);
      }
      return (byte[])localObject;
    }
    Object localObject = paramString.toUpperCase();
    switch (a.a((String)localObject))
    {
    case 0: 
      return new byte[] { 29, 1 };
    case 1: 
      return new byte[] { 29, 0 };
    }
    return null;
  }
  
  static byte[] b(Validation paramValidation, String paramString)
  {
    Worksheet localWorksheet = paramValidation.e.a();
    if (zw.b(paramString)) {
      return null;
    }
    int[] arrayOfInt = paramValidation.b();
    int i = 0;
    int j = 0;
    if (arrayOfInt != null)
    {
      i = arrayOfInt[0];
      j = arrayOfInt[1];
    }
    if (paramValidation.getType() == 3)
    {
      if (paramString.charAt(0) == '=') {
        return localWorksheet.c().y().a(-1, paramString, i, j, 0, 32, true, false, false);
      }
      return a(paramString, true, localWorksheet.getWorkbook().h());
    }
    String str = paramString;
    if (paramString.charAt(0) == '=') {
      str = paramString.substring(1);
    }
    byte[] arrayOfByte = a(paramValidation, str);
    if (arrayOfByte == null) {
      return localWorksheet.c().y().a(-1, str, i, j, 0, 32, true, false, false);
    }
    return arrayOfByte;
  }
  
  private static byte[] a(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (paramString.indexOf(0) == -1)) {
      paramString = paramString.replace(',', '\000');
    }
    byte[] arrayOfByte1 = Encoding.getUnicode().a(paramString);
    byte[] arrayOfByte2 = null;
    if (paramBoolean2)
    {
      arrayOfByte2 = new byte[3 + arrayOfByte1.length];
      arrayOfByte2[0] = 23;
      System.arraycopy(zc.a(paramString.length()), 0, arrayOfByte2, 1, 2);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 3, arrayOfByte1.length);
    }
    else
    {
      arrayOfByte2 = new byte[3 + arrayOfByte1.length];
      arrayOfByte2[0] = 23;
      arrayOfByte2[1] = ((byte)paramString.length());
      arrayOfByte2[2] = 1;
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 3, arrayOfByte1.length);
    }
    return arrayOfByte2;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbyi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */