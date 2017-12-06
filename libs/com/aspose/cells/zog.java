package com.aspose.cells;

import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zog
  extends ztp
{
  private zpf b;
  
  zog(zpf paramzpf)
  {
    this.b = paramzpf;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    Shape localShape = this.b.b;
    paramzcjz.c();
    paramzcjz.b("formControlPr");
    paramzcjz.a("xmlns", zaty.c);
    Object localObject;
    switch (localShape.getMsoDrawingType())
    {
    case 17: 
      paramzcjz.a("objectType", "Scroll");
      localObject = (ScrollBar)localShape;
      a(paramzcjz, ((ScrollBar)localObject).f, ((ScrollBar)localObject).getCurrentValue(), ((ScrollBar)localObject).getMin(), ((ScrollBar)localObject).getMax(), ((ScrollBar)localObject).getIncrementalChange(), ((ScrollBar)localObject).getPageChange(), ((ScrollBar)localObject).isHorizontal(), ((ScrollBar)localObject).getShadow());
      break;
    case 16: 
      paramzcjz.a("objectType", "Spin");
      localObject = (Spinner)localShape;
      a(paramzcjz, ((Spinner)localObject).f, ((Spinner)localObject).getCurrentValue(), ((Spinner)localObject).getMin(), ((Spinner)localObject).getMax(), ((Spinner)localObject).getIncrementalChange(), ((Spinner)localObject).a(), ((Spinner)localObject).isHorizontal(), ((Spinner)localObject).getShadow());
      break;
    case 7: 
      paramzcjz.a("objectType", "Button");
      localObject = (Button)localShape;
      if (((Button)localObject).a) {
        paramzcjz.a("lockText", "1");
      }
      break;
    case 18: 
      paramzcjz.a("objectType", "List");
      e(paramzcjz);
      break;
    case 19: 
      paramzcjz.a("objectType", "GBox");
      if (!localShape.B) {
        paramzcjz.a("noThreeD", "1");
      }
      break;
    case 20: 
      paramzcjz.a("objectType", "Drop");
      d(paramzcjz);
      break;
    case 11: 
      c(paramzcjz);
      break;
    case 12: 
      b(paramzcjz);
      break;
    case 8: 
    case 9: 
    case 10: 
    case 13: 
    case 14: 
    case 15: 
    default: 
      localObject = zvu.a(localShape);
      paramzcjz.a("objectType", (String)localObject);
    }
    paramzcjz.b();
    paramzcjz.d();
  }
  
  private void b(zcjz paramzcjz)
    throws Exception
  {
    RadioButton localRadioButton = (RadioButton)this.b.b;
    paramzcjz.a("objectType", "Radio");
    if (localRadioButton.isChecked()) {
      paramzcjz.a("checked", "Checked");
    }
    if (localRadioButton.a) {
      paramzcjz.a("lockText", "1");
    }
    if (!localRadioButton.B) {
      paramzcjz.a("noThreeD", "1");
    }
  }
  
  private void c(zcjz paramzcjz)
    throws Exception
  {
    CheckBox localCheckBox = (CheckBox)this.b.b;
    paramzcjz.a("objectType", "CheckBox");
    switch (localCheckBox.getCheckedValue())
    {
    case 1: 
      paramzcjz.a("checked", "Checked");
      break;
    case 2: 
      paramzcjz.a("checked", "Mixed");
      break;
    }
    if (localCheckBox.a) {
      paramzcjz.a("lockText", "1");
    }
    if (!localCheckBox.B) {
      paramzcjz.a("noThreeD", "1");
    }
  }
  
  private void d(zcjz paramzcjz)
    throws Exception
  {
    ComboBox localComboBox = (ComboBox)this.b.b;
    paramzcjz.a("dropLines", zauj.z(localComboBox.getDropDownLines()));
    paramzcjz.a("dropStyle", "Combo");
    paramzcjz.a("dx", zauj.z(localComboBox.b));
    if (!localComboBox.B) {
      paramzcjz.a("noThreeD", "1");
    }
    int i = Math.max(0, localComboBox.getSelectedIndex() + 1);
    paramzcjz.a("sel", zauj.z(i));
  }
  
  private void a(zcjz paramzcjz, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean1, boolean paramBoolean2)
    throws Exception
  {
    paramzcjz.a("dx", zauj.z(paramInt1));
    if (paramBoolean1) {
      paramzcjz.a("horiz", "1");
    }
    paramzcjz.a("inc", zauj.z(paramInt5));
    paramzcjz.a("max", zauj.z(paramInt4));
    paramzcjz.a("min", zauj.z(paramInt3));
    if (!paramBoolean2) {
      paramzcjz.a("noThreeD", "1");
    }
    paramzcjz.a("page", zauj.z(paramInt6));
    paramzcjz.a("val", zauj.z(paramInt2));
  }
  
  private void e(zcjz paramzcjz)
    throws Exception
  {
    ListBox localListBox = (ListBox)this.b.b;
    paramzcjz.a("dx", zauj.z(localListBox.a));
    if (localListBox.getSelectionType() == 1) {
      if ((localListBox.a() != null) && (localListBox.a().size() > 0))
      {
        StringBuilder localStringBuilder = new StringBuilder(zp.a((((Integer)localListBox.a().get(0)).intValue() & 0xFFFF) + 1));
        for (int j = 1; j < localListBox.a().size(); j++) {
          localStringBuilder.append(", ").append(zp.a((((Integer)localListBox.a().get(j)).intValue() & 0xFFFF) + 1));
        }
        paramzcjz.a("multiSel", zs.a(localStringBuilder));
      }
      else
      {
        paramzcjz.a("multiSel", "");
      }
    }
    if (!localListBox.getShadow()) {
      paramzcjz.a("noThreeD", "1");
    }
    int i = localListBox.getSelectedIndex() + 1;
    paramzcjz.a("sel", zauj.z(i));
    String str = "single";
    switch (localListBox.getSelectionType())
    {
    case 0: 
      str = "single";
      break;
    case 1: 
      str = "multi";
      break;
    case 2: 
      str = "extended";
      break;
    default: 
      str = "single";
    }
    paramzcjz.a("seltype", str);
    paramzcjz.a("val", zauj.z(localListBox.b()));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */