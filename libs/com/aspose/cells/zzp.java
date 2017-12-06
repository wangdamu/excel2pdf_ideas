package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

class zzp
{
  private static final za a = new za(new String[] { "Bold", "加粗", "Kalın", "Italic", "倾斜", "İtalik", "Regular", "常规", "Normal", "加粗倾斜" });
  
  static void a(Font paramFont, String paramString)
  {
    switch (a.a(paramString))
    {
    case 0: 
    case 1: 
    case 2: 
      paramFont.setBold(true);
      break;
    case 3: 
    case 4: 
    case 5: 
      paramFont.setItalic(true);
      break;
    case 6: 
    case 7: 
    case 8: 
      paramFont.setItalic(false);
      paramFont.setBold(false);
      break;
    case 9: 
      paramFont.setItalic(true);
      paramFont.setBold(true);
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */