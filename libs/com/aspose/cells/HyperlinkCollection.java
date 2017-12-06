package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.Iterator;

public class HyperlinkCollection
  extends CollectionBase
{
  private Object a;
  
  HyperlinkCollection(Object parent)
  {
    this.a = parent;
  }
  
  Worksheet a()
  {
    if ((this.a instanceof Worksheet)) {
      return (Worksheet)this.a;
    }
    return null;
  }
  
  public int add(int firstRow, int firstColumn, int totalRows, int totalColumns, String address)
  {
    if (getCount() >= 65530) {
      throw new CellsException(10, "The count of Hyperlinks cannot be larger than 65530.");
    }
    zamm.a(firstRow, firstColumn, firstRow + totalRows - 1, firstColumn + totalColumns - 1);
    String str = address.toLowerCase();
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = firstRow;
    localCellArea.StartColumn = firstColumn;
    localCellArea.EndRow = (firstRow + totalRows - 1);
    localCellArea.EndColumn = (firstColumn + totalColumns - 1);
    Hyperlink localHyperlink = new Hyperlink(this, localCellArea);
    localHyperlink.a(address);
    if ((!str.startsWith("http:")) && (!str.startsWith("www.")) && (!str.startsWith("https:")) && (!str.startsWith("mailto:")))
    {
      localHyperlink.b(true);
      if ((address.length() > 2) && (address.charAt(1) == ':')) {
        localHyperlink.a(true);
      }
    }
    if (str.startsWith("www.")) {
      localHyperlink.setAddress("http://" + address);
    } else {
      localHyperlink.setAddress(address);
    }
    zf.a(this.InnerList, localHyperlink);
    return getCount() - 1;
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString)
  {
    zamm.a(paramInt1, paramInt2, paramInt1 + paramInt3 - 1, paramInt2 + paramInt4 - 1);
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = paramInt1;
    localCellArea.StartColumn = paramInt2;
    localCellArea.EndRow = (paramInt1 + paramInt3 - 1);
    localCellArea.EndColumn = (paramInt2 + paramInt4 - 1);
    Hyperlink localHyperlink = new Hyperlink(this, localCellArea);
    localHyperlink.setAddress(paramString);
    localHyperlink.b(paramString);
    localHyperlink.b(true);
    if ((paramString.length() > 2) && (paramString.charAt(1) == ':')) {
      localHyperlink.a(true);
    }
    zf.a(this.InnerList, localHyperlink);
    return this.InnerList.size() - 1;
  }
  
  int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString)
  {
    zamm.a(paramInt1, paramInt2, paramInt1 + paramInt3 - 1, paramInt2 + paramInt4 - 1);
    if (paramString != null)
    {
      localObject = paramString.toLowerCase();
      if ((!((String)localObject).startsWith("http:")) && (!((String)localObject).startsWith("www.")) && (!((String)localObject).startsWith("https:")) && (!((String)localObject).startsWith("mailto:"))) {
        return b(paramInt1, paramInt2, paramInt3, paramInt4, paramString);
      }
    }
    Object localObject = new CellArea();
    ((CellArea)localObject).StartRow = paramInt1;
    ((CellArea)localObject).StartColumn = paramInt2;
    ((CellArea)localObject).EndRow = (paramInt1 + paramInt3 - 1);
    ((CellArea)localObject).EndColumn = (paramInt2 + paramInt4 - 1);
    Hyperlink localHyperlink = new Hyperlink(this, (CellArea)localObject);
    localHyperlink.setAddress(paramString);
    localHyperlink.b(paramString);
    zf.a(this.InnerList, localHyperlink);
    return this.InnerList.size() - 1;
  }
  
  public int add(String cellName, int totalRows, int totalColumns, String address)
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    CellsHelper.a(cellName, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    return add(i, j, totalRows, totalColumns, address);
  }
  
  public int add(String startCellName, String endCellName, String address, String textToDisplay, String screenTip)
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    CellsHelper.a(startCellName, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    int k = 0;
    int m = 0;
    int[] arrayOfInt3 = { k };
    int[] arrayOfInt4 = { m };
    CellsHelper.a(endCellName, arrayOfInt3, arrayOfInt4);
    k = arrayOfInt3[0];
    m = arrayOfInt4[0];
    int n = add(i, j, k - i + 1, m - j + 1, address);
    Hyperlink localHyperlink = get(n);
    if ((textToDisplay != null) && (!"".equals(textToDisplay))) {
      localHyperlink.setTextToDisplay(textToDisplay);
    }
    if ((screenTip != null) && (!"".equals(screenTip))) {
      localHyperlink.setScreenTip(screenTip);
    }
    return n;
  }
  
  int a(Hyperlink paramHyperlink)
  {
    zf.a(this.InnerList, paramHyperlink);
    return this.InnerList.size() - 1;
  }
  
  public Hyperlink get(int index)
  {
    return (Hyperlink)this.InnerList.get(index);
  }
  
  void a(int paramInt)
  {
    this.InnerList.remove(paramInt);
  }
  
  public void removeAt(int index)
  {
    Hyperlink localHyperlink = (Hyperlink)this.InnerList.get(index);
    this.InnerList.remove(index);
    Worksheet localWorksheet = a();
    if (localWorksheet == null) {
      return;
    }
    CellArea localCellArea = localHyperlink.getArea();
    RowCollection localRowCollection = localWorksheet.getCells().getRows();
    for (int i = localCellArea.StartRow; i <= localCellArea.EndRow; i++)
    {
      Row localRow = localRowCollection.a(i, true, false, false);
      if (localRow != null) {
        for (int j = localCellArea.StartColumn; j <= localCellArea.EndColumn; j++)
        {
          Cell localCell = localRow.getCellOrNull(j);
          if (localCell != null) {
            localCell.a(null);
          }
        }
      }
    }
  }
  
  public void clear()
  {
    for (int i = 0; i < getCount(); i++)
    {
      Hyperlink localHyperlink = (Hyperlink)this.InnerList.get(i);
      Worksheet localWorksheet = a();
      if (localWorksheet == null) {
        return;
      }
      CellArea localCellArea = localHyperlink.getArea();
      RowCollection localRowCollection = localWorksheet.getCells().getRows();
      for (int j = localCellArea.StartRow; j <= localCellArea.EndRow; j++)
      {
        Row localRow = localRowCollection.a(j, true, false, false);
        if (localRow != null) {
          for (int k = localCellArea.StartColumn; k <= localCellArea.EndColumn; k++)
          {
            Cell localCell = localRow.getCellOrNull(k);
            if (localCell != null) {
              localCell.b(15);
            }
          }
        }
      }
    }
    this.InnerList.clear();
  }
  
  void a(HyperlinkCollection paramHyperlinkCollection, CopyOptions paramCopyOptions)
  {
    this.InnerList.clear();
    for (int i = 0; i < paramHyperlinkCollection.InnerList.size(); i++)
    {
      Hyperlink localHyperlink1 = (Hyperlink)paramHyperlinkCollection.InnerList.get(i);
      Hyperlink localHyperlink2 = new Hyperlink(this, localHyperlink1.c);
      localHyperlink2.a(localHyperlink1, paramCopyOptions);
      zf.a(this.InnerList, localHyperlink2);
    }
  }
  
  void a(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      Hyperlink localHyperlink = get(i);
      CellArea localCellArea = localHyperlink.getArea();
      int j = 0;
      boolean[] arrayOfBoolean = { j };
      localCellArea = zban.a(localCellArea, paramInt1, paramInt2, arrayOfBoolean);
      j = arrayOfBoolean[0];
      if (j != 0) {
        a(i--);
      } else {
        localHyperlink.a(localCellArea);
      }
    }
  }
  
  void b(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      Hyperlink localHyperlink = get(i);
      CellArea localCellArea = localHyperlink.getArea();
      int j = 0;
      boolean[] arrayOfBoolean = { j };
      localCellArea = zban.b(localCellArea, paramInt1, paramInt2, arrayOfBoolean);
      j = arrayOfBoolean[0];
      if (j != 0) {
        a(i--);
      } else {
        localHyperlink.a(localCellArea);
      }
    }
  }
  
  void a(CellArea paramCellArea, int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    case 3: 
      c(paramCellArea, paramInt1);
      break;
    case 0: 
      b(paramCellArea, paramInt1);
      break;
    case 4: 
      a(paramCellArea, paramInt1);
      break;
    }
  }
  
  private void a(CellArea paramCellArea, int paramInt)
  {
    int i = this.InnerList.size();
    boolean bool = a().c().p().g();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    for (int j = i - 1; j >= 0; j--)
    {
      localArrayList1.clear();
      localArrayList2.clear();
      Hyperlink localHyperlink1 = get(j);
      CellArea localCellArea = localHyperlink1.getArea();
      zban.c(bool, paramCellArea, paramInt, localCellArea, localArrayList1, localArrayList2);
      zf.a(localArrayList1, localArrayList2);
      if (localArrayList1.size() == 0)
      {
        this.InnerList.remove(j);
      }
      else
      {
        if (localArrayList1.size() > 0) {
          localHyperlink1.a((CellArea)localArrayList1.get(0));
        }
        for (int k = 1; k < localArrayList1.size(); k++)
        {
          Hyperlink localHyperlink2 = new Hyperlink(this, (CellArea)localArrayList1.get(k));
          localHyperlink2.a(localHyperlink1, null);
          localHyperlink2.a((CellArea)localArrayList1.get(k));
          zf.a(this.InnerList, localHyperlink2);
        }
      }
    }
  }
  
  private void b(CellArea paramCellArea, int paramInt)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      Hyperlink localHyperlink = get(i);
      CellArea localCellArea = localHyperlink.getArea();
      if ((paramCellArea.StartColumn <= localCellArea.StartColumn) && (paramCellArea.EndColumn >= localCellArea.EndColumn))
      {
        if (paramCellArea.StartRow <= localCellArea.StartRow)
        {
          localCellArea.StartRow += paramInt;
          localCellArea.EndRow += paramInt;
        }
        else if (paramCellArea.StartRow <= localCellArea.EndRow)
        {
          localCellArea.EndRow += paramInt;
        }
        localHyperlink.a(localCellArea);
      }
    }
  }
  
  private void c(CellArea paramCellArea, int paramInt)
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      Hyperlink localHyperlink = get(i);
      CellArea localCellArea = localHyperlink.getArea();
      if ((paramCellArea.StartRow <= localCellArea.StartRow) && (paramCellArea.EndRow >= localCellArea.EndRow)) {
        if (paramCellArea.StartColumn <= localCellArea.StartColumn)
        {
          localCellArea.StartColumn += paramInt;
          localCellArea.EndColumn += paramInt;
        }
        else if (paramCellArea.StartColumn <= localCellArea.EndColumn)
        {
          localCellArea.EndColumn += paramInt;
        }
      }
    }
  }
  
  void a(HyperlinkCollection paramHyperlinkCollection, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions)
  {
    CellArea localCellArea1 = CellArea.createCellArea(0, paramInt1, 1048575, paramInt1 + paramInt3 - 1);
    CellArea localCellArea2 = CellArea.createCellArea(0, paramInt2, 1048575, paramInt2 + paramInt3 - 1);
    a(paramHyperlinkCollection, localCellArea1, localCellArea2, paramCopyOptions);
  }
  
  void b(HyperlinkCollection paramHyperlinkCollection, int paramInt1, int paramInt2, int paramInt3, CopyOptions paramCopyOptions)
  {
    CellArea localCellArea1 = CellArea.createCellArea(paramInt1, 0, paramInt1 + paramInt3 - 1, 16383);
    CellArea localCellArea2 = CellArea.createCellArea(paramInt2, 0, paramInt2 + paramInt3 - 1, 16383);
    a(paramHyperlinkCollection, localCellArea1, localCellArea2, paramCopyOptions);
  }
  
  void a(HyperlinkCollection paramHyperlinkCollection, CellArea paramCellArea1, CellArea paramCellArea2, CopyOptions paramCopyOptions)
  {
    if (getCount() >= 65530) {
      return;
    }
    int i = paramHyperlinkCollection.a() == a() ? 1 : 0;
    int j = getCount();
    Hyperlink localHyperlink1;
    Object localObject1;
    Object localObject2;
    Iterator localIterator;
    CellArea localCellArea1;
    Hyperlink localHyperlink2;
    if (i == 0) {
      for (k = 0; k < j; k++)
      {
        localHyperlink1 = get(k);
        localObject1 = zban.e(localHyperlink1.getArea(), paramCellArea2);
        if (localObject1 != null)
        {
          localObject2 = zban.d(localHyperlink1.c, (CellArea)localObject1);
          if (((ArrayList)localObject2).size() != 0)
          {
            localIterator = ((Iterable)localObject2).iterator();
            while (localIterator.hasNext())
            {
              localCellArea1 = (CellArea)localIterator.next();
              localHyperlink2 = new Hyperlink(this, localCellArea1);
              localHyperlink2.b(localHyperlink1, paramCopyOptions);
              a(localHyperlink2);
            }
          }
          a(k);
          k--;
          j--;
        }
      }
    }
    j = paramHyperlinkCollection.getCount();
    for (int k = 0; k < j; k++)
    {
      localHyperlink1 = paramHyperlinkCollection.get(k);
      localObject1 = null;
      if (i != 0)
      {
        localObject1 = zban.e(localHyperlink1.getArea(), paramCellArea2);
        if (localObject1 != null)
        {
          localObject2 = zban.d(localHyperlink1.c, (CellArea)localObject1);
          if (((ArrayList)localObject2).size() != 0)
          {
            localIterator = ((Iterable)localObject2).iterator();
            while (localIterator.hasNext())
            {
              localCellArea1 = (CellArea)localIterator.next();
              localHyperlink2 = new Hyperlink(this, localCellArea1);
              localHyperlink2.b(localHyperlink1, paramCopyOptions);
              a(localHyperlink2);
            }
          }
          a(k);
          k--;
          j--;
        }
      }
      localObject1 = zban.e(localHyperlink1.getArea(), paramCellArea1);
      if (localObject1 != null)
      {
        localObject2 = (CellArea)localObject1;
        int m = ((CellArea)localObject2).StartRow - paramCellArea1.StartRow;
        int n = ((CellArea)localObject2).StartColumn - paramCellArea1.StartColumn;
        int i1 = paramCellArea2.StartRow + m;
        int i2 = paramCellArea2.StartColumn + n;
        CellArea localCellArea2 = new CellArea();
        localCellArea2.StartRow = i1;
        localCellArea2.StartColumn = i2;
        localCellArea2.EndRow = (i1 + ((CellArea)localObject2).EndRow - ((CellArea)localObject2).StartRow);
        localCellArea2.EndColumn = (i2 + ((CellArea)localObject2).EndColumn - ((CellArea)localObject2).StartColumn);
        if ((i != 0) && (paramCopyOptions.getExtendToAdjacentRange()))
        {
          int i3 = 1;
          CellArea localCellArea3 = localHyperlink1.c;
          boolean[] arrayOfBoolean = { i3 };
          localCellArea3 = zban.a(localCellArea3, localCellArea2, arrayOfBoolean);
          i3 = arrayOfBoolean[0];
          if (i3 != 0)
          {
            localHyperlink1.c = localCellArea3;
            continue;
          }
        }
        Hyperlink localHyperlink3 = new Hyperlink(this, localCellArea2);
        localHyperlink3.b(localHyperlink1, paramCopyOptions);
        if (i != 0) {
          a(localHyperlink3);
        } else {
          b(localHyperlink3);
        }
      }
    }
  }
  
  private void b(Hyperlink paramHyperlink)
  {
    CellArea localCellArea1 = paramHyperlink.c;
    for (int i = 0; i < getCount(); i++)
    {
      Hyperlink localHyperlink = get(i);
      if (paramHyperlink.a(localHyperlink))
      {
        int j = 0;
        CellArea localCellArea2 = localHyperlink.c;
        boolean[] arrayOfBoolean = { j };
        localCellArea2 = zban.a(localCellArea2, localCellArea1, arrayOfBoolean);
        j = arrayOfBoolean[0];
        if (j != 0)
        {
          localHyperlink.c = localCellArea2;
          return;
        }
      }
    }
    a(paramHyperlink);
  }
  
  void a(byte[] paramArrayOfByte)
  {
    int i = zc.e(paramArrayOfByte, 0) & 0xFFFF;
    int j = zc.e(paramArrayOfByte, 2) & 0xFFFF;
    int k = paramArrayOfByte[4] & 0xFF;
    int m = paramArrayOfByte[6] & 0xFF;
    if (m < k)
    {
      int n = m;
      m = k;
      k = n;
    }
    String str1 = null;
    int i1 = 28;
    byte[] arrayOfByte = new byte[4];
    System.arraycopy(paramArrayOfByte, i1, arrayOfByte, 0, 4);
    i1 += 4;
    int i2;
    int i3;
    if ((arrayOfByte[0] & 0xFF & 0x10) != 0)
    {
      i2 = zc.a(paramArrayOfByte, i1);
      i1 += 4;
      i3 = i2 + i2 - 2;
      str1 = Encoding.getUnicode().a(paramArrayOfByte, i1, i3);
      i1 += i3 + 2;
    }
    if ((arrayOfByte[0] & 0xFF & 0x80) != 0)
    {
      i2 = zc.a(paramArrayOfByte, i1);
      i1 += 4 + i2 + i2;
    }
    String str2 = "";
    if ((arrayOfByte[0] & 0xFF & 0x1) != 0)
    {
      i4 = (arrayOfByte[1] & 0xFF & 0x1) != 0 ? 1 : 0;
      int i5 = 0;
      if (i4 == 0) {
        if ((paramArrayOfByte[i1] == 3) && (paramArrayOfByte[(i1 + 1)] == 3))
        {
          int[] arrayOfInt = { i1 };
          str2 = a(paramArrayOfByte, arrayOfInt);
          i1 = arrayOfInt[0];
          i5 = 1;
        }
        else
        {
          i1 += 16;
        }
      }
      int i6;
      if (i5 == 0)
      {
        i2 = zc.a(paramArrayOfByte, i1);
        i1 += 4;
        i3 = i2 - 2;
        if (i4 != 0) {
          i3 += i2;
        }
        if (i3 + i1 > paramArrayOfByte.length) {
          i3 = paramArrayOfByte.length - i1;
        }
        str2 = Encoding.getUnicode().a(paramArrayOfByte, i1, i3);
        i6 = str2.indexOf(0);
        if (i6 != -1) {
          str2 = str2.substring(0, 0 + i6);
        }
        i1 += i3 + 2;
      }
      if ((arrayOfByte[0] & 0xFF & 0x8) != 0)
      {
        i6 = zc.a(paramArrayOfByte, i1);
        if (4 + i6 * 2 + i1 <= paramArrayOfByte.length)
        {
          i1 += 4;
          String str3 = Encoding.getUnicode().a(paramArrayOfByte, i1, (i6 - 1) * 2);
          str2 = str2 + "#" + str3;
        }
      }
    }
    else if (i1 < paramArrayOfByte.length)
    {
      i2 = zc.a(paramArrayOfByte, i1);
      i1 += 4;
      i3 = i2 + i2 - 2;
      str2 = Encoding.getUnicode().a(paramArrayOfByte, i1, i3);
    }
    int i4 = a(i, k, j - i + 1, m - k + 1, str2);
    if ((str1 != null) && (!"".equals(str1))) {
      get(i4).b(str1);
    }
  }
  
  private String a(byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    paramArrayOfInt[0] += 16;
    int i = zc.b(paramArrayOfByte, paramArrayOfInt[0]);
    paramArrayOfInt[0] += 2;
    int j = zc.a(paramArrayOfByte, paramArrayOfInt[0]);
    paramArrayOfInt[0] += 4;
    String str = Encoding.getDefault().a(paramArrayOfByte, paramArrayOfInt[0], j - 1);
    if (i > 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      for (int m = 0; m < i; m++) {
        localStringBuilder.append("..\\");
      }
      str = zs.a(localStringBuilder) + str;
    }
    paramArrayOfInt[0] += j + 24;
    int k = zc.a(paramArrayOfByte, paramArrayOfInt[0]);
    if (k != 0)
    {
      j = zc.a(paramArrayOfByte, paramArrayOfInt[0] + 4);
      str = Encoding.getUnicode().a(paramArrayOfByte, paramArrayOfInt[0] + 10, j);
    }
    paramArrayOfInt[0] += 4 + k;
    return str;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/HyperlinkCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */