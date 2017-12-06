package com.aspose.cells;

class zdo
{
  static float a(Cells paramCells, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    Border localBorder1 = null;
    Border localBorder2 = null;
    Border localBorder3 = null;
    Cell localCell1 = null;
    Cell localCell2 = null;
    Cell localCell3 = null;
    switch (paramInt5)
    {
    case 1: 
      localCell1 = paramCells.checkCell(paramInt1, paramInt2);
      if (localCell1 != null)
      {
        localBorder1 = a(localCell1, 1);
      }
      else
      {
        localCell1 = paramCells.checkCell(paramInt1, paramInt2 - 1);
        localBorder1 = a(localCell1, 2);
      }
      localCell2 = paramCells.checkCell(paramInt3, paramInt4);
      if (localCell2 != null)
      {
        localBorder2 = a(localCell2, 1);
      }
      else
      {
        localCell2 = paramCells.checkCell(paramInt3, paramInt4 - 1);
        localBorder2 = a(localCell2, 2);
      }
      break;
    case 4: 
      localCell1 = paramCells.checkCell(paramInt1, paramInt2);
      if (localCell1 != null)
      {
        localBorder1 = a(localCell1, 4);
      }
      else
      {
        localCell1 = paramCells.checkCell(paramInt1 - 1, paramInt2);
        localBorder1 = a(localCell1, 8);
      }
      localCell2 = paramCells.checkCell(paramInt3, paramInt4);
      if (localCell2 != null)
      {
        localBorder2 = a(localCell2, 4);
      }
      else
      {
        localCell2 = paramCells.checkCell(paramInt3 - 1, paramInt4);
        localBorder2 = a(localCell2, 8);
      }
      break;
    case 2: 
      localCell1 = paramCells.checkCell(paramInt1, paramInt2);
      if (localCell1 != null)
      {
        localBorder1 = a(localCell1, 2);
      }
      else
      {
        localCell1 = paramCells.checkCell(paramInt1, paramInt2 + 1);
        localBorder1 = a(localCell1, 1);
      }
      localCell2 = paramCells.checkCell(paramInt3, paramInt4);
      if (localCell2 != null)
      {
        localBorder2 = a(localCell2, 2);
      }
      else
      {
        localCell2 = paramCells.checkCell(paramInt3, paramInt4 + 1);
        localBorder2 = a(localCell2, 1);
      }
      break;
    case 8: 
      localCell1 = paramCells.checkCell(paramInt1, paramInt2);
      if (localCell1 != null)
      {
        localBorder1 = a(localCell1, 8);
      }
      else
      {
        localCell1 = paramCells.checkCell(paramInt1 + 1, paramInt2);
        localBorder1 = a(localCell1, 4);
      }
      localCell2 = paramCells.checkCell(paramInt3, paramInt4);
      if (localCell2 != null)
      {
        localBorder2 = a(localCell2, 8);
      }
      else
      {
        localCell2 = paramCells.checkCell(paramInt3 + 1, paramInt4);
        localBorder2 = a(localCell2, 4);
      }
      break;
    }
    switch (paramInt8)
    {
    case 1: 
      localCell3 = paramCells.checkCell(paramInt6, paramInt7);
      if (localCell3 != null)
      {
        localBorder3 = a(localCell3, 1);
      }
      else
      {
        localCell3 = paramCells.checkCell(paramInt6, paramInt7 - 1);
        localBorder3 = a(localCell3, 2);
      }
      break;
    case 4: 
      localCell3 = paramCells.checkCell(paramInt6, paramInt7);
      if (localCell3 != null)
      {
        localBorder3 = a(localCell3, 4);
      }
      else
      {
        localCell3 = paramCells.checkCell(paramInt6 - 1, paramInt7);
        localBorder3 = a(localCell3, 8);
      }
      break;
    case 2: 
      localCell3 = paramCells.checkCell(paramInt6, paramInt7);
      if (localCell3 != null)
      {
        localBorder3 = a(localCell3, 2);
      }
      else
      {
        localCell3 = paramCells.checkCell(paramInt6, paramInt7 + 1);
        localBorder3 = a(localCell3, 1);
      }
      break;
    case 8: 
      localCell3 = paramCells.checkCell(paramInt6, paramInt7);
      if (localCell3 != null)
      {
        localBorder3 = a(localCell3, 8);
      }
      else
      {
        localCell3 = paramCells.checkCell(paramInt6 + 1, paramInt7);
        localBorder3 = a(localCell3, 4);
      }
      break;
    }
    return a(localBorder1, localBorder2, localBorder3);
  }
  
  private static Border a(Cell paramCell, int paramInt)
  {
    Style localStyle = null;
    Border localBorder = null;
    if (paramCell != null) {
      localStyle = paramCell.getStyle();
    }
    if (localStyle != null) {
      localBorder = localStyle.f() ? localStyle.d().getByBorderType(paramInt) : null;
    }
    return localBorder;
  }
  
  static float a(Cells paramCells, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    Border localBorder1 = null;
    Border localBorder2 = null;
    Cell localCell1 = null;
    Cell localCell2 = null;
    switch (paramInt5)
    {
    case 1: 
      localCell1 = paramCells.checkCell(paramInt1, paramInt2);
      if (localCell1 != null)
      {
        localBorder1 = a(localCell1, 1);
      }
      else
      {
        localCell1 = paramCells.checkCell(paramInt1, paramInt2 - 1);
        localBorder1 = a(localCell1, 2);
      }
      localCell2 = paramCells.checkCell(paramInt3, paramInt4);
      if (localCell2 != null)
      {
        localBorder2 = a(localCell2, 1);
      }
      else
      {
        localCell2 = paramCells.checkCell(paramInt3, paramInt4 - 1);
        localBorder2 = a(localCell2, 2);
      }
      break;
    case 4: 
      localCell1 = paramCells.checkCell(paramInt1, paramInt2);
      if (localCell1 != null)
      {
        localBorder1 = a(localCell1, 4);
      }
      else
      {
        localCell1 = paramCells.checkCell(paramInt1 - 1, paramInt2);
        localBorder1 = a(localCell1, 8);
      }
      localCell2 = paramCells.checkCell(paramInt3, paramInt4);
      if (localCell2 != null)
      {
        localBorder2 = a(localCell2, 4);
      }
      else
      {
        localCell2 = paramCells.checkCell(paramInt3 - 1, paramInt4);
        localBorder2 = a(localCell2, 8);
      }
      break;
    case 2: 
      localCell1 = paramCells.checkCell(paramInt1, paramInt2);
      if (localCell1 != null)
      {
        localBorder1 = a(localCell1, 2);
      }
      else
      {
        localCell1 = paramCells.checkCell(paramInt1, paramInt2 + 1);
        localBorder1 = a(localCell1, 1);
      }
      localCell2 = paramCells.checkCell(paramInt3, paramInt4);
      if (localCell2 != null)
      {
        localBorder2 = a(localCell2, 2);
      }
      else
      {
        localCell2 = paramCells.checkCell(paramInt3, paramInt4 + 1);
        localBorder2 = a(localCell2, 1);
      }
      break;
    case 8: 
      localCell1 = paramCells.checkCell(paramInt1, paramInt2);
      if (localCell1 != null)
      {
        localBorder1 = a(localCell1, 8);
      }
      else
      {
        localCell1 = paramCells.checkCell(paramInt1 + 1, paramInt2);
        localBorder1 = a(localCell1, 4);
      }
      localCell2 = paramCells.checkCell(paramInt3, paramInt4);
      if (localCell2 != null)
      {
        localBorder2 = a(localCell2, 8);
      }
      else
      {
        localCell2 = paramCells.checkCell(paramInt3 + 1, paramInt4);
        localBorder2 = a(localCell2, 4);
      }
      break;
    }
    return a(localBorder1, localBorder2);
  }
  
  static float b(Cells paramCells, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    Border localBorder1 = null;
    Border localBorder2 = null;
    Cell localCell1 = null;
    Cell localCell2 = null;
    switch (paramInt5)
    {
    case 1: 
      localCell1 = paramCells.checkCell(paramInt1, paramInt2);
      if (localCell1 != null)
      {
        localBorder1 = a(localCell1, 1);
      }
      else
      {
        localCell1 = paramCells.checkCell(paramInt1, paramInt2 - 1);
        localBorder1 = a(localCell1, 2);
      }
      localCell2 = paramCells.checkCell(paramInt3, paramInt4);
      if (localCell2 != null)
      {
        localBorder2 = a(localCell2, 1);
      }
      else
      {
        localCell2 = paramCells.checkCell(paramInt3, paramInt4 - 1);
        localBorder2 = a(localCell2, 2);
      }
      break;
    case 4: 
      localCell1 = paramCells.checkCell(paramInt1, paramInt2);
      if (localCell1 != null)
      {
        localBorder1 = a(localCell1, 4);
      }
      else
      {
        localCell1 = paramCells.checkCell(paramInt1 - 1, paramInt2);
        localBorder1 = a(localCell1, 8);
      }
      localCell2 = paramCells.checkCell(paramInt3, paramInt4);
      if (localCell2 != null)
      {
        localBorder2 = a(localCell2, 4);
      }
      else
      {
        localCell2 = paramCells.checkCell(paramInt3 - 1, paramInt4);
        localBorder2 = a(localCell2, 8);
      }
      break;
    case 2: 
      localCell1 = paramCells.checkCell(paramInt1, paramInt2);
      if (localCell1 != null)
      {
        localBorder1 = a(localCell1, 2);
      }
      else
      {
        localCell1 = paramCells.checkCell(paramInt1, paramInt2 + 1);
        localBorder1 = a(localCell1, 1);
      }
      localCell2 = paramCells.checkCell(paramInt3, paramInt4);
      if (localCell2 != null)
      {
        localBorder2 = a(localCell2, 2);
      }
      else
      {
        localCell2 = paramCells.checkCell(paramInt3, paramInt4 + 1);
        localBorder2 = a(localCell2, 1);
      }
      break;
    case 8: 
      localCell1 = paramCells.checkCell(paramInt1, paramInt2);
      if (localCell1 != null)
      {
        localBorder1 = a(localCell1, 8);
      }
      else
      {
        localCell1 = paramCells.checkCell(paramInt1 + 1, paramInt2);
        localBorder1 = a(localCell1, 4);
      }
      localCell2 = paramCells.checkCell(paramInt3, paramInt4);
      if (localCell2 != null)
      {
        localBorder2 = a(localCell2, 8);
      }
      else
      {
        localCell2 = paramCells.checkCell(paramInt3 + 1, paramInt4);
        localBorder2 = a(localCell2, 4);
      }
      break;
    }
    return b(localBorder1, localBorder2);
  }
  
  private static float a(Border paramBorder1, Border paramBorder2, Border paramBorder3)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    if (paramBorder1 == null) {
      bool1 = false;
    } else {
      bool1 = paramBorder1.getLineStyle() == 6;
    }
    if (paramBorder2 == null) {
      bool2 = false;
    } else {
      bool2 = paramBorder2.getLineStyle() == 6;
    }
    if (paramBorder3 == null) {
      bool3 = false;
    } else {
      bool3 = paramBorder3.getLineStyle() == 6;
    }
    int i = a(bool1, bool2, bool3);
    if ((a(paramBorder1) == 3.0F) || (a(paramBorder2) == 3.0F)) {
      return i * 0.333F;
    }
    if ((a(paramBorder1) == 2.0F) || (a(paramBorder2) == 2.0F)) {
      return i * 1.0F;
    }
    if ((a(paramBorder1) == 1.0F) || (a(paramBorder2) == 1.0F)) {
      return i * 0.5F;
    }
    if ((a(paramBorder1) == 0.5F) || (a(paramBorder2) == 0.5F)) {
      return i * 0.25F;
    }
    return 0.0F;
  }
  
  private static float a(Border paramBorder1, Border paramBorder2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if (paramBorder1 == null) {
      bool1 = false;
    } else {
      bool1 = paramBorder1.getLineStyle() == 6;
    }
    if (paramBorder2 == null) {
      bool2 = false;
    } else {
      bool2 = paramBorder2.getLineStyle() == 6;
    }
    int i = a(bool1, bool2);
    if ((a(paramBorder1) == 3.0F) || (a(paramBorder2) == 3.0F)) {
      return i * 1.0F;
    }
    if ((a(paramBorder1) == 2.0F) || (a(paramBorder2) == 2.0F)) {
      return i * 1.0F;
    }
    if ((a(paramBorder1) == 1.0F) || (a(paramBorder2) == 1.0F)) {
      return i * 0.5F;
    }
    if ((a(paramBorder1) == 0.5F) || (a(paramBorder2) == 0.5F)) {
      return i * 0.25F;
    }
    return 0.0F;
  }
  
  private static float b(Border paramBorder1, Border paramBorder2)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if (paramBorder1 == null) {
      bool1 = false;
    } else {
      bool1 = paramBorder1.getLineStyle() == 6;
    }
    if (paramBorder2 == null) {
      bool2 = false;
    } else {
      bool2 = paramBorder2.getLineStyle() == 6;
    }
    int i = b(bool1, bool2);
    if ((a(paramBorder1) == 3.0F) || (a(paramBorder2) == 3.0F)) {
      return i * 1;
    }
    if ((a(paramBorder1) == 2.0F) || (a(paramBorder2) == 2.0F)) {
      return i * 1.0F;
    }
    if ((a(paramBorder1) == 1.0F) || (a(paramBorder2) == 1.0F)) {
      return i * 0.5F;
    }
    if ((a(paramBorder1) == 0.5F) || (a(paramBorder2) == 0.5F)) {
      return i * 0.25F;
    }
    return 0.0F;
  }
  
  static float a(Border paramBorder)
  {
    if (paramBorder == null) {
      return 0.0F;
    }
    switch (paramBorder.getLineStyle())
    {
    case 3: 
    case 4: 
    case 7: 
    case 9: 
    case 11: 
    case 13: 
      return 0.5F;
    case 1: 
    case 2: 
    case 8: 
    case 10: 
      return 1.0F;
    case 5: 
      return 2.0F;
    case 6: 
      return 3.0F;
    }
    return 0.0F;
  }
  
  private static int a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean1) && (!paramBoolean2)) {
      return 0;
    }
    if ((paramBoolean1 == true) && (!paramBoolean2)) {
      return 0;
    }
    if ((paramBoolean1 == true) && (paramBoolean2 == true)) {
      return 0;
    }
    if ((!paramBoolean1) && (paramBoolean2 == true)) {
      return -1;
    }
    return 0;
  }
  
  private static int b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean1) && (!paramBoolean2)) {
      return 0;
    }
    if ((paramBoolean1 == true) && (!paramBoolean2)) {
      return -1;
    }
    if ((paramBoolean1 == true) && (paramBoolean2 == true)) {
      return 0;
    }
    if ((!paramBoolean1) && (paramBoolean2 == true)) {
      return 0;
    }
    return 0;
  }
  
  private static int a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((!paramBoolean1) && (!paramBoolean2))
    {
      if (paramBoolean3) {
        return -1;
      }
      return 1;
    }
    if (((paramBoolean1) && (!paramBoolean2)) || ((!paramBoolean1) && (paramBoolean2))) {
      return -1;
    }
    if ((paramBoolean1) && (paramBoolean2)) {
      return 0;
    }
    return 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */