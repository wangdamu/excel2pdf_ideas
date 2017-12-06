package com.aspose.cells;

import java.util.Iterator;

public class RadioButton
  extends Shape
{
  private boolean b;
  boolean a = true;
  
  RadioButton(ShapeCollection shapes)
  {
    super(shapes, 12, shapes);
    this.x = new FontSettingCollection(shapes.j(), this);
  }
  
  public String getLinkedCell()
  {
    byte[] arrayOfByte = this.m_linkedCell;
    if (arrayOfByte == null)
    {
      localObject1 = getGroupBox();
      Object localObject2;
      Object localObject3;
      if (localObject1 != null)
      {
        localObject2 = ((GroupBox)localObject1).a();
        localObject3 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          Shape localShape = (Shape)((Iterator)localObject3).next();
          if (localShape.getMsoDrawingType() == 12)
          {
            arrayOfByte = ((RadioButton)localShape).m_linkedCell;
            if (arrayOfByte != null) {
              break;
            }
          }
        }
      }
      else
      {
        localObject2 = this.j.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Shape)((Iterator)localObject2).next();
          if ((((Shape)localObject3).getMsoDrawingType() == 12) && (((Shape)localObject3).getGroupBox() == null))
          {
            arrayOfByte = ((RadioButton)localObject3).m_linkedCell;
            if (arrayOfByte != null) {
              break;
            }
          }
        }
      }
      if (arrayOfByte == null) {
        return null;
      }
    }
    Object localObject1 = P().d().a(0, arrayOfByte.length, arrayOfByte, 0, 0, false, false);
    if ((localObject1 != null) && (!"".equals(localObject1)) && (((String)localObject1).charAt(0) == '=')) {
      return ((String)localObject1).substring(1);
    }
    return (String)localObject1;
  }
  
  public void setLinkedCell(String value)
  {
    if ((value == null) || ("".equals(value)))
    {
      this.m_linkedCell = null;
      return;
    }
    int i = 0;
    boolean[] arrayOfBoolean = { i };
    byte[] arrayOfByte = zaar.a(P(), Q().getIndex(), value, false, true, false, arrayOfBoolean);
    i = arrayOfBoolean[0];
    Object localObject1;
    Object localObject2;
    if (N().l())
    {
      localObject1 = getGroupBox();
      Object localObject3;
      if (localObject1 != null)
      {
        localObject2 = ((GroupBox)localObject1).a();
        localObject3 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          Shape localShape = (Shape)((Iterator)localObject3).next();
          if (localShape.getMsoDrawingType() == 12) {
            if (i != 0) {
              ((RadioButton)localShape).m_linkedCell = arrayOfByte;
            } else {
              ((RadioButton)localShape).m_linkedCell = null;
            }
          }
        }
      }
      else
      {
        localObject2 = this.j.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (Shape)((Iterator)localObject2).next();
          if ((((Shape)localObject3).getMsoDrawingType() == 12) && (((Shape)localObject3).getGroupBox() == null)) {
            if (i != 0) {
              ((RadioButton)localObject3).m_linkedCell = arrayOfByte;
            } else {
              ((RadioButton)localObject3).m_linkedCell = null;
            }
          }
        }
      }
    }
    else
    {
      localObject1 = this.j.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Shape)((Iterator)localObject1).next();
        if (((Shape)localObject2).getMsoDrawingType() == 12) {
          if (i != 0) {
            ((RadioButton)localObject2).m_linkedCell = arrayOfByte;
          } else {
            ((RadioButton)localObject2).m_linkedCell = null;
          }
        }
      }
    }
  }
  
  void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public boolean isChecked()
  {
    return this.b;
  }
  
  public void setChecked(boolean value)
  {
    if (this.b == value) {
      return;
    }
    int i = -1;
    if (value)
    {
      int j = 0;
      Object localObject1;
      Object localObject2;
      if (N().l())
      {
        localObject1 = getGroupBox();
        Object localObject3;
        if (localObject1 != null)
        {
          localObject2 = ((GroupBox)localObject1).a();
          localObject3 = ((Iterable)localObject2).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            Shape localShape = (Shape)((Iterator)localObject3).next();
            if (localShape.getMsoDrawingType() == 12)
            {
              ((RadioButton)localShape).b = false;
              if (localShape == this) {
                i = j;
              }
              j++;
            }
          }
        }
        else
        {
          localObject2 = this.j.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = (Shape)((Iterator)localObject2).next();
            if ((((Shape)localObject3).getMsoDrawingType() == 12) && (((Shape)localObject3).getGroupBox() == null))
            {
              ((RadioButton)localObject3).b = false;
              if (localObject3 == this) {
                i = j;
              }
              j++;
            }
          }
        }
      }
      else
      {
        localObject1 = this.j.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (Shape)((Iterator)localObject1).next();
          if (((Shape)localObject2).getMsoDrawingType() == 12)
          {
            ((RadioButton)localObject2).b = false;
            if (localObject2 == this) {
              i = j;
            }
            j++;
          }
        }
      }
    }
    this.b = value;
    if (((value) && (i != -1)) || ((!value) && (this.m_linkedCell != null)))
    {
      Cell localCell = e(true);
      if (localCell != null) {
        if (value) {
          localCell.putValue(i + 1);
        } else {
          localCell.putValue(0);
        }
      }
    }
  }
  
  public boolean getShadow()
  {
    return this.B;
  }
  
  public void setShadow(boolean value)
  {
    this.B = value;
  }
  
  void a(RadioButton paramRadioButton, CopyOptions paramCopyOptions)
  {
    this.m_linkedCell = paramRadioButton.m_linkedCell;
    this.b = paramRadioButton.b;
    super.a(paramRadioButton, paramCopyOptions);
  }
  
  public GroupBox getGroupBox()
  {
    return super.getGroupBox();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/RadioButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */