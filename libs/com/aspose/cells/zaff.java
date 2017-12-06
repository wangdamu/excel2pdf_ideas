package com.aspose.cells;

import com.aspose.cells.a.d.zav;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zaff
{
  private zafo a = null;
  private Style b = null;
  
  zaff(zafo paramzafo)
  {
    this.a = paramzafo;
    this.b = this.a.i();
  }
  
  void a(zago paramzago)
    throws Exception
  {
    paramzago.a("tr");
    paramzago.b(" {mso-height-source:auto;");
    paramzago.b(" mso-ruby-visibility:none;}");
    paramzago.b("col");
    paramzago.b(" {mso-width-source:auto;");
    paramzago.b(" mso-ruby-visibility:none;}");
    paramzago.b("br");
    paramzago.b(" {mso-data-placement:same-cell;}");
    paramzago.b("ruby");
    paramzago.b(" {ruby-align:left;}");
    b(paramzago);
    c(paramzago);
    a(paramzago, null);
    d(paramzago);
    paramzago.h();
  }
  
  private String a(Font paramFont)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Font substitution: Font [ ");
    localStringBuilder.append(paramFont.getName());
    localStringBuilder.append(" ] has been substituted");
    return zs.a(localStringBuilder);
  }
  
  private void b(zago paramzago)
    throws Exception
  {
    Style localStyle = this.b;
    paramzago.b("." + this.a.c().getCellCssPrefix() + "style0");
    paramzago.b(" {");
    a(paramzago, localStyle, true);
    b(paramzago, localStyle);
    c(paramzago, localStyle);
    if ((!zav.a().a(localStyle.getFont().getName(), localStyle.getFont().p(), localStyle.getFont().getName())) && (this.a.c().getWarningCallback() != null))
    {
      String str = a(localStyle.getFont());
      this.a.c().getWarningCallback().warning(new WarningInfo(0, str));
    }
    a(paramzago, localStyle.getFont(), true);
    d(paramzago, localStyle);
    a(paramzago, localStyle);
    paramzago.b(" mso-style-name:Normal;");
    paramzago.b(" mso-style-id:0;}");
  }
  
  private void c(zago paramzago)
    throws Exception
  {
    ArrayList localArrayList = this.a.f().a;
    for (int i = 0; i < localArrayList.size(); i++)
    {
      Font localFont = (Font)localArrayList.get(i);
      paramzago.b("." + this.a.c().getCellCssPrefix() + "font" + zauj.z(i));
      paramzago.b(" {");
      a(paramzago, localFont, true);
      paramzago.a(" }");
    }
  }
  
  void a(zago paramzago, Worksheet paramWorksheet)
    throws Exception
  {
    Style localStyle = this.b;
    paramzago.b("td");
    paramzago.b(" {mso-style-parent:" + this.a.c().getCellCssPrefix() + "style0;");
    a(paramzago, localStyle, true);
    b(paramzago, localStyle);
    c(paramzago, localStyle);
    a(paramzago, localStyle.getFont(), true);
    if (paramWorksheet == null)
    {
      int i = this.a.k().getWorksheets().getCount();
      if (i == 1) {
        paramWorksheet = this.a.k().getWorksheets().get(0);
      } else if ((i > 1) && (!this.a.c().getExportHiddenWorksheet())) {
        for (int j = 0; j < i; j++)
        {
          paramWorksheet = this.a.k().getWorksheets().get(j);
          if (paramWorksheet.isVisible()) {
            break;
          }
        }
      }
    }
    if ((this.a.c().getExportGridLines()) && (paramWorksheet != null) && (paramWorksheet.isGridlinesVisible()))
    {
      if (paramWorksheet.B() == 64) {
        paramzago.b(" border:solid #b6b6b6 1px;");
      } else {
        paramzago.b(" border:dotted #" + zauj.a(paramWorksheet.A()) + " 1px;");
      }
    }
    else {
      d(paramzago, localStyle);
    }
    a(paramzago, localStyle);
    paramzago.b(" mso-ignore:padding;}");
  }
  
  private void d(zago paramzago)
    throws Exception
  {
    zajm localzajm = this.a.j.getWorksheets().C();
    int i = localzajm.b();
    for (int j = 0; j < i; j++)
    {
      Style localStyle = localzajm.a(j);
      a(paramzago, localStyle, j);
    }
  }
  
  void a(zago paramzago, Style paramStyle, int paramInt)
    throws Exception
  {
    if (!paramStyle.g()) {
      paramzago.b("." + this.a.c().getCellCssPrefix() + "style" + zauj.z(paramInt));
    } else {
      paramzago.b("." + this.a.c().getCellCssPrefix() + "x" + zauj.z(paramInt));
    }
    paramzago.b(" {");
    String str;
    if (paramStyle.g())
    {
      str = " mso-style-parent:" + this.a.c().getCellCssPrefix() + "style0;";
      if (paramStyle.h() > 0) {
        str = " mso-style-parent:" + this.a.c().getCellCssPrefix() + "style" + zauj.z(paramStyle.h()) + ";";
      }
      paramzago.b(str);
    }
    a(paramzago, paramStyle, paramStyle.g());
    b(paramzago, paramStyle);
    c(paramzago, paramStyle);
    if (paramStyle.q() != null) {
      a(paramzago, paramStyle.getFont(), false);
    }
    if (paramStyle.d() != null) {
      d(paramzago, paramStyle);
    }
    a(paramzago, paramStyle);
    if (!paramStyle.g())
    {
      str = paramStyle.getName();
      if ((str != null) && (str.length() > 0)) {
        paramzago.b(" mso-style-name:\"" + str.trim() + "\";");
      }
    }
    paramzago.b(" }");
  }
  
  private void a(zago paramzago, Style paramStyle)
    throws Exception
  {
    paramzago.b(" mso-protection:" + (paramStyle.isLocked() ? "locked " : "unlocked ") + (paramStyle.isFormulaHidden() ? "hidden" : "visible") + ";");
  }
  
  private void a(zago paramzago, Style paramStyle, boolean paramBoolean)
    throws Exception
  {
    String str = paramStyle.s();
    if (((str == null) || (str.length() == 0)) && (paramStyle.getNumber() > 0)) {
      str = paramStyle.e().p().getSettings().f().d(paramStyle.getNumber());
    }
    if ((str != null) && (str.length() > 0))
    {
      str = zagn.g(str);
      paramzago.b(" mso-number-format:\"" + zs.a(str) + "\";");
    }
    else if (paramBoolean)
    {
      paramzago.b(" mso-number-format:General;");
    }
  }
  
  private void b(zago paramzago, Style paramStyle)
    throws Exception
  {
    paramzago.b(" " + zagn.b(paramStyle.getHorizontalAlignment()) + ";");
    paramzago.b(" " + zagn.c(paramStyle.getVerticalAlignment()) + ";");
    if (paramStyle.isTextWrapped()) {
      paramzago.b(" white-space:normal;word-wrap:break-word;");
    } else {
      paramzago.b(" white-space:nowrap;");
    }
    if (paramStyle.getIndentLevel() > 0)
    {
      paramzago.b(" mso-char-indent-count:" + zauj.z(paramStyle.getIndentLevel()) + ";");
      int i = a(paramStyle);
      int j = zagn.b(paramStyle.getHorizontalAlignment()).charAt(11);
      if (j == 108) {
        paramzago.b(" padding-left:" + zauj.z(i) + "px;");
      } else if (j == 114) {
        paramzago.b(" padding-right:" + zauj.z(i) + "px;");
      }
    }
    if (paramStyle.getRotationAngle() == 255) {
      paramzago.b(" layout-flow:vertical;");
    } else if (paramStyle.getRotationAngle() != 0) {
      paramzago.b(" mso-rotate:" + zauj.z(paramStyle.getRotationAngle()) + ";");
    }
  }
  
  private int a(Style paramStyle)
    throws Exception
  {
    int i = this.a.e().a(paramStyle, "O");
    return i * paramStyle.getIndentLevel();
  }
  
  private void c(zago paramzago, Style paramStyle)
    throws Exception
  {
    String str1 = "auto";
    String str2 = "auto";
    String str3 = "";
    switch (paramStyle.getPattern())
    {
    case 0: 
      break;
    case 1: 
      if (!paramStyle.b.b()) {
        str1 = "#" + zauj.a(paramStyle.getForegroundColor());
      }
      str3 = " none";
      break;
    default: 
      if (!paramStyle.a.b()) {
        str1 = "#" + zauj.a(paramStyle.getBackgroundColor());
      }
      if (!paramStyle.b.b()) {
        str2 = "#" + zauj.a(paramStyle.getForegroundColor());
      }
      str3 = " " + ztt.b(paramStyle.getPattern());
    }
    paramzago.b(" background:" + str1 + ";");
    paramzago.b(" mso-pattern:" + str2 + str3 + ";");
  }
  
  private void a(zago paramzago, Font paramFont, boolean paramBoolean)
    throws Exception
  {
    if ((!paramFont.k()) || (paramBoolean))
    {
      String str = null;
      try
      {
        str = zauj.a(paramFont.getColor());
      }
      catch (Exception localException)
      {
        str = null;
      }
      if (str != null) {
        paramzago.b(" color:#" + str + ";");
      }
    }
    paramzago.b(" font-size:" + zauj.z(paramFont.getSize()) + "pt;");
    paramzago.b(" font-weight:" + zauj.z(paramFont.g()) + ";");
    if (paramFont.isItalic()) {
      paramzago.b(" font-style:italic;");
    } else {
      paramzago.b(" font-style:normal;");
    }
    if (paramFont.isStrikeout()) {
      paramzago.b(" text-decoration:line-through;");
    }
    if (paramFont.getUnderline() != 0) {
      paramzago.b(" " + zagn.a(paramFont.getUnderline()));
    }
    if (paramFont.h() != 0)
    {
      paramzago.b(" font-family:\"" + paramFont.getName() + "\",");
      if ((this.a.c() != null) && (this.a.c().getDefaultFontName() != null)) {
        paramzago.a("\"" + this.a.c().getDefaultFontName() + "\";");
      } else {
        switch (paramFont.h())
        {
        case 1: 
          paramzago.a("\"serif\";");
          break;
        case 2: 
          paramzago.a("\"sans-serif\";");
          break;
        case 3: 
          paramzago.a("\"monospace\";");
          break;
        case 4: 
          paramzago.a("\"cursive\";");
          break;
        default: 
          paramzago.a("\"sans-serif\";");
          break;
        }
      }
    }
    else
    {
      paramzago.b(" font-family:\"" + paramFont.getName() + "\"");
      if ((this.a.c() != null) && (this.a.c().getDefaultFontName() != null)) {
        paramzago.a(",\"" + this.a.c().getDefaultFontName() + "\";");
      } else {
        paramzago.a(";");
      }
    }
  }
  
  private void d(zago paramzago, Style paramStyle)
    throws Exception
  {
    if (paramStyle.f()) {
      e(paramzago, paramStyle);
    } else {
      paramzago.b(" border:none;");
    }
  }
  
  private void e(zago paramzago, Style paramStyle)
    throws Exception
  {
    paramzago.b(" border-top:" + zagn.a(paramStyle, 4, true) + ";");
    paramzago.b(" border-right:" + zagn.a(paramStyle, 2, true) + ";");
    paramzago.b(" border-bottom:" + zagn.a(paramStyle, 8, true) + ";");
    paramzago.b(" border-left:" + zagn.a(paramStyle, 1, true) + ";");
    paramzago.b(" mso-diagonal-down:" + zagn.a(paramStyle, 16, true) + ";");
    paramzago.b(" mso-diagonal-up:" + zagn.a(paramStyle, 32, true) + ";");
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */