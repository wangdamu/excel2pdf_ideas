package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zarm
  extends zcd
{
  private ArrayList a;
  
  zarm()
  {
    c(93);
  }
  
  void a(Shape paramShape, int paramInt)
  {
    if (this.b == null)
    {
      b(70);
      this.b = new byte[d()];
      int i = e(paramShape);
      this.b[8] = 1;
      this.b[9] = 33;
      i += a(i, 100, 10);
      switch (paramShape.getMsoDrawingType())
      {
      case 20: 
        Object localObject = ((ComboBox)paramShape).a();
        byte[] arrayOfByte;
        if ((localObject instanceof AutoFilter))
        {
          arrayOfByte = new byte[] { 19, 0, -18, 31, 0, 0, 0, 0, 4, 0, 1, 3, 0, 0, 2, 0, 8, 0, 108, 0 };
          System.arraycopy(arrayOfByte, 0, this.b, i, arrayOfByte.length);
        }
        else if ((localObject instanceof ValidationCollection))
        {
          arrayOfByte = new byte[] { 19, 0, -18, 31, 0, 0, 0, 0, 1, 0, 1, 6, 0, 0, 2, 0, 8, 0, 64, 0 };
          System.arraycopy(arrayOfByte, 0, this.b, i, arrayOfByte.length);
        }
        else if ((localObject instanceof PivotTable))
        {
          arrayOfByte = new byte[] { 19, 0, -18, 31, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 2, 0, 8, 0, 0, 0 };
          System.arraycopy(arrayOfByte, 0, this.b, i, arrayOfByte.length);
        }
        break;
      }
      return;
    }
    System.arraycopy(zc.a(paramInt), 0, this.b, 6, 2);
  }
  
  void a(Picture paramPicture)
  {
    byte[] arrayOfByte1 = paramPicture.y;
    if ((arrayOfByte1 == null) && (paramPicture.S().a != null) && (paramPicture.S().a.size() != 0))
    {
      c(paramPicture);
      return;
    }
    b(22);
    if ((paramPicture.S().a != null) && (paramPicture.S().a.size() != 0))
    {
      for (int i = 0; i < paramPicture.S().a.size(); i++)
      {
        byte[] arrayOfByte3 = (byte[])paramPicture.S().a.get(i);
        if (arrayOfByte3[0] == 9)
        {
          arrayOfByte3 = a(arrayOfByte3, arrayOfByte1);
          paramPicture.S().a.set(i, arrayOfByte3);
        }
        b(d() + (short)arrayOfByte3.length);
      }
      c(paramPicture);
    }
    else
    {
      b(d() + 4);
      byte[] arrayOfByte2 = null;
      if (arrayOfByte1 != null)
      {
        arrayOfByte2 = a(null, arrayOfByte1);
        b(d() + (short)arrayOfByte2.length);
      }
      this.b = new byte[d()];
      int j = e(paramPicture);
      if (arrayOfByte2 != null) {
        System.arraycopy(arrayOfByte2, 0, this.b, j, arrayOfByte2.length);
      }
    }
  }
  
  byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte2 == null) {
      return paramArrayOfByte1;
    }
    int i = paramArrayOfByte2.length % 2;
    byte[] arrayOfByte1 = new byte[paramArrayOfByte2.length + 2 + 6 + i];
    int j = 0;
    System.arraycopy(zc.a(paramArrayOfByte2.length + 6 + i), 0, arrayOfByte1, j, 2);
    j += 2;
    System.arraycopy(zc.a(paramArrayOfByte2.length), 0, arrayOfByte1, j, 2);
    j += 2;
    j += 4;
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte1, j, paramArrayOfByte2.length);
    byte[] arrayOfByte2 = null;
    j = 0;
    int k = 6;
    if (paramArrayOfByte1 != null)
    {
      k += zc.b(paramArrayOfByte1, 4);
      arrayOfByte2 = new byte[arrayOfByte1.length + 4 + paramArrayOfByte1.length - k];
    }
    else
    {
      arrayOfByte2 = new byte[arrayOfByte1.length + 4];
    }
    arrayOfByte2[j] = 9;
    j += 2;
    System.arraycopy(zc.a(arrayOfByte2.length - 4), 0, arrayOfByte2, j, 2);
    j += 2;
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, j, arrayOfByte1.length);
    j += arrayOfByte1.length;
    j += i;
    if ((paramArrayOfByte1 != null) && (paramArrayOfByte1.length - k > 0)) {
      System.arraycopy(paramArrayOfByte1, k, arrayOfByte2, j, paramArrayOfByte1.length - k);
    }
    return arrayOfByte2;
  }
  
  void a(Shape paramShape)
    throws Exception
  {
    switch (paramShape.getMsoDrawingType())
    {
    case 8: 
      if (((Picture)paramShape).d)
      {
        a((Picture)paramShape);
        return;
      }
      break;
    case 24: 
      if (((OleObject)paramShape).i())
      {
        a((OleObject)paramShape);
        return;
      }
      break;
    case 11: 
      a((CheckBox)paramShape);
      return;
    case 20: 
      if (!paramShape.R().i().b()) {
        a((ComboBox)paramShape);
      } else {
        c(paramShape);
      }
      return;
    case 18: 
      a((ListBox)paramShape);
      return;
    case 12: 
      a((RadioButton)paramShape);
      return;
    case 16: 
    case 17: 
      d(paramShape);
      return;
    }
    if ((paramShape.S().a != null) && (paramShape.S().a.size() != 0))
    {
      c(paramShape);
      return;
    }
    b(26);
    switch (paramShape.getMsoDrawingType())
    {
    case 24: 
      a((OleObject)paramShape);
      break;
    case 19: 
      a((GroupBox)paramShape);
      break;
    case 0: 
      a((GroupShape)paramShape);
      break;
    default: 
      byte[] arrayOfByte = paramShape.S().b;
      if (arrayOfByte != null) {
        b(d() + (short)arrayOfByte.length);
      }
      this.b = new byte[d()];
      int i = e(paramShape);
      if (arrayOfByte != null)
      {
        System.arraycopy(arrayOfByte, 0, this.b, i, arrayOfByte.length);
        i += arrayOfByte.length;
      }
      break;
    }
  }
  
  int b(Shape paramShape)
  {
    int i = 0;
    if ((paramShape.S().a != null) && (paramShape.S().a.size() != 0))
    {
      Iterator localIterator = paramShape.S().a.iterator();
      while (localIterator.hasNext())
      {
        byte[] arrayOfByte = (byte[])localIterator.next();
        i += (short)arrayOfByte.length;
      }
    }
    return i;
  }
  
  void c(Shape paramShape)
  {
    b(22);
    Object localObject;
    if ((paramShape.S().a != null) && (paramShape.S().a.size() != 0))
    {
      Iterator localIterator = paramShape.S().a.iterator();
      while (localIterator.hasNext())
      {
        localObject = (byte[])localIterator.next();
        b(d() + (short)localObject.length);
      }
    }
    this.b = new byte[d()];
    int i = e(paramShape);
    if ((paramShape.S().a != null) && (paramShape.S().a.size() != 0))
    {
      localObject = paramShape.S().a.iterator();
      while (((Iterator)localObject).hasNext())
      {
        byte[] arrayOfByte = (byte[])((Iterator)localObject).next();
        System.arraycopy(arrayOfByte, 0, this.b, i, arrayOfByte.length);
        i += (short)arrayOfByte.length;
      }
    }
  }
  
  void a(GroupBox paramGroupBox)
  {
    b(d() + 10);
    this.b = new byte[d()];
    int i = e(paramGroupBox);
    this.b[i] = 15;
    this.b[(i + 2)] = 6;
    i += 4;
    if (!paramGroupBox.getShadow()) {
      this.b[(i + 4)] = 1;
    }
    i += 6;
  }
  
  void a(GroupShape paramGroupShape)
  {
    b(d() + 6);
    this.b = new byte[d()];
    int i = e(paramGroupShape);
    this.b[i] = 6;
    this.b[(i + 2)] = 2;
    i += 6;
  }
  
  void a(RadioButton paramRadioButton)
  {
    b(72);
    byte[] arrayOfByte1 = paramRadioButton.af();
    if (arrayOfByte1 != null) {
      b(d() + (short)(11 + arrayOfByte1.length));
    }
    Object localObject;
    if ((paramRadioButton.S().a != null) && (paramRadioButton.S().a.size() > 0))
    {
      Iterator localIterator = paramRadioButton.S().a.iterator();
      while (localIterator.hasNext())
      {
        localObject = (byte[])localIterator.next();
        b(d() + (short)localObject.length);
      }
    }
    this.b = new byte[d()];
    int i = e(paramRadioButton);
    this.b[i] = 10;
    this.b[(i + 2)] = 12;
    i += 4;
    if (paramRadioButton.isChecked()) {
      this.b[i] = 1;
    }
    if (arrayOfByte1 != null)
    {
      this.b[(i + 2)] = 12;
      this.b[(i + 4)] = 108;
      this.b[(i + 5)] = 1;
    }
    this.b[(i + 10)] = 3;
    i += 12;
    this.b[i] = 11;
    this.b[(i + 2)] = 6;
    i += 4;
    if (paramRadioButton.isChecked())
    {
      this.b[i] = 88;
      this.b[(i + 1)] = 14;
    }
    else
    {
      this.b[i] = -16;
      this.b[(i + 1)] = 37;
    }
    this.b[(i + 2)] = -54;
    this.b[(i + 3)] = 1;
    this.b[(i + 4)] = 1;
    i += 6;
    if (arrayOfByte1 != null) {
      i += b(i, arrayOfByte1);
    }
    this.b[i] = 18;
    this.b[(i + 2)] = 8;
    i += 4;
    if (paramRadioButton.isChecked()) {
      this.b[i] = 1;
    }
    if (paramRadioButton.getShadow()) {
      this.b[(i + 6)] = 2;
    } else {
      this.b[(i + 6)] = 3;
    }
    i += 8;
    this.b[i] = 17;
    this.b[(i + 2)] = 4;
    i += 4;
    this.b[(i + 2)] = 1;
    i += 4;
    if ((paramRadioButton.S().a != null) && (paramRadioButton.S().a.size() > 0))
    {
      localObject = paramRadioButton.S().a.iterator();
      while (((Iterator)localObject).hasNext())
      {
        byte[] arrayOfByte2 = (byte[])((Iterator)localObject).next();
        System.arraycopy(arrayOfByte2, 0, this.b, i, arrayOfByte2.length);
        i += (short)arrayOfByte2.length;
      }
    }
  }
  
  void a(CheckBox paramCheckBox)
  {
    b(d() + 22 + 4 + 28);
    int i = paramCheckBox.a();
    byte[] arrayOfByte1 = paramCheckBox.af();
    if (arrayOfByte1 != null) {
      b(d() + (short)(11 + arrayOfByte1.length));
    }
    Object localObject;
    if ((paramCheckBox.S().a != null) && (paramCheckBox.S().a.size() > 0))
    {
      Iterator localIterator = paramCheckBox.S().a.iterator();
      while (localIterator.hasNext())
      {
        localObject = (byte[])localIterator.next();
        b(d() + (short)localObject.length);
      }
    }
    this.b = new byte[d()];
    int j = e(paramCheckBox);
    this.b[j] = 10;
    this.b[(j + 2)] = 12;
    j += 4;
    this.b[j] = ((byte)i);
    if (arrayOfByte1 != null)
    {
      this.b[(j + 2)] = 12;
      this.b[(j + 4)] = -55;
      this.b[(j + 5)] = 1;
    }
    j += 12;
    if (arrayOfByte1 != null) {
      j += b(j, arrayOfByte1);
    }
    byte[] arrayOfByte2;
    if ((paramCheckBox.S().a != null) && (paramCheckBox.S().a.size() > 0))
    {
      localObject = paramCheckBox.S().a.iterator();
      while (((Iterator)localObject).hasNext())
      {
        arrayOfByte2 = (byte[])((Iterator)localObject).next();
        if ((arrayOfByte2[0] == 4) && (arrayOfByte2[1] == 0))
        {
          System.arraycopy(arrayOfByte2, 0, this.b, j, arrayOfByte2.length);
          j += (short)arrayOfByte2.length;
          break;
        }
      }
    }
    this.b[j] = 18;
    this.b[(j + 2)] = 8;
    j += 4;
    this.b[j] = ((byte)i);
    if (paramCheckBox.getShadow()) {
      this.b[(j + 6)] = 2;
    } else {
      this.b[(j + 6)] = 3;
    }
    j += 8;
    if ((paramCheckBox.S().a != null) && (paramCheckBox.S().a.size() > 0))
    {
      localObject = paramCheckBox.S().a.iterator();
      while (((Iterator)localObject).hasNext())
      {
        arrayOfByte2 = (byte[])((Iterator)localObject).next();
        if ((arrayOfByte2[0] != 4) || (arrayOfByte2[1] != 0))
        {
          System.arraycopy(arrayOfByte2, 0, this.b, j, arrayOfByte2.length);
          j += (short)arrayOfByte2.length;
          break;
        }
      }
    }
  }
  
  void a(ComboBox paramComboBox)
  {
    b(70);
    if ((paramComboBox.S().a != null) && (paramComboBox.S().a.size() > 0))
    {
      localObject = paramComboBox.S().a.iterator();
      while (((Iterator)localObject).hasNext())
      {
        byte[] arrayOfByte1 = (byte[])((Iterator)localObject).next();
        b(d() + (short)arrayOfByte1.length);
      }
    }
    Object localObject = paramComboBox.af();
    if (localObject != null) {
      b(d() + (short)(11 + localObject.length));
    }
    int i = 0;
    byte[] arrayOfByte2 = paramComboBox.ah();
    if (arrayOfByte2 != null)
    {
      i = paramComboBox.b();
      b(d() + (short)(7 + arrayOfByte2.length));
    }
    int j = 0;
    if (paramComboBox.a != null) {
      for (k = 0; k < paramComboBox.a.length; k++)
      {
        j = (short)(3 + paramComboBox.a[k].length() * 2);
        if (d() + j > 8224) {
          break;
        }
        b(d() + j);
      }
    }
    this.b = new byte[d()];
    int k = e(paramComboBox);
    k += a(k, 0, 8);
    Iterator localIterator;
    byte[] arrayOfByte3;
    if ((paramComboBox.S().a != null) && (paramComboBox.S().a.size() > 0))
    {
      localIterator = paramComboBox.S().a.iterator();
      while (localIterator.hasNext())
      {
        arrayOfByte3 = (byte[])localIterator.next();
        if (arrayOfByte3[0] == 4)
        {
          System.arraycopy(arrayOfByte3, 0, this.b, k, arrayOfByte3.length);
          k += (short)arrayOfByte3.length;
          break;
        }
      }
    }
    if (localObject != null) {
      k += a(k, (byte[])localObject);
    }
    if ((paramComboBox.S().a != null) && (paramComboBox.S().a.size() > 0))
    {
      localIterator = paramComboBox.S().a.iterator();
      while (localIterator.hasNext())
      {
        arrayOfByte3 = (byte[])localIterator.next();
        if (arrayOfByte3[0] != 4)
        {
          System.arraycopy(arrayOfByte3, 0, this.b, k, arrayOfByte3.length);
          k += (short)arrayOfByte3.length;
          break;
        }
      }
    }
    k += a(k, arrayOfByte2, i, paramComboBox.getSelectedIndex(), paramComboBox.getShadow(), (byte)0, paramComboBox.getDropDownLines(), null, paramComboBox.a);
  }
  
  void a(ListBox paramListBox)
  {
    b(60);
    if ((paramListBox.S().a != null) && (paramListBox.S().a.size() > 0))
    {
      localObject = paramListBox.S().a.iterator();
      while (((Iterator)localObject).hasNext())
      {
        byte[] arrayOfByte1 = (byte[])((Iterator)localObject).next();
        b(d() + (short)arrayOfByte1.length);
      }
    }
    Object localObject = paramListBox.af();
    if (localObject != null) {
      b(d() + (short)(11 + localObject.length));
    }
    int i = 0;
    byte[] arrayOfByte2 = paramListBox.ah();
    if (arrayOfByte2 != null)
    {
      i = paramListBox.getItemCount();
      b(d() + (short)(7 + arrayOfByte2.length));
      if (paramListBox.getSelectionType() != 0) {
        b(d() + (short)i);
      }
    }
    this.b = new byte[d()];
    int j = e(paramListBox);
    j += a(j, paramListBox.b(), paramListBox.c(), paramListBox.d(), paramListBox.e(), paramListBox.getPageChange(), paramListBox.getShadow());
    if (localObject != null) {
      j += a(j, (byte[])localObject);
    }
    j += a(j, arrayOfByte2, i, paramListBox.getSelectedIndex(), paramListBox.getShadow(), (byte)paramListBox.getSelectionType(), -1, paramListBox.a(), null);
  }
  
  void d(Shape paramShape)
  {
    b(50);
    byte[] arrayOfByte1 = null;
    if (paramShape.getMsoDrawingType() == 17) {
      arrayOfByte1 = ((ScrollBar)paramShape).af();
    } else {
      arrayOfByte1 = ((Spinner)paramShape).af();
    }
    if (arrayOfByte1 != null) {
      b(d() + (short)(11 + arrayOfByte1.length));
    }
    byte[] arrayOfByte2 = paramShape.S().b;
    if (arrayOfByte2 != null) {
      b(d() + (short)arrayOfByte2.length);
    }
    this.b = new byte[d()];
    int i = e(paramShape);
    if (paramShape.getMsoDrawingType() == 17) {
      i += a(i, (ScrollBar)paramShape);
    } else {
      i += a(i, (Spinner)paramShape);
    }
    if (arrayOfByte1 != null) {
      i += a(i, arrayOfByte1);
    }
    if (arrayOfByte2 != null)
    {
      System.arraycopy(arrayOfByte2, 0, this.b, i, arrayOfByte2.length);
      i += arrayOfByte2.length;
    }
  }
  
  private int a(int paramInt, Spinner paramSpinner)
  {
    this.b[paramInt] = 12;
    this.b[(paramInt + 2)] = 20;
    paramInt += 4;
    paramInt += 4;
    System.arraycopy(zc.a(paramSpinner.getCurrentValue()), 0, this.b, paramInt, 2);
    System.arraycopy(zc.a(paramSpinner.getMin()), 0, this.b, paramInt + 2, 2);
    System.arraycopy(zc.a(paramSpinner.getMax()), 0, this.b, paramInt + 4, 2);
    System.arraycopy(zc.a(paramSpinner.getIncrementalChange()), 0, this.b, paramInt + 6, 2);
    System.arraycopy(zc.a(paramSpinner.a()), 0, this.b, paramInt + 8, 2);
    if (paramSpinner.isHorizontal()) {
      this.b[(paramInt + 10)] = 1;
    }
    this.b[(paramInt + 12)] = 16;
    if (paramSpinner.getShadow()) {
      this.b[(paramInt + 14)] = 1;
    } else {
      this.b[(paramInt + 14)] = 9;
    }
    return 24;
  }
  
  private int a(int paramInt, ScrollBar paramScrollBar)
  {
    this.b[paramInt] = 12;
    this.b[(paramInt + 2)] = 20;
    paramInt += 4;
    paramInt += 4;
    System.arraycopy(zc.a(paramScrollBar.getCurrentValue()), 0, this.b, paramInt, 2);
    System.arraycopy(zc.a(paramScrollBar.getMin()), 0, this.b, paramInt + 2, 2);
    System.arraycopy(zc.a(paramScrollBar.getMax()), 0, this.b, paramInt + 4, 2);
    System.arraycopy(zc.a(paramScrollBar.getIncrementalChange()), 0, this.b, paramInt + 6, 2);
    System.arraycopy(zc.a(paramScrollBar.getPageChange()), 0, this.b, paramInt + 8, 2);
    if (paramScrollBar.isHorizontal()) {
      this.b[(paramInt + 10)] = 1;
    }
    this.b[(paramInt + 12)] = 16;
    if (paramScrollBar.getShadow()) {
      this.b[(paramInt + 14)] = 1;
    } else {
      this.b[(paramInt + 14)] = 9;
    }
    return 24;
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.b[paramInt1] = 12;
    this.b[(paramInt1 + 2)] = 20;
    paramInt1 += 4;
    System.arraycopy(zc.a(paramInt2), 0, this.b, paramInt1 + 8, 2);
    this.b[(paramInt1 + 10)] = 1;
    System.arraycopy(zc.a(paramInt3), 0, this.b, paramInt1 + 12, 2);
    this.b[(paramInt1 + 16)] = 16;
    this.b[(paramInt1 + 18)] = 1;
    return 24;
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
  {
    this.b[paramInt1] = 12;
    this.b[(paramInt1 + 2)] = 20;
    paramInt1 += 4;
    paramInt1 += 4;
    System.arraycopy(zc.a(paramInt2), 0, this.b, paramInt1, 2);
    System.arraycopy(zc.a(paramInt3), 0, this.b, paramInt1 + 2, 2);
    System.arraycopy(zc.a(paramInt4), 0, this.b, paramInt1 + 4, 2);
    System.arraycopy(zc.a(paramInt5), 0, this.b, paramInt1 + 6, 2);
    System.arraycopy(zc.a(paramInt6), 0, this.b, paramInt1 + 8, 2);
    this.b[(paramInt1 + 12)] = 16;
    if (paramBoolean) {
      this.b[(paramInt1 + 14)] = 1;
    } else {
      this.b[(paramInt1 + 14)] = 9;
    }
    return 24;
  }
  
  private int a(int paramInt, byte[] paramArrayOfByte)
  {
    this.b[paramInt] = 14;
    this.b[(paramInt + 2)] = ((byte)(7 + paramArrayOfByte.length));
    paramInt += 4;
    this.b[paramInt] = ((byte)paramArrayOfByte.length);
    this.b[(paramInt + 2)] = 104;
    this.b[(paramInt + 3)] = 42;
    this.b[(paramInt + 4)] = -54;
    this.b[(paramInt + 5)] = 1;
    System.arraycopy(paramArrayOfByte, 0, this.b, paramInt + 6, paramArrayOfByte.length);
    return 11 + paramArrayOfByte.length;
  }
  
  private int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, boolean paramBoolean, byte paramByte, int paramInt4, ArrayList paramArrayList, String[] paramArrayOfString)
  {
    int i = paramInt1;
    this.b[paramInt1] = 19;
    this.b[(paramInt1 + 2)] = -18;
    this.b[(paramInt1 + 3)] = 31;
    paramInt1 += 4;
    if (paramArrayOfByte != null)
    {
      System.arraycopy(zc.a(paramArrayOfByte.length + 7), 0, this.b, paramInt1, 2);
      System.arraycopy(zc.a(paramArrayOfByte.length), 0, this.b, paramInt1 + 2, 2);
      paramInt1 += 4;
      this.b[(paramInt1++)] = 104;
      this.b[(paramInt1++)] = 42;
      this.b[(paramInt1++)] = -64;
      this.b[(paramInt1++)] = 1;
      System.arraycopy(paramArrayOfByte, 0, this.b, paramInt1, paramArrayOfByte.length);
      paramInt1 += paramArrayOfByte.length;
      this.b[(paramInt1++)] = -16;
      if (paramInt2 != 0) {
        System.arraycopy(zc.a(paramInt2), 0, this.b, paramInt1, 2);
      }
      paramInt1 += 2;
    }
    else
    {
      if (paramArrayOfString != null) {
        System.arraycopy(zc.a(paramArrayOfString.length), 0, this.b, paramInt1 + 2, 2);
      }
      paramInt1 += 4;
    }
    if ((paramByte == 0) && (paramInt3 != -1)) {
      System.arraycopy(zc.a(paramInt3 + 1), 0, this.b, paramInt1, 2);
    }
    int j = (byte)((paramByte & 0xFF) << 4);
    if ((paramArrayOfString != null) && (paramArrayOfByte == null)) {
      j = (byte)(j | 0x2);
    }
    if (!paramBoolean) {
      j = (byte)(j | 0x8);
    }
    this.b[(paramInt1 + 2)] = j;
    paramInt1 += 6;
    if (paramInt4 != -1)
    {
      System.arraycopy(zc.a(paramInt4), 0, this.b, paramInt1 + 2, 2);
      paramInt1 += 6;
      paramInt1 += 4;
    }
    int k;
    if (paramArrayOfString != null) {
      for (j = 0; j < paramArrayOfString.length; j++) {
        if (paramInt1 >= d())
        {
          k = d() - (i + 4) - 1;
          System.arraycopy(zc.a(k), 0, this.b, i + 2, 2);
          this.a = new ArrayList();
          byte[] arrayOfByte = new byte['․'];
          arrayOfByte[0] = 60;
          zf.a(this.a, arrayOfByte);
          int m = 4;
          while (j < paramArrayOfString.length)
          {
            if (m + 3 + 2 * paramArrayOfString.length > arrayOfByte.length)
            {
              System.arraycopy(zc.a(m - 4), 0, arrayOfByte, 2, 2);
              arrayOfByte = new byte['․'];
              arrayOfByte[0] = 60;
              zf.a(this.a, arrayOfByte);
              m = 4;
            }
            System.arraycopy(zc.a(paramArrayOfString[j].length()), 0, arrayOfByte, m, 2);
            arrayOfByte[(m + 2)] = 1;
            System.arraycopy(Encoding.getUnicode().a(paramArrayOfString[j]), 0, arrayOfByte, m + 3, paramArrayOfString[j].length() * 2);
            m += 3 + paramArrayOfString[j].length() * 2;
            j++;
          }
          if (m > 4) {
            System.arraycopy(zc.a(m - 4), 0, arrayOfByte, 2, 2);
          }
        }
        else
        {
          System.arraycopy(zc.a(paramArrayOfString[j].length()), 0, this.b, paramInt1, 2);
          this.b[(paramInt1 + 2)] = 1;
          System.arraycopy(Encoding.getUnicode().a(paramArrayOfString[j]), 0, this.b, paramInt1 + 3, paramArrayOfString[j].length() * 2);
          paramInt1 += 3 + paramArrayOfString[j].length() * 2;
        }
      }
    }
    if ((paramByte != 0) && (paramArrayList != null) && (paramArrayList.size() != 0))
    {
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
      {
        k = ((Integer)localIterator.next()).intValue();
        this.b[(paramInt1 + (k & 0xFFFF))] = 1;
      }
      paramInt1 += paramInt2;
    }
    return paramInt1 - i;
  }
  
  private int b(int paramInt, byte[] paramArrayOfByte)
  {
    this.b[paramInt] = 20;
    this.b[(paramInt + 2)] = ((byte)(7 + paramArrayOfByte.length));
    paramInt += 4;
    this.b[paramInt] = ((byte)paramArrayOfByte.length);
    this.b[(paramInt + 2)] = -72;
    this.b[(paramInt + 3)] = 44;
    this.b[(paramInt + 4)] = -54;
    this.b[(paramInt + 5)] = 1;
    System.arraycopy(paramArrayOfByte, 0, this.b, paramInt + 6, paramArrayOfByte.length);
    return 11 + paramArrayOfByte.length;
  }
  
  void a(OleObject paramOleObject)
    throws Exception
  {
    b(26);
    int i = 0;
    byte[] arrayOfByte1 = null;
    int j = 0;
    byte[] arrayOfByte2 = null;
    boolean bool = paramOleObject.isLink();
    if (bool)
    {
      arrayOfByte2 = new byte[] { 9, 0, 16, 0, 14, 0, 7, 0, -24, 72, -26, 4, 89, 0, 0, 0, 0, 0, 0, 0 };
      k = paramOleObject.n();
      if (k != -1)
      {
        m = paramOleObject.o();
        if ((k != -1) && (m != -1))
        {
          System.arraycopy(zc.a(k), 0, arrayOfByte2, 13, 2);
          System.arraycopy(zc.a(m + 1), 0, arrayOfByte2, 15, 2);
          i = arrayOfByte2.length - 4;
        }
        else
        {
          bool = false;
        }
      }
      else
      {
        bool = false;
      }
    }
    if (!bool)
    {
      arrayOfByte1 = zct.c(paramOleObject.getProgID());
      i = 21 + (arrayOfByte1 == null ? 0 : arrayOfByte1.length);
      j = i % 2 != 0 ? 1 : 0;
      if (j != 0) {
        i++;
      }
    }
    b(d() + (short)(12 + i + 4));
    int k = b(paramOleObject);
    b(d() + (short)k);
    this.b = new byte[d()];
    int m = e(paramOleObject);
    this.b[m] = 7;
    this.b[(m + 2)] = 2;
    this.b[(m + 4)] = 2;
    m += 6;
    this.b[m] = 8;
    this.b[(m + 2)] = 2;
    System.arraycopy(zc.a((short)paramOleObject.b()), 0, this.b, m + 4, 2);
    m += 6;
    Object localObject;
    if (bool)
    {
      System.arraycopy(arrayOfByte2, 0, this.b, m, arrayOfByte2.length);
      m += arrayOfByte2.length;
    }
    else
    {
      this.b[m] = 9;
      System.arraycopy(zc.a(i), 0, this.b, m + 2, 2);
      m += 4;
      System.arraycopy(zc.a(i - 6), 0, this.b, m, 2);
      m += 2;
      localObject = new byte[] { 5, 0, -108, 14, -54, 1, 2, -36, 19, -88, 1, 3 };
      System.arraycopy(localObject, 0, this.b, m, localObject.length);
      m += localObject.length;
      System.arraycopy(zc.a(paramOleObject.getProgID().length()), 0, this.b, m, 2);
      if (arrayOfByte1 != null) {
        this.b[(m + 2)] = ((byte)(arrayOfByte1.length == paramOleObject.getProgID().length() ? 0 : 1));
      }
      m += 3;
      if (arrayOfByte1 != null)
      {
        System.arraycopy(arrayOfByte1, 0, this.b, m, arrayOfByte1.length);
        m += arrayOfByte1.length;
      }
      if (j != 0) {
        m++;
      }
      System.arraycopy(zc.a(paramOleObject.s()), 0, this.b, m, 4);
      m += 4;
    }
    if (k != 0)
    {
      localObject = paramOleObject.S().a.iterator();
      while (((Iterator)localObject).hasNext())
      {
        byte[] arrayOfByte3 = (byte[])((Iterator)localObject).next();
        System.arraycopy(arrayOfByte3, 0, this.b, m, arrayOfByte3.length);
        m += arrayOfByte3.length;
      }
    }
  }
  
  int e(Shape paramShape)
  {
    this.b[0] = 21;
    this.b[2] = 18;
    int i = 4;
    switch (paramShape.getMsoDrawingType())
    {
    case 24: 
      this.b[i] = 8;
      break;
    case 30: 
      if ((paramShape.C()) && (!zw.b(paramShape.o)))
      {
        int j = paramShape.R().d().c(16644, 0);
        this.b[i] = (j > 0 ? 8 : (byte)paramShape.getMsoDrawingType());
      }
      else
      {
        this.b[i] = ((byte)paramShape.getMsoDrawingType());
      }
      break;
    default: 
      this.b[i] = ((byte)paramShape.getMsoDrawingType());
    }
    System.arraycopy(zc.a(paramShape.O()), 0, this.b, i + 2, 2);
    if (paramShape.isLocked())
    {
      int tmp172_171 = (i + 4);
      byte[] tmp172_166 = this.b;
      tmp172_166[tmp172_171] = ((byte)(tmp172_166[tmp172_171] | 0x1));
    }
    if (paramShape.isPrintable())
    {
      int tmp192_191 = (i + 4);
      byte[] tmp192_186 = this.b;
      tmp192_186[tmp192_191] = ((byte)(tmp192_186[tmp192_191] | 0x10));
    }
    if (paramShape.S().e())
    {
      int tmp216_215 = (i + 5);
      byte[] tmp216_210 = this.b;
      tmp216_210[tmp216_215] = ((byte)(tmp216_210[tmp216_215] | 0x1));
    }
    if (paramShape.S().c())
    {
      int tmp239_238 = (i + 5);
      byte[] tmp239_233 = this.b;
      tmp239_233[tmp239_238] = ((byte)(tmp239_233[tmp239_238] | 0x20));
    }
    if (paramShape.S().d())
    {
      int tmp263_262 = (i + 5);
      byte[] tmp263_257 = this.b;
      tmp263_257[tmp263_262] = ((byte)(tmp263_257[tmp263_262] | 0x40));
    }
    i += 18;
    return i;
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    byte[] arrayOfByte1 = new byte[this.b.length + 4];
    System.arraycopy(zc.a(f()), 0, arrayOfByte1, 0, 2);
    System.arraycopy(zc.a(d()), 0, arrayOfByte1, 2, 2);
    System.arraycopy(this.b, 0, arrayOfByte1, 4, this.b.length);
    paramzrg.a(arrayOfByte1);
    if (this.a != null) {
      for (int i = 0; i < this.a.size(); i++)
      {
        byte[] arrayOfByte2 = (byte[])this.a.get(i);
        int j = zc.b(arrayOfByte2, 2);
        paramzrg.a(arrayOfByte2, j + 4);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zarm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */