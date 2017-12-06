package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zcje
  extends zcjf
{
  private HashMap i = new HashMap();
  private boolean j = false;
  private byte[] k;
  private byte[] l;
  private byte[] m;
  private ArrayList n;
  private static final za o = new za(new String[] { "#REF", "#REF!" });
  
  zcje(WorksheetCollection paramWorksheetCollection)
  {
    super(paramWorksheetCollection);
    Iterator localIterator = paramWorksheetCollection.iterator();
    while (localIterator.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator.next();
      byte[] arrayOfByte = new byte[3];
      System.arraycopy(zc.a(localWorksheet.getTabId()), 0, arrayOfByte, 1, 2);
      this.i.put(localWorksheet.getName().toUpperCase(), arrayOfByte);
    }
    this.k = new byte[] { 1, 2 };
    this.l = new byte[] { 3 };
    this.m = new byte[] { 2 };
    this.n = new ArrayList();
  }
  
  int[] a(zacf paramzacf, String paramString)
  {
    this.n.clear();
    this.j = true;
    int[] arrayOfInt = new int[2];
    int i1 = paramString.indexOf("!");
    if (i1 != -1)
    {
      String str1 = paramString.substring(0, 0 + i1);
      paramString = paramString.substring(i1 + 1);
      String str2 = paramString.toUpperCase();
      a(str1);
      a(paramString, paramString);
    }
    else
    {
      zf.a(this.n, new byte[] { -1, -1 });
      a(paramString, paramString);
      arrayOfInt[0] = -1;
    }
    a(null, 0);
    this.j = false;
    return arrayOfInt;
  }
  
  private void a(String paramString1, String paramString2)
  {
    int i1 = 4;
    int i2 = Name.e(paramString1);
    byte[] arrayOfByte1 = null;
    if (i2 == -1)
    {
      arrayOfByte1 = zct.c(paramString2);
      i1 += arrayOfByte1.length;
    }
    byte[] arrayOfByte2 = new byte[i1];
    arrayOfByte2[0] = ((byte)(i2 + 1));
    if (arrayOfByte1 != null) {
      zct.a(arrayOfByte2, 1, arrayOfByte1, paramString2);
    }
    zf.a(this.n, arrayOfByte2);
  }
  
  int[] a(String paramString, boolean paramBoolean)
  {
    this.n.clear();
    a(paramString);
    return new int[4];
  }
  
  byte[] a(zacf paramzacf, String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, int paramInt4, int paramInt5)
  {
    this.n.clear();
    a(paramzacf, paramString1);
    byte[] arrayOfByte = new byte[7];
    switch (paramInt5)
    {
    case 32: 
      arrayOfByte[0] = 57;
      break;
    case 64: 
      arrayOfByte[0] = 89;
      break;
    case 96: 
      arrayOfByte[0] = 121;
    }
    return arrayOfByte;
  }
  
  private void a(String paramString)
  {
    String str1 = paramString;
    if (str1.length() == 0) {
      return;
    }
    str1 = zaap.a(str1);
    String str2 = str1.toUpperCase();
    switch (o.a(str1))
    {
    case 0: 
    case 1: 
      zf.a(this.n, this.k);
      zf.a(this.n, this.l);
      return;
    }
    Object localObject1 = this.i.get(str2);
    if (localObject1 != null)
    {
      zf.a(this.n, this.k);
      zf.a(this.n, localObject1);
      if (!this.j) {
        zf.a(this.n, this.m);
      }
      return;
    }
    int i1 = str1.lastIndexOf('[');
    if (i1 != -1)
    {
      String str3 = null;
      int i3 = str1.lastIndexOf(']');
      if (i1 != 0) {
        str3 = str1.substring(0, 0 + i1) + str1.substring(i1 + 1, i1 + 1 + (i3 - i1 - 1));
      } else {
        str3 = str1.substring(1, 1 + (i3 - 1));
      }
      str1 = str1.substring(i3 + 1);
      b(str3, str1);
    }
    else
    {
      int i2 = str1.indexOf(":");
      if ((i2 != -1) && (i2 + 1 < str1.length()) && (str1.charAt(i2 + 1) != '\\') && (str1.charAt(i2 + 1) != '/'))
      {
        String[] arrayOfString = zw.d(str2, ':');
        if (arrayOfString.length != 2) {
          throw new CellsException(5, "Invalid formula.");
        }
        Object localObject2 = this.i.get(arrayOfString[0]);
        Object localObject3 = this.i.get(arrayOfString[1]);
        if ((localObject2 == null) || (localObject3 == null)) {
          throw new CellsException(5, "Invalid formula.");
        }
        zf.a(this.n, this.k);
        zf.a(this.n, localObject2);
        if (!this.j) {
          zf.a(this.n, localObject3);
        }
      }
      else
      {
        b(str1, null);
      }
    }
  }
  
  private void b(String paramString1, String paramString2)
  {
    String str1 = zbti.a(paramString1, 0);
    byte[] arrayOfByte1 = zct.c(str1);
    int i1 = arrayOfByte1.length + 3;
    byte[] arrayOfByte2 = null;
    byte[] arrayOfByte3 = null;
    String str2 = null;
    String str3 = null;
    if (paramString2 != null)
    {
      int i2 = paramString1.indexOf(':');
      if (i2 == -1) {
        arrayOfByte2 = zct.c(paramString2);
      }
    }
    if (arrayOfByte2 != null)
    {
      i1 += arrayOfByte2.length + 4;
    }
    else
    {
      i1 += 4;
      if (!this.j) {
        if (arrayOfByte3 == null) {
          i1++;
        } else {
          i1 += arrayOfByte3.length + 4;
        }
      }
    }
    byte[] arrayOfByte4 = new byte[i1];
    int i3 = 0;
    i3 += zct.a(arrayOfByte4, i3, arrayOfByte1, str1);
    if (arrayOfByte2 != null)
    {
      arrayOfByte4[i3] = 1;
      i3++;
      i3 += zct.a(arrayOfByte4, i3, arrayOfByte2, str2);
    }
    else
    {
      arrayOfByte4[i3] = 1;
      i3++;
      i3 += 3;
      if (!this.j) {
        if (arrayOfByte3 == null)
        {
          arrayOfByte4[i3] = this.m[0];
          i3++;
        }
        else
        {
          arrayOfByte4[i3] = 1;
          i3++;
          i3 += zct.a(arrayOfByte4, i3, arrayOfByte3, str3);
        }
      }
    }
  }
  
  void a(byte[] paramArrayOfByte, int paramInt)
  {
    zf.a(this.c, this.n);
    Iterator localIterator = this.n.iterator();
    while (localIterator.hasNext())
    {
      byte[] arrayOfByte = (byte[])localIterator.next();
      this.b += arrayOfByte.length;
    }
    this.n.clear();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcje.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */