
package dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class MiComboBoxModel extends AbstractListModel implements ComboBoxModel {
 Calendar micalendar;
 ArrayList anioslist=new ArrayList();
 
  public MiComboBoxModel(){
      lista=(new Alumnos().select());
      selection=(String)lista.get(0);
  }
  String selection="";

  public Object getElementAt(int index) {
    return anioslist.get(index);
  }

  public int getSize() {
    return anioslist.size();
  }

  public void setSelectedItem(Object anItem) {
    selection = (String) anItem; // to select and register an
  } // item from the pull-down list

  // Methods implemented from the interface ComboBoxModel
  public Object getSelectedItem() {
    return selection; // to add the selection to the combo box
  }
}