package stockWatcher.client;

import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;

import java.util.Arrays;
import java.util.List;

public class CellTableExample{

  // A simple data type that represents a contact.
  private static class Contact {
    private final String address;
    private final String name;

    public Contact(String name, String address) {
      this.name = name;
      this.address = address;
    }
  }

  // The list of data to display.
  private static List<Contact> CONTACTS = Arrays.asList(
          new Contact("John", "123 Fourth Road"),
          new Contact("Mary", "222 Lancer Lane"));

  public CellTable getCellTable() {

    // Create a CellTable.
    CellTable<Contact> table = new CellTable<Contact>();

    // Create name column.
    TextColumn<Contact> nameColumn = new TextColumn<Contact>() {
      @Override
      public String getValue(Contact contact) {
        return contact.name;
      }
    };

    // Create address column.
    TextColumn<Contact> addressColumn = new TextColumn<Contact>() {
      @Override
      public String getValue(Contact contact) {
        return contact.address;
      }
    };

    // Add the columns.
    table.addColumn(nameColumn, "Name");
    table.addColumn(addressColumn, "Address");

    // Set the total row count. This isn't strictly necessary, but it affects
    // paging calculations, so its good habit to keep the row count up to date.
    table.setRowCount(CONTACTS.size(), true);

    // Push the data into the widget.
    table.setRowData(0, CONTACTS);

    return table;

  }
}
