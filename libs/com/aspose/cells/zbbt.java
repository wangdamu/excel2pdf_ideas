package com.aspose.cells;

import com.aspose.cells.b.a.g.a.ze;

class zbbt
{
  static boolean a(char paramChar)
  {
    switch (paramChar)
    {
    case '(': 
    case ')': 
    case '<': 
    case '>': 
    case '[': 
    case ']': 
    case '{': 
    case '}': 
    case '‐': 
    case '―': 
    case '《': 
    case '》': 
    case 'ー': 
    case '（': 
    case '）': 
    case '～': 
      return true;
    }
    return false;
  }
  
  static boolean b(char paramChar)
  {
    ze localze = new ze("^[\\u2E80-\\u9FFF\\uF900-\\uFAFF\\uFF00-\\uFFEF]$");
    return localze.d(Character.toString(paramChar));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbbt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */