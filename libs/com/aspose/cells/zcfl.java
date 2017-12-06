package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zcfl
  extends zche
{
  zcfl()
  {
    this.d = 64;
  }
  
  void a(Validation paramValidation)
    throws Exception
  {
    int i = 20;
    i += paramValidation.getAreaList().size() * 16 + 4;
    if (paramValidation.getErrorTitle() != null) {
      i += paramValidation.getErrorTitle().length() * 2;
    }
    if (paramValidation.getErrorMessage() != null) {
      i += paramValidation.getErrorMessage().length() * 2;
    }
    if (paramValidation.getInputTitle() != null) {
      i += paramValidation.getInputTitle().length() * 2;
    }
    if (paramValidation.getInputMessage() != null) {
      i += paramValidation.getInputMessage().length() * 2;
    }
    byte[] arrayOfByte1 = paramValidation.c;
    if (arrayOfByte1 != null) {
      i += arrayOfByte1.length + 4 + 4;
    } else {
      i += 8;
    }
    byte[] arrayOfByte2 = paramValidation.d;
    if (arrayOfByte2 != null) {
      i += arrayOfByte2.length + 4 + 4;
    } else {
      i += 8;
    }
    this.c = new byte[i];
    long l1 = 0L;
    long l2 = 0L;
    switch (paramValidation.getType())
    {
    case 0: 
      l2 = 0L;
      break;
    case 1: 
      l2 = 1L;
      break;
    case 2: 
      l2 = 2L;
      break;
    case 3: 
      l2 = 3L;
      break;
    case 4: 
      l2 = 4L;
      break;
    case 5: 
      l2 = 5L;
      break;
    case 6: 
      l2 = 6L;
      break;
    case 7: 
      l2 = 7L;
      break;
    }
    l1 |= l2;
    l2 = 0L;
    switch (paramValidation.getAlertStyle())
    {
    case 1: 
      l2 = 0L;
      break;
    case 2: 
      l2 = 16L;
      break;
    case 0: 
      l2 = 32L;
      break;
    }
    l1 |= l2;
    if (paramValidation.getIgnoreBlank()) {
      l1 |= 0x100;
    }
    if (!paramValidation.getInCellDropDown()) {
      l1 |= 0x200;
    }
    l2 = 0L;
    switch (paramValidation.c())
    {
    case 0: 
      l2 = 0L;
      break;
    case 1: 
      l2 = 1L;
      break;
    case 2: 
      l2 = 2L;
      break;
    default: 
      l2 = 0L;
    }
    l1 |= l2 << 10 & 0xFFFFFFFF;
    if (paramValidation.getShowInput()) {
      l1 |= 0x40000;
    }
    if (paramValidation.getShowError()) {
      l1 |= 0x80000;
    }
    l2 = 0L;
    switch (paramValidation.getOperator())
    {
    case 0: 
      l2 = 0L;
      break;
    case 7: 
      l2 = 1L;
      break;
    case 1: 
      l2 = 2L;
      break;
    case 8: 
      l2 = 3L;
      break;
    case 2: 
      l2 = 4L;
      break;
    case 4: 
      l2 = 5L;
      break;
    case 3: 
      l2 = 6L;
      break;
    case 5: 
      l2 = 7L;
    }
    l1 |= l2 << 20 & 0xFFFFFFFF;
    System.arraycopy(zc.a(l1), 0, this.c, 0, 4);
    zcgj.a(paramValidation.getAreaList(), this.c, 4);
    int j = paramValidation.getAreaList().size() * 16 + 4 + 4;
    j = zcgj.a(this.c, j, paramValidation.getErrorTitle());
    j = zcgj.a(this.c, j, paramValidation.getErrorMessage());
    j = zcgj.a(this.c, j, paramValidation.getInputTitle());
    j = zcgj.a(this.c, j, paramValidation.getInputMessage());
    if (arrayOfByte1 != null)
    {
      System.arraycopy(zc.a(arrayOfByte1.length), 0, this.c, j, 4);
      j += 4;
      System.arraycopy(arrayOfByte1, 0, this.c, j, arrayOfByte1.length);
      j += arrayOfByte1.length + 4;
    }
    else
    {
      j += 8;
    }
    if (arrayOfByte2 != null)
    {
      System.arraycopy(zc.a(arrayOfByte2.length), 0, this.c, j, 4);
      j += 4;
      System.arraycopy(arrayOfByte2, 0, this.c, j, arrayOfByte2.length);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */