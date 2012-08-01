
package dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class MiComboBoxModel extends AbstractListModel implements ComboBoxModel {
 
 ArrayList list=new ArrayList();
 
  public MiComboBoxModel(){
      list=(new RegistroDAO().select());
      selection=(String)list.get(0);
  }
  String selection="";

    @Override
  public Object getElementAt(int index) {
    return list.get(index);
  }

    @Override
  public int getSize() {
    return list.size();
  }

    @Override
  public void setSelectedItem(Object anItem) {
    selection = (String) anItem; // to select and register an
  } // item from the pull-down list

  // Methods implemented from the interface ComboBoxModel
    @Override
  public Object getSelectedItem() {
    return selection; // to add the selection to the combo box
  }
}