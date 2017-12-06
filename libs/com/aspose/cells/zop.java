package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zop
  extends zcd
{
  private int d = 1048575;
  private int e = 16383;
  private Worksheet f;
  private int g = 0;
  int a = 0;
  int c = 0;
  private Validation h = null;
  private int i;
  
  zop(Worksheet paramWorksheet)
  {
    c(446);
    this.f = paramWorksheet;
  }
  
  boolean a(Validation paramValidation)
  {
    if (paramValidation.a()) {
      return false;
    }
    this.h = paramValidation;
    this.c = paramValidation.getAreaList().size();
    for (int j = 0; j < paramValidation.getAreaList().size(); j++)
    {
      localObject = (CellArea)paramValidation.getAreaList().get(j);
      if (((CellArea)localObject).StartRow < this.d)
      {
        this.d = ((CellArea)localObject).StartRow;
        this.e = ((CellArea)localObject).StartColumn;
      }
    }
    if (this.c == 0) {
      return false;
    }
    j = 14;
    Object localObject = zct.c(paramValidation.getInputTitle());
    j += c((byte[])localObject);
    byte[] arrayOfByte1 = zct.c(paramValidation.getInputMessage());
    j += c(arrayOfByte1);
    byte[] arrayOfByte2 = zct.c(paramValidation.getErrorTitle());
    j += c(arrayOfByte2);
    byte[] arrayOfByte3 = zct.c(paramValidation.getErrorMessage());
    j += c(arrayOfByte3);
    byte[] arrayOfByte4 = null;
    if ((paramValidation.getType() != 0) && (paramValidation.c != null)) {
      arrayOfByte4 = paramValidation.c;
    }
    if (arrayOfByte4 != null) {
      j += arrayOfByte4.length;
    }
    byte[] arrayOfByte5 = null;
    if (((paramValidation.getOperator() == 0) || (paramValidation.getOperator() == 7)) && (paramValidation.getType() != 3) && (paramValidation.getType() != 7) && (paramValidation.getType() != 0)) {
      arrayOfByte5 = paramValidation.d;
    }
    if (arrayOfByte5 != null) {
      j += arrayOfByte5.length;
    }
    this.a = ((8224 - j) / 8);
    if (this.c > this.a) {
      j += this.a * 8;
    } else {
      j += this.c * 8;
    }
    a((short)j);
    this.b = new byte[j];
    switch (paramValidation.getType())
    {
    case 7: 
      this.b[0] = 7;
      break;
    case 4: 
      this.b[0] = 4;
      break;
    case 2: 
      this.b[0] = 2;
      break;
    case 3: 
      this.b[0] = 3;
      if (!paramValidation.getInCellDropDown()) {
        this.b[1] = 2;
      }
      if ((arrayOfByte4 != null) && (arrayOfByte4.length > 0) && (arrayOfByte4[0] == 23)) {
        if (arrayOfByte4[2] == 0)
        {
          if (arrayOfByte4.length == (arrayOfByte4[1] & 0xFF) + 3)
          {
            int tmp468_467 = 0;
            byte[] tmp468_464 = this.b;
            tmp468_464[tmp468_467] = ((byte)(tmp468_464[tmp468_467] | 0x80));
          }
        }
        else if ((arrayOfByte4[2] == 1) && (arrayOfByte4.length == 2 * (arrayOfByte4[1] & 0xFF) + 3))
        {
          int tmp510_509 = 0;
          byte[] tmp510_506 = this.b;
          tmp510_506[tmp510_509] = ((byte)(tmp510_506[tmp510_509] | 0x80));
        }
      }
      break;
    case 6: 
      this.b[0] = 6;
      break;
    case 5: 
      this.b[0] = 5;
      break;
    case 1: 
      this.b[0] = 1;
      break;
    }
    switch (paramValidation.getAlertStyle())
    {
    case 0: 
      int tmp589_588 = 0;
      byte[] tmp589_585 = this.b;
      tmp589_585[tmp589_588] = ((byte)(tmp589_585[tmp589_588] | 0x20));
      break;
    case 2: 
      int tmp604_603 = 0;
      byte[] tmp604_600 = this.b;
      tmp604_600[tmp604_603] = ((byte)(tmp604_600[tmp604_603] | 0x10));
      break;
    }
    if (paramValidation.getIgnoreBlank())
    {
      int tmp626_625 = 1;
      byte[] tmp626_622 = this.b;
      tmp626_622[tmp626_625] = ((byte)(tmp626_622[tmp626_625] | 0x1));
    }
    if (paramValidation.getShowInput()) {
      this.b[2] = 4;
    }
    if (paramValidation.getShowError())
    {
      int tmp658_657 = 2;
      byte[] tmp658_654 = this.b;
      tmp658_654[tmp658_657] = ((byte)(tmp658_654[tmp658_657] | 0x8));
    }
    switch (paramValidation.getOperator())
    {
    case 1: 
      int tmp721_720 = 2;
      byte[] tmp721_717 = this.b;
      tmp721_717[tmp721_720] = ((byte)(tmp721_717[tmp721_720] | 0x20));
      break;
    case 3: 
      int tmp736_735 = 2;
      byte[] tmp736_732 = this.b;
      tmp736_732[tmp736_735] = ((byte)(tmp736_732[tmp736_735] | 0x60));
      break;
    case 2: 
      int tmp751_750 = 2;
      byte[] tmp751_747 = this.b;
      tmp751_747[tmp751_750] = ((byte)(tmp751_747[tmp751_750] | 0x40));
      break;
    case 5: 
      int tmp766_765 = 2;
      byte[] tmp766_762 = this.b;
      tmp766_762[tmp766_765] = ((byte)(tmp766_762[tmp766_765] | 0x70));
      break;
    case 4: 
      int tmp781_780 = 2;
      byte[] tmp781_777 = this.b;
      tmp781_777[tmp781_780] = ((byte)(tmp781_777[tmp781_780] | 0x50));
      break;
    case 7: 
      int tmp796_795 = 2;
      byte[] tmp796_792 = this.b;
      tmp796_792[tmp796_795] = ((byte)(tmp796_792[tmp796_795] | 0x10));
      break;
    case 8: 
      int tmp811_810 = 2;
      byte[] tmp811_807 = this.b;
      tmp811_807[tmp811_810] = ((byte)(tmp811_807[tmp811_810] | 0x30));
      break;
    }
    int k = 4;
    if (localObject == null)
    {
      this.b[k] = 1;
      k += 4;
    }
    else
    {
      System.arraycopy(zc.a(paramValidation.getInputTitle().length()), 0, this.b, k, 2);
      if (paramValidation.getInputTitle().length() != localObject.length) {
        this.b[(k + 2)] = 1;
      }
      k += 3;
      System.arraycopy(localObject, 0, this.b, k, localObject.length);
      k += localObject.length;
    }
    if (arrayOfByte2 == null)
    {
      this.b[k] = 1;
      k += 4;
    }
    else
    {
      System.arraycopy(zc.a(paramValidation.getErrorTitle().length()), 0, this.b, k, 2);
      if (paramValidation.getErrorTitle().length() != arrayOfByte2.length) {
        this.b[(k + 2)] = 1;
      }
      k += 3;
      System.arraycopy(arrayOfByte2, 0, this.b, k, arrayOfByte2.length);
      k += arrayOfByte2.length;
    }
    if (arrayOfByte1 == null)
    {
      this.b[k] = 1;
      k += 4;
    }
    else
    {
      System.arraycopy(zc.a(paramValidation.getInputMessage().length()), 0, this.b, k, 2);
      if (paramValidation.getInputMessage().length() != arrayOfByte1.length) {
        this.b[(k + 2)] = 1;
      }
      k += 3;
      System.arraycopy(arrayOfByte1, 0, this.b, k, arrayOfByte1.length);
      k += arrayOfByte1.length;
    }
    if (arrayOfByte3 == null)
    {
      this.b[k] = 1;
      k += 4;
    }
    else
    {
      System.arraycopy(zc.a(paramValidation.getErrorMessage().length()), 0, this.b, k, 2);
      if (paramValidation.getErrorMessage().length() != arrayOfByte3.length) {
        this.b[(k + 2)] = 1;
      }
      k += 3;
      System.arraycopy(arrayOfByte3, 0, this.b, k, arrayOfByte3.length);
      k += arrayOfByte3.length;
    }
    if (arrayOfByte4 == null)
    {
      k += 4;
    }
    else
    {
      System.arraycopy(zc.a(arrayOfByte4.length), 0, this.b, k, 2);
      k += 4;
      System.arraycopy(arrayOfByte4, 0, this.b, k, arrayOfByte4.length);
      k += arrayOfByte4.length;
    }
    if (arrayOfByte5 == null)
    {
      k += 4;
    }
    else
    {
      System.arraycopy(zc.a(arrayOfByte5.length), 0, this.b, k, 2);
      k += 4;
      System.arraycopy(arrayOfByte5, 0, this.b, k, arrayOfByte5.length);
      k += arrayOfByte5.length;
    }
    this.g = k;
    return true;
  }
  
  boolean a()
  {
    int j = this.c - this.i > this.a ? this.a : this.c - this.i;
    if (j == 0) {
      return false;
    }
    int k = this.g;
    a((short)(k + 2 + j * 8));
    if (d() < this.b.length)
    {
      byte[] arrayOfByte = new byte[d()];
      System.arraycopy(this.b, 0, arrayOfByte, 0, arrayOfByte.length);
      this.b = arrayOfByte;
    }
    System.arraycopy(zc.a(j), 0, this.b, k, 2);
    k += 2;
    for (int m = 0; m < j; m++)
    {
      Object localObject = this.h.getAreaList().get(m + this.i);
      if ((localObject instanceof CellArea))
      {
        CellArea localCellArea = (CellArea)localObject;
        System.arraycopy(zc.a(localCellArea.StartRow), 0, this.b, k, 2);
        k += 2;
        System.arraycopy(zc.a(localCellArea.EndRow), 0, this.b, k, 2);
        k += 2;
        this.b[k] = ((byte)localCellArea.StartColumn);
        k += 2;
        this.b[k] = ((byte)localCellArea.EndColumn);
        k += 2;
      }
    }
    this.i += j;
    return true;
  }
  
  private int c(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return 4;
    }
    return paramArrayOfByte.length + 3;
  }
  
  Validation a(byte[] paramArrayOfByte)
    throws Exception
  {
    Validation localValidation = new Validation(this.f.getValidations());
    localValidation.a = true;
    int j = paramArrayOfByte[0] & 0xFF & 0xF;
    switch (j)
    {
    case 0: 
      localValidation.setType(0);
      break;
    case 1: 
      localValidation.setType(1);
      break;
    case 2: 
      localValidation.setType(2);
      break;
    case 3: 
      localValidation.setType(3);
      break;
    case 4: 
      localValidation.setType(4);
      break;
    case 5: 
      localValidation.setType(5);
      break;
    case 6: 
      localValidation.setType(6);
      break;
    case 7: 
      localValidation.setType(7);
      break;
    }
    j = paramArrayOfByte[0] & 0xFF & 0x70;
    switch (j)
    {
    case 0: 
      localValidation.setAlertStyle(1);
      break;
    case 16: 
      localValidation.setAlertStyle(2);
      break;
    case 32: 
      localValidation.setAlertStyle(0);
      break;
    }
    j = paramArrayOfByte[1] & 0xFF & 0x1;
    if (j != 0) {
      localValidation.setIgnoreBlank(true);
    } else {
      localValidation.setIgnoreBlank(false);
    }
    j = paramArrayOfByte[1] & 0xFF & 0x2;
    if (j == 0) {
      localValidation.setInCellDropDown(true);
    } else {
      localValidation.setInCellDropDown(false);
    }
    j = ((paramArrayOfByte[2] & 0xFF & 0x3) << 6) + ((paramArrayOfByte[1] & 0xFF & 0xFC) >> 2);
    switch (j)
    {
    case 0: 
      localValidation.a(0);
      break;
    case 1: 
      localValidation.a(1);
      break;
    case 2: 
      localValidation.a(2);
      break;
    case 3: 
      localValidation.a(3);
      break;
    case 4: 
      localValidation.a(4);
      break;
    case 5: 
      localValidation.a(5);
      break;
    case 6: 
      localValidation.a(6);
      break;
    case 7: 
      localValidation.a(7);
      break;
    case 8: 
      localValidation.a(8);
      break;
    case 9: 
      localValidation.a(9);
      break;
    case 10: 
      localValidation.a(10);
      break;
    default: 
      localValidation.a(0);
    }
    j = paramArrayOfByte[2] & 0xFF & 0x4;
    if (j == 0) {
      localValidation.setShowInput(false);
    } else {
      localValidation.setShowInput(true);
    }
    j = paramArrayOfByte[2] & 0xFF & 0x8;
    if (j == 0) {
      localValidation.setShowError(false);
    } else {
      localValidation.setShowError(true);
    }
    j = paramArrayOfByte[2] & 0xFF & 0xF0;
    switch (j)
    {
    case 0: 
      localValidation.setOperator(0);
      break;
    case 16: 
      localValidation.setOperator(7);
      break;
    case 32: 
      localValidation.setOperator(1);
      break;
    case 48: 
      localValidation.setOperator(8);
      break;
    case 64: 
      localValidation.setOperator(2);
      break;
    case 80: 
      localValidation.setOperator(4);
      break;
    case 96: 
      localValidation.setOperator(3);
      break;
    case 112: 
      localValidation.setOperator(5);
      break;
    }
    int k = 4;
    int[] arrayOfInt = { k };
    localValidation.setInputTitle(a(paramArrayOfByte, arrayOfInt));
    k = arrayOfInt[0];
    arrayOfInt[0] = k;
    localValidation.setErrorTitle(a(paramArrayOfByte, arrayOfInt));
    k = arrayOfInt[0];
    arrayOfInt[0] = k;
    localValidation.setInputMessage(a(paramArrayOfByte, arrayOfInt));
    k = arrayOfInt[0];
    arrayOfInt[0] = k;
    localValidation.setErrorMessage(a(paramArrayOfByte, arrayOfInt));
    k = arrayOfInt[0];
    int m = paramArrayOfByte[k] & 0xFF;
    int n = 0;
    int i1 = 0;
    m = zc.e(paramArrayOfByte, k) & 0xFFFF;
    k += 4;
    if (m != 0)
    {
      localValidation.c = new byte[m];
      System.arraycopy(paramArrayOfByte, k, localValidation.c, 0, m);
      k += m;
    }
    m = zc.e(paramArrayOfByte, k) & 0xFFFF;
    k += 4;
    if (m != 0)
    {
      localValidation.d = new byte[m];
      System.arraycopy(paramArrayOfByte, k, localValidation.d, 0, m);
      k += m;
    }
    int i2 = zc.e(paramArrayOfByte, k);
    if ((i2 & 0xFFFF) == 0) {
      return null;
    }
    this.d = (n = zc.e(paramArrayOfByte, k + 2) & 0xFFFF);
    this.e = (i1 = paramArrayOfByte[(k + 6)] & 0xFF);
    k += 2;
    for (int i3 = 0; i3 < (i2 & 0xFFFF); i3++)
    {
      CellArea localCellArea = a(paramArrayOfByte, k);
      k += 8;
      zf.a(localValidation.getAreaList(), localCellArea);
    }
    return localValidation;
  }
  
  private CellArea a(byte[] paramArrayOfByte, int paramInt)
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = (zc.e(paramArrayOfByte, paramInt) & 0xFFFF);
    paramInt += 2;
    localCellArea.EndRow = (zc.e(paramArrayOfByte, paramInt) & 0xFFFF);
    localCellArea.StartColumn = (paramArrayOfByte[(paramInt + 2)] & 0xFF);
    localCellArea.EndColumn = (paramArrayOfByte[(paramInt + 4)] & 0xFF);
    paramInt += 6;
    return localCellArea;
  }
  
  private String a(byte[] paramArrayOfByte, int[] paramArrayOfInt)
    throws Exception
  {
    int j = zc.e(paramArrayOfByte, paramArrayOfInt[0]);
    if ((j & 0xFFFF) == 0)
    {
      paramArrayOfInt[0] += 3;
      return null;
    }
    if (((j & 0xFFFF) == 0) || (((j & 0xFFFF) == 1) && (paramArrayOfByte[(paramArrayOfInt[0] + 2)] == 0) && (paramArrayOfByte[(paramArrayOfInt[0] + 3)] == 0)))
    {
      paramArrayOfInt[0] += 4;
      return null;
    }
    paramArrayOfInt[0] += 2;
    if (paramArrayOfByte[paramArrayOfInt[0]] == 0)
    {
      localObject = new byte[2 * (j & 0xFFFF)];
      for (int k = 0; k < (j & 0xFFFF); k++) {
        localObject[(2 * k)] = paramArrayOfByte[(paramArrayOfInt[0] + k + 1)];
      }
      paramArrayOfInt[0] += (j & 0xFFFF) + 1;
      return Encoding.getUnicode().a((byte[])localObject);
    }
    Object localObject = Encoding.getUnicode().a(paramArrayOfByte, paramArrayOfInt[0] + 1, 2 * (j & 0xFFFF));
    paramArrayOfInt[0] += 2 * (j & 0xFFFF) + 1;
    return (String)localObject;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */